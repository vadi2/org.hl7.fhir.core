package org.hl7.fhir.convertors.conv30_40.resources30_40;

import org.hl7.fhir.convertors.context.ConversionContext30_40;
import org.hl7.fhir.convertors.conv30_40.datatypes30_40.Reference30_40;
import org.hl7.fhir.convertors.conv30_40.datatypes30_40.complextypes30_40.Address30_40;
import org.hl7.fhir.convertors.conv30_40.datatypes30_40.complextypes30_40.CodeableConcept30_40;
import org.hl7.fhir.convertors.conv30_40.datatypes30_40.complextypes30_40.Coding30_40;
import org.hl7.fhir.convertors.conv30_40.datatypes30_40.complextypes30_40.ContactPoint30_40;
import org.hl7.fhir.convertors.conv30_40.datatypes30_40.complextypes30_40.Identifier30_40;
import org.hl7.fhir.convertors.conv30_40.datatypes30_40.primitivetypes30_40.Decimal30_40;
import org.hl7.fhir.convertors.conv30_40.datatypes30_40.primitivetypes30_40.String30_40;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Enumeration;
import org.hl7.fhir.r4.model.Location;

public class Location30_40 {

  public static org.hl7.fhir.r4.model.Location convertLocation(org.hl7.fhir.dstu3.model.Location src) throws FHIRException {
    if (src == null)
      return null;
    org.hl7.fhir.r4.model.Location tgt = new org.hl7.fhir.r4.model.Location();
    ConversionContext30_40.INSTANCE.getVersionConvertor_30_40().copyDomainResource(src, tgt);
    for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(Identifier30_40.convertIdentifier(t));
    if (src.hasStatus())
      tgt.setStatusElement(convertLocationStatus(src.getStatusElement()));
    if (src.hasOperationalStatus())
      tgt.setOperationalStatus(Coding30_40.convertCoding(src.getOperationalStatus()));
    if (src.hasName())
      tgt.setNameElement(String30_40.convertString(src.getNameElement()));
    for (org.hl7.fhir.dstu3.model.StringType t : src.getAlias()) tgt.addAlias(t.getValue());
    if (src.hasDescription())
      tgt.setDescriptionElement(String30_40.convertString(src.getDescriptionElement()));
    if (src.hasMode())
      tgt.setModeElement(convertLocationMode(src.getModeElement()));
    if (src.hasType())
      tgt.addType(CodeableConcept30_40.convertCodeableConcept(src.getType()));
    for (org.hl7.fhir.dstu3.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(ContactPoint30_40.convertContactPoint(t));
    if (src.hasAddress())
      tgt.setAddress(Address30_40.convertAddress(src.getAddress()));
    if (src.hasPhysicalType())
      tgt.setPhysicalType(CodeableConcept30_40.convertCodeableConcept(src.getPhysicalType()));
    if (src.hasPosition())
      tgt.setPosition(convertLocationPositionComponent(src.getPosition()));
    if (src.hasManagingOrganization())
      tgt.setManagingOrganization(Reference30_40.convertReference(src.getManagingOrganization()));
    if (src.hasPartOf())
      tgt.setPartOf(Reference30_40.convertReference(src.getPartOf()));
    for (org.hl7.fhir.dstu3.model.Reference t : src.getEndpoint()) tgt.addEndpoint(Reference30_40.convertReference(t));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Location convertLocation(org.hl7.fhir.r4.model.Location src) throws FHIRException {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Location tgt = new org.hl7.fhir.dstu3.model.Location();
    ConversionContext30_40.INSTANCE.getVersionConvertor_30_40().copyDomainResource(src, tgt);
    for (org.hl7.fhir.r4.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(Identifier30_40.convertIdentifier(t));
    if (src.hasStatus())
      tgt.setStatusElement(convertLocationStatus(src.getStatusElement()));
    if (src.hasOperationalStatus())
      tgt.setOperationalStatus(Coding30_40.convertCoding(src.getOperationalStatus()));
    if (src.hasName())
      tgt.setNameElement(String30_40.convertString(src.getNameElement()));
    for (org.hl7.fhir.r4.model.StringType t : src.getAlias()) tgt.addAlias(t.getValue());
    if (src.hasDescription())
      tgt.setDescriptionElement(String30_40.convertString(src.getDescriptionElement()));
    if (src.hasMode())
      tgt.setModeElement(convertLocationMode(src.getModeElement()));
    if (src.hasType())
      tgt.setType(CodeableConcept30_40.convertCodeableConcept(src.getTypeFirstRep()));
    for (org.hl7.fhir.r4.model.ContactPoint t : src.getTelecom())
      tgt.addTelecom(ContactPoint30_40.convertContactPoint(t));
    if (src.hasAddress())
      tgt.setAddress(Address30_40.convertAddress(src.getAddress()));
    if (src.hasPhysicalType())
      tgt.setPhysicalType(CodeableConcept30_40.convertCodeableConcept(src.getPhysicalType()));
    if (src.hasPosition())
      tgt.setPosition(convertLocationPositionComponent(src.getPosition()));
    if (src.hasManagingOrganization())
      tgt.setManagingOrganization(Reference30_40.convertReference(src.getManagingOrganization()));
    if (src.hasPartOf())
      tgt.setPartOf(Reference30_40.convertReference(src.getPartOf()));
    for (org.hl7.fhir.r4.model.Reference t : src.getEndpoint()) tgt.addEndpoint(Reference30_40.convertReference(t));
    return tgt;
  }

  static public org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Location.LocationMode> convertLocationMode(org.hl7.fhir.dstu3.model.Enumeration<org.hl7.fhir.dstu3.model.Location.LocationMode> src) throws FHIRException {
      if (src == null || src.isEmpty())
          return null;
      Enumeration<Location.LocationMode> tgt = new Enumeration<>(new Location.LocationModeEnumFactory());
      ConversionContext30_40.INSTANCE.getVersionConvertor_30_40().copyElement(src, tgt);
      if (src.getValue() == null) {
          tgt.setValue(null);
      } else {
          switch (src.getValue()) {
              case INSTANCE:
                  tgt.setValue(Location.LocationMode.INSTANCE);
                  break;
              case KIND:
                  tgt.setValue(Location.LocationMode.KIND);
                  break;
              default:
                  tgt.setValue(Location.LocationMode.NULL);
                  break;
          }
      }
      return tgt;
  }

  static public org.hl7.fhir.dstu3.model.Enumeration<org.hl7.fhir.dstu3.model.Location.LocationMode> convertLocationMode(org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Location.LocationMode> src) throws FHIRException {
      if (src == null || src.isEmpty())
          return null;
      org.hl7.fhir.dstu3.model.Enumeration<org.hl7.fhir.dstu3.model.Location.LocationMode> tgt = new org.hl7.fhir.dstu3.model.Enumeration<>(new org.hl7.fhir.dstu3.model.Location.LocationModeEnumFactory());
      ConversionContext30_40.INSTANCE.getVersionConvertor_30_40().copyElement(src, tgt);
      if (src.getValue() == null) {
          tgt.setValue(null);
      } else {
          switch (src.getValue()) {
              case INSTANCE:
                  tgt.setValue(org.hl7.fhir.dstu3.model.Location.LocationMode.INSTANCE);
                  break;
              case KIND:
                  tgt.setValue(org.hl7.fhir.dstu3.model.Location.LocationMode.KIND);
                  break;
              default:
                  tgt.setValue(org.hl7.fhir.dstu3.model.Location.LocationMode.NULL);
                  break;
          }
      }
      return tgt;
  }

  public static org.hl7.fhir.r4.model.Location.LocationPositionComponent convertLocationPositionComponent(org.hl7.fhir.dstu3.model.Location.LocationPositionComponent src) throws FHIRException {
    if (src == null)
      return null;
    org.hl7.fhir.r4.model.Location.LocationPositionComponent tgt = new org.hl7.fhir.r4.model.Location.LocationPositionComponent();
    ConversionContext30_40.INSTANCE.getVersionConvertor_30_40().copyBackboneElement(src,tgt);
    if (src.hasLongitude())
      tgt.setLongitudeElement(Decimal30_40.convertDecimal(src.getLongitudeElement()));
    if (src.hasLatitude())
      tgt.setLatitudeElement(Decimal30_40.convertDecimal(src.getLatitudeElement()));
    if (src.hasAltitude())
      tgt.setAltitudeElement(Decimal30_40.convertDecimal(src.getAltitudeElement()));
    return tgt;
  }

  public static org.hl7.fhir.dstu3.model.Location.LocationPositionComponent convertLocationPositionComponent(org.hl7.fhir.r4.model.Location.LocationPositionComponent src) throws FHIRException {
    if (src == null)
      return null;
    org.hl7.fhir.dstu3.model.Location.LocationPositionComponent tgt = new org.hl7.fhir.dstu3.model.Location.LocationPositionComponent();
    ConversionContext30_40.INSTANCE.getVersionConvertor_30_40().copyBackboneElement(src,tgt);
    if (src.hasLongitude())
      tgt.setLongitudeElement(Decimal30_40.convertDecimal(src.getLongitudeElement()));
    if (src.hasLatitude())
      tgt.setLatitudeElement(Decimal30_40.convertDecimal(src.getLatitudeElement()));
    if (src.hasAltitude())
      tgt.setAltitudeElement(Decimal30_40.convertDecimal(src.getAltitudeElement()));
    return tgt;
  }

  static public org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Location.LocationStatus> convertLocationStatus(org.hl7.fhir.dstu3.model.Enumeration<org.hl7.fhir.dstu3.model.Location.LocationStatus> src) throws FHIRException {
      if (src == null || src.isEmpty())
          return null;
      Enumeration<Location.LocationStatus> tgt = new Enumeration<>(new Location.LocationStatusEnumFactory());
      ConversionContext30_40.INSTANCE.getVersionConvertor_30_40().copyElement(src, tgt);
      if (src.getValue() == null) {
          tgt.setValue(null);
      } else {
          switch (src.getValue()) {
              case ACTIVE:
                  tgt.setValue(Location.LocationStatus.ACTIVE);
                  break;
              case SUSPENDED:
                  tgt.setValue(Location.LocationStatus.SUSPENDED);
                  break;
              case INACTIVE:
                  tgt.setValue(Location.LocationStatus.INACTIVE);
                  break;
              default:
                  tgt.setValue(Location.LocationStatus.NULL);
                  break;
          }
      }
      return tgt;
  }

  static public org.hl7.fhir.dstu3.model.Enumeration<org.hl7.fhir.dstu3.model.Location.LocationStatus> convertLocationStatus(org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Location.LocationStatus> src) throws FHIRException {
      if (src == null || src.isEmpty())
          return null;
      org.hl7.fhir.dstu3.model.Enumeration<org.hl7.fhir.dstu3.model.Location.LocationStatus> tgt = new org.hl7.fhir.dstu3.model.Enumeration<>(new org.hl7.fhir.dstu3.model.Location.LocationStatusEnumFactory());
      ConversionContext30_40.INSTANCE.getVersionConvertor_30_40().copyElement(src, tgt);
      if (src.getValue() == null) {
          tgt.setValue(null);
      } else {
          switch (src.getValue()) {
              case ACTIVE:
                  tgt.setValue(org.hl7.fhir.dstu3.model.Location.LocationStatus.ACTIVE);
                  break;
              case SUSPENDED:
                  tgt.setValue(org.hl7.fhir.dstu3.model.Location.LocationStatus.SUSPENDED);
                  break;
              case INACTIVE:
                  tgt.setValue(org.hl7.fhir.dstu3.model.Location.LocationStatus.INACTIVE);
                  break;
              default:
                  tgt.setValue(org.hl7.fhir.dstu3.model.Location.LocationStatus.NULL);
                  break;
          }
      }
      return tgt;
  }
}