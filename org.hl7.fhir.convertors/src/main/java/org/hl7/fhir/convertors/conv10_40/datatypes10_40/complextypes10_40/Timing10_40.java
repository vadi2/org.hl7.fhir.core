package org.hl7.fhir.convertors.conv10_40.datatypes10_40.complextypes10_40;

import java.util.Collections;

import org.hl7.fhir.convertors.context.ConversionContext10_40;
import org.hl7.fhir.convertors.conv10_40.datatypes10_40.primitivetypes10_40.Decimal10_40;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Timing;

public class Timing10_40 {
  public static org.hl7.fhir.r4.model.Timing convertTiming(org.hl7.fhir.dstu2.model.Timing src) throws FHIRException {
    if (src == null || src.isEmpty()) return null;
    org.hl7.fhir.r4.model.Timing tgt = new org.hl7.fhir.r4.model.Timing();
    ConversionContext10_40.INSTANCE.getVersionConvertor_10_40().copyElement(src, tgt);
    for (org.hl7.fhir.dstu2.model.DateTimeType t : src.getEvent()) tgt.addEvent(t.getValue());
    if (src.hasRepeat()) tgt.setRepeat(convertTimingRepeatComponent(src.getRepeat()));
    if (src.hasCode()) tgt.setCode(CodeableConcept10_40.convertCodeableConcept(src.getCode()));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Timing convertTiming(org.hl7.fhir.r4.model.Timing src) throws FHIRException {
    if (src == null || src.isEmpty()) return null;
    org.hl7.fhir.dstu2.model.Timing tgt = new org.hl7.fhir.dstu2.model.Timing();
    ConversionContext10_40.INSTANCE.getVersionConvertor_10_40().copyElement(src, tgt);
    for (org.hl7.fhir.r4.model.DateTimeType t : src.getEvent()) tgt.addEvent(t.getValue());
    if (src.hasRepeat()) tgt.setRepeat(convertTimingRepeatComponent(src.getRepeat()));
    if (src.hasCode()) tgt.setCode(CodeableConcept10_40.convertCodeableConcept(src.getCode()));
    return tgt;
  }

  public static org.hl7.fhir.r4.model.Timing.TimingRepeatComponent convertTimingRepeatComponent(org.hl7.fhir.dstu2.model.Timing.TimingRepeatComponent src) throws FHIRException {
    if (src == null || src.isEmpty()) return null;
    org.hl7.fhir.r4.model.Timing.TimingRepeatComponent tgt = new org.hl7.fhir.r4.model.Timing.TimingRepeatComponent();
    ConversionContext10_40.INSTANCE.getVersionConvertor_10_40().copyElement(src, tgt);
    if (src.hasBounds())
      tgt.setBounds(ConversionContext10_40.INSTANCE.getVersionConvertor_10_40().convertType(src.getBounds()));
    if (src.hasCount()) tgt.setCount(src.getCount());
    if (src.hasDurationElement()) tgt.setDurationElement(Decimal10_40.convertDecimal(src.getDurationElement()));
    if (src.hasDurationMaxElement())
      tgt.setDurationMaxElement(Decimal10_40.convertDecimal(src.getDurationMaxElement()));
    if (src.hasDurationUnits()) tgt.setDurationUnitElement(convertUnitsOfTime(src.getDurationUnitsElement()));
    if (src.hasFrequency()) tgt.setFrequency(src.getFrequency());
    if (src.hasFrequencyMax()) tgt.setFrequencyMax(src.getFrequencyMax());
    if (src.hasPeriodElement()) tgt.setPeriodElement(Decimal10_40.convertDecimal(src.getPeriodElement()));
    if (src.hasPeriodMaxElement()) tgt.setPeriodMaxElement(Decimal10_40.convertDecimal(src.getPeriodMaxElement()));
    if (src.hasPeriodUnits()) tgt.setPeriodUnitElement(convertUnitsOfTime(src.getPeriodUnitsElement()));
    if (src.hasWhen()) tgt.setWhen(Collections.singletonList(convertEventTiming(src.getWhenElement())));
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.Timing.TimingRepeatComponent convertTimingRepeatComponent(org.hl7.fhir.r4.model.Timing.TimingRepeatComponent src) throws FHIRException {
    if (src == null || src.isEmpty()) return null;
    org.hl7.fhir.dstu2.model.Timing.TimingRepeatComponent tgt = new org.hl7.fhir.dstu2.model.Timing.TimingRepeatComponent();
    ConversionContext10_40.INSTANCE.getVersionConvertor_10_40().copyElement(src, tgt);
    if (src.hasBounds())
      tgt.setBounds(ConversionContext10_40.INSTANCE.getVersionConvertor_10_40().convertType(src.getBounds()));
    if (src.hasCount()) tgt.setCount(src.getCount());
    if (src.hasDurationElement()) tgt.setDurationElement(Decimal10_40.convertDecimal(src.getDurationElement()));
    if (src.hasDurationMaxElement())
      tgt.setDurationMaxElement(Decimal10_40.convertDecimal(src.getDurationMaxElement()));
    if (src.hasDurationUnit()) tgt.setDurationUnitsElement(convertUnitsOfTime(src.getDurationUnitElement()));
    if (src.hasFrequency()) tgt.setFrequency(src.getFrequency());
    if (src.hasFrequencyMax()) tgt.setFrequencyMax(src.getFrequencyMax());
    if (src.hasPeriodElement()) tgt.setPeriodElement(Decimal10_40.convertDecimal(src.getPeriodElement()));
    if (src.hasPeriodMaxElement()) tgt.setPeriodMaxElement(Decimal10_40.convertDecimal(src.getPeriodMaxElement()));
    if (src.hasPeriodUnit()) tgt.setPeriodUnitsElement(convertUnitsOfTime(src.getPeriodUnitElement()));
    if (src.hasWhen()) tgt.setWhenElement(convertEventTiming(src.getWhen().get(0)));
    return tgt;
  }

  static public org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.UnitsOfTime> convertUnitsOfTime(org.hl7.fhir.dstu2.model.Enumeration<org.hl7.fhir.dstu2.model.Timing.UnitsOfTime> src) throws FHIRException {
    if (src == null || src.isEmpty()) return null;
    org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.UnitsOfTime> tgt = new org.hl7.fhir.r4.model.Enumeration<>(new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory());
    ConversionContext10_40.INSTANCE.getVersionConvertor_10_40().copyElement(src, tgt);
    if (src.getValue() == null) {
    tgt.setValue(null);
} else {
      switch(src.getValue()) {
        case S:
                    tgt.setValue(Timing.UnitsOfTime.S);
                    break;
                case MIN:
                    tgt.setValue(Timing.UnitsOfTime.MIN);
                    break;
                case H:
                    tgt.setValue(Timing.UnitsOfTime.H);
                    break;
                case D:
                    tgt.setValue(Timing.UnitsOfTime.D);
                    break;
                case WK:
                    tgt.setValue(Timing.UnitsOfTime.WK);
                    break;
                case MO:
                    tgt.setValue(Timing.UnitsOfTime.MO);
                    break;
                case A:
                    tgt.setValue(Timing.UnitsOfTime.A);
                    break;
                default:
                    tgt.setValue(Timing.UnitsOfTime.NULL);
                    break;
       }
}
    return tgt;
  }

  static public org.hl7.fhir.dstu2.model.Enumeration<org.hl7.fhir.dstu2.model.Timing.UnitsOfTime> convertUnitsOfTime(org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.UnitsOfTime> src) throws FHIRException {
    if (src == null || src.isEmpty()) return null;
    org.hl7.fhir.dstu2.model.Enumeration<org.hl7.fhir.dstu2.model.Timing.UnitsOfTime> tgt = new org.hl7.fhir.dstu2.model.Enumeration<>(new org.hl7.fhir.dstu2.model.Timing.UnitsOfTimeEnumFactory());
    ConversionContext10_40.INSTANCE.getVersionConvertor_10_40().copyElement(src, tgt);
    if (src.getValue() == null) {
    tgt.setValue(null);
} else {
      switch(src.getValue()) {
        case S:
                    tgt.setValue(org.hl7.fhir.dstu2.model.Timing.UnitsOfTime.S);
                    break;
                case MIN:
                    tgt.setValue(org.hl7.fhir.dstu2.model.Timing.UnitsOfTime.MIN);
                    break;
                case H:
                    tgt.setValue(org.hl7.fhir.dstu2.model.Timing.UnitsOfTime.H);
                    break;
                case D:
                    tgt.setValue(org.hl7.fhir.dstu2.model.Timing.UnitsOfTime.D);
                    break;
                case WK:
                    tgt.setValue(org.hl7.fhir.dstu2.model.Timing.UnitsOfTime.WK);
                    break;
                case MO:
                    tgt.setValue(org.hl7.fhir.dstu2.model.Timing.UnitsOfTime.MO);
                    break;
                case A:
                    tgt.setValue(org.hl7.fhir.dstu2.model.Timing.UnitsOfTime.A);
                    break;
                default:
                    tgt.setValue(org.hl7.fhir.dstu2.model.Timing.UnitsOfTime.NULL);
                    break;
       }
}
    return tgt;
  }

  static public org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming> convertEventTiming(org.hl7.fhir.dstu2.model.Enumeration<org.hl7.fhir.dstu2.model.Timing.EventTiming> src) throws FHIRException {
    if (src == null || src.isEmpty()) return null;
    org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming> tgt = new org.hl7.fhir.r4.model.Enumeration<>(new org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory());
    ConversionContext10_40.INSTANCE.getVersionConvertor_10_40().copyElement(src, tgt);
    if (src.getValue() == null) {
    tgt.setValue(null);
} else {
      switch(src.getValue()) {
        case HS:
                    tgt.setValue(Timing.EventTiming.HS);
                    break;
                case WAKE:
                    tgt.setValue(Timing.EventTiming.WAKE);
                    break;
                case C:
                    tgt.setValue(Timing.EventTiming.C);
                    break;
                case CM:
                    tgt.setValue(Timing.EventTiming.CM);
                    break;
                case CD:
                    tgt.setValue(Timing.EventTiming.CD);
                    break;
                case CV:
                    tgt.setValue(Timing.EventTiming.CV);
                    break;
                case AC:
                    tgt.setValue(Timing.EventTiming.AC);
                    break;
                case ACM:
                    tgt.setValue(Timing.EventTiming.ACM);
                    break;
                case ACD:
                    tgt.setValue(Timing.EventTiming.ACD);
                    break;
                case ACV:
                    tgt.setValue(Timing.EventTiming.ACV);
                    break;
                case PC:
                    tgt.setValue(Timing.EventTiming.PC);
                    break;
                case PCM:
                    tgt.setValue(Timing.EventTiming.PCM);
                    break;
                case PCD:
                    tgt.setValue(Timing.EventTiming.PCD);
                    break;
                case PCV:
                    tgt.setValue(Timing.EventTiming.PCV);
                    break;
                default:
                    tgt.setValue(Timing.EventTiming.NULL);
                    break;
       }
}
    return tgt;
  }

  static public org.hl7.fhir.dstu2.model.Enumeration<org.hl7.fhir.dstu2.model.Timing.EventTiming> convertEventTiming(org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming> src) throws FHIRException {
    if (src == null || src.isEmpty()) return null;
    org.hl7.fhir.dstu2.model.Enumeration<org.hl7.fhir.dstu2.model.Timing.EventTiming> tgt = new org.hl7.fhir.dstu2.model.Enumeration<>(new org.hl7.fhir.dstu2.model.Timing.EventTimingEnumFactory());
    ConversionContext10_40.INSTANCE.getVersionConvertor_10_40().copyElement(src, tgt);
    if (src.getValue() == null) {
    tgt.setValue(null);
} else {
      switch(src.getValue()) {
        case HS:
                    tgt.setValue(org.hl7.fhir.dstu2.model.Timing.EventTiming.HS);
                    break;
                case WAKE:
                    tgt.setValue(org.hl7.fhir.dstu2.model.Timing.EventTiming.WAKE);
                    break;
                case C:
                    tgt.setValue(org.hl7.fhir.dstu2.model.Timing.EventTiming.C);
                    break;
                case CM:
                    tgt.setValue(org.hl7.fhir.dstu2.model.Timing.EventTiming.CM);
                    break;
                case CD:
                    tgt.setValue(org.hl7.fhir.dstu2.model.Timing.EventTiming.CD);
                    break;
                case CV:
                    tgt.setValue(org.hl7.fhir.dstu2.model.Timing.EventTiming.CV);
                    break;
                case AC:
                    tgt.setValue(org.hl7.fhir.dstu2.model.Timing.EventTiming.AC);
                    break;
                case ACM:
                    tgt.setValue(org.hl7.fhir.dstu2.model.Timing.EventTiming.ACM);
                    break;
                case ACD:
                    tgt.setValue(org.hl7.fhir.dstu2.model.Timing.EventTiming.ACD);
                    break;
                case ACV:
                    tgt.setValue(org.hl7.fhir.dstu2.model.Timing.EventTiming.ACV);
                    break;
                case PC:
                    tgt.setValue(org.hl7.fhir.dstu2.model.Timing.EventTiming.PC);
                    break;
                case PCM:
                    tgt.setValue(org.hl7.fhir.dstu2.model.Timing.EventTiming.PCM);
                    break;
                case PCD:
                    tgt.setValue(org.hl7.fhir.dstu2.model.Timing.EventTiming.PCD);
                    break;
                case PCV:
                    tgt.setValue(org.hl7.fhir.dstu2.model.Timing.EventTiming.PCV);
                    break;
                default:
                    tgt.setValue(org.hl7.fhir.dstu2.model.Timing.EventTiming.NULL);
                    break;
       }
}
    return tgt;
  }
}
