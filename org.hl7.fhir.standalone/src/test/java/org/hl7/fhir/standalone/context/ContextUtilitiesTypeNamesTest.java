package org.hl7.fhir.standalone.context;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.model.core.CanonicalResource;
import org.hl7.fhir.model.core.Enumerations.FHIRVersion;
import org.hl7.fhir.model.core.PackageInformation;
import org.hl7.fhir.model.core.StructureDefinition;
import org.hl7.fhir.model.core.StructureDefinition.StructureDefinitionKind;
import org.hl7.fhir.model.core.StructureDefinition.TypeDerivationRule;
import org.hl7.fhir.services.context.CanonicalResourceProxy;
import org.hl7.fhir.services.context.ContextUtilities;
import org.hl7.fhir.standalone.testing.TestingUtilities;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.utilities.VersionUtilities;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ContextUtilitiesTypeNamesTest {

  private static class CountingProxy extends CanonicalResourceProxy {
    private final StructureDefinition sd;
    private final AtomicInteger loads = new AtomicInteger();

    CountingProxy(StructureDefinition sd, String indexedDerivation) {
      super("StructureDefinition", sd.getId(), sd.getUrl(), sd.getVersion(), null, indexedDerivation, null);
      this.sd = sd;
    }

    @Override
    public CanonicalResource loadResource() throws FHIRException {
      loads.incrementAndGet();
      return sd;
    }
  }

  private static SimpleWorkerContext context;
  private static CountingProxy constraint;

  private static StructureDefinition sd(String id, StructureDefinitionKind kind, TypeDerivationRule derivation, FHIRVersion version) {
    StructureDefinition sd = new StructureDefinition();
    sd.setId(id);
    sd.setUrl("http://example.org/fhir/StructureDefinition/type-names-" + id);
    sd.setVersion("1.0.0");
    sd.setName("TypeNames" + id);
    sd.setKind(kind);
    sd.setType(kind == StructureDefinitionKind.LOGICAL ? sd.getUrl() : "TypeNames" + id);
    sd.setDerivation(derivation);
    sd.setFhirVersion(version);
    return sd;
  }

  @BeforeAll
  static void setUp() throws IOException {
    context = new SimpleWorkerContext((SimpleWorkerContext) TestingUtilities.getSharedWorkerContext("5.0.0"));
    PackageInformation pi = new PackageInformation("example.type.names", "1.0.0", "5.0.0", new Date());

    constraint = new CountingProxy(sd("Constraint", StructureDefinitionKind.RESOURCE, TypeDerivationRule.CONSTRAINT, FHIRVersion._5_0_0), "constraint");
    context.registerResourceFromPackage(constraint, pi);
    // a package index that doesn't give the derivation: these have to be loaded to find out
    context.registerResourceFromPackage(new CountingProxy(sd("UnknownConstraint", StructureDefinitionKind.RESOURCE, TypeDerivationRule.CONSTRAINT, FHIRVersion._5_0_0), null), pi);
    context.registerResourceFromPackage(new CountingProxy(sd("Resource", StructureDefinitionKind.RESOURCE, TypeDerivationRule.SPECIALIZATION, FHIRVersion._5_0_0), null), pi);
    context.registerResourceFromPackage(new CountingProxy(sd("Logical", StructureDefinitionKind.LOGICAL, TypeDerivationRule.SPECIALIZATION, FHIRVersion._5_0_0), "specialization"), pi);
    context.registerResourceFromPackage(new CountingProxy(sd("OtherVersion", StructureDefinitionKind.COMPLEXTYPE, TypeDerivationRule.SPECIALIZATION, FHIRVersion._4_0_1), "specialization"), pi);
  }

  @Test
  void typeNamesAreTheSameAsFilteringAllStructures() {
    int loads = constraint.loads.get();
    List<String> actual = new ContextUtilities(context).getTypeNames();
    assertEquals(loads, constraint.loads.get(), "a known constraint shouldn't be loaded");

    Set<String> expected = new HashSet<>();
    for (StructureDefinition sd : context.fetchResourcesByType(StructureDefinition.class)) {
      if (sd.getKind() != StructureDefinitionKind.LOGICAL && sd.getDerivation() == TypeDerivationRule.SPECIALIZATION) {
        expected.add(sd.getName());
      }
    }
    assertEquals(Utilities.sorted(expected), actual);
    assertTrue(actual.contains("TypeNamesResource"));
    assertTrue(actual.contains("TypeNamesOtherVersion"));
    assertTrue(actual.contains("Patient"));
    assertFalse(actual.contains("TypeNamesLogical"));
    assertFalse(actual.contains("TypeNamesConstraint"));
    assertFalse(actual.contains("TypeNamesUnknownConstraint"));
  }

  @Test
  void typeNameSetIsTheSameAsFilteringAllStructures() {
    int loads = constraint.loads.get();
    Set<String> actual = new ContextUtilities(context).getTypeNameSet();
    assertEquals(loads, constraint.loads.get(), "a known constraint shouldn't be loaded");

    Set<String> expected = new HashSet<>();
    for (StructureDefinition sd : context.fetchResourcesByType(StructureDefinition.class)) {
      if (sd.getKind() != StructureDefinitionKind.LOGICAL && sd.getDerivation() == TypeDerivationRule.SPECIALIZATION &&
        VersionUtilities.versionMatches(context.getFHIRVersion(), sd.getFhirVersion().toCode())) {
        expected.add(sd.getName());
      }
    }
    assertEquals(expected, actual);
    assertTrue(actual.contains("TypeNamesResource"));
    assertTrue(actual.contains("Patient"));
    assertFalse(actual.contains("TypeNamesOtherVersion"));
    assertFalse(actual.contains("TypeNamesLogical"));
    assertFalse(actual.contains("TypeNamesConstraint"));
    assertFalse(actual.contains("TypeNamesUnknownConstraint"));
  }
}
