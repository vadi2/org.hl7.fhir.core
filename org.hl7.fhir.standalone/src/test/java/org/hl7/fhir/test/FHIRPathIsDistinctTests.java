package org.hl7.fhir.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.model.Base;
import org.hl7.fhir.model.core.CodeType;
import org.hl7.fhir.model.core.DecimalType;
import org.hl7.fhir.model.core.IntegerType;
import org.hl7.fhir.model.core.Patient;
import org.hl7.fhir.model.core.StringType;
import org.hl7.fhir.model.core.UriType;
import org.hl7.fhir.model.core.UrlType;
import org.hl7.fhir.services.fhirpath.FHIRPathEngine;
import org.hl7.fhir.standalone.context.SimpleWorkerContext;
import org.hl7.fhir.standalone.testing.TestingUtilities;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * isDistinct() compares collections of string-like primitives by value without comparing every pair; these check
 * it gives the same answers as comparing every pair with doEquals() does
 */
class FHIRPathIsDistinctTests {

  private static FHIRPathEngine fp;

  @BeforeAll
  static void setUp() throws FHIRException, IOException {
    fp = new FHIRPathEngine(new SimpleWorkerContext((SimpleWorkerContext) TestingUtilities.getSharedWorkerContext()));
  }

  @AfterAll
  static void tearDown() {
    fp = null;
  }

  private boolean isDistinct(Base... values) {
    Map<String, List<Base>> vars = new HashMap<>();
    vars.put("v", new ArrayList<>(Arrays.asList(values)));
    List<Base> res = fp.evaluate(null, null, null, new Patient(), fp.parse("%v.isDistinct()"), vars);
    Assertions.assertEquals(1, res.size());
    return Boolean.parseBoolean(res.get(0).primitiveValue());
  }

  @Test
  void strings() {
    Assertions.assertTrue(isDistinct(new StringType("a"), new StringType("b"), new StringType("c")));
    Assertions.assertFalse(isDistinct(new StringType("a"), new StringType("b"), new StringType("a")));
  }

  @Test
  void differentStringLikeTypesWithTheSameValue() {
    Assertions.assertFalse(isDistinct(new StringType("a"), new CodeType("a")));
    Assertions.assertFalse(isDistinct(new UriType("http://example.org"), new UrlType("http://example.org")));
  }

  @Test
  void primitivesWithNoValue() {
    Assertions.assertFalse(isDistinct(new StringType(), new StringType()));
    Assertions.assertTrue(isDistinct(new StringType(), new StringType("a")));
  }

  @Test
  void notAllStringLike() {
    Assertions.assertTrue(isDistinct(new StringType("1"), new IntegerType(2)));
    Assertions.assertTrue(isDistinct(new IntegerType(1), new IntegerType(2)));
    Assertions.assertFalse(isDistinct(new IntegerType(1), new IntegerType(1)));
    Assertions.assertFalse(isDistinct(new DecimalType("1.0"), new DecimalType("1")));
  }
}
