package org.hl7.fhir.convertors.conv30_40.resources30_40;

import org.hl7.fhir.convertors.VersionConvertorConstants;
import org.hl7.fhir.convertors.context.ConversionContext30_40;
import org.hl7.fhir.convertors.conv30_40.datatypes30_40.Reference30_40;
import org.hl7.fhir.convertors.conv30_40.datatypes30_40.complextypes30_40.Address30_40;
import org.hl7.fhir.convertors.conv30_40.datatypes30_40.complextypes30_40.Attachment30_40;
import org.hl7.fhir.convertors.conv30_40.datatypes30_40.complextypes30_40.CodeableConcept30_40;
import org.hl7.fhir.convertors.conv30_40.datatypes30_40.complextypes30_40.ContactPoint30_40;
import org.hl7.fhir.convertors.conv30_40.datatypes30_40.complextypes30_40.HumanName30_40;
import org.hl7.fhir.convertors.conv30_40.datatypes30_40.complextypes30_40.Identifier30_40;
import org.hl7.fhir.convertors.conv30_40.datatypes30_40.complextypes30_40.Period30_40;
import org.hl7.fhir.convertors.conv30_40.datatypes30_40.primitivetypes30_40.Boolean30_40;
import org.hl7.fhir.convertors.conv30_40.datatypes30_40.primitivetypes30_40.Date30_40;
import org.hl7.fhir.dstu3.model.Enumeration;
import org.hl7.fhir.dstu3.model.Patient;
import org.hl7.fhir.exceptions.FHIRException;

public class Patient30_40 {

  public static org.hl7.fhir.dstu3.model.Patient.AnimalComponent convertAnimalComponent(org.hl7.fhir.r4.model.Extension src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.Patient.AnimalComponent tgt = new org.hl7.fhir.dstu3.model.Patient.AnimalComponent();
    ConversionContext30_40.INSTANCE.getVersionConvertor_30_40().copyElement(src, tgt);
    if (src.hasExtension("species"))
      tgt.setSpecies(CodeableConcept30_40.convertCodeableConcept((org.hl7.fhir.r4.model.CodeableConcept) src.getExtensionByUrl("species").getValue()));
    if (src.hasExtension("breed"))
      tgt.setBreed(CodeableConcept30_40.convertCodeableConcept((org.hl7.fhir.r4.model.CodeableConcept) src.getExtensionByUrl("breed").getValue()));
    if (src.hasExtension("genderStatus"))
      tgt.setGenderStatus(CodeableConcept30_40.convertCodeableConcept((org.hl7.fhir.r4.model.CodeableConcept) src.getExtensionByUrl("genderStatus").getValue()));
    return tgt;
  }

  public static org.hl7.fhir.r4.model.Extension convertAnimalComponent(org.hl7.fhir.dstu3.model.Patient.AnimalComponent src) throws FHIRException {
    if (src == null)
      return null;
    org.hl7.fhir.r4.model.Extension tgt = new org.hl7.fhir.r4.model.Extension();
    tgt.setUrl(VersionConvertorConstants.EXT_PAT_ANIMAL);
    ConversionContext30_40.INSTANCE.getVersionConvertor_30_40().copyElement(src, tgt);
    if (src.hasSpecies())
      tgt.addExtension("species", CodeableConcept30_40.convertCodeableConcept(src.getSpecies()));
    if (src.hasBreed())
      tgt.addExtension("breed", CodeableConcept30_40.convertCodeableConcept(src.getBreed()));
    if (src.hasGenderStatus())
      tgt.addExtension("genderStatus", CodeableConcept30_40.convertCodeableConcept(src.getGenderStatus()));
    return tgt;
  }

  public static org.hl7.fhir.r4.model.Patient.ContactComponent convertContactComponent(org.hl7.fhir.dstu3.model.Patient.ContactComponent src) throws FHIRException {
    if (src == null)
      return null;
    org.hl7.fhir.r4.model.Patient.ContactComponent tgt = new org.hl7.fhir.r4.model.Patient.ContactComponent();
    ConversionContext30_40.INSTANCE.getVersionConvertor_30_40().copyBackboneElement(src,tgt);
    for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getRelationship())
      tgt.addRelationship(CodeableConcept30_40.convertCodeableConcept(t));
    if (src.hasName())
      tgt.setName(HumanName30_40.convertHumanName(src.getName()));
    for (org.hl7.fhir.dstu3.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(ContactPoint30_40.convertContactPoint(t));
    if (src.hasAddress())
      tgt.setAddress(Address30_40.convertAddress(src.getAddress()));
    if (src.hasGender())
      tgt.setGenderElement(Enumerations30_40.convertAdministrativeGender(src.getGenderElement()));
    if (src.hasOrganization())
      tgt.setOrganization(Reference30_40.convertReference(src.getOrganization()));
    if (src.hasPeriod())
      tgt.setPeriod(Period30_40.convertPeriod(src.getPeriod()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Patient.ContactComponent convertContactComponent(org.hl7.fhir.r4.model.Patient.ContactComponent src) throws FHIRException {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Patient.ContactComponent tgt = new org.hl7.fhir.dstu3.model.Patient.ContactComponent();
    ConversionContext30_40.INSTANCE.getVersionConvertor_30_40().copyBackboneElement(src,tgt);
    for (org.hl7.fhir.r4.model.CodeableConcept t : src.getRelationship())
      tgt.addRelationship(CodeableConcept30_40.convertCodeableConcept(t));
    if (src.hasName())
      tgt.setName(HumanName30_40.convertHumanName(src.getName()));
    for (org.hl7.fhir.r4.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(ContactPoint30_40.convertContactPoint(t));
    if (src.hasAddress())
      tgt.setAddress(Address30_40.convertAddress(src.getAddress()));
    if (src.hasGender())
      tgt.setGenderElement(Enumerations30_40.convertAdministrativeGender(src.getGenderElement()));
    if (src.hasOrganization())
      tgt.setOrganization(Reference30_40.convertReference(src.getOrganization()));
    if (src.hasPeriod())
      tgt.setPeriod(Period30_40.convertPeriod(src.getPeriod()));
    return tgt;
  }

  static public org.hl7.fhir.dstu3.model.Enumeration<org.hl7.fhir.dstu3.model.Patient.LinkType> convertLinkType(org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Patient.LinkType> src) throws FHIRException {
      if (src == null || src.isEmpty())
          return null;
      Enumeration<Patient.LinkType> tgt = new Enumeration<>(new Patient.LinkTypeEnumFactory());
      ConversionContext30_40.INSTANCE.getVersionConvertor_30_40().copyElement(src, tgt);
      if (src.getValue() == null) {
          tgt.setValue(null);
      } else {
          switch (src.getValue()) {
              case REPLACEDBY:
                  tgt.setValue(Patient.LinkType.REPLACEDBY);
                  break;
              case REPLACES:
                  tgt.setValue(Patient.LinkType.REPLACES);
                  break;
              case REFER:
                  tgt.setValue(Patient.LinkType.REFER);
                  break;
              case SEEALSO:
                  tgt.setValue(Patient.LinkType.SEEALSO);
                  break;
              default:
                  tgt.setValue(Patient.LinkType.NULL);
                  break;
          }
      }
      return tgt;
  }

  static public org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Patient.LinkType> convertLinkType(org.hl7.fhir.dstu3.model.Enumeration<org.hl7.fhir.dstu3.model.Patient.LinkType> src) throws FHIRException {
      if (src == null || src.isEmpty())
          return null;
      org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Patient.LinkType> tgt = new org.hl7.fhir.r4.model.Enumeration<>(new org.hl7.fhir.r4.model.Patient.LinkTypeEnumFactory());
      ConversionContext30_40.INSTANCE.getVersionConvertor_30_40().copyElement(src, tgt);
      if (src.getValue() == null) {
          tgt.setValue(null);
      } else {
          switch (src.getValue()) {
              case REPLACEDBY:
                  tgt.setValue(org.hl7.fhir.r4.model.Patient.LinkType.REPLACEDBY);
                  break;
              case REPLACES:
                  tgt.setValue(org.hl7.fhir.r4.model.Patient.LinkType.REPLACES);
                  break;
              case REFER:
                  tgt.setValue(org.hl7.fhir.r4.model.Patient.LinkType.REFER);
                  break;
              case SEEALSO:
                  tgt.setValue(org.hl7.fhir.r4.model.Patient.LinkType.SEEALSO);
                  break;
              default:
                  tgt.setValue(org.hl7.fhir.r4.model.Patient.LinkType.NULL);
                  break;
          }
      }
      return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Patient convertPatient(org.hl7.fhir.r4.model.Patient src) throws FHIRException {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Patient tgt = new org.hl7.fhir.dstu3.model.Patient();
    ConversionContext30_40.INSTANCE.getVersionConvertor_30_40().copyDomainResource(src, tgt);
    for (org.hl7.fhir.r4.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(Identifier30_40.convertIdentifier(t));
    if (src.hasActive())
      tgt.setActiveElement(Boolean30_40.convertBoolean(src.getActiveElement()));
    for (org.hl7.fhir.r4.model.HumanName t : src.getName()) tgt.addName(HumanName30_40.convertHumanName(t));
    for (org.hl7.fhir.r4.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(ContactPoint30_40.convertContactPoint(t));
    if (src.hasGender())
      tgt.setGenderElement(Enumerations30_40.convertAdministrativeGender(src.getGenderElement()));
    if (src.hasBirthDate())
      tgt.setBirthDateElement(Date30_40.convertDate(src.getBirthDateElement()));
    if (src.hasDeceased())
      tgt.setDeceased(ConversionContext30_40.INSTANCE.getVersionConvertor_30_40().convertType(src.getDeceased()));
    for (org.hl7.fhir.r4.model.Address t : src.getAddress()) tgt.addAddress(Address30_40.convertAddress(t));
    if (src.hasMaritalStatus())
      tgt.setMaritalStatus(CodeableConcept30_40.convertCodeableConcept(src.getMaritalStatus()));
    if (src.hasMultipleBirth())
      tgt.setMultipleBirth(ConversionContext30_40.INSTANCE.getVersionConvertor_30_40().convertType(src.getMultipleBirth()));
    for (org.hl7.fhir.r4.model.Attachment t : src.getPhoto()) tgt.addPhoto(Attachment30_40.convertAttachment(t));
    for (org.hl7.fhir.r4.model.Patient.ContactComponent t : src.getContact())
      tgt.addContact(convertContactComponent(t));
    if (src.hasExtension(VersionConvertorConstants.EXT_PAT_ANIMAL))
      tgt.setAnimal(convertAnimalComponent(src.getExtensionByUrl(VersionConvertorConstants.EXT_PAT_ANIMAL)));
    for (org.hl7.fhir.r4.model.Patient.PatientCommunicationComponent t : src.getCommunication())
      tgt.addCommunication(convertPatientCommunicationComponent(t));
    for (org.hl7.fhir.r4.model.Reference t : src.getGeneralPractitioner())
      tgt.addGeneralPractitioner(Reference30_40.convertReference(t));
    if (src.hasManagingOrganization())
      tgt.setManagingOrganization(Reference30_40.convertReference(src.getManagingOrganization()));
    for (org.hl7.fhir.r4.model.Patient.PatientLinkComponent t : src.getLink())
      tgt.addLink(convertPatientLinkComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.r4.model.Patient convertPatient(org.hl7.fhir.dstu3.model.Patient src) throws FHIRException {
    if (src == null)
      return null;
    org.hl7.fhir.r4.model.Patient tgt = new org.hl7.fhir.r4.model.Patient();
    ConversionContext30_40.INSTANCE.getVersionConvertor_30_40().copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(Identifier30_40.convertIdentifier(t));
    if (src.hasActive())
      tgt.setActiveElement(Boolean30_40.convertBoolean(src.getActiveElement()));
    for (org.hl7.fhir.dstu3.model.HumanName t : src.getName()) tgt.addName(HumanName30_40.convertHumanName(t));
    for (org.hl7.fhir.dstu3.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(ContactPoint30_40.convertContactPoint(t));
    if (src.hasGender())
      tgt.setGenderElement(Enumerations30_40.convertAdministrativeGender(src.getGenderElement()));
    if (src.hasBirthDate())
      tgt.setBirthDateElement(Date30_40.convertDate(src.getBirthDateElement()));
    if (src.hasDeceased())
      tgt.setDeceased(ConversionContext30_40.INSTANCE.getVersionConvertor_30_40().convertType(src.getDeceased()));
    for (org.hl7.fhir.dstu3.model.Address t : src.getAddress()) tgt.addAddress(Address30_40.convertAddress(t));
    if (src.hasMaritalStatus())
      tgt.setMaritalStatus(CodeableConcept30_40.convertCodeableConcept(src.getMaritalStatus()));
    if (src.hasMultipleBirth())
      tgt.setMultipleBirth(ConversionContext30_40.INSTANCE.getVersionConvertor_30_40().convertType(src.getMultipleBirth()));
    for (org.hl7.fhir.dstu3.model.Attachment t : src.getPhoto()) tgt.addPhoto(Attachment30_40.convertAttachment(t));
    for (org.hl7.fhir.dstu3.model.Patient.ContactComponent t : src.getContact())
      tgt.addContact(convertContactComponent(t));
    if (src.hasAnimal())
      tgt.addExtension(convertAnimalComponent(src.getAnimal()));
    for (org.hl7.fhir.dstu3.model.Patient.PatientCommunicationComponent t : src.getCommunication())
      tgt.addCommunication(convertPatientCommunicationComponent(t));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getGeneralPractitioner())
      tgt.addGeneralPractitioner(Reference30_40.convertReference(t));
    if (src.hasManagingOrganization())
      tgt.setManagingOrganization(Reference30_40.convertReference(src.getManagingOrganization()));
    for (org.hl7.fhir.dstu3.model.Patient.PatientLinkComponent t : src.getLink())
      tgt.addLink(convertPatientLinkComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Patient.PatientCommunicationComponent convertPatientCommunicationComponent(org.hl7.fhir.r4.model.Patient.PatientCommunicationComponent src) throws FHIRException {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Patient.PatientCommunicationComponent tgt = new org.hl7.fhir.dstu3.model.Patient.PatientCommunicationComponent();
    ConversionContext30_40.INSTANCE.getVersionConvertor_30_40().copyBackboneElement(src,tgt);
    if (src.hasLanguage())
      tgt.setLanguage(CodeableConcept30_40.convertCodeableConcept(src.getLanguage()));
    if (src.hasPreferred())
      tgt.setPreferredElement(Boolean30_40.convertBoolean(src.getPreferredElement()));
    return tgt;
  }

  public static org.hl7.fhir.r4.model.Patient.PatientCommunicationComponent convertPatientCommunicationComponent(org.hl7.fhir.dstu3.model.Patient.PatientCommunicationComponent src) throws FHIRException {
    if (src == null)
      return null;
    org.hl7.fhir.r4.model.Patient.PatientCommunicationComponent tgt = new org.hl7.fhir.r4.model.Patient.PatientCommunicationComponent();
    ConversionContext30_40.INSTANCE.getVersionConvertor_30_40().copyBackboneElement(src,tgt);
    if (src.hasLanguage())
      tgt.setLanguage(CodeableConcept30_40.convertCodeableConcept(src.getLanguage()));
    if (src.hasPreferred())
      tgt.setPreferredElement(Boolean30_40.convertBoolean(src.getPreferredElement()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Patient.PatientLinkComponent convertPatientLinkComponent(org.hl7.fhir.r4.model.Patient.PatientLinkComponent src) throws FHIRException {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Patient.PatientLinkComponent tgt = new org.hl7.fhir.dstu3.model.Patient.PatientLinkComponent();
    ConversionContext30_40.INSTANCE.getVersionConvertor_30_40().copyBackboneElement(src,tgt);
    if (src.hasOther())
      tgt.setOther(Reference30_40.convertReference(src.getOther()));
    if (src.hasType())
      tgt.setTypeElement(convertLinkType(src.getTypeElement()));
    return tgt;
  }

  public static org.hl7.fhir.r4.model.Patient.PatientLinkComponent convertPatientLinkComponent(org.hl7.fhir.dstu3.model.Patient.PatientLinkComponent src) throws FHIRException {
    if (src == null)
      return null;
    org.hl7.fhir.r4.model.Patient.PatientLinkComponent tgt = new org.hl7.fhir.r4.model.Patient.PatientLinkComponent();
    ConversionContext30_40.INSTANCE.getVersionConvertor_30_40().copyBackboneElement(src,tgt);
    if (src.hasOther())
      tgt.setOther(Reference30_40.convertReference(src.getOther()));
    if (src.hasType())
      tgt.setTypeElement(convertLinkType(src.getTypeElement()));
    return tgt;
  }
}