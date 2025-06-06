package org.hl7.fhir.utilities.settings;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.hl7.fhir.utilities.tests.ResourceLoaderTests;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Isolated;

@Isolated
public class FhirSettingsTests implements ResourceLoaderTests {

  private static String existingFhirSettingsPath;

  @BeforeAll
  public static void beforeAll() {
    existingFhirSettingsPath = System.getProperty(FhirSettings.FHIR_SETTINGS_PATH);
    System.clearProperty(FhirSettings.FHIR_SETTINGS_PATH);
  }

  @AfterEach
  public void afterEach() {
    System.clearProperty(FhirSettings.FHIR_SETTINGS_PATH);
  }

  @AfterAll
  public static void afterAll() {
    if (existingFhirSettingsPath == null) {
      System.clearProperty(FhirSettings.FHIR_SETTINGS_PATH);
    } else {
      System.setProperty(FhirSettings.FHIR_SETTINGS_PATH, existingFhirSettingsPath);
    }
  }

  @Test
  public void testDefaultFhirSettingsPath() throws IOException {
    String actualPath = FhirSettings.getSettingsFilePath(null);
    assertEquals(FhirSettings.getDefaultSettingsPath(), actualPath);
  }

  @Test
  public void testJavaSystemPropertyFhirSettingsPath() throws IOException {
    final String dummyPath = "dummy-path";
    System.setProperty(FhirSettings.FHIR_SETTINGS_PATH, dummyPath);
    String actualPath = FhirSettings.getSettingsFilePath(null);
    assertEquals(dummyPath, actualPath);
  }

  @Test
  public void testExplicitSettingsPathSelected() throws IOException {
    final String wrongDummyPath = "wrong-dummy-path";
    final String dummyPath = "dummy-path";
    System.setProperty(FhirSettings.FHIR_SETTINGS_PATH, wrongDummyPath);
    String actualPath = FhirSettings.getSettingsFilePath(dummyPath);
    assertEquals(dummyPath, actualPath);
  }

  @Test
  public void testExplicitFhirSettingsPath() throws IOException {
    final String dummyPath = "dummy-path";
    String actualPath = FhirSettings.getSettingsFilePath(dummyPath);
    assertEquals(dummyPath, actualPath);
  }

  @Test
  public void testParseFhirSettings() throws IOException {
    Path path = Files.createTempFile("fhir-settings", "json").toAbsolutePath();
    copyResourceToFile(path, "settings", "settings-example.json");

    FhirSettingsPOJO fhirSettings = FhirSettings.getFhirSettingsPOJO(path.toString());

   assertEquals("dummy-npm-path", fhirSettings.getNpmPath());
   assertEquals("dummy-ruby-path", fhirSettings.getRubyPath());
    assertEquals("dummy-api-key-value", fhirSettings.getApiKeys().get("dummy-api-key"));
    assertEquals("dummy-fhir-test-cases-path", fhirSettings.getFhirTestCasesPath());
    assertEquals("dummy-diff-tool-path", fhirSettings.getDiffToolPath());
    assertEquals("dummy-temp-path", fhirSettings.getTempPath());
    assertEquals("dummy-test-igs-path", fhirSettings.getTestIgsPath());

    assertTrue(fhirSettings.getIgnoreDefaultPackageServers());

    List<ServerDetailsPOJO> servers = fhirSettings.getServers();

    assertEquals(2, servers.size());

    assertEquals("http://dummy.org", servers.get(0).url);
    assertEquals("npm-package", servers.get(0).type);
    assertEquals("joe", servers.get(0).username);
    assertEquals("swordfish", servers.get(0).password);
    assertEquals("BASIC", servers.get(0).authenticationType);

    assertEquals("http://dummy2.com", servers.get(1).url);

  }
}
