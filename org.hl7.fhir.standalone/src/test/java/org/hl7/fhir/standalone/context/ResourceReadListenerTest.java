package org.hl7.fhir.standalone.context;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

import org.hl7.fhir.model.core.CodeSystem;
import org.hl7.fhir.model.core.Resource;
import org.hl7.fhir.model.core.StructureDefinition;
import org.hl7.fhir.model.core.StructureDefinition.StructureDefinitionKind;
import org.hl7.fhir.model.core.StructureDefinition.TypeDerivationRule;
import org.hl7.fhir.model.core.VersionResolutionRules;
import org.hl7.fhir.services.context.IResourceReadListener;
import org.hl7.fhir.standalone.testing.TestingUtilities;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ResourceReadListenerTest {

  private static final String URL = "http://example.org/fhir/StructureDefinition/read-listener";

  /** what the listener was told, one line per call */
  private static class Recorder implements IResourceReadListener {
    final List<String> calls = new ArrayList<>();
    final List<Object> results = new ArrayList<>();

    @Override
    public void resourceRead(String type, String canonical, String version, Resource result) {
      calls.add("one " + type + " " + canonical + " " + version);
      results.add(result);
    }

    @Override
    public void resourcesRead(String query, List<? extends Resource> result) {
      calls.add("list " + query);
      results.add(result);
    }
  }

  private SimpleWorkerContext context;
  private StructureDefinition sd;
  private Recorder recorder;

  @BeforeEach
  void setUp() throws IOException {
    context = new SimpleWorkerContext((SimpleWorkerContext) TestingUtilities.getSharedWorkerContext());
    sd = new StructureDefinition();
    sd.setId("read-listener");
    sd.setUrl(URL);
    sd.setVersion("1.0.0");
    sd.setName("ReadListener");
    sd.setKind(StructureDefinitionKind.LOGICAL);
    sd.setType(URL);
    sd.setDerivation(TypeDerivationRule.SPECIALIZATION);
    context.cacheResource(sd);
    recorder = new Recorder();
  }

  @Test
  void noListenerUnlessOneIsSet() {
    assertNull(context.getResourceReadListener());
    context.setResourceReadListener(recorder);
    assertSame(recorder, context.getResourceReadListener());
    context.setResourceReadListener(null);
    assertNull(context.getResourceReadListener());
  }

  @Test
  void fetchResourceTellsTheListenerWhatItFound() {
    context.setResourceReadListener(recorder);
    StructureDefinition found = context.fetchResource(StructureDefinition.class, URL, VersionResolutionRules.defaultRule(), "1.0.0");

    assertSame(sd, found);
    assertEquals(List.of("one StructureDefinition " + URL + " 1.0.0"), recorder.calls);
    assertSame(sd, recorder.results.get(0));
  }

  @Test
  void aLookupThatFindsNothingIsToldToo() {
    context.setResourceReadListener(recorder);
    assertNull(context.fetchResource(StructureDefinition.class, URL + "-missing", VersionResolutionRules.defaultRule()));

    assertEquals(List.of("one StructureDefinition " + URL + "-missing null"), recorder.calls);
    assertNull(recorder.results.get(0));
  }

  @Test
  void fetchResourcesByTypeTellsTheListenerTheWholeList() {
    context.setResourceReadListener(recorder);
    List<StructureDefinition> list = context.fetchResourcesByType(StructureDefinition.class);

    assertEquals(List.of("list StructureDefinition"), recorder.calls);
    assertSame(list, recorder.results.get(0));
    assertTrue(list.contains(sd));
  }

  @Test
  void aLookupOfEveryTypeHasAnEmptyType() {
    boolean allowed = BaseWorkerContext.isAllowedToIterateTerminologyResources();
    BaseWorkerContext.setAllowedToIterateTerminologyResources(true);
    try {
      context.setResourceReadListener(recorder);
      context.fetchResourcesByType(Resource.class);
    } finally {
      BaseWorkerContext.setAllowedToIterateTerminologyResources(allowed);
    }

    assertEquals(List.of("list "), recorder.calls);
  }

  static Stream<Arguments> lookups() {
    return Stream.of(
      Arguments.of("fetchResourceById", (Function<SimpleWorkerContext, Object>) c -> c.fetchResourceById("StructureDefinition", "read-listener"), "one StructureDefinition read-listener null"),
      Arguments.of("getStructure", (Function<SimpleWorkerContext, Object>) c -> c.getStructure(URL), "one StructureDefinition " + URL + " null"),
      Arguments.of("fetchTypeDefinition", (Function<SimpleWorkerContext, Object>) c -> c.fetchTypeDefinition("Patient"), "one StructureDefinition Patient null"),
      Arguments.of("fetchTypeDefinitions", (Function<SimpleWorkerContext, Object>) c -> c.fetchTypeDefinitions("Patient"), "list StructureDefinition?type=Patient"),
      Arguments.of("fetchResourceVersions", (Function<SimpleWorkerContext, Object>) c -> c.fetchResourceVersions(StructureDefinition.class, URL), "list StructureDefinition?url=" + URL),
      Arguments.of("fetchResourceVersionsByTypeAndUrl", (Function<SimpleWorkerContext, Object>) c -> c.fetchResourceVersionsByTypeAndUrl(StructureDefinition.class, URL), "list StructureDefinition?url=" + URL),
      Arguments.of("fetchSpecializations", (Function<SimpleWorkerContext, Object>) c -> c.fetchSpecializations(), "list StructureDefinition?derivation=specialization"),
      Arguments.of("listStructures", (Function<SimpleWorkerContext, Object>) c -> c.listStructures(), "list StructureDefinition"),
      Arguments.of("listCodeSystems", (Function<SimpleWorkerContext, Object>) c -> c.listCodeSystems(), "list CodeSystem"),
      Arguments.of("allImplementationGuides", (Function<SimpleWorkerContext, Object>) c -> c.allImplementationGuides(), "list ImplementationGuide"));
  }

  @ParameterizedTest(name = "{0}")
  @MethodSource("lookups")
  void eachLookupTellsTheListenerWhatItReturned(String name, Function<SimpleWorkerContext, Object> lookup, String expected) {
    context.setResourceReadListener(recorder);
    Object result = lookup.apply(context);

    assertTrue(recorder.calls.contains(expected), name + " told the listener " + recorder.calls);
    int i = recorder.calls.lastIndexOf(expected);
    assertSame(result, recorder.results.get(i));
  }

  @Test
  void aSupplementedCodeSystemTellsTheListenerItsSupplements() {
    CodeSystem cs = context.fetchCodeSystem("http://hl7.org/fhir/administrative-gender", VersionResolutionRules.defaultRule());
    assertNotNull(cs, "the core package should have it");
    context.setResourceReadListener(recorder);
    context.fetchSupplementedCodeSystem("http://hl7.org/fhir/administrative-gender", VersionResolutionRules.defaultRule());

    assertTrue(recorder.calls.contains("list CodeSystem?supplements=" + cs.getVersionedUrl()), recorder.calls.toString());
  }

  @Test
  void anAnswerFromTheMemoOfAllStructuresIsToldToo() {
    List<StructureDefinition> first = context.getCutils().allStructures();
    context.setResourceReadListener(recorder);
    List<StructureDefinition> second = context.getCutils().allStructures();

    assertSame(first, second);
    assertEquals(List.of("list StructureDefinition"), recorder.calls);
    assertSame(second, recorder.results.get(0));
  }

  @Test
  void anAnswerFromTheOidMemoTellsWhatItWasWorkedOutFrom() {
    context.getCutils().oid2Uri("1.2.3.4.5.6.7.8.9");
    context.setResourceReadListener(recorder);
    context.getCutils().oid2Uri("1.2.3.4.5.6.7.8.9");

    assertTrue(recorder.calls.contains("list CodeSystem"), recorder.calls.toString());
    assertTrue(recorder.calls.contains("list NamingSystem"), recorder.calls.toString());
  }

  @Test
  void nothingIsToldOnceTheListenerIsCleared() {
    context.setResourceReadListener(recorder);
    context.setResourceReadListener(null);
    context.fetchResource(StructureDefinition.class, URL, VersionResolutionRules.defaultRule());
    context.fetchResourcesByType(StructureDefinition.class);
    context.getCutils().allStructures();
    context.getCutils().allStructures();

    assertTrue(recorder.calls.isEmpty(), recorder.calls.toString());
  }

  @Test
  void aCopyOfTheContextHasNoListener() throws IOException {
    context.setResourceReadListener(recorder);
    SimpleWorkerContext copy = new SimpleWorkerContext(context);

    assertNull(copy.getResourceReadListener());
    copy.fetchResource(StructureDefinition.class, URL, VersionResolutionRules.defaultRule());
    assertTrue(recorder.calls.isEmpty(), recorder.calls.toString());
  }
}
