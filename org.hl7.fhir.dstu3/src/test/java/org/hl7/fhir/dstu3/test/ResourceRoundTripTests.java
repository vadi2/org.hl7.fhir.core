package org.hl7.fhir.dstu3.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.hl7.fhir.dstu3.context.SimpleWorkerContext;
import org.hl7.fhir.dstu3.formats.IParser.OutputStyle;
import org.hl7.fhir.dstu3.formats.XmlParser;
import org.hl7.fhir.dstu3.model.DomainResource;
import org.hl7.fhir.dstu3.model.Resource;
import org.hl7.fhir.dstu3.test.support.TestingUtilities;
import org.hl7.fhir.dstu3.utils.EOperationOutcome;
import org.hl7.fhir.dstu3.utils.NarrativeGenerator;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.filesystem.ManagedFileAccess;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
@Deprecated
public class ResourceRoundTripTests {

  @Test
  public void test() throws FileNotFoundException, IOException, FHIRException, EOperationOutcome {
    if (TestingUtilities.context == null)
      TestingUtilities.context = SimpleWorkerContext.fromPack("C:\\work\\org.hl7.fhir\\build\\publish\\definitions.xml.zip");
    Resource res = new XmlParser().parse(ManagedFileAccess.inStream("C:\\work\\org.hl7.fhir\\build\\tests\\resources\\unicode.xml"));
    new NarrativeGenerator("", "", TestingUtilities.context).generate((DomainResource) res);
    new XmlParser().setOutputStyle(OutputStyle.PRETTY).compose(ManagedFileAccess.outStream("C:\\work\\org.hl7.fhir\\build\\tests\\resources\\unicode.out.xml"), res);
  }

}