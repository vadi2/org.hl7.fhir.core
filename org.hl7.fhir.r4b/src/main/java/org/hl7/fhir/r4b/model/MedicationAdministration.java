package org.hl7.fhir.r4b.model;

/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, \
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this \
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, \
     this list of conditions and the following disclaimer in the documentation \
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS \"AS IS\" AND \
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED \
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. \
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, \
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT \
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR \
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, \
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) \
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE \
  POSSIBILITY OF SUCH DAMAGE.
  */

// Generated on Mon, Jun 13, 2022 17:19+0300 for FHIR v4.3.0

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.r4b.model.Enumerations.*;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.instance.model.api.ICompositeType;
import ca.uhn.fhir.model.api.annotation.ResourceDef;
import ca.uhn.fhir.model.api.annotation.SearchParamDefinition;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.ChildOrder;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.api.annotation.Block;

/**
 * Describes the event of a patient consuming or otherwise being administered a
 * medication. This may be as simple as swallowing a tablet or it may be a long
 * running infusion. Related resources tie this event to the authorizing
 * prescription, and the specific encounter between patient and health care
 * practitioner.
 */
@ResourceDef(name = "MedicationAdministration", profile = "http://hl7.org/fhir/StructureDefinition/MedicationAdministration")
public class MedicationAdministration extends DomainResource {

  public enum MedicationAdministrationStatusCodes {
    /**
     * The administration has started but has not yet completed.
     */
    INPROGRESS,
    /**
     * The administration was terminated prior to any impact on the subject (though
     * preparatory actions may have been taken)
     */
    NOTDONE,
    /**
     * Actions implied by the administration have been temporarily halted, but are
     * expected to continue later. May also be called 'suspended'.
     */
    ONHOLD,
    /**
     * All actions that are implied by the administration have occurred.
     */
    COMPLETED,
    /**
     * The administration was entered in error and therefore nullified.
     */
    ENTEREDINERROR,
    /**
     * Actions implied by the administration have been permanently halted, before
     * all of them occurred.
     */
    STOPPED,
    /**
     * The authoring system does not know which of the status values currently
     * applies for this request. Note: This concept is not to be used for 'other' -
     * one of the listed statuses is presumed to apply, it's just not known which
     * one.
     */
    UNKNOWN,
    /**
     * added to help the parsers with the generic types
     */
    NULL;

    public static MedicationAdministrationStatusCodes fromCode(String codeString) throws FHIRException {
      if (codeString == null || "".equals(codeString))
        return null;
      if ("in-progress".equals(codeString))
        return INPROGRESS;
      if ("not-done".equals(codeString))
        return NOTDONE;
      if ("on-hold".equals(codeString))
        return ONHOLD;
      if ("completed".equals(codeString))
        return COMPLETED;
      if ("entered-in-error".equals(codeString))
        return ENTEREDINERROR;
      if ("stopped".equals(codeString))
        return STOPPED;
      if ("unknown".equals(codeString))
        return UNKNOWN;
      if (Configuration.isAcceptInvalidEnums())
        return null;
      else
        throw new FHIRException("Unknown MedicationAdministrationStatusCodes code '" + codeString + "'");
    }

    public String toCode() {
      switch (this) {
      case INPROGRESS:
        return "in-progress";
      case NOTDONE:
        return "not-done";
      case ONHOLD:
        return "on-hold";
      case COMPLETED:
        return "completed";
      case ENTEREDINERROR:
        return "entered-in-error";
      case STOPPED:
        return "stopped";
      case UNKNOWN:
        return "unknown";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getSystem() {
      switch (this) {
      case INPROGRESS:
        return "http://terminology.hl7.org/CodeSystem/medication-admin-status";
      case NOTDONE:
        return "http://terminology.hl7.org/CodeSystem/medication-admin-status";
      case ONHOLD:
        return "http://terminology.hl7.org/CodeSystem/medication-admin-status";
      case COMPLETED:
        return "http://terminology.hl7.org/CodeSystem/medication-admin-status";
      case ENTEREDINERROR:
        return "http://terminology.hl7.org/CodeSystem/medication-admin-status";
      case STOPPED:
        return "http://terminology.hl7.org/CodeSystem/medication-admin-status";
      case UNKNOWN:
        return "http://terminology.hl7.org/CodeSystem/medication-admin-status";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDefinition() {
      switch (this) {
      case INPROGRESS:
        return "The administration has started but has not yet completed.";
      case NOTDONE:
        return "The administration was terminated prior to any impact on the subject (though preparatory actions may have been taken)";
      case ONHOLD:
        return "Actions implied by the administration have been temporarily halted, but are expected to continue later. May also be called 'suspended'.";
      case COMPLETED:
        return "All actions that are implied by the administration have occurred.";
      case ENTEREDINERROR:
        return "The administration was entered in error and therefore nullified.";
      case STOPPED:
        return "Actions implied by the administration have been permanently halted, before all of them occurred.";
      case UNKNOWN:
        return "The authoring system does not know which of the status values currently applies for this request. Note: This concept is not to be used for 'other' - one of the listed statuses is presumed to apply, it's just not known which one.";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDisplay() {
      switch (this) {
      case INPROGRESS:
        return "In Progress";
      case NOTDONE:
        return "Not Done";
      case ONHOLD:
        return "On Hold";
      case COMPLETED:
        return "Completed";
      case ENTEREDINERROR:
        return "Entered in Error";
      case STOPPED:
        return "Stopped";
      case UNKNOWN:
        return "Unknown";
      case NULL:
        return null;
      default:
        return "?";
      }
    }
  }

  public static class MedicationAdministrationStatusCodesEnumFactory
      implements EnumFactory<MedicationAdministrationStatusCodes> {
    public MedicationAdministrationStatusCodes fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
        if (codeString == null || "".equals(codeString))
          return null;
      if ("in-progress".equals(codeString))
        return MedicationAdministrationStatusCodes.INPROGRESS;
      if ("not-done".equals(codeString))
        return MedicationAdministrationStatusCodes.NOTDONE;
      if ("on-hold".equals(codeString))
        return MedicationAdministrationStatusCodes.ONHOLD;
      if ("completed".equals(codeString))
        return MedicationAdministrationStatusCodes.COMPLETED;
      if ("entered-in-error".equals(codeString))
        return MedicationAdministrationStatusCodes.ENTEREDINERROR;
      if ("stopped".equals(codeString))
        return MedicationAdministrationStatusCodes.STOPPED;
      if ("unknown".equals(codeString))
        return MedicationAdministrationStatusCodes.UNKNOWN;
      throw new IllegalArgumentException("Unknown MedicationAdministrationStatusCodes code '" + codeString + "'");
    }

    public Enumeration<MedicationAdministrationStatusCodes> fromType(PrimitiveType<?> code) throws FHIRException {
      if (code == null)
        return null;
      if (code.isEmpty())
        return new Enumeration<MedicationAdministrationStatusCodes>(this, MedicationAdministrationStatusCodes.NULL,
            code);
      String codeString = code.asStringValue();
      if (codeString == null || "".equals(codeString))
        return new Enumeration<MedicationAdministrationStatusCodes>(this, MedicationAdministrationStatusCodes.NULL,
            code);
      if ("in-progress".equals(codeString))
        return new Enumeration<MedicationAdministrationStatusCodes>(this,
            MedicationAdministrationStatusCodes.INPROGRESS, code);
      if ("not-done".equals(codeString))
        return new Enumeration<MedicationAdministrationStatusCodes>(this, MedicationAdministrationStatusCodes.NOTDONE,
            code);
      if ("on-hold".equals(codeString))
        return new Enumeration<MedicationAdministrationStatusCodes>(this, MedicationAdministrationStatusCodes.ONHOLD,
            code);
      if ("completed".equals(codeString))
        return new Enumeration<MedicationAdministrationStatusCodes>(this, MedicationAdministrationStatusCodes.COMPLETED,
            code);
      if ("entered-in-error".equals(codeString))
        return new Enumeration<MedicationAdministrationStatusCodes>(this,
            MedicationAdministrationStatusCodes.ENTEREDINERROR, code);
      if ("stopped".equals(codeString))
        return new Enumeration<MedicationAdministrationStatusCodes>(this, MedicationAdministrationStatusCodes.STOPPED,
            code);
      if ("unknown".equals(codeString))
        return new Enumeration<MedicationAdministrationStatusCodes>(this, MedicationAdministrationStatusCodes.UNKNOWN,
            code);
      throw new FHIRException("Unknown MedicationAdministrationStatusCodes code '" + codeString + "'");
    }

    public String toCode(MedicationAdministrationStatusCodes code) {
       if (code == MedicationAdministrationStatusCodes.NULL)
           return null;
       if (code == MedicationAdministrationStatusCodes.INPROGRESS)
        return "in-progress";
      if (code == MedicationAdministrationStatusCodes.NOTDONE)
        return "not-done";
      if (code == MedicationAdministrationStatusCodes.ONHOLD)
        return "on-hold";
      if (code == MedicationAdministrationStatusCodes.COMPLETED)
        return "completed";
      if (code == MedicationAdministrationStatusCodes.ENTEREDINERROR)
        return "entered-in-error";
      if (code == MedicationAdministrationStatusCodes.STOPPED)
        return "stopped";
      if (code == MedicationAdministrationStatusCodes.UNKNOWN)
        return "unknown";
      return "?";
   }

    public String toSystem(MedicationAdministrationStatusCodes code) {
      return code.getSystem();
    }
  }

  @Block()
  public static class MedicationAdministrationPerformerComponent extends BackboneElement
      implements IBaseBackboneElement {
    /**
     * Distinguishes the type of involvement of the performer in the medication
     * administration.
     */
    @Child(name = "function", type = {
        CodeableConcept.class }, order = 1, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Type of performance", formalDefinition = "Distinguishes the type of involvement of the performer in the medication administration.")
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/med-admin-perform-function")
    protected CodeableConcept function;

    /**
     * Indicates who or what performed the medication administration.
     */
    @Child(name = "actor", type = { Practitioner.class, PractitionerRole.class, Patient.class, RelatedPerson.class,
        Device.class }, order = 2, min = 1, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "Who performed the medication administration", formalDefinition = "Indicates who or what performed the medication administration.")
    protected Reference actor;

    private static final long serialVersionUID = -576943815L;

    /**
     * Constructor
     */
    public MedicationAdministrationPerformerComponent() {
      super();
    }

    /**
     * Constructor
     */
    public MedicationAdministrationPerformerComponent(Reference actor) {
      super();
      this.setActor(actor);
    }

    /**
     * @return {@link #function} (Distinguishes the type of involvement of the
     *         performer in the medication administration.)
     */
    public CodeableConcept getFunction() {
      if (this.function == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create MedicationAdministrationPerformerComponent.function");
        else if (Configuration.doAutoCreate())
          this.function = new CodeableConcept(); // cc
      return this.function;
    }

    public boolean hasFunction() {
      return this.function != null && !this.function.isEmpty();
    }

    /**
     * @param value {@link #function} (Distinguishes the type of involvement of the
     *              performer in the medication administration.)
     */
    public MedicationAdministrationPerformerComponent setFunction(CodeableConcept value) {
      this.function = value;
      return this;
    }

    /**
     * @return {@link #actor} (Indicates who or what performed the medication
     *         administration.)
     */
    public Reference getActor() {
      if (this.actor == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create MedicationAdministrationPerformerComponent.actor");
        else if (Configuration.doAutoCreate())
          this.actor = new Reference(); // cc
      return this.actor;
    }

    public boolean hasActor() {
      return this.actor != null && !this.actor.isEmpty();
    }

    /**
     * @param value {@link #actor} (Indicates who or what performed the medication
     *              administration.)
     */
    public MedicationAdministrationPerformerComponent setActor(Reference value) {
      this.actor = value;
      return this;
    }

    protected void listChildren(List<Property> children) {
      super.listChildren(children);
      children.add(new Property("function", "CodeableConcept",
          "Distinguishes the type of involvement of the performer in the medication administration.", 0, 1, function));
      children.add(new Property("actor", "Reference(Practitioner|PractitionerRole|Patient|RelatedPerson|Device)",
          "Indicates who or what performed the medication administration.", 0, 1, actor));
    }

    @Override
    public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
      switch (_hash) {
      case 1380938712:
        /* function */ return new Property("function", "CodeableConcept",
            "Distinguishes the type of involvement of the performer in the medication administration.", 0, 1, function);
      case 92645877:
        /* actor */ return new Property("actor",
            "Reference(Practitioner|PractitionerRole|Patient|RelatedPerson|Device)",
            "Indicates who or what performed the medication administration.", 0, 1, actor);
      default:
        return super.getNamedProperty(_hash, _name, _checkValid);
      }

    }

    @Override
    public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
      switch (hash) {
      case 1380938712:
        /* function */ return this.function == null ? new Base[0] : new Base[] { this.function }; // CodeableConcept
      case 92645877:
        /* actor */ return this.actor == null ? new Base[0] : new Base[] { this.actor }; // Reference
      default:
        return super.getProperty(hash, name, checkValid);
      }

    }

    @Override
    public Base setProperty(int hash, String name, Base value) throws FHIRException {
      switch (hash) {
      case 1380938712: // function
        this.function = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        return value;
      case 92645877: // actor
        this.actor = TypeConvertor.castToReference(value); // Reference
        return value;
      default:
        return super.setProperty(hash, name, value);
      }

    }

    @Override
    public Base setProperty(String name, Base value) throws FHIRException {
      if (name.equals("function")) {
        this.function = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
      } else if (name.equals("actor")) {
        this.actor = TypeConvertor.castToReference(value); // Reference
      } else
        return super.setProperty(name, value);
      return value;
    }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
      if (name.equals("function")) {
        this.function = null;
      } else if (name.equals("actor")) {
        this.actor = null;
      } else
        super.removeChild(name, value);
      
    }

    @Override
    public Base makeProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 1380938712:
        return getFunction();
      case 92645877:
        return getActor();
      default:
        return super.makeProperty(hash, name);
      }

    }

    @Override
    public String[] getTypesForProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 1380938712:
        /* function */ return new String[] { "CodeableConcept" };
      case 92645877:
        /* actor */ return new String[] { "Reference" };
      default:
        return super.getTypesForProperty(hash, name);
      }

    }

    @Override
    public Base addChild(String name) throws FHIRException {
      if (name.equals("function")) {
        this.function = new CodeableConcept();
        return this.function;
      } else if (name.equals("actor")) {
        this.actor = new Reference();
        return this.actor;
      } else
        return super.addChild(name);
    }

    public MedicationAdministrationPerformerComponent copy() {
      MedicationAdministrationPerformerComponent dst = new MedicationAdministrationPerformerComponent();
      copyValues(dst);
      return dst;
    }

    public void copyValues(MedicationAdministrationPerformerComponent dst) {
      super.copyValues(dst);
      dst.function = function == null ? null : function.copy();
      dst.actor = actor == null ? null : actor.copy();
    }

    @Override
    public boolean equalsDeep(Base other_) {
      if (!super.equalsDeep(other_))
        return false;
      if (!(other_ instanceof MedicationAdministrationPerformerComponent))
        return false;
      MedicationAdministrationPerformerComponent o = (MedicationAdministrationPerformerComponent) other_;
      return compareDeep(function, o.function, true) && compareDeep(actor, o.actor, true);
    }

    @Override
    public boolean equalsShallow(Base other_) {
      if (!super.equalsShallow(other_))
        return false;
      if (!(other_ instanceof MedicationAdministrationPerformerComponent))
        return false;
      MedicationAdministrationPerformerComponent o = (MedicationAdministrationPerformerComponent) other_;
      return true;
    }

    public boolean isEmpty() {
      return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(function, actor);
    }

    public String fhirType() {
      return "MedicationAdministration.performer";

    }

  }

  @Block()
  public static class MedicationAdministrationDosageComponent extends BackboneElement implements IBaseBackboneElement {
    /**
     * Free text dosage can be used for cases where the dosage administered is too
     * complex to code. When coded dosage is present, the free text dosage may still
     * be present for display to humans.
     * 
     * The dosage instructions should reflect the dosage of the medication that was
     * administered.
     */
    @Child(name = "text", type = { StringType.class }, order = 1, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Free text dosage instructions e.g. SIG", formalDefinition = "Free text dosage can be used for cases where the dosage administered is too complex to code. When coded dosage is present, the free text dosage may still be present for display to humans.\r\rThe dosage instructions should reflect the dosage of the medication that was administered.")
    protected StringType text;

    /**
     * A coded specification of the anatomic site where the medication first entered
     * the body. For example, "left arm".
     */
    @Child(name = "site", type = {
        CodeableConcept.class }, order = 2, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Body site administered to", formalDefinition = "A coded specification of the anatomic site where the medication first entered the body.  For example, \"left arm\".")
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/approach-site-codes")
    protected CodeableConcept site;

    /**
     * A code specifying the route or physiological path of administration of a
     * therapeutic agent into or onto the patient. For example, topical,
     * intravenous, etc.
     */
    @Child(name = "route", type = {
        CodeableConcept.class }, order = 3, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Path of substance into body", formalDefinition = "A code specifying the route or physiological path of administration of a therapeutic agent into or onto the patient.  For example, topical, intravenous, etc.")
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/route-codes")
    protected CodeableConcept route;

    /**
     * A coded value indicating the method by which the medication is intended to be
     * or was introduced into or on the body. This attribute will most often NOT be
     * populated. It is most commonly used for injections. For example, Slow Push,
     * Deep IV.
     */
    @Child(name = "method", type = {
        CodeableConcept.class }, order = 4, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "How drug was administered", formalDefinition = "A coded value indicating the method by which the medication is intended to be or was introduced into or on the body.  This attribute will most often NOT be populated.  It is most commonly used for injections.  For example, Slow Push, Deep IV.")
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/administration-method-codes")
    protected CodeableConcept method;

    /**
     * The amount of the medication given at one administration event. Use this
     * value when the administration is essentially an instantaneous event such as a
     * swallowing a tablet or giving an injection.
     */
    @Child(name = "dose", type = { Quantity.class }, order = 5, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Amount of medication per dose", formalDefinition = "The amount of the medication given at one administration event.   Use this value when the administration is essentially an instantaneous event such as a swallowing a tablet or giving an injection.")
    protected Quantity dose;

    /**
     * Identifies the speed with which the medication was or will be introduced into
     * the patient. Typically, the rate for an infusion e.g. 100 ml per 1 hour or
     * 100 ml/hr. May also be expressed as a rate per unit of time, e.g. 500 ml per
     * 2 hours. Other examples: 200 mcg/min or 200 mcg/1 minute; 1 liter/8 hours.
     */
    @Child(name = "rate", type = { Ratio.class,
        Quantity.class }, order = 6, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Dose quantity per unit of time", formalDefinition = "Identifies the speed with which the medication was or will be introduced into the patient.  Typically, the rate for an infusion e.g. 100 ml per 1 hour or 100 ml/hr.  May also be expressed as a rate per unit of time, e.g. 500 ml per 2 hours.  Other examples:  200 mcg/min or 200 mcg/1 minute; 1 liter/8 hours.")
    protected DataType rate;

    private static final long serialVersionUID = -484090956L;

    /**
     * Constructor
     */
    public MedicationAdministrationDosageComponent() {
      super();
    }

    /**
     * @return {@link #text} (Free text dosage can be used for cases where the
     *         dosage administered is too complex to code. When coded dosage is
     *         present, the free text dosage may still be present for display to
     *         humans.
     * 
     *         The dosage instructions should reflect the dosage of the medication
     *         that was administered.). This is the underlying object with id, value
     *         and extensions. The accessor "getText" gives direct access to the
     *         value
     */
    public StringType getTextElement() {
      if (this.text == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create MedicationAdministrationDosageComponent.text");
        else if (Configuration.doAutoCreate())
          this.text = new StringType(); // bb
      return this.text;
    }

    public boolean hasTextElement() {
      return this.text != null && !this.text.isEmpty();
    }

    public boolean hasText() {
      return this.text != null && !this.text.isEmpty();
    }

    /**
     * @param value {@link #text} (Free text dosage can be used for cases where the
     *              dosage administered is too complex to code. When coded dosage is
     *              present, the free text dosage may still be present for display
     *              to humans.
     * 
     *              The dosage instructions should reflect the dosage of the
     *              medication that was administered.). This is the underlying
     *              object with id, value and extensions. The accessor "getText"
     *              gives direct access to the value
     */
    public MedicationAdministrationDosageComponent setTextElement(StringType value) {
      this.text = value;
      return this;
    }

    /**
     * @return Free text dosage can be used for cases where the dosage administered
     *         is too complex to code. When coded dosage is present, the free text
     *         dosage may still be present for display to humans.
     * 
     *         The dosage instructions should reflect the dosage of the medication
     *         that was administered.
     */
    public String getText() {
      return this.text == null ? null : this.text.getValue();
    }

    /**
     * @param value Free text dosage can be used for cases where the dosage
     *              administered is too complex to code. When coded dosage is
     *              present, the free text dosage may still be present for display
     *              to humans.
     * 
     *              The dosage instructions should reflect the dosage of the
     *              medication that was administered.
     */
    public MedicationAdministrationDosageComponent setText(String value) {
      if (Utilities.noString(value))
        this.text = null;
      else {
        if (this.text == null)
          this.text = new StringType();
        this.text.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #site} (A coded specification of the anatomic site where the
     *         medication first entered the body. For example, "left arm".)
     */
    public CodeableConcept getSite() {
      if (this.site == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create MedicationAdministrationDosageComponent.site");
        else if (Configuration.doAutoCreate())
          this.site = new CodeableConcept(); // cc
      return this.site;
    }

    public boolean hasSite() {
      return this.site != null && !this.site.isEmpty();
    }

    /**
     * @param value {@link #site} (A coded specification of the anatomic site where
     *              the medication first entered the body. For example, "left arm".)
     */
    public MedicationAdministrationDosageComponent setSite(CodeableConcept value) {
      this.site = value;
      return this;
    }

    /**
     * @return {@link #route} (A code specifying the route or physiological path of
     *         administration of a therapeutic agent into or onto the patient. For
     *         example, topical, intravenous, etc.)
     */
    public CodeableConcept getRoute() {
      if (this.route == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create MedicationAdministrationDosageComponent.route");
        else if (Configuration.doAutoCreate())
          this.route = new CodeableConcept(); // cc
      return this.route;
    }

    public boolean hasRoute() {
      return this.route != null && !this.route.isEmpty();
    }

    /**
     * @param value {@link #route} (A code specifying the route or physiological
     *              path of administration of a therapeutic agent into or onto the
     *              patient. For example, topical, intravenous, etc.)
     */
    public MedicationAdministrationDosageComponent setRoute(CodeableConcept value) {
      this.route = value;
      return this;
    }

    /**
     * @return {@link #method} (A coded value indicating the method by which the
     *         medication is intended to be or was introduced into or on the body.
     *         This attribute will most often NOT be populated. It is most commonly
     *         used for injections. For example, Slow Push, Deep IV.)
     */
    public CodeableConcept getMethod() {
      if (this.method == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create MedicationAdministrationDosageComponent.method");
        else if (Configuration.doAutoCreate())
          this.method = new CodeableConcept(); // cc
      return this.method;
    }

    public boolean hasMethod() {
      return this.method != null && !this.method.isEmpty();
    }

    /**
     * @param value {@link #method} (A coded value indicating the method by which
     *              the medication is intended to be or was introduced into or on
     *              the body. This attribute will most often NOT be populated. It is
     *              most commonly used for injections. For example, Slow Push, Deep
     *              IV.)
     */
    public MedicationAdministrationDosageComponent setMethod(CodeableConcept value) {
      this.method = value;
      return this;
    }

    /**
     * @return {@link #dose} (The amount of the medication given at one
     *         administration event. Use this value when the administration is
     *         essentially an instantaneous event such as a swallowing a tablet or
     *         giving an injection.)
     */
    public Quantity getDose() {
      if (this.dose == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create MedicationAdministrationDosageComponent.dose");
        else if (Configuration.doAutoCreate())
          this.dose = new Quantity(); // cc
      return this.dose;
    }

    public boolean hasDose() {
      return this.dose != null && !this.dose.isEmpty();
    }

    /**
     * @param value {@link #dose} (The amount of the medication given at one
     *              administration event. Use this value when the administration is
     *              essentially an instantaneous event such as a swallowing a tablet
     *              or giving an injection.)
     */
    public MedicationAdministrationDosageComponent setDose(Quantity value) {
      this.dose = value;
      return this;
    }

    /**
     * @return {@link #rate} (Identifies the speed with which the medication was or
     *         will be introduced into the patient. Typically, the rate for an
     *         infusion e.g. 100 ml per 1 hour or 100 ml/hr. May also be expressed
     *         as a rate per unit of time, e.g. 500 ml per 2 hours. Other examples:
     *         200 mcg/min or 200 mcg/1 minute; 1 liter/8 hours.)
     */
    public DataType getRate() {
      return this.rate;
    }

    /**
     * @return {@link #rate} (Identifies the speed with which the medication was or
     *         will be introduced into the patient. Typically, the rate for an
     *         infusion e.g. 100 ml per 1 hour or 100 ml/hr. May also be expressed
     *         as a rate per unit of time, e.g. 500 ml per 2 hours. Other examples:
     *         200 mcg/min or 200 mcg/1 minute; 1 liter/8 hours.)
     */
    public Ratio getRateRatio() throws FHIRException {
      if (this.rate == null)
        this.rate = new Ratio();
      if (!(this.rate instanceof Ratio))
        throw new FHIRException(
            "Type mismatch: the type Ratio was expected, but " + this.rate.getClass().getName() + " was encountered");
      return (Ratio) this.rate;
    }

    public boolean hasRateRatio() {
        return this.rate instanceof Ratio;
    }

    /**
     * @return {@link #rate} (Identifies the speed with which the medication was or
     *         will be introduced into the patient. Typically, the rate for an
     *         infusion e.g. 100 ml per 1 hour or 100 ml/hr. May also be expressed
     *         as a rate per unit of time, e.g. 500 ml per 2 hours. Other examples:
     *         200 mcg/min or 200 mcg/1 minute; 1 liter/8 hours.)
     */
    public Quantity getRateQuantity() throws FHIRException {
      if (this.rate == null)
        this.rate = new Quantity();
      if (!(this.rate instanceof Quantity))
        throw new FHIRException("Type mismatch: the type Quantity was expected, but " + this.rate.getClass().getName()
            + " was encountered");
      return (Quantity) this.rate;
    }

    public boolean hasRateQuantity() {
        return this.rate instanceof Quantity;
    }

    public boolean hasRate() {
      return this.rate != null && !this.rate.isEmpty();
    }

    /**
     * @param value {@link #rate} (Identifies the speed with which the medication
     *              was or will be introduced into the patient. Typically, the rate
     *              for an infusion e.g. 100 ml per 1 hour or 100 ml/hr. May also be
     *              expressed as a rate per unit of time, e.g. 500 ml per 2 hours.
     *              Other examples: 200 mcg/min or 200 mcg/1 minute; 1 liter/8
     *              hours.)
     */
    public MedicationAdministrationDosageComponent setRate(DataType value) {
      if (value != null && !(value instanceof Ratio || value instanceof Quantity))
        throw new Error("Not the right type for MedicationAdministration.dosage.rate[x]: " + value.fhirType());
      this.rate = value;
      return this;
    }

    protected void listChildren(List<Property> children) {
      super.listChildren(children);
      children.add(new Property("text", "string",
          "Free text dosage can be used for cases where the dosage administered is too complex to code. When coded dosage is present, the free text dosage may still be present for display to humans.\r\rThe dosage instructions should reflect the dosage of the medication that was administered.",
          0, 1, text));
      children.add(new Property("site", "CodeableConcept",
          "A coded specification of the anatomic site where the medication first entered the body.  For example, \"left arm\".",
          0, 1, site));
      children.add(new Property("route", "CodeableConcept",
          "A code specifying the route or physiological path of administration of a therapeutic agent into or onto the patient.  For example, topical, intravenous, etc.",
          0, 1, route));
      children.add(new Property("method", "CodeableConcept",
          "A coded value indicating the method by which the medication is intended to be or was introduced into or on the body.  This attribute will most often NOT be populated.  It is most commonly used for injections.  For example, Slow Push, Deep IV.",
          0, 1, method));
      children.add(new Property("dose", "Quantity",
          "The amount of the medication given at one administration event.   Use this value when the administration is essentially an instantaneous event such as a swallowing a tablet or giving an injection.",
          0, 1, dose));
      children.add(new Property("rate[x]", "Ratio|Quantity",
          "Identifies the speed with which the medication was or will be introduced into the patient.  Typically, the rate for an infusion e.g. 100 ml per 1 hour or 100 ml/hr.  May also be expressed as a rate per unit of time, e.g. 500 ml per 2 hours.  Other examples:  200 mcg/min or 200 mcg/1 minute; 1 liter/8 hours.",
          0, 1, rate));
    }

    @Override
    public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
      switch (_hash) {
      case 3556653:
        /* text */ return new Property("text", "string",
            "Free text dosage can be used for cases where the dosage administered is too complex to code. When coded dosage is present, the free text dosage may still be present for display to humans.\r\rThe dosage instructions should reflect the dosage of the medication that was administered.",
            0, 1, text);
      case 3530567:
        /* site */ return new Property("site", "CodeableConcept",
            "A coded specification of the anatomic site where the medication first entered the body.  For example, \"left arm\".",
            0, 1, site);
      case 108704329:
        /* route */ return new Property("route", "CodeableConcept",
            "A code specifying the route or physiological path of administration of a therapeutic agent into or onto the patient.  For example, topical, intravenous, etc.",
            0, 1, route);
      case -1077554975:
        /* method */ return new Property("method", "CodeableConcept",
            "A coded value indicating the method by which the medication is intended to be or was introduced into or on the body.  This attribute will most often NOT be populated.  It is most commonly used for injections.  For example, Slow Push, Deep IV.",
            0, 1, method);
      case 3089437:
        /* dose */ return new Property("dose", "Quantity",
            "The amount of the medication given at one administration event.   Use this value when the administration is essentially an instantaneous event such as a swallowing a tablet or giving an injection.",
            0, 1, dose);
      case 983460768:
        /* rate[x] */ return new Property("rate[x]", "Ratio|Quantity",
            "Identifies the speed with which the medication was or will be introduced into the patient.  Typically, the rate for an infusion e.g. 100 ml per 1 hour or 100 ml/hr.  May also be expressed as a rate per unit of time, e.g. 500 ml per 2 hours.  Other examples:  200 mcg/min or 200 mcg/1 minute; 1 liter/8 hours.",
            0, 1, rate);
      case 3493088:
        /* rate */ return new Property("rate[x]", "Ratio|Quantity",
            "Identifies the speed with which the medication was or will be introduced into the patient.  Typically, the rate for an infusion e.g. 100 ml per 1 hour or 100 ml/hr.  May also be expressed as a rate per unit of time, e.g. 500 ml per 2 hours.  Other examples:  200 mcg/min or 200 mcg/1 minute; 1 liter/8 hours.",
            0, 1, rate);
      case 204021515:
        /* rateRatio */ return new Property("rate[x]", "Ratio",
            "Identifies the speed with which the medication was or will be introduced into the patient.  Typically, the rate for an infusion e.g. 100 ml per 1 hour or 100 ml/hr.  May also be expressed as a rate per unit of time, e.g. 500 ml per 2 hours.  Other examples:  200 mcg/min or 200 mcg/1 minute; 1 liter/8 hours.",
            0, 1, rate);
      case -1085459061:
        /* rateQuantity */ return new Property("rate[x]", "Quantity",
            "Identifies the speed with which the medication was or will be introduced into the patient.  Typically, the rate for an infusion e.g. 100 ml per 1 hour or 100 ml/hr.  May also be expressed as a rate per unit of time, e.g. 500 ml per 2 hours.  Other examples:  200 mcg/min or 200 mcg/1 minute; 1 liter/8 hours.",
            0, 1, rate);
      default:
        return super.getNamedProperty(_hash, _name, _checkValid);
      }

    }

    @Override
    public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
      switch (hash) {
      case 3556653:
        /* text */ return this.text == null ? new Base[0] : new Base[] { this.text }; // StringType
      case 3530567:
        /* site */ return this.site == null ? new Base[0] : new Base[] { this.site }; // CodeableConcept
      case 108704329:
        /* route */ return this.route == null ? new Base[0] : new Base[] { this.route }; // CodeableConcept
      case -1077554975:
        /* method */ return this.method == null ? new Base[0] : new Base[] { this.method }; // CodeableConcept
      case 3089437:
        /* dose */ return this.dose == null ? new Base[0] : new Base[] { this.dose }; // Quantity
      case 3493088:
        /* rate */ return this.rate == null ? new Base[0] : new Base[] { this.rate }; // DataType
      default:
        return super.getProperty(hash, name, checkValid);
      }

    }

    @Override
    public Base setProperty(int hash, String name, Base value) throws FHIRException {
      switch (hash) {
      case 3556653: // text
        this.text = TypeConvertor.castToString(value); // StringType
        return value;
      case 3530567: // site
        this.site = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        return value;
      case 108704329: // route
        this.route = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        return value;
      case -1077554975: // method
        this.method = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        return value;
      case 3089437: // dose
        this.dose = TypeConvertor.castToQuantity(value); // Quantity
        return value;
      case 3493088: // rate
        this.rate = TypeConvertor.castToType(value); // DataType
        return value;
      default:
        return super.setProperty(hash, name, value);
      }

    }

    @Override
    public Base setProperty(String name, Base value) throws FHIRException {
      if (name.equals("text")) {
        this.text = TypeConvertor.castToString(value); // StringType
      } else if (name.equals("site")) {
        this.site = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
      } else if (name.equals("route")) {
        this.route = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
      } else if (name.equals("method")) {
        this.method = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
      } else if (name.equals("dose")) {
        this.dose = TypeConvertor.castToQuantity(value); // Quantity
      } else if (name.equals("rate[x]")) {
        this.rate = TypeConvertor.castToType(value); // DataType
      } else
        return super.setProperty(name, value);
      return value;
    }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
      if (name.equals("text")) {
        this.text = null;
      } else if (name.equals("site")) {
        this.site = null;
      } else if (name.equals("route")) {
        this.route = null;
      } else if (name.equals("method")) {
        this.method = null;
      } else if (name.equals("dose")) {
        this.dose = null;
      } else if (name.equals("rate[x]")) {
        this.rate = null;
      } else
        super.removeChild(name, value);
      
    }

    @Override
    public Base makeProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 3556653:
        return getTextElement();
      case 3530567:
        return getSite();
      case 108704329:
        return getRoute();
      case -1077554975:
        return getMethod();
      case 3089437:
        return getDose();
      case 983460768:
        return getRate();
      case 3493088:
        return getRate();
      default:
        return super.makeProperty(hash, name);
      }

    }

    @Override
    public String[] getTypesForProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 3556653:
        /* text */ return new String[] { "string" };
      case 3530567:
        /* site */ return new String[] { "CodeableConcept" };
      case 108704329:
        /* route */ return new String[] { "CodeableConcept" };
      case -1077554975:
        /* method */ return new String[] { "CodeableConcept" };
      case 3089437:
        /* dose */ return new String[] { "Quantity" };
      case 3493088:
        /* rate */ return new String[] { "Ratio", "Quantity" };
      default:
        return super.getTypesForProperty(hash, name);
      }

    }

    @Override
    public Base addChild(String name) throws FHIRException {
      if (name.equals("text")) {
        throw new FHIRException("Cannot call addChild on a singleton property MedicationAdministration.dosage.text");
      } else if (name.equals("site")) {
        this.site = new CodeableConcept();
        return this.site;
      } else if (name.equals("route")) {
        this.route = new CodeableConcept();
        return this.route;
      } else if (name.equals("method")) {
        this.method = new CodeableConcept();
        return this.method;
      } else if (name.equals("dose")) {
        this.dose = new Quantity();
        return this.dose;
      } else if (name.equals("rateRatio")) {
        this.rate = new Ratio();
        return this.rate;
      } else if (name.equals("rateQuantity")) {
        this.rate = new Quantity();
        return this.rate;
      } else
        return super.addChild(name);
    }

    public MedicationAdministrationDosageComponent copy() {
      MedicationAdministrationDosageComponent dst = new MedicationAdministrationDosageComponent();
      copyValues(dst);
      return dst;
    }

    public void copyValues(MedicationAdministrationDosageComponent dst) {
      super.copyValues(dst);
      dst.text = text == null ? null : text.copy();
      dst.site = site == null ? null : site.copy();
      dst.route = route == null ? null : route.copy();
      dst.method = method == null ? null : method.copy();
      dst.dose = dose == null ? null : dose.copy();
      dst.rate = rate == null ? null : rate.copy();
    }

    @Override
    public boolean equalsDeep(Base other_) {
      if (!super.equalsDeep(other_))
        return false;
      if (!(other_ instanceof MedicationAdministrationDosageComponent))
        return false;
      MedicationAdministrationDosageComponent o = (MedicationAdministrationDosageComponent) other_;
      return compareDeep(text, o.text, true) && compareDeep(site, o.site, true) && compareDeep(route, o.route, true)
          && compareDeep(method, o.method, true) && compareDeep(dose, o.dose, true) && compareDeep(rate, o.rate, true);
    }

    @Override
    public boolean equalsShallow(Base other_) {
      if (!super.equalsShallow(other_))
        return false;
      if (!(other_ instanceof MedicationAdministrationDosageComponent))
        return false;
      MedicationAdministrationDosageComponent o = (MedicationAdministrationDosageComponent) other_;
      return compareValues(text, o.text, true);
    }

    public boolean isEmpty() {
      return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(text, site, route, method, dose, rate);
    }

    public String fhirType() {
      return "MedicationAdministration.dosage";

    }

  }

  /**
   * Identifiers associated with this Medication Administration that are defined
   * by business processes and/or used to refer to it when a direct URL reference
   * to the resource itself is not appropriate. They are business identifiers
   * assigned to this resource by the performer or other systems and remain
   * constant as the resource is updated and propagates from server to server.
   */
  @Child(name = "identifier", type = {
      Identifier.class }, order = 0, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "External identifier", formalDefinition = "Identifiers associated with this Medication Administration that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate. They are business identifiers assigned to this resource by the performer or other systems and remain constant as the resource is updated and propagates from server to server.")
  protected List<Identifier> identifier;

  /**
   * A protocol, guideline, orderset, or other definition that was adhered to in
   * whole or in part by this event.
   */
  @Child(name = "instantiates", type = {
      UriType.class }, order = 1, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
  @Description(shortDefinition = "Instantiates protocol or definition", formalDefinition = "A protocol, guideline, orderset, or other definition that was adhered to in whole or in part by this event.")
  protected List<UriType> instantiates;

  /**
   * A larger event of which this particular event is a component or step.
   */
  @Child(name = "partOf", type = { MedicationAdministration.class,
      Procedure.class }, order = 2, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
  @Description(shortDefinition = "Part of referenced event", formalDefinition = "A larger event of which this particular event is a component or step.")
  protected List<Reference> partOf;

  /**
   * Will generally be set to show that the administration has been completed. For
   * some long running administrations such as infusions, it is possible for an
   * administration to be started but not completed or it may be paused while some
   * other process is under way.
   */
  @Child(name = "status", type = { CodeType.class }, order = 3, min = 1, max = 1, modifier = true, summary = true)
  @Description(shortDefinition = "in-progress | not-done | on-hold | completed | entered-in-error | stopped | unknown", formalDefinition = "Will generally be set to show that the administration has been completed.  For some long running administrations such as infusions, it is possible for an administration to be started but not completed or it may be paused while some other process is under way.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/medication-admin-status")
  protected Enumeration<MedicationAdministrationStatusCodes> status;

  /**
   * A code indicating why the administration was not performed.
   */
  @Child(name = "statusReason", type = {
      CodeableConcept.class }, order = 4, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "Reason administration not performed", formalDefinition = "A code indicating why the administration was not performed.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/reason-medication-not-given-codes")
  protected List<CodeableConcept> statusReason;

  /**
   * Indicates where the medication is expected to be consumed or administered.
   */
  @Child(name = "category", type = {
      CodeableConcept.class }, order = 5, min = 0, max = 1, modifier = false, summary = false)
  @Description(shortDefinition = "Type of medication usage", formalDefinition = "Indicates where the medication is expected to be consumed or administered.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/medication-admin-category")
  protected CodeableConcept category;

  /**
   * Identifies the medication that was administered. This is either a link to a
   * resource representing the details of the medication or a simple attribute
   * carrying a code that identifies the medication from a known list of
   * medications.
   */
  @Child(name = "medication", type = { CodeableConcept.class,
      Medication.class }, order = 6, min = 1, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "What was administered", formalDefinition = "Identifies the medication that was administered. This is either a link to a resource representing the details of the medication or a simple attribute carrying a code that identifies the medication from a known list of medications.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/medication-codes")
  protected DataType medication;

  /**
   * The person or animal or group receiving the medication.
   */
  @Child(name = "subject", type = { Patient.class,
      Group.class }, order = 7, min = 1, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "Who received medication", formalDefinition = "The person or animal or group receiving the medication.")
  protected Reference subject;

  /**
   * The visit, admission, or other contact between patient and health care
   * provider during which the medication administration was performed.
   */
  @Child(name = "context", type = { Encounter.class,
      EpisodeOfCare.class }, order = 8, min = 0, max = 1, modifier = false, summary = false)
  @Description(shortDefinition = "Encounter or Episode of Care administered as part of", formalDefinition = "The visit, admission, or other contact between patient and health care provider during which the medication administration was performed.")
  protected Reference context;

  /**
   * Additional information (for example, patient height and weight) that supports
   * the administration of the medication.
   */
  @Child(name = "supportingInformation", type = {
      Reference.class }, order = 9, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "Additional information to support administration", formalDefinition = "Additional information (for example, patient height and weight) that supports the administration of the medication.")
  protected List<Reference> supportingInformation;

  /**
   * A specific date/time or interval of time during which the administration took
   * place (or did not take place, when the 'notGiven' attribute is true). For
   * many administrations, such as swallowing a tablet the use of dateTime is more
   * appropriate.
   */
  @Child(name = "effective", type = { DateTimeType.class,
      Period.class }, order = 10, min = 1, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "Start and end time of administration", formalDefinition = "A specific date/time or interval of time during which the administration took place (or did not take place, when the 'notGiven' attribute is true). For many administrations, such as swallowing a tablet the use of dateTime is more appropriate.")
  protected DataType effective;

  /**
   * Indicates who or what performed the medication administration and how they
   * were involved.
   */
  @Child(name = "performer", type = {}, order = 11, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
  @Description(shortDefinition = "Who performed the medication administration and what they did", formalDefinition = "Indicates who or what performed the medication administration and how they were involved.")
  protected List<MedicationAdministrationPerformerComponent> performer;

  /**
   * A code indicating why the medication was given.
   */
  @Child(name = "reasonCode", type = {
      CodeableConcept.class }, order = 12, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "Reason administration performed", formalDefinition = "A code indicating why the medication was given.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/reason-medication-given-codes")
  protected List<CodeableConcept> reasonCode;

  /**
   * Condition or observation that supports why the medication was administered.
   */
  @Child(name = "reasonReference", type = { Condition.class, Observation.class,
      DiagnosticReport.class }, order = 13, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "Condition or observation that supports why the medication was administered", formalDefinition = "Condition or observation that supports why the medication was administered.")
  protected List<Reference> reasonReference;

  /**
   * The original request, instruction or authority to perform the administration.
   */
  @Child(name = "request", type = {
      MedicationRequest.class }, order = 14, min = 0, max = 1, modifier = false, summary = false)
  @Description(shortDefinition = "Request administration performed against", formalDefinition = "The original request, instruction or authority to perform the administration.")
  protected Reference request;

  /**
   * The device used in administering the medication to the patient. For example,
   * a particular infusion pump.
   */
  @Child(name = "device", type = {
      Device.class }, order = 15, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "Device used to administer", formalDefinition = "The device used in administering the medication to the patient.  For example, a particular infusion pump.")
  protected List<Reference> device;

  /**
   * Extra information about the medication administration that is not conveyed by
   * the other attributes.
   */
  @Child(name = "note", type = {
      Annotation.class }, order = 16, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "Information about the administration", formalDefinition = "Extra information about the medication administration that is not conveyed by the other attributes.")
  protected List<Annotation> note;

  /**
   * Describes the medication dosage information details e.g. dose, rate, site,
   * route, etc.
   */
  @Child(name = "dosage", type = {}, order = 17, min = 0, max = 1, modifier = false, summary = false)
  @Description(shortDefinition = "Details of how medication was taken", formalDefinition = "Describes the medication dosage information details e.g. dose, rate, site, route, etc.")
  protected MedicationAdministrationDosageComponent dosage;

  /**
   * A summary of the events of interest that have occurred, such as when the
   * administration was verified.
   */
  @Child(name = "eventHistory", type = {
      Provenance.class }, order = 18, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "A list of events of interest in the lifecycle", formalDefinition = "A summary of the events of interest that have occurred, such as when the administration was verified.")
  protected List<Reference> eventHistory;

  private static final long serialVersionUID = 1202226940L;

  /**
   * Constructor
   */
  public MedicationAdministration() {
    super();
  }

  /**
   * Constructor
   */
  public MedicationAdministration(MedicationAdministrationStatusCodes status, DataType medication, Reference subject,
      DataType effective) {
    super();
    this.setStatus(status);
    this.setMedication(medication);
    this.setSubject(subject);
    this.setEffective(effective);
  }

  /**
   * @return {@link #identifier} (Identifiers associated with this Medication
   *         Administration that are defined by business processes and/or used to
   *         refer to it when a direct URL reference to the resource itself is not
   *         appropriate. They are business identifiers assigned to this resource
   *         by the performer or other systems and remain constant as the resource
   *         is updated and propagates from server to server.)
   */
  public List<Identifier> getIdentifier() {
    if (this.identifier == null)
      this.identifier = new ArrayList<Identifier>();
    return this.identifier;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public MedicationAdministration setIdentifier(List<Identifier> theIdentifier) {
    this.identifier = theIdentifier;
    return this;
  }

  public boolean hasIdentifier() {
    if (this.identifier == null)
      return false;
    for (Identifier item : this.identifier)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public Identifier addIdentifier() { // 3
    Identifier t = new Identifier();
    if (this.identifier == null)
      this.identifier = new ArrayList<Identifier>();
    this.identifier.add(t);
    return t;
  }

  public MedicationAdministration addIdentifier(Identifier t) { // 3
    if (t == null)
      return this;
    if (this.identifier == null)
      this.identifier = new ArrayList<Identifier>();
    this.identifier.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #identifier}, creating
   *         it if it does not already exist {3}
   */
  public Identifier getIdentifierFirstRep() {
    if (getIdentifier().isEmpty()) {
      addIdentifier();
    }
    return getIdentifier().get(0);
  }

  /**
   * @return {@link #instantiates} (A protocol, guideline, orderset, or other
   *         definition that was adhered to in whole or in part by this event.)
   */
  public List<UriType> getInstantiates() {
    if (this.instantiates == null)
      this.instantiates = new ArrayList<UriType>();
    return this.instantiates;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public MedicationAdministration setInstantiates(List<UriType> theInstantiates) {
    this.instantiates = theInstantiates;
    return this;
  }

  public boolean hasInstantiates() {
    if (this.instantiates == null)
      return false;
    for (UriType item : this.instantiates)
      if (!item.isEmpty())
        return true;
    return false;
  }

  /**
   * @return {@link #instantiates} (A protocol, guideline, orderset, or other
   *         definition that was adhered to in whole or in part by this event.)
   */
  public UriType addInstantiatesElement() {// 2
    UriType t = new UriType();
    if (this.instantiates == null)
      this.instantiates = new ArrayList<UriType>();
    this.instantiates.add(t);
    return t;
  }

  /**
   * @param value {@link #instantiates} (A protocol, guideline, orderset, or other
   *              definition that was adhered to in whole or in part by this
   *              event.)
   */
  public MedicationAdministration addInstantiates(String value) { // 1
    UriType t = new UriType();
    t.setValue(value);
    if (this.instantiates == null)
      this.instantiates = new ArrayList<UriType>();
    this.instantiates.add(t);
    return this;
  }

  /**
   * @param value {@link #instantiates} (A protocol, guideline, orderset, or other
   *              definition that was adhered to in whole or in part by this
   *              event.)
   */
  public boolean hasInstantiates(String value) {
    if (this.instantiates == null)
      return false;
    for (UriType v : this.instantiates)
      if (v.getValue().equals(value)) // uri
        return true;
    return false;
  }

  /**
   * @return {@link #partOf} (A larger event of which this particular event is a
   *         component or step.)
   */
  public List<Reference> getPartOf() {
    if (this.partOf == null)
      this.partOf = new ArrayList<Reference>();
    return this.partOf;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public MedicationAdministration setPartOf(List<Reference> thePartOf) {
    this.partOf = thePartOf;
    return this;
  }

  public boolean hasPartOf() {
    if (this.partOf == null)
      return false;
    for (Reference item : this.partOf)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public Reference addPartOf() { // 3
    Reference t = new Reference();
    if (this.partOf == null)
      this.partOf = new ArrayList<Reference>();
    this.partOf.add(t);
    return t;
  }

  public MedicationAdministration addPartOf(Reference t) { // 3
    if (t == null)
      return this;
    if (this.partOf == null)
      this.partOf = new ArrayList<Reference>();
    this.partOf.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #partOf}, creating it
   *         if it does not already exist {3}
   */
  public Reference getPartOfFirstRep() {
    if (getPartOf().isEmpty()) {
      addPartOf();
    }
    return getPartOf().get(0);
  }

  /**
   * @return {@link #status} (Will generally be set to show that the
   *         administration has been completed. For some long running
   *         administrations such as infusions, it is possible for an
   *         administration to be started but not completed or it may be paused
   *         while some other process is under way.). This is the underlying
   *         object with id, value and extensions. The accessor "getStatus" gives
   *         direct access to the value
   */
  public Enumeration<MedicationAdministrationStatusCodes> getStatusElement() {
    if (this.status == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create MedicationAdministration.status");
      else if (Configuration.doAutoCreate())
        this.status = new Enumeration<MedicationAdministrationStatusCodes>(
            new MedicationAdministrationStatusCodesEnumFactory()); // bb
    return this.status;
  }

  public boolean hasStatusElement() {
    return this.status != null && !this.status.isEmpty();
  }

  public boolean hasStatus() {
    return this.status != null && !this.status.isEmpty();
  }

  /**
   * @param value {@link #status} (Will generally be set to show that the
   *              administration has been completed. For some long running
   *              administrations such as infusions, it is possible for an
   *              administration to be started but not completed or it may be
   *              paused while some other process is under way.). This is the
   *              underlying object with id, value and extensions. The accessor
   *              "getStatus" gives direct access to the value
   */
  public MedicationAdministration setStatusElement(Enumeration<MedicationAdministrationStatusCodes> value) {
    this.status = value;
    return this;
  }

  /**
   * @return Will generally be set to show that the administration has been
   *         completed. For some long running administrations such as infusions,
   *         it is possible for an administration to be started but not completed
   *         or it may be paused while some other process is under way.
   */
  public MedicationAdministrationStatusCodes getStatus() {
    return this.status == null ? null : this.status.getValue();
  }

  /**
   * @param value Will generally be set to show that the administration has been
   *              completed. For some long running administrations such as
   *              infusions, it is possible for an administration to be started
   *              but not completed or it may be paused while some other process
   *              is under way.
   */
  public MedicationAdministration setStatus(MedicationAdministrationStatusCodes value) {
    if (this.status == null)
      this.status = new Enumeration<MedicationAdministrationStatusCodes>(
          new MedicationAdministrationStatusCodesEnumFactory());
    this.status.setValue(value);
    return this;
  }

  /**
   * @return {@link #statusReason} (A code indicating why the administration was
   *         not performed.)
   */
  public List<CodeableConcept> getStatusReason() {
    if (this.statusReason == null)
      this.statusReason = new ArrayList<CodeableConcept>();
    return this.statusReason;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public MedicationAdministration setStatusReason(List<CodeableConcept> theStatusReason) {
    this.statusReason = theStatusReason;
    return this;
  }

  public boolean hasStatusReason() {
    if (this.statusReason == null)
      return false;
    for (CodeableConcept item : this.statusReason)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public CodeableConcept addStatusReason() { // 3
    CodeableConcept t = new CodeableConcept();
    if (this.statusReason == null)
      this.statusReason = new ArrayList<CodeableConcept>();
    this.statusReason.add(t);
    return t;
  }

  public MedicationAdministration addStatusReason(CodeableConcept t) { // 3
    if (t == null)
      return this;
    if (this.statusReason == null)
      this.statusReason = new ArrayList<CodeableConcept>();
    this.statusReason.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #statusReason},
   *         creating it if it does not already exist {3}
   */
  public CodeableConcept getStatusReasonFirstRep() {
    if (getStatusReason().isEmpty()) {
      addStatusReason();
    }
    return getStatusReason().get(0);
  }

  /**
   * @return {@link #category} (Indicates where the medication is expected to be
   *         consumed or administered.)
   */
  public CodeableConcept getCategory() {
    if (this.category == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create MedicationAdministration.category");
      else if (Configuration.doAutoCreate())
        this.category = new CodeableConcept(); // cc
    return this.category;
  }

  public boolean hasCategory() {
    return this.category != null && !this.category.isEmpty();
  }

  /**
   * @param value {@link #category} (Indicates where the medication is expected to
   *              be consumed or administered.)
   */
  public MedicationAdministration setCategory(CodeableConcept value) {
    this.category = value;
    return this;
  }

  /**
   * @return {@link #medication} (Identifies the medication that was administered.
   *         This is either a link to a resource representing the details of the
   *         medication or a simple attribute carrying a code that identifies the
   *         medication from a known list of medications.)
   */
  public DataType getMedication() {
    return this.medication;
  }

  /**
   * @return {@link #medication} (Identifies the medication that was administered.
   *         This is either a link to a resource representing the details of the
   *         medication or a simple attribute carrying a code that identifies the
   *         medication from a known list of medications.)
   */
  public CodeableConcept getMedicationCodeableConcept() throws FHIRException {
    if (this.medication == null)
      this.medication = new CodeableConcept();
    if (!(this.medication instanceof CodeableConcept))
      throw new FHIRException("Type mismatch: the type CodeableConcept was expected, but "
          + this.medication.getClass().getName() + " was encountered");
    return (CodeableConcept) this.medication;
  }

  public boolean hasMedicationCodeableConcept() {
      return this.medication instanceof CodeableConcept;
  }

  /**
   * @return {@link #medication} (Identifies the medication that was administered.
   *         This is either a link to a resource representing the details of the
   *         medication or a simple attribute carrying a code that identifies the
   *         medication from a known list of medications.)
   */
  public Reference getMedicationReference() throws FHIRException {
    if (this.medication == null)
      this.medication = new Reference();
    if (!(this.medication instanceof Reference))
      throw new FHIRException("Type mismatch: the type Reference was expected, but "
          + this.medication.getClass().getName() + " was encountered");
    return (Reference) this.medication;
  }

  public boolean hasMedicationReference() {
      return this.medication instanceof Reference;
  }

  public boolean hasMedication() {
    return this.medication != null && !this.medication.isEmpty();
  }

  /**
   * @param value {@link #medication} (Identifies the medication that was
   *              administered. This is either a link to a resource representing
   *              the details of the medication or a simple attribute carrying a
   *              code that identifies the medication from a known list of
   *              medications.)
   */
  public MedicationAdministration setMedication(DataType value) {
    if (value != null && !(value instanceof CodeableConcept || value instanceof Reference))
      throw new Error("Not the right type for MedicationAdministration.medication[x]: " + value.fhirType());
    this.medication = value;
    return this;
  }

  /**
   * @return {@link #subject} (The person or animal or group receiving the
   *         medication.)
   */
  public Reference getSubject() {
    if (this.subject == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create MedicationAdministration.subject");
      else if (Configuration.doAutoCreate())
        this.subject = new Reference(); // cc
    return this.subject;
  }

  public boolean hasSubject() {
    return this.subject != null && !this.subject.isEmpty();
  }

  /**
   * @param value {@link #subject} (The person or animal or group receiving the
   *              medication.)
   */
  public MedicationAdministration setSubject(Reference value) {
    this.subject = value;
    return this;
  }

  /**
   * @return {@link #context} (The visit, admission, or other contact between
   *         patient and health care provider during which the medication
   *         administration was performed.)
   */
  public Reference getContext() {
    if (this.context == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create MedicationAdministration.context");
      else if (Configuration.doAutoCreate())
        this.context = new Reference(); // cc
    return this.context;
  }

  public boolean hasContext() {
    return this.context != null && !this.context.isEmpty();
  }

  /**
   * @param value {@link #context} (The visit, admission, or other contact between
   *              patient and health care provider during which the medication
   *              administration was performed.)
   */
  public MedicationAdministration setContext(Reference value) {
    this.context = value;
    return this;
  }

  /**
   * @return {@link #supportingInformation} (Additional information (for example,
   *         patient height and weight) that supports the administration of the
   *         medication.)
   */
  public List<Reference> getSupportingInformation() {
    if (this.supportingInformation == null)
      this.supportingInformation = new ArrayList<Reference>();
    return this.supportingInformation;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public MedicationAdministration setSupportingInformation(List<Reference> theSupportingInformation) {
    this.supportingInformation = theSupportingInformation;
    return this;
  }

  public boolean hasSupportingInformation() {
    if (this.supportingInformation == null)
      return false;
    for (Reference item : this.supportingInformation)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public Reference addSupportingInformation() { // 3
    Reference t = new Reference();
    if (this.supportingInformation == null)
      this.supportingInformation = new ArrayList<Reference>();
    this.supportingInformation.add(t);
    return t;
  }

  public MedicationAdministration addSupportingInformation(Reference t) { // 3
    if (t == null)
      return this;
    if (this.supportingInformation == null)
      this.supportingInformation = new ArrayList<Reference>();
    this.supportingInformation.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field
   *         {@link #supportingInformation}, creating it if it does not already
   *         exist {3}
   */
  public Reference getSupportingInformationFirstRep() {
    if (getSupportingInformation().isEmpty()) {
      addSupportingInformation();
    }
    return getSupportingInformation().get(0);
  }

  /**
   * @return {@link #effective} (A specific date/time or interval of time during
   *         which the administration took place (or did not take place, when the
   *         'notGiven' attribute is true). For many administrations, such as
   *         swallowing a tablet the use of dateTime is more appropriate.)
   */
  public DataType getEffective() {
    return this.effective;
  }

  /**
   * @return {@link #effective} (A specific date/time or interval of time during
   *         which the administration took place (or did not take place, when the
   *         'notGiven' attribute is true). For many administrations, such as
   *         swallowing a tablet the use of dateTime is more appropriate.)
   */
  public DateTimeType getEffectiveDateTimeType() throws FHIRException {
    if (this.effective == null)
      this.effective = new DateTimeType();
    if (!(this.effective instanceof DateTimeType))
      throw new FHIRException("Type mismatch: the type DateTimeType was expected, but "
          + this.effective.getClass().getName() + " was encountered");
    return (DateTimeType) this.effective;
  }

  public boolean hasEffectiveDateTimeType() {
      return this.effective instanceof DateTimeType;
  }

  /**
   * @return {@link #effective} (A specific date/time or interval of time during
   *         which the administration took place (or did not take place, when the
   *         'notGiven' attribute is true). For many administrations, such as
   *         swallowing a tablet the use of dateTime is more appropriate.)
   */
  public Period getEffectivePeriod() throws FHIRException {
    if (this.effective == null)
      this.effective = new Period();
    if (!(this.effective instanceof Period))
      throw new FHIRException("Type mismatch: the type Period was expected, but " + this.effective.getClass().getName()
          + " was encountered");
    return (Period) this.effective;
  }

  public boolean hasEffectivePeriod() {
      return this.effective instanceof Period;
  }

  public boolean hasEffective() {
    return this.effective != null && !this.effective.isEmpty();
  }

  /**
   * @param value {@link #effective} (A specific date/time or interval of time
   *              during which the administration took place (or did not take
   *              place, when the 'notGiven' attribute is true). For many
   *              administrations, such as swallowing a tablet the use of dateTime
   *              is more appropriate.)
   */
  public MedicationAdministration setEffective(DataType value) {
    if (value != null && !(value instanceof DateTimeType || value instanceof Period))
      throw new Error("Not the right type for MedicationAdministration.effective[x]: " + value.fhirType());
    this.effective = value;
    return this;
  }

  /**
   * @return {@link #performer} (Indicates who or what performed the medication
   *         administration and how they were involved.)
   */
  public List<MedicationAdministrationPerformerComponent> getPerformer() {
    if (this.performer == null)
      this.performer = new ArrayList<MedicationAdministrationPerformerComponent>();
    return this.performer;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public MedicationAdministration setPerformer(List<MedicationAdministrationPerformerComponent> thePerformer) {
    this.performer = thePerformer;
    return this;
  }

  public boolean hasPerformer() {
    if (this.performer == null)
      return false;
    for (MedicationAdministrationPerformerComponent item : this.performer)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public MedicationAdministrationPerformerComponent addPerformer() { // 3
    MedicationAdministrationPerformerComponent t = new MedicationAdministrationPerformerComponent();
    if (this.performer == null)
      this.performer = new ArrayList<MedicationAdministrationPerformerComponent>();
    this.performer.add(t);
    return t;
  }

  public MedicationAdministration addPerformer(MedicationAdministrationPerformerComponent t) { // 3
    if (t == null)
      return this;
    if (this.performer == null)
      this.performer = new ArrayList<MedicationAdministrationPerformerComponent>();
    this.performer.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #performer}, creating
   *         it if it does not already exist {3}
   */
  public MedicationAdministrationPerformerComponent getPerformerFirstRep() {
    if (getPerformer().isEmpty()) {
      addPerformer();
    }
    return getPerformer().get(0);
  }

  /**
   * @return {@link #reasonCode} (A code indicating why the medication was given.)
   */
  public List<CodeableConcept> getReasonCode() {
    if (this.reasonCode == null)
      this.reasonCode = new ArrayList<CodeableConcept>();
    return this.reasonCode;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public MedicationAdministration setReasonCode(List<CodeableConcept> theReasonCode) {
    this.reasonCode = theReasonCode;
    return this;
  }

  public boolean hasReasonCode() {
    if (this.reasonCode == null)
      return false;
    for (CodeableConcept item : this.reasonCode)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public CodeableConcept addReasonCode() { // 3
    CodeableConcept t = new CodeableConcept();
    if (this.reasonCode == null)
      this.reasonCode = new ArrayList<CodeableConcept>();
    this.reasonCode.add(t);
    return t;
  }

  public MedicationAdministration addReasonCode(CodeableConcept t) { // 3
    if (t == null)
      return this;
    if (this.reasonCode == null)
      this.reasonCode = new ArrayList<CodeableConcept>();
    this.reasonCode.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #reasonCode}, creating
   *         it if it does not already exist {3}
   */
  public CodeableConcept getReasonCodeFirstRep() {
    if (getReasonCode().isEmpty()) {
      addReasonCode();
    }
    return getReasonCode().get(0);
  }

  /**
   * @return {@link #reasonReference} (Condition or observation that supports why
   *         the medication was administered.)
   */
  public List<Reference> getReasonReference() {
    if (this.reasonReference == null)
      this.reasonReference = new ArrayList<Reference>();
    return this.reasonReference;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public MedicationAdministration setReasonReference(List<Reference> theReasonReference) {
    this.reasonReference = theReasonReference;
    return this;
  }

  public boolean hasReasonReference() {
    if (this.reasonReference == null)
      return false;
    for (Reference item : this.reasonReference)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public Reference addReasonReference() { // 3
    Reference t = new Reference();
    if (this.reasonReference == null)
      this.reasonReference = new ArrayList<Reference>();
    this.reasonReference.add(t);
    return t;
  }

  public MedicationAdministration addReasonReference(Reference t) { // 3
    if (t == null)
      return this;
    if (this.reasonReference == null)
      this.reasonReference = new ArrayList<Reference>();
    this.reasonReference.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #reasonReference},
   *         creating it if it does not already exist {3}
   */
  public Reference getReasonReferenceFirstRep() {
    if (getReasonReference().isEmpty()) {
      addReasonReference();
    }
    return getReasonReference().get(0);
  }

  /**
   * @return {@link #request} (The original request, instruction or authority to
   *         perform the administration.)
   */
  public Reference getRequest() {
    if (this.request == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create MedicationAdministration.request");
      else if (Configuration.doAutoCreate())
        this.request = new Reference(); // cc
    return this.request;
  }

  public boolean hasRequest() {
    return this.request != null && !this.request.isEmpty();
  }

  /**
   * @param value {@link #request} (The original request, instruction or authority
   *              to perform the administration.)
   */
  public MedicationAdministration setRequest(Reference value) {
    this.request = value;
    return this;
  }

  /**
   * @return {@link #device} (The device used in administering the medication to
   *         the patient. For example, a particular infusion pump.)
   */
  public List<Reference> getDevice() {
    if (this.device == null)
      this.device = new ArrayList<Reference>();
    return this.device;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public MedicationAdministration setDevice(List<Reference> theDevice) {
    this.device = theDevice;
    return this;
  }

  public boolean hasDevice() {
    if (this.device == null)
      return false;
    for (Reference item : this.device)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public Reference addDevice() { // 3
    Reference t = new Reference();
    if (this.device == null)
      this.device = new ArrayList<Reference>();
    this.device.add(t);
    return t;
  }

  public MedicationAdministration addDevice(Reference t) { // 3
    if (t == null)
      return this;
    if (this.device == null)
      this.device = new ArrayList<Reference>();
    this.device.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #device}, creating it
   *         if it does not already exist {3}
   */
  public Reference getDeviceFirstRep() {
    if (getDevice().isEmpty()) {
      addDevice();
    }
    return getDevice().get(0);
  }

  /**
   * @return {@link #note} (Extra information about the medication administration
   *         that is not conveyed by the other attributes.)
   */
  public List<Annotation> getNote() {
    if (this.note == null)
      this.note = new ArrayList<Annotation>();
    return this.note;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public MedicationAdministration setNote(List<Annotation> theNote) {
    this.note = theNote;
    return this;
  }

  public boolean hasNote() {
    if (this.note == null)
      return false;
    for (Annotation item : this.note)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public Annotation addNote() { // 3
    Annotation t = new Annotation();
    if (this.note == null)
      this.note = new ArrayList<Annotation>();
    this.note.add(t);
    return t;
  }

  public MedicationAdministration addNote(Annotation t) { // 3
    if (t == null)
      return this;
    if (this.note == null)
      this.note = new ArrayList<Annotation>();
    this.note.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #note}, creating it if
   *         it does not already exist {3}
   */
  public Annotation getNoteFirstRep() {
    if (getNote().isEmpty()) {
      addNote();
    }
    return getNote().get(0);
  }

  /**
   * @return {@link #dosage} (Describes the medication dosage information details
   *         e.g. dose, rate, site, route, etc.)
   */
  public MedicationAdministrationDosageComponent getDosage() {
    if (this.dosage == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create MedicationAdministration.dosage");
      else if (Configuration.doAutoCreate())
        this.dosage = new MedicationAdministrationDosageComponent(); // cc
    return this.dosage;
  }

  public boolean hasDosage() {
    return this.dosage != null && !this.dosage.isEmpty();
  }

  /**
   * @param value {@link #dosage} (Describes the medication dosage information
   *              details e.g. dose, rate, site, route, etc.)
   */
  public MedicationAdministration setDosage(MedicationAdministrationDosageComponent value) {
    this.dosage = value;
    return this;
  }

  /**
   * @return {@link #eventHistory} (A summary of the events of interest that have
   *         occurred, such as when the administration was verified.)
   */
  public List<Reference> getEventHistory() {
    if (this.eventHistory == null)
      this.eventHistory = new ArrayList<Reference>();
    return this.eventHistory;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public MedicationAdministration setEventHistory(List<Reference> theEventHistory) {
    this.eventHistory = theEventHistory;
    return this;
  }

  public boolean hasEventHistory() {
    if (this.eventHistory == null)
      return false;
    for (Reference item : this.eventHistory)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public Reference addEventHistory() { // 3
    Reference t = new Reference();
    if (this.eventHistory == null)
      this.eventHistory = new ArrayList<Reference>();
    this.eventHistory.add(t);
    return t;
  }

  public MedicationAdministration addEventHistory(Reference t) { // 3
    if (t == null)
      return this;
    if (this.eventHistory == null)
      this.eventHistory = new ArrayList<Reference>();
    this.eventHistory.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #eventHistory},
   *         creating it if it does not already exist {3}
   */
  public Reference getEventHistoryFirstRep() {
    if (getEventHistory().isEmpty()) {
      addEventHistory();
    }
    return getEventHistory().get(0);
  }

  protected void listChildren(List<Property> children) {
    super.listChildren(children);
    children.add(new Property("identifier", "Identifier",
        "Identifiers associated with this Medication Administration that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate. They are business identifiers assigned to this resource by the performer or other systems and remain constant as the resource is updated and propagates from server to server.",
        0, java.lang.Integer.MAX_VALUE, identifier));
    children.add(new Property("instantiates", "uri",
        "A protocol, guideline, orderset, or other definition that was adhered to in whole or in part by this event.",
        0, java.lang.Integer.MAX_VALUE, instantiates));
    children.add(new Property("partOf", "Reference(MedicationAdministration|Procedure)",
        "A larger event of which this particular event is a component or step.", 0, java.lang.Integer.MAX_VALUE,
        partOf));
    children.add(new Property("status", "code",
        "Will generally be set to show that the administration has been completed.  For some long running administrations such as infusions, it is possible for an administration to be started but not completed or it may be paused while some other process is under way.",
        0, 1, status));
    children.add(new Property("statusReason", "CodeableConcept",
        "A code indicating why the administration was not performed.", 0, java.lang.Integer.MAX_VALUE, statusReason));
    children.add(new Property("category", "CodeableConcept",
        "Indicates where the medication is expected to be consumed or administered.", 0, 1, category));
    children.add(new Property("medication[x]", "CodeableConcept|Reference(Medication)",
        "Identifies the medication that was administered. This is either a link to a resource representing the details of the medication or a simple attribute carrying a code that identifies the medication from a known list of medications.",
        0, 1, medication));
    children.add(new Property("subject", "Reference(Patient|Group)",
        "The person or animal or group receiving the medication.", 0, 1, subject));
    children.add(new Property("context", "Reference(Encounter|EpisodeOfCare)",
        "The visit, admission, or other contact between patient and health care provider during which the medication administration was performed.",
        0, 1, context));
    children.add(new Property("supportingInformation", "Reference(Any)",
        "Additional information (for example, patient height and weight) that supports the administration of the medication.",
        0, java.lang.Integer.MAX_VALUE, supportingInformation));
    children.add(new Property("effective[x]", "dateTime|Period",
        "A specific date/time or interval of time during which the administration took place (or did not take place, when the 'notGiven' attribute is true). For many administrations, such as swallowing a tablet the use of dateTime is more appropriate.",
        0, 1, effective));
    children.add(new Property("performer", "",
        "Indicates who or what performed the medication administration and how they were involved.", 0,
        java.lang.Integer.MAX_VALUE, performer));
    children.add(new Property("reasonCode", "CodeableConcept", "A code indicating why the medication was given.", 0,
        java.lang.Integer.MAX_VALUE, reasonCode));
    children.add(new Property("reasonReference", "Reference(Condition|Observation|DiagnosticReport)",
        "Condition or observation that supports why the medication was administered.", 0, java.lang.Integer.MAX_VALUE,
        reasonReference));
    children.add(new Property("request", "Reference(MedicationRequest)",
        "The original request, instruction or authority to perform the administration.", 0, 1, request));
    children.add(new Property("device", "Reference(Device)",
        "The device used in administering the medication to the patient.  For example, a particular infusion pump.", 0,
        java.lang.Integer.MAX_VALUE, device));
    children.add(new Property("note", "Annotation",
        "Extra information about the medication administration that is not conveyed by the other attributes.", 0,
        java.lang.Integer.MAX_VALUE, note));
    children.add(new Property("dosage", "",
        "Describes the medication dosage information details e.g. dose, rate, site, route, etc.", 0, 1, dosage));
    children.add(new Property("eventHistory", "Reference(Provenance)",
        "A summary of the events of interest that have occurred, such as when the administration was verified.", 0,
        java.lang.Integer.MAX_VALUE, eventHistory));
  }

  @Override
  public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
    switch (_hash) {
    case -1618432855:
      /* identifier */ return new Property("identifier", "Identifier",
          "Identifiers associated with this Medication Administration that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate. They are business identifiers assigned to this resource by the performer or other systems and remain constant as the resource is updated and propagates from server to server.",
          0, java.lang.Integer.MAX_VALUE, identifier);
    case -246883639:
      /* instantiates */ return new Property("instantiates", "uri",
          "A protocol, guideline, orderset, or other definition that was adhered to in whole or in part by this event.",
          0, java.lang.Integer.MAX_VALUE, instantiates);
    case -995410646:
      /* partOf */ return new Property("partOf", "Reference(MedicationAdministration|Procedure)",
          "A larger event of which this particular event is a component or step.", 0, java.lang.Integer.MAX_VALUE,
          partOf);
    case -892481550:
      /* status */ return new Property("status", "code",
          "Will generally be set to show that the administration has been completed.  For some long running administrations such as infusions, it is possible for an administration to be started but not completed or it may be paused while some other process is under way.",
          0, 1, status);
    case 2051346646:
      /* statusReason */ return new Property("statusReason", "CodeableConcept",
          "A code indicating why the administration was not performed.", 0, java.lang.Integer.MAX_VALUE, statusReason);
    case 50511102:
      /* category */ return new Property("category", "CodeableConcept",
          "Indicates where the medication is expected to be consumed or administered.", 0, 1, category);
    case 1458402129:
      /* medication[x] */ return new Property("medication[x]", "CodeableConcept|Reference(Medication)",
          "Identifies the medication that was administered. This is either a link to a resource representing the details of the medication or a simple attribute carrying a code that identifies the medication from a known list of medications.",
          0, 1, medication);
    case 1998965455:
      /* medication */ return new Property("medication[x]", "CodeableConcept|Reference(Medication)",
          "Identifies the medication that was administered. This is either a link to a resource representing the details of the medication or a simple attribute carrying a code that identifies the medication from a known list of medications.",
          0, 1, medication);
    case -209845038:
      /* medicationCodeableConcept */ return new Property("medication[x]", "CodeableConcept",
          "Identifies the medication that was administered. This is either a link to a resource representing the details of the medication or a simple attribute carrying a code that identifies the medication from a known list of medications.",
          0, 1, medication);
    case 2104315196:
      /* medicationReference */ return new Property("medication[x]", "Reference(Medication)",
          "Identifies the medication that was administered. This is either a link to a resource representing the details of the medication or a simple attribute carrying a code that identifies the medication from a known list of medications.",
          0, 1, medication);
    case -1867885268:
      /* subject */ return new Property("subject", "Reference(Patient|Group)",
          "The person or animal or group receiving the medication.", 0, 1, subject);
    case 951530927:
      /* context */ return new Property("context", "Reference(Encounter|EpisodeOfCare)",
          "The visit, admission, or other contact between patient and health care provider during which the medication administration was performed.",
          0, 1, context);
    case -1248768647:
      /* supportingInformation */ return new Property("supportingInformation", "Reference(Any)",
          "Additional information (for example, patient height and weight) that supports the administration of the medication.",
          0, java.lang.Integer.MAX_VALUE, supportingInformation);
    case 247104889:
      /* effective[x] */ return new Property("effective[x]", "dateTime|Period",
          "A specific date/time or interval of time during which the administration took place (or did not take place, when the 'notGiven' attribute is true). For many administrations, such as swallowing a tablet the use of dateTime is more appropriate.",
          0, 1, effective);
    case -1468651097:
      /* effective */ return new Property("effective[x]", "dateTime|Period",
          "A specific date/time or interval of time during which the administration took place (or did not take place, when the 'notGiven' attribute is true). For many administrations, such as swallowing a tablet the use of dateTime is more appropriate.",
          0, 1, effective);
    case -275306910:
      /* effectiveDateTime */ return new Property("effective[x]", "dateTime",
          "A specific date/time or interval of time during which the administration took place (or did not take place, when the 'notGiven' attribute is true). For many administrations, such as swallowing a tablet the use of dateTime is more appropriate.",
          0, 1, effective);
    case -403934648:
      /* effectivePeriod */ return new Property("effective[x]", "Period",
          "A specific date/time or interval of time during which the administration took place (or did not take place, when the 'notGiven' attribute is true). For many administrations, such as swallowing a tablet the use of dateTime is more appropriate.",
          0, 1, effective);
    case 481140686:
      /* performer */ return new Property("performer", "",
          "Indicates who or what performed the medication administration and how they were involved.", 0,
          java.lang.Integer.MAX_VALUE, performer);
    case 722137681:
      /* reasonCode */ return new Property("reasonCode", "CodeableConcept",
          "A code indicating why the medication was given.", 0, java.lang.Integer.MAX_VALUE, reasonCode);
    case -1146218137:
      /* reasonReference */ return new Property("reasonReference", "Reference(Condition|Observation|DiagnosticReport)",
          "Condition or observation that supports why the medication was administered.", 0, java.lang.Integer.MAX_VALUE,
          reasonReference);
    case 1095692943:
      /* request */ return new Property("request", "Reference(MedicationRequest)",
          "The original request, instruction or authority to perform the administration.", 0, 1, request);
    case -1335157162:
      /* device */ return new Property("device", "Reference(Device)",
          "The device used in administering the medication to the patient.  For example, a particular infusion pump.",
          0, java.lang.Integer.MAX_VALUE, device);
    case 3387378:
      /* note */ return new Property("note", "Annotation",
          "Extra information about the medication administration that is not conveyed by the other attributes.", 0,
          java.lang.Integer.MAX_VALUE, note);
    case -1326018889:
      /* dosage */ return new Property("dosage", "",
          "Describes the medication dosage information details e.g. dose, rate, site, route, etc.", 0, 1, dosage);
    case 1835190426:
      /* eventHistory */ return new Property("eventHistory", "Reference(Provenance)",
          "A summary of the events of interest that have occurred, such as when the administration was verified.", 0,
          java.lang.Integer.MAX_VALUE, eventHistory);
    default:
      return super.getNamedProperty(_hash, _name, _checkValid);
    }

  }

  @Override
  public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
    switch (hash) {
    case -1618432855:
      /* identifier */ return this.identifier == null ? new Base[0]
          : this.identifier.toArray(new Base[this.identifier.size()]); // Identifier
    case -246883639:
      /* instantiates */ return this.instantiates == null ? new Base[0]
          : this.instantiates.toArray(new Base[this.instantiates.size()]); // UriType
    case -995410646:
      /* partOf */ return this.partOf == null ? new Base[0] : this.partOf.toArray(new Base[this.partOf.size()]); // Reference
    case -892481550:
      /* status */ return this.status == null ? new Base[0] : new Base[] { this.status }; // Enumeration<MedicationAdministrationStatusCodes>
    case 2051346646:
      /* statusReason */ return this.statusReason == null ? new Base[0]
          : this.statusReason.toArray(new Base[this.statusReason.size()]); // CodeableConcept
    case 50511102:
      /* category */ return this.category == null ? new Base[0] : new Base[] { this.category }; // CodeableConcept
    case 1998965455:
      /* medication */ return this.medication == null ? new Base[0] : new Base[] { this.medication }; // DataType
    case -1867885268:
      /* subject */ return this.subject == null ? new Base[0] : new Base[] { this.subject }; // Reference
    case 951530927:
      /* context */ return this.context == null ? new Base[0] : new Base[] { this.context }; // Reference
    case -1248768647:
      /* supportingInformation */ return this.supportingInformation == null ? new Base[0]
          : this.supportingInformation.toArray(new Base[this.supportingInformation.size()]); // Reference
    case -1468651097:
      /* effective */ return this.effective == null ? new Base[0] : new Base[] { this.effective }; // DataType
    case 481140686:
      /* performer */ return this.performer == null ? new Base[0]
          : this.performer.toArray(new Base[this.performer.size()]); // MedicationAdministrationPerformerComponent
    case 722137681:
      /* reasonCode */ return this.reasonCode == null ? new Base[0]
          : this.reasonCode.toArray(new Base[this.reasonCode.size()]); // CodeableConcept
    case -1146218137:
      /* reasonReference */ return this.reasonReference == null ? new Base[0]
          : this.reasonReference.toArray(new Base[this.reasonReference.size()]); // Reference
    case 1095692943:
      /* request */ return this.request == null ? new Base[0] : new Base[] { this.request }; // Reference
    case -1335157162:
      /* device */ return this.device == null ? new Base[0] : this.device.toArray(new Base[this.device.size()]); // Reference
    case 3387378:
      /* note */ return this.note == null ? new Base[0] : this.note.toArray(new Base[this.note.size()]); // Annotation
    case -1326018889:
      /* dosage */ return this.dosage == null ? new Base[0] : new Base[] { this.dosage }; // MedicationAdministrationDosageComponent
    case 1835190426:
      /* eventHistory */ return this.eventHistory == null ? new Base[0]
          : this.eventHistory.toArray(new Base[this.eventHistory.size()]); // Reference
    default:
      return super.getProperty(hash, name, checkValid);
    }

  }

  @Override
  public Base setProperty(int hash, String name, Base value) throws FHIRException {
    switch (hash) {
    case -1618432855: // identifier
      this.getIdentifier().add(TypeConvertor.castToIdentifier(value)); // Identifier
      return value;
    case -246883639: // instantiates
      this.getInstantiates().add(TypeConvertor.castToUri(value)); // UriType
      return value;
    case -995410646: // partOf
      this.getPartOf().add(TypeConvertor.castToReference(value)); // Reference
      return value;
    case -892481550: // status
      value = new MedicationAdministrationStatusCodesEnumFactory().fromType(TypeConvertor.castToCode(value));
      this.status = (Enumeration) value; // Enumeration<MedicationAdministrationStatusCodes>
      return value;
    case 2051346646: // statusReason
      this.getStatusReason().add(TypeConvertor.castToCodeableConcept(value)); // CodeableConcept
      return value;
    case 50511102: // category
      this.category = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
      return value;
    case 1998965455: // medication
      this.medication = TypeConvertor.castToType(value); // DataType
      return value;
    case -1867885268: // subject
      this.subject = TypeConvertor.castToReference(value); // Reference
      return value;
    case 951530927: // context
      this.context = TypeConvertor.castToReference(value); // Reference
      return value;
    case -1248768647: // supportingInformation
      this.getSupportingInformation().add(TypeConvertor.castToReference(value)); // Reference
      return value;
    case -1468651097: // effective
      this.effective = TypeConvertor.castToType(value); // DataType
      return value;
    case 481140686: // performer
      this.getPerformer().add((MedicationAdministrationPerformerComponent) value); // MedicationAdministrationPerformerComponent
      return value;
    case 722137681: // reasonCode
      this.getReasonCode().add(TypeConvertor.castToCodeableConcept(value)); // CodeableConcept
      return value;
    case -1146218137: // reasonReference
      this.getReasonReference().add(TypeConvertor.castToReference(value)); // Reference
      return value;
    case 1095692943: // request
      this.request = TypeConvertor.castToReference(value); // Reference
      return value;
    case -1335157162: // device
      this.getDevice().add(TypeConvertor.castToReference(value)); // Reference
      return value;
    case 3387378: // note
      this.getNote().add(TypeConvertor.castToAnnotation(value)); // Annotation
      return value;
    case -1326018889: // dosage
      this.dosage = (MedicationAdministrationDosageComponent) value; // MedicationAdministrationDosageComponent
      return value;
    case 1835190426: // eventHistory
      this.getEventHistory().add(TypeConvertor.castToReference(value)); // Reference
      return value;
    default:
      return super.setProperty(hash, name, value);
    }

  }

  @Override
  public Base setProperty(String name, Base value) throws FHIRException {
    if (name.equals("identifier")) {
      this.getIdentifier().add(TypeConvertor.castToIdentifier(value));
    } else if (name.equals("instantiates")) {
      this.getInstantiates().add(TypeConvertor.castToUri(value));
    } else if (name.equals("partOf")) {
      this.getPartOf().add(TypeConvertor.castToReference(value));
    } else if (name.equals("status")) {
      value = new MedicationAdministrationStatusCodesEnumFactory().fromType(TypeConvertor.castToCode(value));
      this.status = (Enumeration) value; // Enumeration<MedicationAdministrationStatusCodes>
    } else if (name.equals("statusReason")) {
      this.getStatusReason().add(TypeConvertor.castToCodeableConcept(value));
    } else if (name.equals("category")) {
      this.category = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
    } else if (name.equals("medication[x]")) {
      this.medication = TypeConvertor.castToType(value); // DataType
    } else if (name.equals("subject")) {
      this.subject = TypeConvertor.castToReference(value); // Reference
    } else if (name.equals("context")) {
      this.context = TypeConvertor.castToReference(value); // Reference
    } else if (name.equals("supportingInformation")) {
      this.getSupportingInformation().add(TypeConvertor.castToReference(value));
    } else if (name.equals("effective[x]")) {
      this.effective = TypeConvertor.castToType(value); // DataType
    } else if (name.equals("performer")) {
      this.getPerformer().add((MedicationAdministrationPerformerComponent) value);
    } else if (name.equals("reasonCode")) {
      this.getReasonCode().add(TypeConvertor.castToCodeableConcept(value));
    } else if (name.equals("reasonReference")) {
      this.getReasonReference().add(TypeConvertor.castToReference(value));
    } else if (name.equals("request")) {
      this.request = TypeConvertor.castToReference(value); // Reference
    } else if (name.equals("device")) {
      this.getDevice().add(TypeConvertor.castToReference(value));
    } else if (name.equals("note")) {
      this.getNote().add(TypeConvertor.castToAnnotation(value));
    } else if (name.equals("dosage")) {
      this.dosage = (MedicationAdministrationDosageComponent) value; // MedicationAdministrationDosageComponent
    } else if (name.equals("eventHistory")) {
      this.getEventHistory().add(TypeConvertor.castToReference(value));
    } else
      return super.setProperty(name, value);
    return value;
  }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
    if (name.equals("identifier")) {
      this.getIdentifier().remove(value);
    } else if (name.equals("instantiates")) {
      this.getInstantiates().remove(value);
    } else if (name.equals("partOf")) {
      this.getPartOf().remove(value);
    } else if (name.equals("status")) {
      this.status = null;
    } else if (name.equals("statusReason")) {
      this.getStatusReason().remove(value);
    } else if (name.equals("category")) {
      this.category = null;
    } else if (name.equals("medication[x]")) {
      this.medication = null;
    } else if (name.equals("subject")) {
      this.subject = null;
    } else if (name.equals("context")) {
      this.context = null;
    } else if (name.equals("supportingInformation")) {
      this.getSupportingInformation().remove(value);
    } else if (name.equals("effective[x]")) {
      this.effective = null;
    } else if (name.equals("performer")) {
      this.getPerformer().remove((MedicationAdministrationPerformerComponent) value);
    } else if (name.equals("reasonCode")) {
      this.getReasonCode().remove(value);
    } else if (name.equals("reasonReference")) {
      this.getReasonReference().remove(value);
    } else if (name.equals("request")) {
      this.request = null;
    } else if (name.equals("device")) {
      this.getDevice().remove(value);
    } else if (name.equals("note")) {
      this.getNote().remove(value);
    } else if (name.equals("dosage")) {
      this.dosage = (MedicationAdministrationDosageComponent) value; // MedicationAdministrationDosageComponent
    } else if (name.equals("eventHistory")) {
      this.getEventHistory().remove(value);
    } else
      super.removeChild(name, value);
    
  }

  @Override
  public Base makeProperty(int hash, String name) throws FHIRException {
    switch (hash) {
    case -1618432855:
      return addIdentifier();
    case -246883639:
      return addInstantiatesElement();
    case -995410646:
      return addPartOf();
    case -892481550:
      return getStatusElement();
    case 2051346646:
      return addStatusReason();
    case 50511102:
      return getCategory();
    case 1458402129:
      return getMedication();
    case 1998965455:
      return getMedication();
    case -1867885268:
      return getSubject();
    case 951530927:
      return getContext();
    case -1248768647:
      return addSupportingInformation();
    case 247104889:
      return getEffective();
    case -1468651097:
      return getEffective();
    case 481140686:
      return addPerformer();
    case 722137681:
      return addReasonCode();
    case -1146218137:
      return addReasonReference();
    case 1095692943:
      return getRequest();
    case -1335157162:
      return addDevice();
    case 3387378:
      return addNote();
    case -1326018889:
      return getDosage();
    case 1835190426:
      return addEventHistory();
    default:
      return super.makeProperty(hash, name);
    }

  }

  @Override
  public String[] getTypesForProperty(int hash, String name) throws FHIRException {
    switch (hash) {
    case -1618432855:
      /* identifier */ return new String[] { "Identifier" };
    case -246883639:
      /* instantiates */ return new String[] { "uri" };
    case -995410646:
      /* partOf */ return new String[] { "Reference" };
    case -892481550:
      /* status */ return new String[] { "code" };
    case 2051346646:
      /* statusReason */ return new String[] { "CodeableConcept" };
    case 50511102:
      /* category */ return new String[] { "CodeableConcept" };
    case 1998965455:
      /* medication */ return new String[] { "CodeableConcept", "Reference" };
    case -1867885268:
      /* subject */ return new String[] { "Reference" };
    case 951530927:
      /* context */ return new String[] { "Reference" };
    case -1248768647:
      /* supportingInformation */ return new String[] { "Reference" };
    case -1468651097:
      /* effective */ return new String[] { "dateTime", "Period" };
    case 481140686:
      /* performer */ return new String[] {};
    case 722137681:
      /* reasonCode */ return new String[] { "CodeableConcept" };
    case -1146218137:
      /* reasonReference */ return new String[] { "Reference" };
    case 1095692943:
      /* request */ return new String[] { "Reference" };
    case -1335157162:
      /* device */ return new String[] { "Reference" };
    case 3387378:
      /* note */ return new String[] { "Annotation" };
    case -1326018889:
      /* dosage */ return new String[] {};
    case 1835190426:
      /* eventHistory */ return new String[] { "Reference" };
    default:
      return super.getTypesForProperty(hash, name);
    }

  }

  @Override
  public Base addChild(String name) throws FHIRException {
    if (name.equals("identifier")) {
      return addIdentifier();
    } else if (name.equals("instantiates")) {
      throw new FHIRException("Cannot call addChild on a singleton property MedicationAdministration.instantiates");
    } else if (name.equals("partOf")) {
      return addPartOf();
    } else if (name.equals("status")) {
      throw new FHIRException("Cannot call addChild on a singleton property MedicationAdministration.status");
    } else if (name.equals("statusReason")) {
      return addStatusReason();
    } else if (name.equals("category")) {
      this.category = new CodeableConcept();
      return this.category;
    } else if (name.equals("medicationCodeableConcept")) {
      this.medication = new CodeableConcept();
      return this.medication;
    } else if (name.equals("medicationReference")) {
      this.medication = new Reference();
      return this.medication;
    } else if (name.equals("subject")) {
      this.subject = new Reference();
      return this.subject;
    } else if (name.equals("context")) {
      this.context = new Reference();
      return this.context;
    } else if (name.equals("supportingInformation")) {
      return addSupportingInformation();
    } else if (name.equals("effectiveDateTime")) {
      this.effective = new DateTimeType();
      return this.effective;
    } else if (name.equals("effectivePeriod")) {
      this.effective = new Period();
      return this.effective;
    } else if (name.equals("performer")) {
      return addPerformer();
    } else if (name.equals("reasonCode")) {
      return addReasonCode();
    } else if (name.equals("reasonReference")) {
      return addReasonReference();
    } else if (name.equals("request")) {
      this.request = new Reference();
      return this.request;
    } else if (name.equals("device")) {
      return addDevice();
    } else if (name.equals("note")) {
      return addNote();
    } else if (name.equals("dosage")) {
      this.dosage = new MedicationAdministrationDosageComponent();
      return this.dosage;
    } else if (name.equals("eventHistory")) {
      return addEventHistory();
    } else
      return super.addChild(name);
  }

  public String fhirType() {
    return "MedicationAdministration";

  }

  public MedicationAdministration copy() {
    MedicationAdministration dst = new MedicationAdministration();
    copyValues(dst);
    return dst;
  }

  public void copyValues(MedicationAdministration dst) {
    super.copyValues(dst);
    if (identifier != null) {
      dst.identifier = new ArrayList<Identifier>();
      for (Identifier i : identifier)
        dst.identifier.add(i.copy());
    }
    ;
    if (instantiates != null) {
      dst.instantiates = new ArrayList<UriType>();
      for (UriType i : instantiates)
        dst.instantiates.add(i.copy());
    }
    ;
    if (partOf != null) {
      dst.partOf = new ArrayList<Reference>();
      for (Reference i : partOf)
        dst.partOf.add(i.copy());
    }
    ;
    dst.status = status == null ? null : status.copy();
    if (statusReason != null) {
      dst.statusReason = new ArrayList<CodeableConcept>();
      for (CodeableConcept i : statusReason)
        dst.statusReason.add(i.copy());
    }
    ;
    dst.category = category == null ? null : category.copy();
    dst.medication = medication == null ? null : medication.copy();
    dst.subject = subject == null ? null : subject.copy();
    dst.context = context == null ? null : context.copy();
    if (supportingInformation != null) {
      dst.supportingInformation = new ArrayList<Reference>();
      for (Reference i : supportingInformation)
        dst.supportingInformation.add(i.copy());
    }
    ;
    dst.effective = effective == null ? null : effective.copy();
    if (performer != null) {
      dst.performer = new ArrayList<MedicationAdministrationPerformerComponent>();
      for (MedicationAdministrationPerformerComponent i : performer)
        dst.performer.add(i.copy());
    }
    ;
    if (reasonCode != null) {
      dst.reasonCode = new ArrayList<CodeableConcept>();
      for (CodeableConcept i : reasonCode)
        dst.reasonCode.add(i.copy());
    }
    ;
    if (reasonReference != null) {
      dst.reasonReference = new ArrayList<Reference>();
      for (Reference i : reasonReference)
        dst.reasonReference.add(i.copy());
    }
    ;
    dst.request = request == null ? null : request.copy();
    if (device != null) {
      dst.device = new ArrayList<Reference>();
      for (Reference i : device)
        dst.device.add(i.copy());
    }
    ;
    if (note != null) {
      dst.note = new ArrayList<Annotation>();
      for (Annotation i : note)
        dst.note.add(i.copy());
    }
    ;
    dst.dosage = dosage == null ? null : dosage.copy();
    if (eventHistory != null) {
      dst.eventHistory = new ArrayList<Reference>();
      for (Reference i : eventHistory)
        dst.eventHistory.add(i.copy());
    }
    ;
  }

  protected MedicationAdministration typedCopy() {
    return copy();
  }

  @Override
  public boolean equalsDeep(Base other_) {
    if (!super.equalsDeep(other_))
      return false;
    if (!(other_ instanceof MedicationAdministration))
      return false;
    MedicationAdministration o = (MedicationAdministration) other_;
    return compareDeep(identifier, o.identifier, true) && compareDeep(instantiates, o.instantiates, true)
        && compareDeep(partOf, o.partOf, true) && compareDeep(status, o.status, true)
        && compareDeep(statusReason, o.statusReason, true) && compareDeep(category, o.category, true)
        && compareDeep(medication, o.medication, true) && compareDeep(subject, o.subject, true)
        && compareDeep(context, o.context, true) && compareDeep(supportingInformation, o.supportingInformation, true)
        && compareDeep(effective, o.effective, true) && compareDeep(performer, o.performer, true)
        && compareDeep(reasonCode, o.reasonCode, true) && compareDeep(reasonReference, o.reasonReference, true)
        && compareDeep(request, o.request, true) && compareDeep(device, o.device, true)
        && compareDeep(note, o.note, true) && compareDeep(dosage, o.dosage, true)
        && compareDeep(eventHistory, o.eventHistory, true);
  }

  @Override
  public boolean equalsShallow(Base other_) {
    if (!super.equalsShallow(other_))
      return false;
    if (!(other_ instanceof MedicationAdministration))
      return false;
    MedicationAdministration o = (MedicationAdministration) other_;
    return compareValues(instantiates, o.instantiates, true) && compareValues(status, o.status, true);
  }

  public boolean isEmpty() {
    return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(identifier, instantiates, partOf, status,
        statusReason, category, medication, subject, context, supportingInformation, effective, performer, reasonCode,
        reasonReference, request, device, note, dosage, eventHistory);
  }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.MedicationAdministration;
  }

  /**
   * Search parameter: <b>context</b>
   * <p>
   * Description: <b>Return administrations that share this encounter or episode
   * of care</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>MedicationAdministration.context</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "context", path = "MedicationAdministration.context", description = "Return administrations that share this encounter or episode of care", type = "reference", providesMembershipIn = {
      @ca.uhn.fhir.model.api.annotation.Compartment(name = "Base FHIR compartment definition for Encounter") }, target = {
          Encounter.class, EpisodeOfCare.class })
  public static final String SP_CONTEXT = "context";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>context</b>
   * <p>
   * Description: <b>Return administrations that share this encounter or episode
   * of care</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>MedicationAdministration.context</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam CONTEXT = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(
      SP_CONTEXT);

  /**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>MedicationAdministration:context</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_CONTEXT = new ca.uhn.fhir.model.api.Include(
      "MedicationAdministration:context").toLocked();

  /**
   * Search parameter: <b>device</b>
   * <p>
   * Description: <b>Return administrations with this administration device
   * identity</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>MedicationAdministration.device</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "device", path = "MedicationAdministration.device", description = "Return administrations with this administration device identity", type = "reference", providesMembershipIn = {
      @ca.uhn.fhir.model.api.annotation.Compartment(name = "Base FHIR compartment definition for Device") }, target = {
          Device.class })
  public static final String SP_DEVICE = "device";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>device</b>
   * <p>
   * Description: <b>Return administrations with this administration device
   * identity</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>MedicationAdministration.device</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam DEVICE = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(
      SP_DEVICE);

  /**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>MedicationAdministration:device</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_DEVICE = new ca.uhn.fhir.model.api.Include(
      "MedicationAdministration:device").toLocked();

  /**
   * Search parameter: <b>effective-time</b>
   * <p>
   * Description: <b>Date administration happened (or did not happen)</b><br>
   * Type: <b>date</b><br>
   * Path: <b>MedicationAdministration.effective</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "effective-time", path = "MedicationAdministration.effective", description = "Date administration happened (or did not happen)", type = "date")
  public static final String SP_EFFECTIVE_TIME = "effective-time";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>effective-time</b>
   * <p>
   * Description: <b>Date administration happened (or did not happen)</b><br>
   * Type: <b>date</b><br>
   * Path: <b>MedicationAdministration.effective</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.DateClientParam EFFECTIVE_TIME = new ca.uhn.fhir.rest.gclient.DateClientParam(
      SP_EFFECTIVE_TIME);

  /**
   * Search parameter: <b>performer</b>
   * <p>
   * Description: <b>The identity of the individual who administered the
   * medication</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>MedicationAdministration.performer.actor</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "performer", path = "MedicationAdministration.performer.actor", description = "The identity of the individual who administered the medication", type = "reference", providesMembershipIn = {
      @ca.uhn.fhir.model.api.annotation.Compartment(name = "Base FHIR compartment definition for Patient"),
      @ca.uhn.fhir.model.api.annotation.Compartment(name = "Base FHIR compartment definition for Practitioner"),
      @ca.uhn.fhir.model.api.annotation.Compartment(name = "Base FHIR compartment definition for RelatedPerson") }, target = {
          Device.class, Patient.class, Practitioner.class, PractitionerRole.class, RelatedPerson.class })
  public static final String SP_PERFORMER = "performer";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>performer</b>
   * <p>
   * Description: <b>The identity of the individual who administered the
   * medication</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>MedicationAdministration.performer.actor</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam PERFORMER = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(
      SP_PERFORMER);

  /**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>MedicationAdministration:performer</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_PERFORMER = new ca.uhn.fhir.model.api.Include(
      "MedicationAdministration:performer").toLocked();

  /**
   * Search parameter: <b>reason-given</b>
   * <p>
   * Description: <b>Reasons for administering the medication</b><br>
   * Type: <b>token</b><br>
   * Path: <b>MedicationAdministration.reasonCode</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "reason-given", path = "MedicationAdministration.reasonCode", description = "Reasons for administering the medication", type = "token")
  public static final String SP_REASON_GIVEN = "reason-given";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>reason-given</b>
   * <p>
   * Description: <b>Reasons for administering the medication</b><br>
   * Type: <b>token</b><br>
   * Path: <b>MedicationAdministration.reasonCode</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam REASON_GIVEN = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_REASON_GIVEN);

  /**
   * Search parameter: <b>reason-not-given</b>
   * <p>
   * Description: <b>Reasons for not administering the medication</b><br>
   * Type: <b>token</b><br>
   * Path: <b>MedicationAdministration.statusReason</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "reason-not-given", path = "MedicationAdministration.statusReason", description = "Reasons for not administering the medication", type = "token")
  public static final String SP_REASON_NOT_GIVEN = "reason-not-given";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>reason-not-given</b>
   * <p>
   * Description: <b>Reasons for not administering the medication</b><br>
   * Type: <b>token</b><br>
   * Path: <b>MedicationAdministration.statusReason</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam REASON_NOT_GIVEN = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_REASON_NOT_GIVEN);

  /**
   * Search parameter: <b>request</b>
   * <p>
   * Description: <b>The identity of a request to list administrations
   * from</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>MedicationAdministration.request</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "request", path = "MedicationAdministration.request", description = "The identity of a request to list administrations from", type = "reference", target = {
      MedicationRequest.class })
  public static final String SP_REQUEST = "request";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>request</b>
   * <p>
   * Description: <b>The identity of a request to list administrations
   * from</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>MedicationAdministration.request</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam REQUEST = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(
      SP_REQUEST);

  /**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>MedicationAdministration:request</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_REQUEST = new ca.uhn.fhir.model.api.Include(
      "MedicationAdministration:request").toLocked();

  /**
   * Search parameter: <b>subject</b>
   * <p>
   * Description: <b>The identity of the individual or group to list
   * administrations for</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>MedicationAdministration.subject</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "subject", path = "MedicationAdministration.subject", description = "The identity of the individual or group to list administrations for", type = "reference", providesMembershipIn = {
      @ca.uhn.fhir.model.api.annotation.Compartment(name = "Base FHIR compartment definition for Patient") }, target = {
          Group.class, Patient.class })
  public static final String SP_SUBJECT = "subject";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>subject</b>
   * <p>
   * Description: <b>The identity of the individual or group to list
   * administrations for</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>MedicationAdministration.subject</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam SUBJECT = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(
      SP_SUBJECT);

  /**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>MedicationAdministration:subject</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_SUBJECT = new ca.uhn.fhir.model.api.Include(
      "MedicationAdministration:subject").toLocked();

  /**
   * Search parameter: <b>code</b>
   * <p>
   * Description: <b>Multiple Resources:
   * 
   * [AllergyIntolerance](allergyintolerance.html): Code that identifies the
   * allergy or intolerance [Condition](condition.html): Code for the condition
   * [DeviceRequest](devicerequest.html): Code for what is being requested/ordered
   * [DiagnosticReport](diagnosticreport.html): The code for the report, as
   * opposed to codes for the atomic results, which are the names on the
   * observation resource referred to from the result
   * [FamilyMemberHistory](familymemberhistory.html): A search by a condition code
   * [List](list.html): What the purpose of this list is
   * [Medication](medication.html): Returns medications for a specific code
   * [MedicationAdministration](medicationadministration.html): Return
   * administrations of this medication code
   * [MedicationDispense](medicationdispense.html): Returns dispenses of this
   * medicine code [MedicationRequest](medicationrequest.html): Return
   * prescriptions of this medication code
   * [MedicationStatement](medicationstatement.html): Return statements of this
   * medication code [Observation](observation.html): The code of the observation
   * type [Procedure](procedure.html): A code to identify a procedure
   * [ServiceRequest](servicerequest.html): What is being requested/ordered
   * </b><br>
   * Type: <b>token</b><br>
   * Path: <b>AllergyIntolerance.code | AllergyIntolerance.reaction.substance |
   * Condition.code | (DeviceRequest.code as CodeableConcept) |
   * DiagnosticReport.code | FamilyMemberHistory.condition.code | List.code |
   * Medication.code | (MedicationAdministration.medication as CodeableConcept) |
   * (MedicationDispense.medication as CodeableConcept) |
   * (MedicationRequest.medication as CodeableConcept) |
   * (MedicationStatement.medication as CodeableConcept) | Observation.code |
   * Procedure.code | ServiceRequest.code</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "code", path = "AllergyIntolerance.code | AllergyIntolerance.reaction.substance | Condition.code | (DeviceRequest.code as CodeableConcept) | DiagnosticReport.code | FamilyMemberHistory.condition.code | List.code | Medication.code | (MedicationAdministration.medication as CodeableConcept) | (MedicationDispense.medication as CodeableConcept) | (MedicationRequest.medication as CodeableConcept) | (MedicationStatement.medication as CodeableConcept) | Observation.code | Procedure.code | ServiceRequest.code", description = "Multiple Resources: \r\n\r\n* [AllergyIntolerance](allergyintolerance.html): Code that identifies the allergy or intolerance\r\n* [Condition](condition.html): Code for the condition\r\n* [DeviceRequest](devicerequest.html): Code for what is being requested/ordered\r\n* [DiagnosticReport](diagnosticreport.html): The code for the report, as opposed to codes for the atomic results, which are the names on the observation resource referred to from the result\r\n* [FamilyMemberHistory](familymemberhistory.html): A search by a condition code\r\n* [List](list.html): What the purpose of this list is\r\n* [Medication](medication.html): Returns medications for a specific code\r\n* [MedicationAdministration](medicationadministration.html): Return administrations of this medication code\r\n* [MedicationDispense](medicationdispense.html): Returns dispenses of this medicine code\r\n* [MedicationRequest](medicationrequest.html): Return prescriptions of this medication code\r\n* [MedicationStatement](medicationstatement.html): Return statements of this medication code\r\n* [Observation](observation.html): The code of the observation type\r\n* [Procedure](procedure.html): A code to identify a  procedure\r\n* [ServiceRequest](servicerequest.html): What is being requested/ordered\r\n", type = "token")
  public static final String SP_CODE = "code";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>code</b>
   * <p>
   * Description: <b>Multiple Resources:
   * 
   * [AllergyIntolerance](allergyintolerance.html): Code that identifies the
   * allergy or intolerance [Condition](condition.html): Code for the condition
   * [DeviceRequest](devicerequest.html): Code for what is being requested/ordered
   * [DiagnosticReport](diagnosticreport.html): The code for the report, as
   * opposed to codes for the atomic results, which are the names on the
   * observation resource referred to from the result
   * [FamilyMemberHistory](familymemberhistory.html): A search by a condition code
   * [List](list.html): What the purpose of this list is
   * [Medication](medication.html): Returns medications for a specific code
   * [MedicationAdministration](medicationadministration.html): Return
   * administrations of this medication code
   * [MedicationDispense](medicationdispense.html): Returns dispenses of this
   * medicine code [MedicationRequest](medicationrequest.html): Return
   * prescriptions of this medication code
   * [MedicationStatement](medicationstatement.html): Return statements of this
   * medication code [Observation](observation.html): The code of the observation
   * type [Procedure](procedure.html): A code to identify a procedure
   * [ServiceRequest](servicerequest.html): What is being requested/ordered
   * </b><br>
   * Type: <b>token</b><br>
   * Path: <b>AllergyIntolerance.code | AllergyIntolerance.reaction.substance |
   * Condition.code | (DeviceRequest.code as CodeableConcept) |
   * DiagnosticReport.code | FamilyMemberHistory.condition.code | List.code |
   * Medication.code | (MedicationAdministration.medication as CodeableConcept) |
   * (MedicationDispense.medication as CodeableConcept) |
   * (MedicationRequest.medication as CodeableConcept) |
   * (MedicationStatement.medication as CodeableConcept) | Observation.code |
   * Procedure.code | ServiceRequest.code</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam CODE = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_CODE);

  /**
   * Search parameter: <b>identifier</b>
   * <p>
   * Description: <b>Multiple Resources:
   * 
   * [AllergyIntolerance](allergyintolerance.html): External ids for this item
   * [CarePlan](careplan.html): External Ids for this plan
   * [CareTeam](careteam.html): External Ids for this team
   * [Composition](composition.html): Version-independent identifier for the
   * Composition [Condition](condition.html): A unique identifier of the condition
   * record [Consent](consent.html): Identifier for this record (external
   * references) [DetectedIssue](detectedissue.html): Unique id for the detected
   * issue [DeviceRequest](devicerequest.html): Business identifier for
   * request/order [DiagnosticReport](diagnosticreport.html): An identifier for
   * the report [DocumentManifest](documentmanifest.html): Unique Identifier for
   * the set of documents [DocumentReference](documentreference.html): Master
   * Version Specific Identifier [Encounter](encounter.html): Identifier(s) by
   * which this encounter is known [EpisodeOfCare](episodeofcare.html): Business
   * Identifier(s) relevant for this EpisodeOfCare
   * [FamilyMemberHistory](familymemberhistory.html): A search by a record
   * identifier [Goal](goal.html): External Ids for this goal
   * [ImagingStudy](imagingstudy.html): Identifiers for the Study, such as DICOM
   * Study Instance UID and Accession number [Immunization](immunization.html):
   * Business identifier [List](list.html): Business identifier
   * [MedicationAdministration](medicationadministration.html): Return
   * administrations with this external identifier
   * [MedicationDispense](medicationdispense.html): Returns dispenses with this
   * external identifier [MedicationRequest](medicationrequest.html): Return
   * prescriptions with this external identifier
   * [MedicationStatement](medicationstatement.html): Return statements with this
   * external identifier [NutritionOrder](nutritionorder.html): Return nutrition
   * orders with this external identifier [Observation](observation.html): The
   * unique id for a particular observation [Procedure](procedure.html): A unique
   * identifier for a procedure [RiskAssessment](riskassessment.html): Unique
   * identifier for the assessment [ServiceRequest](servicerequest.html):
   * Identifiers assigned to this order [SupplyDelivery](supplydelivery.html):
   * External identifier [SupplyRequest](supplyrequest.html): Business Identifier
   * for SupplyRequest [VisionPrescription](visionprescription.html): Return
   * prescriptions with this external identifier </b><br>
   * Type: <b>token</b><br>
   * Path: <b>AllergyIntolerance.identifier | CarePlan.identifier |
   * CareTeam.identifier | Composition.identifier | Condition.identifier |
   * Consent.identifier | DetectedIssue.identifier | DeviceRequest.identifier |
   * DiagnosticReport.identifier | DocumentManifest.masterIdentifier |
   * DocumentManifest.identifier | DocumentReference.masterIdentifier |
   * DocumentReference.identifier | Encounter.identifier |
   * EpisodeOfCare.identifier | FamilyMemberHistory.identifier | Goal.identifier |
   * ImagingStudy.identifier | Immunization.identifier | List.identifier |
   * MedicationAdministration.identifier | MedicationDispense.identifier |
   * MedicationRequest.identifier | MedicationStatement.identifier |
   * NutritionOrder.identifier | Observation.identifier | Procedure.identifier |
   * RiskAssessment.identifier | ServiceRequest.identifier |
   * SupplyDelivery.identifier | SupplyRequest.identifier |
   * VisionPrescription.identifier</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "identifier", path = "AllergyIntolerance.identifier | CarePlan.identifier | CareTeam.identifier | Composition.identifier | Condition.identifier | Consent.identifier | DetectedIssue.identifier | DeviceRequest.identifier | DiagnosticReport.identifier | DocumentManifest.masterIdentifier | DocumentManifest.identifier | DocumentReference.masterIdentifier | DocumentReference.identifier | Encounter.identifier | EpisodeOfCare.identifier | FamilyMemberHistory.identifier | Goal.identifier | ImagingStudy.identifier | Immunization.identifier | List.identifier | MedicationAdministration.identifier | MedicationDispense.identifier | MedicationRequest.identifier | MedicationStatement.identifier | NutritionOrder.identifier | Observation.identifier | Procedure.identifier | RiskAssessment.identifier | ServiceRequest.identifier | SupplyDelivery.identifier | SupplyRequest.identifier | VisionPrescription.identifier", description = "Multiple Resources: \r\n\r\n* [AllergyIntolerance](allergyintolerance.html): External ids for this item\r\n* [CarePlan](careplan.html): External Ids for this plan\r\n* [CareTeam](careteam.html): External Ids for this team\r\n* [Composition](composition.html): Version-independent identifier for the Composition\r\n* [Condition](condition.html): A unique identifier of the condition record\r\n* [Consent](consent.html): Identifier for this record (external references)\r\n* [DetectedIssue](detectedissue.html): Unique id for the detected issue\r\n* [DeviceRequest](devicerequest.html): Business identifier for request/order\r\n* [DiagnosticReport](diagnosticreport.html): An identifier for the report\r\n* [DocumentManifest](documentmanifest.html): Unique Identifier for the set of documents\r\n* [DocumentReference](documentreference.html): Master Version Specific Identifier\r\n* [Encounter](encounter.html): Identifier(s) by which this encounter is known\r\n* [EpisodeOfCare](episodeofcare.html): Business Identifier(s) relevant for this EpisodeOfCare\r\n* [FamilyMemberHistory](familymemberhistory.html): A search by a record identifier\r\n* [Goal](goal.html): External Ids for this goal\r\n* [ImagingStudy](imagingstudy.html): Identifiers for the Study, such as DICOM Study Instance UID and Accession number\r\n* [Immunization](immunization.html): Business identifier\r\n* [List](list.html): Business identifier\r\n* [MedicationAdministration](medicationadministration.html): Return administrations with this external identifier\r\n* [MedicationDispense](medicationdispense.html): Returns dispenses with this external identifier\r\n* [MedicationRequest](medicationrequest.html): Return prescriptions with this external identifier\r\n* [MedicationStatement](medicationstatement.html): Return statements with this external identifier\r\n* [NutritionOrder](nutritionorder.html): Return nutrition orders with this external identifier\r\n* [Observation](observation.html): The unique id for a particular observation\r\n* [Procedure](procedure.html): A unique identifier for a procedure\r\n* [RiskAssessment](riskassessment.html): Unique identifier for the assessment\r\n* [ServiceRequest](servicerequest.html): Identifiers assigned to this order\r\n* [SupplyDelivery](supplydelivery.html): External identifier\r\n* [SupplyRequest](supplyrequest.html): Business Identifier for SupplyRequest\r\n* [VisionPrescription](visionprescription.html): Return prescriptions with this external identifier\r\n", type = "token")
  public static final String SP_IDENTIFIER = "identifier";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
   * <p>
   * Description: <b>Multiple Resources:
   * 
   * [AllergyIntolerance](allergyintolerance.html): External ids for this item
   * [CarePlan](careplan.html): External Ids for this plan
   * [CareTeam](careteam.html): External Ids for this team
   * [Composition](composition.html): Version-independent identifier for the
   * Composition [Condition](condition.html): A unique identifier of the condition
   * record [Consent](consent.html): Identifier for this record (external
   * references) [DetectedIssue](detectedissue.html): Unique id for the detected
   * issue [DeviceRequest](devicerequest.html): Business identifier for
   * request/order [DiagnosticReport](diagnosticreport.html): An identifier for
   * the report [DocumentManifest](documentmanifest.html): Unique Identifier for
   * the set of documents [DocumentReference](documentreference.html): Master
   * Version Specific Identifier [Encounter](encounter.html): Identifier(s) by
   * which this encounter is known [EpisodeOfCare](episodeofcare.html): Business
   * Identifier(s) relevant for this EpisodeOfCare
   * [FamilyMemberHistory](familymemberhistory.html): A search by a record
   * identifier [Goal](goal.html): External Ids for this goal
   * [ImagingStudy](imagingstudy.html): Identifiers for the Study, such as DICOM
   * Study Instance UID and Accession number [Immunization](immunization.html):
   * Business identifier [List](list.html): Business identifier
   * [MedicationAdministration](medicationadministration.html): Return
   * administrations with this external identifier
   * [MedicationDispense](medicationdispense.html): Returns dispenses with this
   * external identifier [MedicationRequest](medicationrequest.html): Return
   * prescriptions with this external identifier
   * [MedicationStatement](medicationstatement.html): Return statements with this
   * external identifier [NutritionOrder](nutritionorder.html): Return nutrition
   * orders with this external identifier [Observation](observation.html): The
   * unique id for a particular observation [Procedure](procedure.html): A unique
   * identifier for a procedure [RiskAssessment](riskassessment.html): Unique
   * identifier for the assessment [ServiceRequest](servicerequest.html):
   * Identifiers assigned to this order [SupplyDelivery](supplydelivery.html):
   * External identifier [SupplyRequest](supplyrequest.html): Business Identifier
   * for SupplyRequest [VisionPrescription](visionprescription.html): Return
   * prescriptions with this external identifier </b><br>
   * Type: <b>token</b><br>
   * Path: <b>AllergyIntolerance.identifier | CarePlan.identifier |
   * CareTeam.identifier | Composition.identifier | Condition.identifier |
   * Consent.identifier | DetectedIssue.identifier | DeviceRequest.identifier |
   * DiagnosticReport.identifier | DocumentManifest.masterIdentifier |
   * DocumentManifest.identifier | DocumentReference.masterIdentifier |
   * DocumentReference.identifier | Encounter.identifier |
   * EpisodeOfCare.identifier | FamilyMemberHistory.identifier | Goal.identifier |
   * ImagingStudy.identifier | Immunization.identifier | List.identifier |
   * MedicationAdministration.identifier | MedicationDispense.identifier |
   * MedicationRequest.identifier | MedicationStatement.identifier |
   * NutritionOrder.identifier | Observation.identifier | Procedure.identifier |
   * RiskAssessment.identifier | ServiceRequest.identifier |
   * SupplyDelivery.identifier | SupplyRequest.identifier |
   * VisionPrescription.identifier</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam IDENTIFIER = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_IDENTIFIER);

  /**
   * Search parameter: <b>patient</b>
   * <p>
   * Description: <b>Multiple Resources:
   * 
   * [AllergyIntolerance](allergyintolerance.html): Who the sensitivity is for
   * [CarePlan](careplan.html): Who the care plan is for
   * [CareTeam](careteam.html): Who care team is for
   * [ClinicalImpression](clinicalimpression.html): Patient or group assessed
   * [Composition](composition.html): Who and/or what the composition is about
   * [Condition](condition.html): Who has the condition? [Consent](consent.html):
   * Who the consent applies to [DetectedIssue](detectedissue.html): Associated
   * patient [DeviceRequest](devicerequest.html): Individual the service is
   * ordered for [DeviceUseStatement](deviceusestatement.html): Search by subject
   * - a patient [DiagnosticReport](diagnosticreport.html): The subject of the
   * report if a patient [DocumentManifest](documentmanifest.html): The subject of
   * the set of documents [DocumentReference](documentreference.html): Who/what is
   * the subject of the document [Encounter](encounter.html): The patient or group
   * present at the encounter [EpisodeOfCare](episodeofcare.html): The patient who
   * is the focus of this episode of care
   * [FamilyMemberHistory](familymemberhistory.html): The identity of a subject to
   * list family member history items for [Flag](flag.html): The identity of a
   * subject to list flags for [Goal](goal.html): Who this goal is intended for
   * [ImagingStudy](imagingstudy.html): Who the study is about
   * [Immunization](immunization.html): The patient for the vaccination record
   * [List](list.html): If all resources have the same subject
   * [MedicationAdministration](medicationadministration.html): The identity of a
   * patient to list administrations for
   * [MedicationDispense](medicationdispense.html): The identity of a patient to
   * list dispenses for [MedicationRequest](medicationrequest.html): Returns
   * prescriptions for a specific patient
   * [MedicationStatement](medicationstatement.html): Returns statements for a
   * specific patient. [NutritionOrder](nutritionorder.html): The identity of the
   * person who requires the diet, formula or nutritional supplement
   * [Observation](observation.html): The subject that the observation is about
   * (if patient) [Procedure](procedure.html): Search by subject - a patient
   * [RiskAssessment](riskassessment.html): Who/what does assessment apply to?
   * [ServiceRequest](servicerequest.html): Search by subject - a patient
   * [SupplyDelivery](supplydelivery.html): Patient for whom the item is supplied
   * [VisionPrescription](visionprescription.html): The identity of a patient to
   * list dispenses for </b><br>
   * Type: <b>reference</b><br>
   * Path: <b>AllergyIntolerance.patient | CarePlan.subject.where(resolve() is
   * Patient) | CareTeam.subject.where(resolve() is Patient) |
   * ClinicalImpression.subject.where(resolve() is Patient) |
   * Composition.subject.where(resolve() is Patient) |
   * Condition.subject.where(resolve() is Patient) | Consent.patient |
   * DetectedIssue.patient | DeviceRequest.subject.where(resolve() is Patient) |
   * DeviceUseStatement.subject.where(resolve() is Patient) |
   * DiagnosticReport.subject.where(resolve() is Patient) |
   * DocumentManifest.subject.where(resolve() is Patient) |
   * DocumentReference.subject.where(resolve() is Patient) |
   * Encounter.subject.where(resolve() is Patient) | EpisodeOfCare.patient |
   * FamilyMemberHistory.patient | Flag.subject.where(resolve() is Patient) |
   * Goal.subject.where(resolve() is Patient) |
   * ImagingStudy.subject.where(resolve() is Patient) | Immunization.patient |
   * List.subject.where(resolve() is Patient) |
   * MedicationAdministration.subject.where(resolve() is Patient) |
   * MedicationDispense.subject.where(resolve() is Patient) |
   * MedicationRequest.subject.where(resolve() is Patient) |
   * MedicationStatement.subject.where(resolve() is Patient) |
   * NutritionOrder.patient | Observation.subject.where(resolve() is Patient) |
   * Procedure.subject.where(resolve() is Patient) |
   * RiskAssessment.subject.where(resolve() is Patient) |
   * ServiceRequest.subject.where(resolve() is Patient) | SupplyDelivery.patient |
   * VisionPrescription.patient</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "patient", path = "AllergyIntolerance.patient | CarePlan.subject.where(resolve() is Patient) | CareTeam.subject.where(resolve() is Patient) | ClinicalImpression.subject.where(resolve() is Patient) | Composition.subject.where(resolve() is Patient) | Condition.subject.where(resolve() is Patient) | Consent.patient | DetectedIssue.patient | DeviceRequest.subject.where(resolve() is Patient) | DeviceUseStatement.subject.where(resolve() is Patient) | DiagnosticReport.subject.where(resolve() is Patient) | DocumentManifest.subject.where(resolve() is Patient) | DocumentReference.subject.where(resolve() is Patient) | Encounter.subject.where(resolve() is Patient) | EpisodeOfCare.patient | FamilyMemberHistory.patient | Flag.subject.where(resolve() is Patient) | Goal.subject.where(resolve() is Patient) | ImagingStudy.subject.where(resolve() is Patient) | Immunization.patient | List.subject.where(resolve() is Patient) | MedicationAdministration.subject.where(resolve() is Patient) | MedicationDispense.subject.where(resolve() is Patient) | MedicationRequest.subject.where(resolve() is Patient) | MedicationStatement.subject.where(resolve() is Patient) | NutritionOrder.patient | Observation.subject.where(resolve() is Patient) | Procedure.subject.where(resolve() is Patient) | RiskAssessment.subject.where(resolve() is Patient) | ServiceRequest.subject.where(resolve() is Patient) | SupplyDelivery.patient | VisionPrescription.patient", description = "Multiple Resources: \r\n\r\n* [AllergyIntolerance](allergyintolerance.html): Who the sensitivity is for\r\n* [CarePlan](careplan.html): Who the care plan is for\r\n* [CareTeam](careteam.html): Who care team is for\r\n* [ClinicalImpression](clinicalimpression.html): Patient or group assessed\r\n* [Composition](composition.html): Who and/or what the composition is about\r\n* [Condition](condition.html): Who has the condition?\r\n* [Consent](consent.html): Who the consent applies to\r\n* [DetectedIssue](detectedissue.html): Associated patient\r\n* [DeviceRequest](devicerequest.html): Individual the service is ordered for\r\n* [DeviceUseStatement](deviceusestatement.html): Search by subject - a patient\r\n* [DiagnosticReport](diagnosticreport.html): The subject of the report if a patient\r\n* [DocumentManifest](documentmanifest.html): The subject of the set of documents\r\n* [DocumentReference](documentreference.html): Who/what is the subject of the document\r\n* [Encounter](encounter.html): The patient or group present at the encounter\r\n* [EpisodeOfCare](episodeofcare.html): The patient who is the focus of this episode of care\r\n* [FamilyMemberHistory](familymemberhistory.html): The identity of a subject to list family member history items for\r\n* [Flag](flag.html): The identity of a subject to list flags for\r\n* [Goal](goal.html): Who this goal is intended for\r\n* [ImagingStudy](imagingstudy.html): Who the study is about\r\n* [Immunization](immunization.html): The patient for the vaccination record\r\n* [List](list.html): If all resources have the same subject\r\n* [MedicationAdministration](medicationadministration.html): The identity of a patient to list administrations  for\r\n* [MedicationDispense](medicationdispense.html): The identity of a patient to list dispenses  for\r\n* [MedicationRequest](medicationrequest.html): Returns prescriptions for a specific patient\r\n* [MedicationStatement](medicationstatement.html): Returns statements for a specific patient.\r\n* [NutritionOrder](nutritionorder.html): The identity of the person who requires the diet, formula or nutritional supplement\r\n* [Observation](observation.html): The subject that the observation is about (if patient)\r\n* [Procedure](procedure.html): Search by subject - a patient\r\n* [RiskAssessment](riskassessment.html): Who/what does assessment apply to?\r\n* [ServiceRequest](servicerequest.html): Search by subject - a patient\r\n* [SupplyDelivery](supplydelivery.html): Patient for whom the item is supplied\r\n* [VisionPrescription](visionprescription.html): The identity of a patient to list dispenses for\r\n", type = "reference", providesMembershipIn = {
      @ca.uhn.fhir.model.api.annotation.Compartment(name = "Base FHIR compartment definition for Patient") }, target = {
          Account.class, ActivityDefinition.class, AdministrableProductDefinition.class, AdverseEvent.class,
          AllergyIntolerance.class, Appointment.class, AppointmentResponse.class, AuditEvent.class, Basic.class,
          Binary.class, BiologicallyDerivedProduct.class, BodyStructure.class, Bundle.class, CapabilityStatement.class,
          CarePlan.class, CareTeam.class, CatalogEntry.class, ChargeItem.class, ChargeItemDefinition.class,
          Citation.class, Claim.class, ClaimResponse.class, ClinicalImpression.class, ClinicalUseDefinition.class,
          CodeSystem.class, Communication.class, CommunicationRequest.class, CompartmentDefinition.class,
          Composition.class, ConceptMap.class, Condition.class, Consent.class, Contract.class, Coverage.class,
          CoverageEligibilityRequest.class, CoverageEligibilityResponse.class, DetectedIssue.class, Device.class,
          DeviceDefinition.class, DeviceMetric.class, DeviceRequest.class, DeviceUseStatement.class,
          DiagnosticReport.class, DocumentManifest.class, DocumentReference.class, Encounter.class, Endpoint.class,
          EnrollmentRequest.class, EnrollmentResponse.class, EpisodeOfCare.class, EventDefinition.class, Evidence.class,
          EvidenceReport.class, EvidenceVariable.class, ExampleScenario.class, ExplanationOfBenefit.class,
          FamilyMemberHistory.class, Flag.class, Goal.class, GraphDefinition.class, Group.class, GuidanceResponse.class,
          HealthcareService.class, ImagingStudy.class, Immunization.class, ImmunizationEvaluation.class,
          ImmunizationRecommendation.class, ImplementationGuide.class, Ingredient.class, InsurancePlan.class,
          Invoice.class, Library.class, Linkage.class, ListResource.class, Location.class,
          ManufacturedItemDefinition.class, Measure.class, MeasureReport.class, Media.class, Medication.class,
          MedicationAdministration.class, MedicationDispense.class, MedicationKnowledge.class, MedicationRequest.class,
          MedicationStatement.class, MedicinalProductDefinition.class, MessageDefinition.class, MessageHeader.class,
          MolecularSequence.class, NamingSystem.class, NutritionOrder.class, NutritionProduct.class, Observation.class,
          ObservationDefinition.class, OperationDefinition.class, OperationOutcome.class, Organization.class,
          OrganizationAffiliation.class, PackagedProductDefinition.class, Patient.class, PaymentNotice.class,
          PaymentReconciliation.class, Person.class, PlanDefinition.class, Practitioner.class, PractitionerRole.class,
          Procedure.class, Provenance.class, Questionnaire.class, QuestionnaireResponse.class,
          RegulatedAuthorization.class, RelatedPerson.class, RequestGroup.class, ResearchDefinition.class,
          ResearchElementDefinition.class, ResearchStudy.class, ResearchSubject.class, RiskAssessment.class,
          Schedule.class, SearchParameter.class, ServiceRequest.class, Slot.class, Specimen.class,
          SpecimenDefinition.class, StructureDefinition.class, StructureMap.class, Subscription.class,
          SubscriptionStatus.class, SubscriptionTopic.class, Substance.class, SubstanceDefinition.class,
          SupplyDelivery.class, SupplyRequest.class, Task.class, TerminologyCapabilities.class, TestReport.class,
          TestScript.class, ValueSet.class, VerificationResult.class, VisionPrescription.class })
  public static final String SP_PATIENT = "patient";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>patient</b>
   * <p>
   * Description: <b>Multiple Resources:
   * 
   * [AllergyIntolerance](allergyintolerance.html): Who the sensitivity is for
   * [CarePlan](careplan.html): Who the care plan is for
   * [CareTeam](careteam.html): Who care team is for
   * [ClinicalImpression](clinicalimpression.html): Patient or group assessed
   * [Composition](composition.html): Who and/or what the composition is about
   * [Condition](condition.html): Who has the condition? [Consent](consent.html):
   * Who the consent applies to [DetectedIssue](detectedissue.html): Associated
   * patient [DeviceRequest](devicerequest.html): Individual the service is
   * ordered for [DeviceUseStatement](deviceusestatement.html): Search by subject
   * - a patient [DiagnosticReport](diagnosticreport.html): The subject of the
   * report if a patient [DocumentManifest](documentmanifest.html): The subject of
   * the set of documents [DocumentReference](documentreference.html): Who/what is
   * the subject of the document [Encounter](encounter.html): The patient or group
   * present at the encounter [EpisodeOfCare](episodeofcare.html): The patient who
   * is the focus of this episode of care
   * [FamilyMemberHistory](familymemberhistory.html): The identity of a subject to
   * list family member history items for [Flag](flag.html): The identity of a
   * subject to list flags for [Goal](goal.html): Who this goal is intended for
   * [ImagingStudy](imagingstudy.html): Who the study is about
   * [Immunization](immunization.html): The patient for the vaccination record
   * [List](list.html): If all resources have the same subject
   * [MedicationAdministration](medicationadministration.html): The identity of a
   * patient to list administrations for
   * [MedicationDispense](medicationdispense.html): The identity of a patient to
   * list dispenses for [MedicationRequest](medicationrequest.html): Returns
   * prescriptions for a specific patient
   * [MedicationStatement](medicationstatement.html): Returns statements for a
   * specific patient. [NutritionOrder](nutritionorder.html): The identity of the
   * person who requires the diet, formula or nutritional supplement
   * [Observation](observation.html): The subject that the observation is about
   * (if patient) [Procedure](procedure.html): Search by subject - a patient
   * [RiskAssessment](riskassessment.html): Who/what does assessment apply to?
   * [ServiceRequest](servicerequest.html): Search by subject - a patient
   * [SupplyDelivery](supplydelivery.html): Patient for whom the item is supplied
   * [VisionPrescription](visionprescription.html): The identity of a patient to
   * list dispenses for </b><br>
   * Type: <b>reference</b><br>
   * Path: <b>AllergyIntolerance.patient | CarePlan.subject.where(resolve() is
   * Patient) | CareTeam.subject.where(resolve() is Patient) |
   * ClinicalImpression.subject.where(resolve() is Patient) |
   * Composition.subject.where(resolve() is Patient) |
   * Condition.subject.where(resolve() is Patient) | Consent.patient |
   * DetectedIssue.patient | DeviceRequest.subject.where(resolve() is Patient) |
   * DeviceUseStatement.subject.where(resolve() is Patient) |
   * DiagnosticReport.subject.where(resolve() is Patient) |
   * DocumentManifest.subject.where(resolve() is Patient) |
   * DocumentReference.subject.where(resolve() is Patient) |
   * Encounter.subject.where(resolve() is Patient) | EpisodeOfCare.patient |
   * FamilyMemberHistory.patient | Flag.subject.where(resolve() is Patient) |
   * Goal.subject.where(resolve() is Patient) |
   * ImagingStudy.subject.where(resolve() is Patient) | Immunization.patient |
   * List.subject.where(resolve() is Patient) |
   * MedicationAdministration.subject.where(resolve() is Patient) |
   * MedicationDispense.subject.where(resolve() is Patient) |
   * MedicationRequest.subject.where(resolve() is Patient) |
   * MedicationStatement.subject.where(resolve() is Patient) |
   * NutritionOrder.patient | Observation.subject.where(resolve() is Patient) |
   * Procedure.subject.where(resolve() is Patient) |
   * RiskAssessment.subject.where(resolve() is Patient) |
   * ServiceRequest.subject.where(resolve() is Patient) | SupplyDelivery.patient |
   * VisionPrescription.patient</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam PATIENT = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(
      SP_PATIENT);

  /**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>MedicationAdministration:patient</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_PATIENT = new ca.uhn.fhir.model.api.Include(
      "MedicationAdministration:patient").toLocked();

  /**
   * Search parameter: <b>medication</b>
   * <p>
   * Description: <b>Multiple Resources:
   * 
   * [MedicationAdministration](medicationadministration.html): Return
   * administrations of this medication resource
   * [MedicationDispense](medicationdispense.html): Returns dispenses of this
   * medicine resource [MedicationRequest](medicationrequest.html): Return
   * prescriptions for this medication reference
   * [MedicationStatement](medicationstatement.html): Return statements of this
   * medication reference </b><br>
   * Type: <b>reference</b><br>
   * Path: <b>(MedicationAdministration.medication as Reference) |
   * (MedicationDispense.medication as Reference) | (MedicationRequest.medication
   * as Reference) | (MedicationStatement.medication as Reference)</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "medication", path = "(MedicationAdministration.medication as Reference) | (MedicationDispense.medication as Reference) | (MedicationRequest.medication as Reference) | (MedicationStatement.medication as Reference)", description = "Multiple Resources: \r\n\r\n* [MedicationAdministration](medicationadministration.html): Return administrations of this medication resource\r\n* [MedicationDispense](medicationdispense.html): Returns dispenses of this medicine resource\r\n* [MedicationRequest](medicationrequest.html): Return prescriptions for this medication reference\r\n* [MedicationStatement](medicationstatement.html): Return statements of this medication reference\r\n", type = "reference", target = {
      Medication.class })
  public static final String SP_MEDICATION = "medication";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>medication</b>
   * <p>
   * Description: <b>Multiple Resources:
   * 
   * [MedicationAdministration](medicationadministration.html): Return
   * administrations of this medication resource
   * [MedicationDispense](medicationdispense.html): Returns dispenses of this
   * medicine resource [MedicationRequest](medicationrequest.html): Return
   * prescriptions for this medication reference
   * [MedicationStatement](medicationstatement.html): Return statements of this
   * medication reference </b><br>
   * Type: <b>reference</b><br>
   * Path: <b>(MedicationAdministration.medication as Reference) |
   * (MedicationDispense.medication as Reference) | (MedicationRequest.medication
   * as Reference) | (MedicationStatement.medication as Reference)</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam MEDICATION = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(
      SP_MEDICATION);

  /**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>MedicationAdministration:medication</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_MEDICATION = new ca.uhn.fhir.model.api.Include(
      "MedicationAdministration:medication").toLocked();

  /**
   * Search parameter: <b>status</b>
   * <p>
   * Description: <b>Multiple Resources:
   * 
   * [MedicationAdministration](medicationadministration.html):
   * MedicationAdministration event status (for example one of
   * active/paused/completed/nullified)
   * [MedicationDispense](medicationdispense.html): Returns dispenses with a
   * specified dispense status [MedicationRequest](medicationrequest.html): Status
   * of the prescription [MedicationStatement](medicationstatement.html): Return
   * statements that match the given status </b><br>
   * Type: <b>token</b><br>
   * Path: <b>MedicationAdministration.status | MedicationDispense.status |
   * MedicationRequest.status | MedicationStatement.status</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "status", path = "MedicationAdministration.status | MedicationDispense.status | MedicationRequest.status | MedicationStatement.status", description = "Multiple Resources: \r\n\r\n* [MedicationAdministration](medicationadministration.html): MedicationAdministration event status (for example one of active/paused/completed/nullified)\r\n* [MedicationDispense](medicationdispense.html): Returns dispenses with a specified dispense status\r\n* [MedicationRequest](medicationrequest.html): Status of the prescription\r\n* [MedicationStatement](medicationstatement.html): Return statements that match the given status\r\n", type = "token")
  public static final String SP_STATUS = "status";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>status</b>
   * <p>
   * Description: <b>Multiple Resources:
   * 
   * [MedicationAdministration](medicationadministration.html):
   * MedicationAdministration event status (for example one of
   * active/paused/completed/nullified)
   * [MedicationDispense](medicationdispense.html): Returns dispenses with a
   * specified dispense status [MedicationRequest](medicationrequest.html): Status
   * of the prescription [MedicationStatement](medicationstatement.html): Return
   * statements that match the given status </b><br>
   * Type: <b>token</b><br>
   * Path: <b>MedicationAdministration.status | MedicationDispense.status |
   * MedicationRequest.status | MedicationStatement.status</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam STATUS = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_STATUS);

}
