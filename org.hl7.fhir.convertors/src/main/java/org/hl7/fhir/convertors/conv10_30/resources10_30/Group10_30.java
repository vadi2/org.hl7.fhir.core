package org.hl7.fhir.convertors.conv10_30.resources10_30;

import org.hl7.fhir.convertors.context.ConversionContext10_30;
import org.hl7.fhir.convertors.conv10_30.datatypes10_30.Reference10_30;
import org.hl7.fhir.convertors.conv10_30.datatypes10_30.complextypes10_30.CodeableConcept10_30;
import org.hl7.fhir.convertors.conv10_30.datatypes10_30.complextypes10_30.Identifier10_30;
import org.hl7.fhir.convertors.conv10_30.datatypes10_30.complextypes10_30.Period10_30;
import org.hl7.fhir.convertors.conv10_30.datatypes10_30.primitivetypes10_30.Boolean10_30;
import org.hl7.fhir.convertors.conv10_30.datatypes10_30.primitivetypes10_30.String10_30;
import org.hl7.fhir.convertors.conv10_30.datatypes10_30.primitivetypes10_30.UnsignedInt10_30;
import org.hl7.fhir.dstu2.model.Enumeration;
import org.hl7.fhir.dstu2.model.Group;
import org.hl7.fhir.exceptions.FHIRException;

public class Group10_30 {

  public static org.hl7.fhir.dstu2.model.Group convertGroup(org.hl7.fhir.dstu3.model.Group src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2.model.Group tgt = new org.hl7.fhir.dstu2.model.Group();
    ConversionContext10_30.INSTANCE.getVersionConvertor_10_30().copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(Identifier10_30.convertIdentifier(t));
    if (src.hasType())
      tgt.setTypeElement(convertGroupType(src.getTypeElement()));
    if (src.hasActualElement())
      tgt.setActualElement(Boolean10_30.convertBoolean(src.getActualElement()));
    if (src.hasCode())
      tgt.setCode(CodeableConcept10_30.convertCodeableConcept(src.getCode()));
    if (src.hasNameElement())
      tgt.setNameElement(String10_30.convertString(src.getNameElement()));
    if (src.hasQuantityElement())
      tgt.setQuantityElement(UnsignedInt10_30.convertUnsignedInt(src.getQuantityElement()));
    for (org.hl7.fhir.dstu3.model.Group.GroupCharacteristicComponent t : src.getCharacteristic())
      tgt.addCharacteristic(convertGroupCharacteristicComponent(t));
    for (org.hl7.fhir.dstu3.model.Group.GroupMemberComponent t : src.getMember())
      tgt.addMember(convertGroupMemberComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Group convertGroup(org.hl7.fhir.dstu2.model.Group src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.Group tgt = new org.hl7.fhir.dstu3.model.Group();
    ConversionContext10_30.INSTANCE.getVersionConvertor_10_30().copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(Identifier10_30.convertIdentifier(t));
    if (src.hasType())
      tgt.setTypeElement(convertGroupType(src.getTypeElement()));
    if (src.hasActualElement())
      tgt.setActualElement(Boolean10_30.convertBoolean(src.getActualElement()));
    if (src.hasCode())
      tgt.setCode(CodeableConcept10_30.convertCodeableConcept(src.getCode()));
    if (src.hasNameElement())
      tgt.setNameElement(String10_30.convertString(src.getNameElement()));
    if (src.hasQuantityElement())
      tgt.setQuantityElement(UnsignedInt10_30.convertUnsignedInt(src.getQuantityElement()));
    for (org.hl7.fhir.dstu2.model.Group.GroupCharacteristicComponent t : src.getCharacteristic())
      tgt.addCharacteristic(convertGroupCharacteristicComponent(t));
    for (org.hl7.fhir.dstu2.model.Group.GroupMemberComponent t : src.getMember())
      tgt.addMember(convertGroupMemberComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Group.GroupCharacteristicComponent convertGroupCharacteristicComponent(org.hl7.fhir.dstu2.model.Group.GroupCharacteristicComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.Group.GroupCharacteristicComponent tgt = new org.hl7.fhir.dstu3.model.Group.GroupCharacteristicComponent();
    ConversionContext10_30.INSTANCE.getVersionConvertor_10_30().copyBackboneElement(src,tgt);
    if (src.hasCode())
      tgt.setCode(CodeableConcept10_30.convertCodeableConcept(src.getCode()));
    if (src.hasValue())
      tgt.setValue(ConversionContext10_30.INSTANCE.getVersionConvertor_10_30().convertType(src.getValue()));
    if (src.hasExcludeElement())
      tgt.setExcludeElement(Boolean10_30.convertBoolean(src.getExcludeElement()));
    if (src.hasPeriod())
      tgt.setPeriod(Period10_30.convertPeriod(src.getPeriod()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Group.GroupCharacteristicComponent convertGroupCharacteristicComponent(org.hl7.fhir.dstu3.model.Group.GroupCharacteristicComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2.model.Group.GroupCharacteristicComponent tgt = new org.hl7.fhir.dstu2.model.Group.GroupCharacteristicComponent();
    ConversionContext10_30.INSTANCE.getVersionConvertor_10_30().copyBackboneElement(src,tgt);
    if (src.hasCode())
      tgt.setCode(CodeableConcept10_30.convertCodeableConcept(src.getCode()));
    if (src.hasValue())
      tgt.setValue(ConversionContext10_30.INSTANCE.getVersionConvertor_10_30().convertType(src.getValue()));
    if (src.hasExcludeElement())
      tgt.setExcludeElement(Boolean10_30.convertBoolean(src.getExcludeElement()));
    if (src.hasPeriod())
      tgt.setPeriod(Period10_30.convertPeriod(src.getPeriod()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Group.GroupMemberComponent convertGroupMemberComponent(org.hl7.fhir.dstu3.model.Group.GroupMemberComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu2.model.Group.GroupMemberComponent tgt = new org.hl7.fhir.dstu2.model.Group.GroupMemberComponent();
    ConversionContext10_30.INSTANCE.getVersionConvertor_10_30().copyBackboneElement(src,tgt);
    if (src.hasEntity())
      tgt.setEntity(Reference10_30.convertReference(src.getEntity()));
    if (src.hasPeriod())
      tgt.setPeriod(Period10_30.convertPeriod(src.getPeriod()));
    if (src.hasInactiveElement())
      tgt.setInactiveElement(Boolean10_30.convertBoolean(src.getInactiveElement()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Group.GroupMemberComponent convertGroupMemberComponent(org.hl7.fhir.dstu2.model.Group.GroupMemberComponent src) throws FHIRException {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.dstu3.model.Group.GroupMemberComponent tgt = new org.hl7.fhir.dstu3.model.Group.GroupMemberComponent();
    ConversionContext10_30.INSTANCE.getVersionConvertor_10_30().copyBackboneElement(src,tgt);
    if (src.hasEntity())
      tgt.setEntity(Reference10_30.convertReference(src.getEntity()));
    if (src.hasPeriod())
      tgt.setPeriod(Period10_30.convertPeriod(src.getPeriod()));
    if (src.hasInactiveElement())
      tgt.setInactiveElement(Boolean10_30.convertBoolean(src.getInactiveElement()));
    return tgt;
  }

  static public org.hl7.fhir.dstu2.model.Enumeration<org.hl7.fhir.dstu2.model.Group.GroupType> convertGroupType(org.hl7.fhir.dstu3.model.Enumeration<org.hl7.fhir.dstu3.model.Group.GroupType> src) throws FHIRException {
      if (src == null || src.isEmpty())
          return null;
      Enumeration<Group.GroupType> tgt = new Enumeration<>(new Group.GroupTypeEnumFactory());
      ConversionContext10_30.INSTANCE.getVersionConvertor_10_30().copyElement(src, tgt);
      if (src.getValue() == null) {
          tgt.setValue(null);
      } else {
          switch (src.getValue()) {
              case PERSON:
                  tgt.setValue(Group.GroupType.PERSON);
                  break;
              case ANIMAL:
                  tgt.setValue(Group.GroupType.ANIMAL);
                  break;
              case PRACTITIONER:
                  tgt.setValue(Group.GroupType.PRACTITIONER);
                  break;
              case DEVICE:
                  tgt.setValue(Group.GroupType.DEVICE);
                  break;
              case MEDICATION:
                  tgt.setValue(Group.GroupType.MEDICATION);
                  break;
              case SUBSTANCE:
                  tgt.setValue(Group.GroupType.SUBSTANCE);
                  break;
              default:
                  tgt.setValue(Group.GroupType.NULL);
                  break;
          }
      }
      return tgt;
  }

  static public org.hl7.fhir.dstu3.model.Enumeration<org.hl7.fhir.dstu3.model.Group.GroupType> convertGroupType(org.hl7.fhir.dstu2.model.Enumeration<org.hl7.fhir.dstu2.model.Group.GroupType> src) throws FHIRException {
      if (src == null || src.isEmpty())
          return null;
      org.hl7.fhir.dstu3.model.Enumeration<org.hl7.fhir.dstu3.model.Group.GroupType> tgt = new org.hl7.fhir.dstu3.model.Enumeration<>(new org.hl7.fhir.dstu3.model.Group.GroupTypeEnumFactory());
      ConversionContext10_30.INSTANCE.getVersionConvertor_10_30().copyElement(src, tgt);
      if (src.getValue() == null) {
          tgt.setValue(null);
      } else {
          switch (src.getValue()) {
              case PERSON:
                  tgt.setValue(org.hl7.fhir.dstu3.model.Group.GroupType.PERSON);
                  break;
              case ANIMAL:
                  tgt.setValue(org.hl7.fhir.dstu3.model.Group.GroupType.ANIMAL);
                  break;
              case PRACTITIONER:
                  tgt.setValue(org.hl7.fhir.dstu3.model.Group.GroupType.PRACTITIONER);
                  break;
              case DEVICE:
                  tgt.setValue(org.hl7.fhir.dstu3.model.Group.GroupType.DEVICE);
                  break;
              case MEDICATION:
                  tgt.setValue(org.hl7.fhir.dstu3.model.Group.GroupType.MEDICATION);
                  break;
              case SUBSTANCE:
                  tgt.setValue(org.hl7.fhir.dstu3.model.Group.GroupType.SUBSTANCE);
                  break;
              default:
                  tgt.setValue(org.hl7.fhir.dstu3.model.Group.GroupType.NULL);
                  break;
          }
      }
      return tgt;
  }
}