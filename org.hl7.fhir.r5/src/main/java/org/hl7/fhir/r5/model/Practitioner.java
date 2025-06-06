package org.hl7.fhir.r5.model;


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

// Generated on Thu, Mar 23, 2023 19:59+1100 for FHIR v5.0.0

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.r5.model.Enumerations.*;
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
 * A person who is directly or indirectly involved in the provisioning of healthcare or related services.
 */
@ResourceDef(name="Practitioner", profile="http://hl7.org/fhir/StructureDefinition/Practitioner")
public class Practitioner extends DomainResource {

    @Block()
    public static class PractitionerQualificationComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * An identifier that applies to this person's qualification.
         */
        @Child(name = "identifier", type = {Identifier.class}, order=1, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="An identifier for this qualification for the practitioner", formalDefinition="An identifier that applies to this person's qualification." )
        protected List<Identifier> identifier;

        /**
         * Coded representation of the qualification.
         */
        @Child(name = "code", type = {CodeableConcept.class}, order=2, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Coded representation of the qualification", formalDefinition="Coded representation of the qualification." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://terminology.hl7.org/ValueSet/v2-0360")
        protected CodeableConcept code;

        /**
         * Period during which the qualification is valid.
         */
        @Child(name = "period", type = {Period.class}, order=3, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Period during which the qualification is valid", formalDefinition="Period during which the qualification is valid." )
        protected Period period;

        /**
         * Organization that regulates and issues the qualification.
         */
        @Child(name = "issuer", type = {Organization.class}, order=4, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Organization that regulates and issues the qualification", formalDefinition="Organization that regulates and issues the qualification." )
        protected Reference issuer;

        private static final long serialVersionUID = 1561812204L;

    /**
     * Constructor
     */
      public PractitionerQualificationComponent() {
        super();
      }

    /**
     * Constructor
     */
      public PractitionerQualificationComponent(CodeableConcept code) {
        super();
        this.setCode(code);
      }

        /**
         * @return {@link #identifier} (An identifier that applies to this person's qualification.)
         */
        public List<Identifier> getIdentifier() { 
          if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
          return this.identifier;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public PractitionerQualificationComponent setIdentifier(List<Identifier> theIdentifier) { 
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

        public Identifier addIdentifier() { //3
          Identifier t = new Identifier();
          if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
          this.identifier.add(t);
          return t;
        }

        public PractitionerQualificationComponent addIdentifier(Identifier t) { //3
          if (t == null)
            return this;
          if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
          this.identifier.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #identifier}, creating it if it does not already exist {3}
         */
        public Identifier getIdentifierFirstRep() { 
          if (getIdentifier().isEmpty()) {
            addIdentifier();
          }
          return getIdentifier().get(0);
        }

        /**
         * @return {@link #code} (Coded representation of the qualification.)
         */
        public CodeableConcept getCode() { 
          if (this.code == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create PractitionerQualificationComponent.code");
            else if (Configuration.doAutoCreate())
              this.code = new CodeableConcept(); // cc
          return this.code;
        }

        public boolean hasCode() { 
          return this.code != null && !this.code.isEmpty();
        }

        /**
         * @param value {@link #code} (Coded representation of the qualification.)
         */
        public PractitionerQualificationComponent setCode(CodeableConcept value) { 
          this.code = value;
          return this;
        }

        /**
         * @return {@link #period} (Period during which the qualification is valid.)
         */
        public Period getPeriod() { 
          if (this.period == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create PractitionerQualificationComponent.period");
            else if (Configuration.doAutoCreate())
              this.period = new Period(); // cc
          return this.period;
        }

        public boolean hasPeriod() { 
          return this.period != null && !this.period.isEmpty();
        }

        /**
         * @param value {@link #period} (Period during which the qualification is valid.)
         */
        public PractitionerQualificationComponent setPeriod(Period value) { 
          this.period = value;
          return this;
        }

        /**
         * @return {@link #issuer} (Organization that regulates and issues the qualification.)
         */
        public Reference getIssuer() { 
          if (this.issuer == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create PractitionerQualificationComponent.issuer");
            else if (Configuration.doAutoCreate())
              this.issuer = new Reference(); // cc
          return this.issuer;
        }

        public boolean hasIssuer() { 
          return this.issuer != null && !this.issuer.isEmpty();
        }

        /**
         * @param value {@link #issuer} (Organization that regulates and issues the qualification.)
         */
        public PractitionerQualificationComponent setIssuer(Reference value) { 
          this.issuer = value;
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("identifier", "Identifier", "An identifier that applies to this person's qualification.", 0, java.lang.Integer.MAX_VALUE, identifier));
          children.add(new Property("code", "CodeableConcept", "Coded representation of the qualification.", 0, 1, code));
          children.add(new Property("period", "Period", "Period during which the qualification is valid.", 0, 1, period));
          children.add(new Property("issuer", "Reference(Organization)", "Organization that regulates and issues the qualification.", 0, 1, issuer));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case -1618432855: /*identifier*/  return new Property("identifier", "Identifier", "An identifier that applies to this person's qualification.", 0, java.lang.Integer.MAX_VALUE, identifier);
          case 3059181: /*code*/  return new Property("code", "CodeableConcept", "Coded representation of the qualification.", 0, 1, code);
          case -991726143: /*period*/  return new Property("period", "Period", "Period during which the qualification is valid.", 0, 1, period);
          case -1179159879: /*issuer*/  return new Property("issuer", "Reference(Organization)", "Organization that regulates and issues the qualification.", 0, 1, issuer);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -1618432855: /*identifier*/ return this.identifier == null ? new Base[0] : this.identifier.toArray(new Base[this.identifier.size()]); // Identifier
        case 3059181: /*code*/ return this.code == null ? new Base[0] : new Base[] {this.code}; // CodeableConcept
        case -991726143: /*period*/ return this.period == null ? new Base[0] : new Base[] {this.period}; // Period
        case -1179159879: /*issuer*/ return this.issuer == null ? new Base[0] : new Base[] {this.issuer}; // Reference
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -1618432855: // identifier
          this.getIdentifier().add(TypeConvertor.castToIdentifier(value)); // Identifier
          return value;
        case 3059181: // code
          this.code = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case -991726143: // period
          this.period = TypeConvertor.castToPeriod(value); // Period
          return value;
        case -1179159879: // issuer
          this.issuer = TypeConvertor.castToReference(value); // Reference
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier")) {
          this.getIdentifier().add(TypeConvertor.castToIdentifier(value));
        } else if (name.equals("code")) {
          this.code = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("period")) {
          this.period = TypeConvertor.castToPeriod(value); // Period
        } else if (name.equals("issuer")) {
          this.issuer = TypeConvertor.castToReference(value); // Reference
        } else
          return super.setProperty(name, value);
        return value;
      }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
        if (name.equals("identifier")) {
          this.getIdentifier().remove(value);
        } else if (name.equals("code")) {
          this.code = null;
        } else if (name.equals("period")) {
          this.period = null;
        } else if (name.equals("issuer")) {
          this.issuer = null;
        } else
          super.removeChild(name, value);
        
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1618432855:  return addIdentifier(); 
        case 3059181:  return getCode();
        case -991726143:  return getPeriod();
        case -1179159879:  return getIssuer();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1618432855: /*identifier*/ return new String[] {"Identifier"};
        case 3059181: /*code*/ return new String[] {"CodeableConcept"};
        case -991726143: /*period*/ return new String[] {"Period"};
        case -1179159879: /*issuer*/ return new String[] {"Reference"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
          return addIdentifier();
        }
        else if (name.equals("code")) {
          this.code = new CodeableConcept();
          return this.code;
        }
        else if (name.equals("period")) {
          this.period = new Period();
          return this.period;
        }
        else if (name.equals("issuer")) {
          this.issuer = new Reference();
          return this.issuer;
        }
        else
          return super.addChild(name);
      }

      public PractitionerQualificationComponent copy() {
        PractitionerQualificationComponent dst = new PractitionerQualificationComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(PractitionerQualificationComponent dst) {
        super.copyValues(dst);
        if (identifier != null) {
          dst.identifier = new ArrayList<Identifier>();
          for (Identifier i : identifier)
            dst.identifier.add(i.copy());
        };
        dst.code = code == null ? null : code.copy();
        dst.period = period == null ? null : period.copy();
        dst.issuer = issuer == null ? null : issuer.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof PractitionerQualificationComponent))
          return false;
        PractitionerQualificationComponent o = (PractitionerQualificationComponent) other_;
        return compareDeep(identifier, o.identifier, true) && compareDeep(code, o.code, true) && compareDeep(period, o.period, true)
           && compareDeep(issuer, o.issuer, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof PractitionerQualificationComponent))
          return false;
        PractitionerQualificationComponent o = (PractitionerQualificationComponent) other_;
        return true;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(identifier, code, period
          , issuer);
      }

  public String fhirType() {
    return "Practitioner.qualification";

  }

  }

    @Block()
    public static class PractitionerCommunicationComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * The ISO-639-1 alpha 2 code in lower case for the language, optionally followed by a hyphen and the ISO-3166-1 alpha 2 code for the region in upper case; e.g. "en" for English, or "en-US" for American English versus "en-AU" for Australian English.
         */
        @Child(name = "language", type = {CodeableConcept.class}, order=1, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="The language code used to communicate with the practitioner", formalDefinition="The ISO-639-1 alpha 2 code in lower case for the language, optionally followed by a hyphen and the ISO-3166-1 alpha 2 code for the region in upper case; e.g. \"en\" for English, or \"en-US\" for American English versus \"en-AU\" for Australian English." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/all-languages")
        protected CodeableConcept language;

        /**
         * Indicates whether or not the person prefers this language (over other languages he masters up a certain level).
         */
        @Child(name = "preferred", type = {BooleanType.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Language preference indicator", formalDefinition="Indicates whether or not the person prefers this language (over other languages he masters up a certain level)." )
        protected BooleanType preferred;

        private static final long serialVersionUID = 633792918L;

    /**
     * Constructor
     */
      public PractitionerCommunicationComponent() {
        super();
      }

    /**
     * Constructor
     */
      public PractitionerCommunicationComponent(CodeableConcept language) {
        super();
        this.setLanguage(language);
      }

        /**
         * @return {@link #language} (The ISO-639-1 alpha 2 code in lower case for the language, optionally followed by a hyphen and the ISO-3166-1 alpha 2 code for the region in upper case; e.g. "en" for English, or "en-US" for American English versus "en-AU" for Australian English.)
         */
        public CodeableConcept getLanguage() { 
          if (this.language == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create PractitionerCommunicationComponent.language");
            else if (Configuration.doAutoCreate())
              this.language = new CodeableConcept(); // cc
          return this.language;
        }

        public boolean hasLanguage() { 
          return this.language != null && !this.language.isEmpty();
        }

        /**
         * @param value {@link #language} (The ISO-639-1 alpha 2 code in lower case for the language, optionally followed by a hyphen and the ISO-3166-1 alpha 2 code for the region in upper case; e.g. "en" for English, or "en-US" for American English versus "en-AU" for Australian English.)
         */
        public PractitionerCommunicationComponent setLanguage(CodeableConcept value) { 
          this.language = value;
          return this;
        }

        /**
         * @return {@link #preferred} (Indicates whether or not the person prefers this language (over other languages he masters up a certain level).). This is the underlying object with id, value and extensions. The accessor "getPreferred" gives direct access to the value
         */
        public BooleanType getPreferredElement() { 
          if (this.preferred == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create PractitionerCommunicationComponent.preferred");
            else if (Configuration.doAutoCreate())
              this.preferred = new BooleanType(); // bb
          return this.preferred;
        }

        public boolean hasPreferredElement() { 
          return this.preferred != null && !this.preferred.isEmpty();
        }

        public boolean hasPreferred() { 
          return this.preferred != null && !this.preferred.isEmpty();
        }

        /**
         * @param value {@link #preferred} (Indicates whether or not the person prefers this language (over other languages he masters up a certain level).). This is the underlying object with id, value and extensions. The accessor "getPreferred" gives direct access to the value
         */
        public PractitionerCommunicationComponent setPreferredElement(BooleanType value) { 
          this.preferred = value;
          return this;
        }

        /**
         * @return Indicates whether or not the person prefers this language (over other languages he masters up a certain level).
         */
        public boolean getPreferred() { 
          return this.preferred == null || this.preferred.isEmpty() ? false : this.preferred.getValue();
        }

        /**
         * @param value Indicates whether or not the person prefers this language (over other languages he masters up a certain level).
         */
        public PractitionerCommunicationComponent setPreferred(boolean value) { 
            if (this.preferred == null)
              this.preferred = new BooleanType();
            this.preferred.setValue(value);
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("language", "CodeableConcept", "The ISO-639-1 alpha 2 code in lower case for the language, optionally followed by a hyphen and the ISO-3166-1 alpha 2 code for the region in upper case; e.g. \"en\" for English, or \"en-US\" for American English versus \"en-AU\" for Australian English.", 0, 1, language));
          children.add(new Property("preferred", "boolean", "Indicates whether or not the person prefers this language (over other languages he masters up a certain level).", 0, 1, preferred));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case -1613589672: /*language*/  return new Property("language", "CodeableConcept", "The ISO-639-1 alpha 2 code in lower case for the language, optionally followed by a hyphen and the ISO-3166-1 alpha 2 code for the region in upper case; e.g. \"en\" for English, or \"en-US\" for American English versus \"en-AU\" for Australian English.", 0, 1, language);
          case -1294005119: /*preferred*/  return new Property("preferred", "boolean", "Indicates whether or not the person prefers this language (over other languages he masters up a certain level).", 0, 1, preferred);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -1613589672: /*language*/ return this.language == null ? new Base[0] : new Base[] {this.language}; // CodeableConcept
        case -1294005119: /*preferred*/ return this.preferred == null ? new Base[0] : new Base[] {this.preferred}; // BooleanType
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -1613589672: // language
          this.language = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case -1294005119: // preferred
          this.preferred = TypeConvertor.castToBoolean(value); // BooleanType
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("language")) {
          this.language = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("preferred")) {
          this.preferred = TypeConvertor.castToBoolean(value); // BooleanType
        } else
          return super.setProperty(name, value);
        return value;
      }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
        if (name.equals("language")) {
          this.language = null;
        } else if (name.equals("preferred")) {
          this.preferred = null;
        } else
          super.removeChild(name, value);
        
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1613589672:  return getLanguage();
        case -1294005119:  return getPreferredElement();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1613589672: /*language*/ return new String[] {"CodeableConcept"};
        case -1294005119: /*preferred*/ return new String[] {"boolean"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("language")) {
          this.language = new CodeableConcept();
          return this.language;
        }
        else if (name.equals("preferred")) {
          throw new FHIRException("Cannot call addChild on a singleton property Practitioner.communication.preferred");
        }
        else
          return super.addChild(name);
      }

      public PractitionerCommunicationComponent copy() {
        PractitionerCommunicationComponent dst = new PractitionerCommunicationComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(PractitionerCommunicationComponent dst) {
        super.copyValues(dst);
        dst.language = language == null ? null : language.copy();
        dst.preferred = preferred == null ? null : preferred.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof PractitionerCommunicationComponent))
          return false;
        PractitionerCommunicationComponent o = (PractitionerCommunicationComponent) other_;
        return compareDeep(language, o.language, true) && compareDeep(preferred, o.preferred, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof PractitionerCommunicationComponent))
          return false;
        PractitionerCommunicationComponent o = (PractitionerCommunicationComponent) other_;
        return compareValues(preferred, o.preferred, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(language, preferred);
      }

  public String fhirType() {
    return "Practitioner.communication";

  }

  }

    /**
     * An identifier that applies to this person in this role.
     */
    @Child(name = "identifier", type = {Identifier.class}, order=0, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="An identifier for the person as this agent", formalDefinition="An identifier that applies to this person in this role." )
    protected List<Identifier> identifier;

    /**
     * Whether this practitioner's record is in active use.
     */
    @Child(name = "active", type = {BooleanType.class}, order=1, min=0, max=1, modifier=true, summary=true)
    @Description(shortDefinition="Whether this practitioner's record is in active use", formalDefinition="Whether this practitioner's record is in active use." )
    protected BooleanType active;

    /**
     * The name(s) associated with the practitioner.
     */
    @Child(name = "name", type = {HumanName.class}, order=2, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="The name(s) associated with the practitioner", formalDefinition="The name(s) associated with the practitioner." )
    protected List<HumanName> name;

    /**
     * A contact detail for the practitioner, e.g. a telephone number or an email address.
     */
    @Child(name = "telecom", type = {ContactPoint.class}, order=3, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="A contact detail for the practitioner (that apply to all roles)", formalDefinition="A contact detail for the practitioner, e.g. a telephone number or an email address." )
    protected List<ContactPoint> telecom;

    /**
     * Administrative Gender - the gender that the person is considered to have for administration and record keeping purposes.
     */
    @Child(name = "gender", type = {CodeType.class}, order=4, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="male | female | other | unknown", formalDefinition="Administrative Gender - the gender that the person is considered to have for administration and record keeping purposes." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/administrative-gender")
    protected Enumeration<AdministrativeGender> gender;

    /**
     * The date of birth for the practitioner.
     */
    @Child(name = "birthDate", type = {DateType.class}, order=5, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="The date  on which the practitioner was born", formalDefinition="The date of birth for the practitioner." )
    protected DateType birthDate;

    /**
     * Indicates if the practitioner is deceased or not.
     */
    @Child(name = "deceased", type = {BooleanType.class, DateTimeType.class}, order=6, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Indicates if the practitioner is deceased or not", formalDefinition="Indicates if the practitioner is deceased or not." )
    protected DataType deceased;

    /**
     * Address(es) of the practitioner that are not role specific (typically home address). 
Work addresses are not typically entered in this property as they are usually role dependent.
     */
    @Child(name = "address", type = {Address.class}, order=7, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Address(es) of the practitioner that are not role specific (typically home address)", formalDefinition="Address(es) of the practitioner that are not role specific (typically home address). \rWork addresses are not typically entered in this property as they are usually role dependent." )
    protected List<Address> address;

    /**
     * Image of the person.
     */
    @Child(name = "photo", type = {Attachment.class}, order=8, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Image of the person", formalDefinition="Image of the person." )
    protected List<Attachment> photo;

    /**
     * The official qualifications, certifications, accreditations, training, licenses (and other types of educations/skills/capabilities) that authorize or otherwise pertain to the provision of care by the practitioner.

For example, a medical license issued by a medical board of licensure authorizing the practitioner to practice medicine within a certain locality.
     */
    @Child(name = "qualification", type = {}, order=9, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Qualifications, certifications, accreditations, licenses, training, etc. pertaining to the provision of care", formalDefinition="The official qualifications, certifications, accreditations, training, licenses (and other types of educations/skills/capabilities) that authorize or otherwise pertain to the provision of care by the practitioner.\r\rFor example, a medical license issued by a medical board of licensure authorizing the practitioner to practice medicine within a certain locality." )
    protected List<PractitionerQualificationComponent> qualification;

    /**
     * A language which may be used to communicate with the practitioner, often for correspondence/administrative purposes.

The `PractitionerRole.communication` property should be used for publishing the languages that a practitioner is able to communicate with patients (on a per Organization/Role basis).
     */
    @Child(name = "communication", type = {}, order=10, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="A language which may be used to communicate with the practitioner", formalDefinition="A language which may be used to communicate with the practitioner, often for correspondence/administrative purposes.\r\rThe `PractitionerRole.communication` property should be used for publishing the languages that a practitioner is able to communicate with patients (on a per Organization/Role basis)." )
    protected List<PractitionerCommunicationComponent> communication;

    private static final long serialVersionUID = -54730811L;

  /**
   * Constructor
   */
    public Practitioner() {
      super();
    }

    /**
     * @return {@link #identifier} (An identifier that applies to this person in this role.)
     */
    public List<Identifier> getIdentifier() { 
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      return this.identifier;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Practitioner setIdentifier(List<Identifier> theIdentifier) { 
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

    public Identifier addIdentifier() { //3
      Identifier t = new Identifier();
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      this.identifier.add(t);
      return t;
    }

    public Practitioner addIdentifier(Identifier t) { //3
      if (t == null)
        return this;
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      this.identifier.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #identifier}, creating it if it does not already exist {3}
     */
    public Identifier getIdentifierFirstRep() { 
      if (getIdentifier().isEmpty()) {
        addIdentifier();
      }
      return getIdentifier().get(0);
    }

    /**
     * @return {@link #active} (Whether this practitioner's record is in active use.). This is the underlying object with id, value and extensions. The accessor "getActive" gives direct access to the value
     */
    public BooleanType getActiveElement() { 
      if (this.active == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Practitioner.active");
        else if (Configuration.doAutoCreate())
          this.active = new BooleanType(); // bb
      return this.active;
    }

    public boolean hasActiveElement() { 
      return this.active != null && !this.active.isEmpty();
    }

    public boolean hasActive() { 
      return this.active != null && !this.active.isEmpty();
    }

    /**
     * @param value {@link #active} (Whether this practitioner's record is in active use.). This is the underlying object with id, value and extensions. The accessor "getActive" gives direct access to the value
     */
    public Practitioner setActiveElement(BooleanType value) { 
      this.active = value;
      return this;
    }

    /**
     * @return Whether this practitioner's record is in active use.
     */
    public boolean getActive() { 
      return this.active == null || this.active.isEmpty() ? false : this.active.getValue();
    }

    /**
     * @param value Whether this practitioner's record is in active use.
     */
    public Practitioner setActive(boolean value) { 
        if (this.active == null)
          this.active = new BooleanType();
        this.active.setValue(value);
      return this;
    }

    /**
     * @return {@link #name} (The name(s) associated with the practitioner.)
     */
    public List<HumanName> getName() { 
      if (this.name == null)
        this.name = new ArrayList<HumanName>();
      return this.name;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Practitioner setName(List<HumanName> theName) { 
      this.name = theName;
      return this;
    }

    public boolean hasName() { 
      if (this.name == null)
        return false;
      for (HumanName item : this.name)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public HumanName addName() { //3
      HumanName t = new HumanName();
      if (this.name == null)
        this.name = new ArrayList<HumanName>();
      this.name.add(t);
      return t;
    }

    public Practitioner addName(HumanName t) { //3
      if (t == null)
        return this;
      if (this.name == null)
        this.name = new ArrayList<HumanName>();
      this.name.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #name}, creating it if it does not already exist {3}
     */
    public HumanName getNameFirstRep() { 
      if (getName().isEmpty()) {
        addName();
      }
      return getName().get(0);
    }

    /**
     * @return {@link #telecom} (A contact detail for the practitioner, e.g. a telephone number or an email address.)
     */
    public List<ContactPoint> getTelecom() { 
      if (this.telecom == null)
        this.telecom = new ArrayList<ContactPoint>();
      return this.telecom;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Practitioner setTelecom(List<ContactPoint> theTelecom) { 
      this.telecom = theTelecom;
      return this;
    }

    public boolean hasTelecom() { 
      if (this.telecom == null)
        return false;
      for (ContactPoint item : this.telecom)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public ContactPoint addTelecom() { //3
      ContactPoint t = new ContactPoint();
      if (this.telecom == null)
        this.telecom = new ArrayList<ContactPoint>();
      this.telecom.add(t);
      return t;
    }

    public Practitioner addTelecom(ContactPoint t) { //3
      if (t == null)
        return this;
      if (this.telecom == null)
        this.telecom = new ArrayList<ContactPoint>();
      this.telecom.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #telecom}, creating it if it does not already exist {3}
     */
    public ContactPoint getTelecomFirstRep() { 
      if (getTelecom().isEmpty()) {
        addTelecom();
      }
      return getTelecom().get(0);
    }

    /**
     * @return {@link #gender} (Administrative Gender - the gender that the person is considered to have for administration and record keeping purposes.). This is the underlying object with id, value and extensions. The accessor "getGender" gives direct access to the value
     */
    public Enumeration<AdministrativeGender> getGenderElement() { 
      if (this.gender == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Practitioner.gender");
        else if (Configuration.doAutoCreate())
          this.gender = new Enumeration<AdministrativeGender>(new AdministrativeGenderEnumFactory()); // bb
      return this.gender;
    }

    public boolean hasGenderElement() { 
      return this.gender != null && !this.gender.isEmpty();
    }

    public boolean hasGender() { 
      return this.gender != null && !this.gender.isEmpty();
    }

    /**
     * @param value {@link #gender} (Administrative Gender - the gender that the person is considered to have for administration and record keeping purposes.). This is the underlying object with id, value and extensions. The accessor "getGender" gives direct access to the value
     */
    public Practitioner setGenderElement(Enumeration<AdministrativeGender> value) { 
      this.gender = value;
      return this;
    }

    /**
     * @return Administrative Gender - the gender that the person is considered to have for administration and record keeping purposes.
     */
    public AdministrativeGender getGender() { 
      return this.gender == null ? null : this.gender.getValue();
    }

    /**
     * @param value Administrative Gender - the gender that the person is considered to have for administration and record keeping purposes.
     */
    public Practitioner setGender(AdministrativeGender value) { 
      if (value == null)
        this.gender = null;
      else {
        if (this.gender == null)
          this.gender = new Enumeration<AdministrativeGender>(new AdministrativeGenderEnumFactory());
        this.gender.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #birthDate} (The date of birth for the practitioner.). This is the underlying object with id, value and extensions. The accessor "getBirthDate" gives direct access to the value
     */
    public DateType getBirthDateElement() { 
      if (this.birthDate == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Practitioner.birthDate");
        else if (Configuration.doAutoCreate())
          this.birthDate = new DateType(); // bb
      return this.birthDate;
    }

    public boolean hasBirthDateElement() { 
      return this.birthDate != null && !this.birthDate.isEmpty();
    }

    public boolean hasBirthDate() { 
      return this.birthDate != null && !this.birthDate.isEmpty();
    }

    /**
     * @param value {@link #birthDate} (The date of birth for the practitioner.). This is the underlying object with id, value and extensions. The accessor "getBirthDate" gives direct access to the value
     */
    public Practitioner setBirthDateElement(DateType value) { 
      this.birthDate = value;
      return this;
    }

    /**
     * @return The date of birth for the practitioner.
     */
    public Date getBirthDate() { 
      return this.birthDate == null ? null : this.birthDate.getValue();
    }

    /**
     * @param value The date of birth for the practitioner.
     */
    public Practitioner setBirthDate(Date value) { 
      if (value == null)
        this.birthDate = null;
      else {
        if (this.birthDate == null)
          this.birthDate = new DateType();
        this.birthDate.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #deceased} (Indicates if the practitioner is deceased or not.)
     */
    public DataType getDeceased() { 
      return this.deceased;
    }

    /**
     * @return {@link #deceased} (Indicates if the practitioner is deceased or not.)
     */
    public BooleanType getDeceasedBooleanType() throws FHIRException { 
      if (this.deceased == null)
        this.deceased = new BooleanType();
      if (!(this.deceased instanceof BooleanType))
        throw new FHIRException("Type mismatch: the type BooleanType was expected, but "+this.deceased.getClass().getName()+" was encountered");
      return (BooleanType) this.deceased;
    }

    public boolean hasDeceasedBooleanType() {
        return this.deceased instanceof BooleanType;
    }

    /**
     * @return {@link #deceased} (Indicates if the practitioner is deceased or not.)
     */
    public DateTimeType getDeceasedDateTimeType() throws FHIRException { 
      if (this.deceased == null)
        this.deceased = new DateTimeType();
      if (!(this.deceased instanceof DateTimeType))
        throw new FHIRException("Type mismatch: the type DateTimeType was expected, but "+this.deceased.getClass().getName()+" was encountered");
      return (DateTimeType) this.deceased;
    }

    public boolean hasDeceasedDateTimeType() {
        return this.deceased instanceof DateTimeType;
    }

    public boolean hasDeceased() { 
      return this.deceased != null && !this.deceased.isEmpty();
    }

    /**
     * @param value {@link #deceased} (Indicates if the practitioner is deceased or not.)
     */
    public Practitioner setDeceased(DataType value) { 
      if (value != null && !(value instanceof BooleanType || value instanceof DateTimeType))
        throw new FHIRException("Not the right type for Practitioner.deceased[x]: "+value.fhirType());
      this.deceased = value;
      return this;
    }

    /**
     * @return {@link #address} (Address(es) of the practitioner that are not role specific (typically home address). 
Work addresses are not typically entered in this property as they are usually role dependent.)
     */
    public List<Address> getAddress() { 
      if (this.address == null)
        this.address = new ArrayList<Address>();
      return this.address;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Practitioner setAddress(List<Address> theAddress) { 
      this.address = theAddress;
      return this;
    }

    public boolean hasAddress() { 
      if (this.address == null)
        return false;
      for (Address item : this.address)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Address addAddress() { //3
      Address t = new Address();
      if (this.address == null)
        this.address = new ArrayList<Address>();
      this.address.add(t);
      return t;
    }

    public Practitioner addAddress(Address t) { //3
      if (t == null)
        return this;
      if (this.address == null)
        this.address = new ArrayList<Address>();
      this.address.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #address}, creating it if it does not already exist {3}
     */
    public Address getAddressFirstRep() { 
      if (getAddress().isEmpty()) {
        addAddress();
      }
      return getAddress().get(0);
    }

    /**
     * @return {@link #photo} (Image of the person.)
     */
    public List<Attachment> getPhoto() { 
      if (this.photo == null)
        this.photo = new ArrayList<Attachment>();
      return this.photo;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Practitioner setPhoto(List<Attachment> thePhoto) { 
      this.photo = thePhoto;
      return this;
    }

    public boolean hasPhoto() { 
      if (this.photo == null)
        return false;
      for (Attachment item : this.photo)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Attachment addPhoto() { //3
      Attachment t = new Attachment();
      if (this.photo == null)
        this.photo = new ArrayList<Attachment>();
      this.photo.add(t);
      return t;
    }

    public Practitioner addPhoto(Attachment t) { //3
      if (t == null)
        return this;
      if (this.photo == null)
        this.photo = new ArrayList<Attachment>();
      this.photo.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #photo}, creating it if it does not already exist {3}
     */
    public Attachment getPhotoFirstRep() { 
      if (getPhoto().isEmpty()) {
        addPhoto();
      }
      return getPhoto().get(0);
    }

    /**
     * @return {@link #qualification} (The official qualifications, certifications, accreditations, training, licenses (and other types of educations/skills/capabilities) that authorize or otherwise pertain to the provision of care by the practitioner.

For example, a medical license issued by a medical board of licensure authorizing the practitioner to practice medicine within a certain locality.)
     */
    public List<PractitionerQualificationComponent> getQualification() { 
      if (this.qualification == null)
        this.qualification = new ArrayList<PractitionerQualificationComponent>();
      return this.qualification;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Practitioner setQualification(List<PractitionerQualificationComponent> theQualification) { 
      this.qualification = theQualification;
      return this;
    }

    public boolean hasQualification() { 
      if (this.qualification == null)
        return false;
      for (PractitionerQualificationComponent item : this.qualification)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public PractitionerQualificationComponent addQualification() { //3
      PractitionerQualificationComponent t = new PractitionerQualificationComponent();
      if (this.qualification == null)
        this.qualification = new ArrayList<PractitionerQualificationComponent>();
      this.qualification.add(t);
      return t;
    }

    public Practitioner addQualification(PractitionerQualificationComponent t) { //3
      if (t == null)
        return this;
      if (this.qualification == null)
        this.qualification = new ArrayList<PractitionerQualificationComponent>();
      this.qualification.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #qualification}, creating it if it does not already exist {3}
     */
    public PractitionerQualificationComponent getQualificationFirstRep() { 
      if (getQualification().isEmpty()) {
        addQualification();
      }
      return getQualification().get(0);
    }

    /**
     * @return {@link #communication} (A language which may be used to communicate with the practitioner, often for correspondence/administrative purposes.

The `PractitionerRole.communication` property should be used for publishing the languages that a practitioner is able to communicate with patients (on a per Organization/Role basis).)
     */
    public List<PractitionerCommunicationComponent> getCommunication() { 
      if (this.communication == null)
        this.communication = new ArrayList<PractitionerCommunicationComponent>();
      return this.communication;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Practitioner setCommunication(List<PractitionerCommunicationComponent> theCommunication) { 
      this.communication = theCommunication;
      return this;
    }

    public boolean hasCommunication() { 
      if (this.communication == null)
        return false;
      for (PractitionerCommunicationComponent item : this.communication)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public PractitionerCommunicationComponent addCommunication() { //3
      PractitionerCommunicationComponent t = new PractitionerCommunicationComponent();
      if (this.communication == null)
        this.communication = new ArrayList<PractitionerCommunicationComponent>();
      this.communication.add(t);
      return t;
    }

    public Practitioner addCommunication(PractitionerCommunicationComponent t) { //3
      if (t == null)
        return this;
      if (this.communication == null)
        this.communication = new ArrayList<PractitionerCommunicationComponent>();
      this.communication.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #communication}, creating it if it does not already exist {3}
     */
    public PractitionerCommunicationComponent getCommunicationFirstRep() { 
      if (getCommunication().isEmpty()) {
        addCommunication();
      }
      return getCommunication().get(0);
    }

      protected void listChildren(List<Property> children) {
        super.listChildren(children);
        children.add(new Property("identifier", "Identifier", "An identifier that applies to this person in this role.", 0, java.lang.Integer.MAX_VALUE, identifier));
        children.add(new Property("active", "boolean", "Whether this practitioner's record is in active use.", 0, 1, active));
        children.add(new Property("name", "HumanName", "The name(s) associated with the practitioner.", 0, java.lang.Integer.MAX_VALUE, name));
        children.add(new Property("telecom", "ContactPoint", "A contact detail for the practitioner, e.g. a telephone number or an email address.", 0, java.lang.Integer.MAX_VALUE, telecom));
        children.add(new Property("gender", "code", "Administrative Gender - the gender that the person is considered to have for administration and record keeping purposes.", 0, 1, gender));
        children.add(new Property("birthDate", "date", "The date of birth for the practitioner.", 0, 1, birthDate));
        children.add(new Property("deceased[x]", "boolean|dateTime", "Indicates if the practitioner is deceased or not.", 0, 1, deceased));
        children.add(new Property("address", "Address", "Address(es) of the practitioner that are not role specific (typically home address). \rWork addresses are not typically entered in this property as they are usually role dependent.", 0, java.lang.Integer.MAX_VALUE, address));
        children.add(new Property("photo", "Attachment", "Image of the person.", 0, java.lang.Integer.MAX_VALUE, photo));
        children.add(new Property("qualification", "", "The official qualifications, certifications, accreditations, training, licenses (and other types of educations/skills/capabilities) that authorize or otherwise pertain to the provision of care by the practitioner.\r\rFor example, a medical license issued by a medical board of licensure authorizing the practitioner to practice medicine within a certain locality.", 0, java.lang.Integer.MAX_VALUE, qualification));
        children.add(new Property("communication", "", "A language which may be used to communicate with the practitioner, often for correspondence/administrative purposes.\r\rThe `PractitionerRole.communication` property should be used for publishing the languages that a practitioner is able to communicate with patients (on a per Organization/Role basis).", 0, java.lang.Integer.MAX_VALUE, communication));
      }

      @Override
      public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
        switch (_hash) {
        case -1618432855: /*identifier*/  return new Property("identifier", "Identifier", "An identifier that applies to this person in this role.", 0, java.lang.Integer.MAX_VALUE, identifier);
        case -1422950650: /*active*/  return new Property("active", "boolean", "Whether this practitioner's record is in active use.", 0, 1, active);
        case 3373707: /*name*/  return new Property("name", "HumanName", "The name(s) associated with the practitioner.", 0, java.lang.Integer.MAX_VALUE, name);
        case -1429363305: /*telecom*/  return new Property("telecom", "ContactPoint", "A contact detail for the practitioner, e.g. a telephone number or an email address.", 0, java.lang.Integer.MAX_VALUE, telecom);
        case -1249512767: /*gender*/  return new Property("gender", "code", "Administrative Gender - the gender that the person is considered to have for administration and record keeping purposes.", 0, 1, gender);
        case -1210031859: /*birthDate*/  return new Property("birthDate", "date", "The date of birth for the practitioner.", 0, 1, birthDate);
        case -1311442804: /*deceased[x]*/  return new Property("deceased[x]", "boolean|dateTime", "Indicates if the practitioner is deceased or not.", 0, 1, deceased);
        case 561497972: /*deceased*/  return new Property("deceased[x]", "boolean|dateTime", "Indicates if the practitioner is deceased or not.", 0, 1, deceased);
        case 497463828: /*deceasedBoolean*/  return new Property("deceased[x]", "boolean", "Indicates if the practitioner is deceased or not.", 0, 1, deceased);
        case -1971804369: /*deceasedDateTime*/  return new Property("deceased[x]", "dateTime", "Indicates if the practitioner is deceased or not.", 0, 1, deceased);
        case -1147692044: /*address*/  return new Property("address", "Address", "Address(es) of the practitioner that are not role specific (typically home address). \rWork addresses are not typically entered in this property as they are usually role dependent.", 0, java.lang.Integer.MAX_VALUE, address);
        case 106642994: /*photo*/  return new Property("photo", "Attachment", "Image of the person.", 0, java.lang.Integer.MAX_VALUE, photo);
        case -631333393: /*qualification*/  return new Property("qualification", "", "The official qualifications, certifications, accreditations, training, licenses (and other types of educations/skills/capabilities) that authorize or otherwise pertain to the provision of care by the practitioner.\r\rFor example, a medical license issued by a medical board of licensure authorizing the practitioner to practice medicine within a certain locality.", 0, java.lang.Integer.MAX_VALUE, qualification);
        case -1035284522: /*communication*/  return new Property("communication", "", "A language which may be used to communicate with the practitioner, often for correspondence/administrative purposes.\r\rThe `PractitionerRole.communication` property should be used for publishing the languages that a practitioner is able to communicate with patients (on a per Organization/Role basis).", 0, java.lang.Integer.MAX_VALUE, communication);
        default: return super.getNamedProperty(_hash, _name, _checkValid);
        }

      }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -1618432855: /*identifier*/ return this.identifier == null ? new Base[0] : this.identifier.toArray(new Base[this.identifier.size()]); // Identifier
        case -1422950650: /*active*/ return this.active == null ? new Base[0] : new Base[] {this.active}; // BooleanType
        case 3373707: /*name*/ return this.name == null ? new Base[0] : this.name.toArray(new Base[this.name.size()]); // HumanName
        case -1429363305: /*telecom*/ return this.telecom == null ? new Base[0] : this.telecom.toArray(new Base[this.telecom.size()]); // ContactPoint
        case -1249512767: /*gender*/ return this.gender == null ? new Base[0] : new Base[] {this.gender}; // Enumeration<AdministrativeGender>
        case -1210031859: /*birthDate*/ return this.birthDate == null ? new Base[0] : new Base[] {this.birthDate}; // DateType
        case 561497972: /*deceased*/ return this.deceased == null ? new Base[0] : new Base[] {this.deceased}; // DataType
        case -1147692044: /*address*/ return this.address == null ? new Base[0] : this.address.toArray(new Base[this.address.size()]); // Address
        case 106642994: /*photo*/ return this.photo == null ? new Base[0] : this.photo.toArray(new Base[this.photo.size()]); // Attachment
        case -631333393: /*qualification*/ return this.qualification == null ? new Base[0] : this.qualification.toArray(new Base[this.qualification.size()]); // PractitionerQualificationComponent
        case -1035284522: /*communication*/ return this.communication == null ? new Base[0] : this.communication.toArray(new Base[this.communication.size()]); // PractitionerCommunicationComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -1618432855: // identifier
          this.getIdentifier().add(TypeConvertor.castToIdentifier(value)); // Identifier
          return value;
        case -1422950650: // active
          this.active = TypeConvertor.castToBoolean(value); // BooleanType
          return value;
        case 3373707: // name
          this.getName().add(TypeConvertor.castToHumanName(value)); // HumanName
          return value;
        case -1429363305: // telecom
          this.getTelecom().add(TypeConvertor.castToContactPoint(value)); // ContactPoint
          return value;
        case -1249512767: // gender
          value = new AdministrativeGenderEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.gender = (Enumeration) value; // Enumeration<AdministrativeGender>
          return value;
        case -1210031859: // birthDate
          this.birthDate = TypeConvertor.castToDate(value); // DateType
          return value;
        case 561497972: // deceased
          this.deceased = TypeConvertor.castToType(value); // DataType
          return value;
        case -1147692044: // address
          this.getAddress().add(TypeConvertor.castToAddress(value)); // Address
          return value;
        case 106642994: // photo
          this.getPhoto().add(TypeConvertor.castToAttachment(value)); // Attachment
          return value;
        case -631333393: // qualification
          this.getQualification().add((PractitionerQualificationComponent) value); // PractitionerQualificationComponent
          return value;
        case -1035284522: // communication
          this.getCommunication().add((PractitionerCommunicationComponent) value); // PractitionerCommunicationComponent
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier")) {
          this.getIdentifier().add(TypeConvertor.castToIdentifier(value));
        } else if (name.equals("active")) {
          this.active = TypeConvertor.castToBoolean(value); // BooleanType
        } else if (name.equals("name")) {
          this.getName().add(TypeConvertor.castToHumanName(value));
        } else if (name.equals("telecom")) {
          this.getTelecom().add(TypeConvertor.castToContactPoint(value));
        } else if (name.equals("gender")) {
          value = new AdministrativeGenderEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.gender = (Enumeration) value; // Enumeration<AdministrativeGender>
        } else if (name.equals("birthDate")) {
          this.birthDate = TypeConvertor.castToDate(value); // DateType
        } else if (name.equals("deceased[x]")) {
          this.deceased = TypeConvertor.castToType(value); // DataType
        } else if (name.equals("address")) {
          this.getAddress().add(TypeConvertor.castToAddress(value));
        } else if (name.equals("photo")) {
          this.getPhoto().add(TypeConvertor.castToAttachment(value));
        } else if (name.equals("qualification")) {
          this.getQualification().add((PractitionerQualificationComponent) value);
        } else if (name.equals("communication")) {
          this.getCommunication().add((PractitionerCommunicationComponent) value);
        } else
          return super.setProperty(name, value);
        return value;
      }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
        if (name.equals("identifier")) {
          this.getIdentifier().remove(value);
        } else if (name.equals("active")) {
          this.active = null;
        } else if (name.equals("name")) {
          this.getName().remove(value);
        } else if (name.equals("telecom")) {
          this.getTelecom().remove(value);
        } else if (name.equals("gender")) {
          value = new AdministrativeGenderEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.gender = (Enumeration) value; // Enumeration<AdministrativeGender>
        } else if (name.equals("birthDate")) {
          this.birthDate = null;
        } else if (name.equals("deceased[x]")) {
          this.deceased = null;
        } else if (name.equals("address")) {
          this.getAddress().remove(value);
        } else if (name.equals("photo")) {
          this.getPhoto().remove(value);
        } else if (name.equals("qualification")) {
          this.getQualification().remove((PractitionerQualificationComponent) value);
        } else if (name.equals("communication")) {
          this.getCommunication().remove((PractitionerCommunicationComponent) value);
        } else
          super.removeChild(name, value);
        
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1618432855:  return addIdentifier(); 
        case -1422950650:  return getActiveElement();
        case 3373707:  return addName(); 
        case -1429363305:  return addTelecom(); 
        case -1249512767:  return getGenderElement();
        case -1210031859:  return getBirthDateElement();
        case -1311442804:  return getDeceased();
        case 561497972:  return getDeceased();
        case -1147692044:  return addAddress(); 
        case 106642994:  return addPhoto(); 
        case -631333393:  return addQualification(); 
        case -1035284522:  return addCommunication(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1618432855: /*identifier*/ return new String[] {"Identifier"};
        case -1422950650: /*active*/ return new String[] {"boolean"};
        case 3373707: /*name*/ return new String[] {"HumanName"};
        case -1429363305: /*telecom*/ return new String[] {"ContactPoint"};
        case -1249512767: /*gender*/ return new String[] {"code"};
        case -1210031859: /*birthDate*/ return new String[] {"date"};
        case 561497972: /*deceased*/ return new String[] {"boolean", "dateTime"};
        case -1147692044: /*address*/ return new String[] {"Address"};
        case 106642994: /*photo*/ return new String[] {"Attachment"};
        case -631333393: /*qualification*/ return new String[] {};
        case -1035284522: /*communication*/ return new String[] {};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
          return addIdentifier();
        }
        else if (name.equals("active")) {
          throw new FHIRException("Cannot call addChild on a singleton property Practitioner.active");
        }
        else if (name.equals("name")) {
          return addName();
        }
        else if (name.equals("telecom")) {
          return addTelecom();
        }
        else if (name.equals("gender")) {
          throw new FHIRException("Cannot call addChild on a singleton property Practitioner.gender");
        }
        else if (name.equals("birthDate")) {
          throw new FHIRException("Cannot call addChild on a singleton property Practitioner.birthDate");
        }
        else if (name.equals("deceasedBoolean")) {
          this.deceased = new BooleanType();
          return this.deceased;
        }
        else if (name.equals("deceasedDateTime")) {
          this.deceased = new DateTimeType();
          return this.deceased;
        }
        else if (name.equals("address")) {
          return addAddress();
        }
        else if (name.equals("photo")) {
          return addPhoto();
        }
        else if (name.equals("qualification")) {
          return addQualification();
        }
        else if (name.equals("communication")) {
          return addCommunication();
        }
        else
          return super.addChild(name);
      }

  public String fhirType() {
    return "Practitioner";

  }

      public Practitioner copy() {
        Practitioner dst = new Practitioner();
        copyValues(dst);
        return dst;
      }

      public void copyValues(Practitioner dst) {
        super.copyValues(dst);
        if (identifier != null) {
          dst.identifier = new ArrayList<Identifier>();
          for (Identifier i : identifier)
            dst.identifier.add(i.copy());
        };
        dst.active = active == null ? null : active.copy();
        if (name != null) {
          dst.name = new ArrayList<HumanName>();
          for (HumanName i : name)
            dst.name.add(i.copy());
        };
        if (telecom != null) {
          dst.telecom = new ArrayList<ContactPoint>();
          for (ContactPoint i : telecom)
            dst.telecom.add(i.copy());
        };
        dst.gender = gender == null ? null : gender.copy();
        dst.birthDate = birthDate == null ? null : birthDate.copy();
        dst.deceased = deceased == null ? null : deceased.copy();
        if (address != null) {
          dst.address = new ArrayList<Address>();
          for (Address i : address)
            dst.address.add(i.copy());
        };
        if (photo != null) {
          dst.photo = new ArrayList<Attachment>();
          for (Attachment i : photo)
            dst.photo.add(i.copy());
        };
        if (qualification != null) {
          dst.qualification = new ArrayList<PractitionerQualificationComponent>();
          for (PractitionerQualificationComponent i : qualification)
            dst.qualification.add(i.copy());
        };
        if (communication != null) {
          dst.communication = new ArrayList<PractitionerCommunicationComponent>();
          for (PractitionerCommunicationComponent i : communication)
            dst.communication.add(i.copy());
        };
      }

      protected Practitioner typedCopy() {
        return copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof Practitioner))
          return false;
        Practitioner o = (Practitioner) other_;
        return compareDeep(identifier, o.identifier, true) && compareDeep(active, o.active, true) && compareDeep(name, o.name, true)
           && compareDeep(telecom, o.telecom, true) && compareDeep(gender, o.gender, true) && compareDeep(birthDate, o.birthDate, true)
           && compareDeep(deceased, o.deceased, true) && compareDeep(address, o.address, true) && compareDeep(photo, o.photo, true)
           && compareDeep(qualification, o.qualification, true) && compareDeep(communication, o.communication, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof Practitioner))
          return false;
        Practitioner o = (Practitioner) other_;
        return compareValues(active, o.active, true) && compareValues(gender, o.gender, true) && compareValues(birthDate, o.birthDate, true)
          ;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(identifier, active, name
          , telecom, gender, birthDate, deceased, address, photo, qualification, communication
          );
      }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.Practitioner;
   }

 /**
   * Search parameter: <b>active</b>
   * <p>
   * Description: <b>Whether the practitioner record is active</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Practitioner.active</b><br>
   * </p>
   */
  @SearchParamDefinition(name="active", path="Practitioner.active", description="Whether the practitioner record is active", type="token" )
  public static final String SP_ACTIVE = "active";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>active</b>
   * <p>
   * Description: <b>Whether the practitioner record is active</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Practitioner.active</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam ACTIVE = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_ACTIVE);

 /**
   * Search parameter: <b>communication</b>
   * <p>
   * Description: <b>A language to communicate with the practitioner</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Practitioner.communication.language</b><br>
   * </p>
   */
  @SearchParamDefinition(name="communication", path="Practitioner.communication.language", description="A language to communicate with the practitioner", type="token" )
  public static final String SP_COMMUNICATION = "communication";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>communication</b>
   * <p>
   * Description: <b>A language to communicate with the practitioner</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Practitioner.communication.language</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam COMMUNICATION = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_COMMUNICATION);

 /**
   * Search parameter: <b>death-date</b>
   * <p>
   * Description: <b>The date of death has been provided and satisfies this search value</b><br>
   * Type: <b>date</b><br>
   * Path: <b>(Practitioner.deceased.ofType(dateTime))</b><br>
   * </p>
   */
  @SearchParamDefinition(name="death-date", path="(Practitioner.deceased.ofType(dateTime))", description="The date of death has been provided and satisfies this search value", type="date" )
  public static final String SP_DEATH_DATE = "death-date";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>death-date</b>
   * <p>
   * Description: <b>The date of death has been provided and satisfies this search value</b><br>
   * Type: <b>date</b><br>
   * Path: <b>(Practitioner.deceased.ofType(dateTime))</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.DateClientParam DEATH_DATE = new ca.uhn.fhir.rest.gclient.DateClientParam(SP_DEATH_DATE);

 /**
   * Search parameter: <b>deceased</b>
   * <p>
   * Description: <b>This Practitioner has been marked as deceased, or has a death date entered</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Practitioner.deceased.exists() and Practitioner.deceased != false</b><br>
   * </p>
   */
  @SearchParamDefinition(name="deceased", path="Practitioner.deceased.exists() and Practitioner.deceased != false", description="This Practitioner has been marked as deceased, or has a death date entered", type="token" )
  public static final String SP_DECEASED = "deceased";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>deceased</b>
   * <p>
   * Description: <b>This Practitioner has been marked as deceased, or has a death date entered</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Practitioner.deceased.exists() and Practitioner.deceased != false</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam DECEASED = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_DECEASED);

 /**
   * Search parameter: <b>identifier</b>
   * <p>
   * Description: <b>A practitioner's Identifier</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Practitioner.identifier | Practitioner.qualification.identifier</b><br>
   * </p>
   */
  @SearchParamDefinition(name="identifier", path="Practitioner.identifier | Practitioner.qualification.identifier", description="A practitioner's Identifier", type="token" )
  public static final String SP_IDENTIFIER = "identifier";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
   * <p>
   * Description: <b>A practitioner's Identifier</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Practitioner.identifier | Practitioner.qualification.identifier</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam IDENTIFIER = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_IDENTIFIER);

 /**
   * Search parameter: <b>name</b>
   * <p>
   * Description: <b>A server defined search that may match any of the string fields in the HumanName, including family, give, prefix, suffix, suffix, and/or text</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Practitioner.name</b><br>
   * </p>
   */
  @SearchParamDefinition(name="name", path="Practitioner.name", description="A server defined search that may match any of the string fields in the HumanName, including family, give, prefix, suffix, suffix, and/or text", type="string" )
  public static final String SP_NAME = "name";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>name</b>
   * <p>
   * Description: <b>A server defined search that may match any of the string fields in the HumanName, including family, give, prefix, suffix, suffix, and/or text</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Practitioner.name</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam NAME = new ca.uhn.fhir.rest.gclient.StringClientParam(SP_NAME);

 /**
   * Search parameter: <b>qualification-period</b>
   * <p>
   * Description: <b>The date(s) a qualification is valid for</b><br>
   * Type: <b>date</b><br>
   * Path: <b>Practitioner.qualification.period</b><br>
   * </p>
   */
  @SearchParamDefinition(name="qualification-period", path="Practitioner.qualification.period", description="The date(s) a qualification is valid for", type="date" )
  public static final String SP_QUALIFICATION_PERIOD = "qualification-period";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>qualification-period</b>
   * <p>
   * Description: <b>The date(s) a qualification is valid for</b><br>
   * Type: <b>date</b><br>
   * Path: <b>Practitioner.qualification.period</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.DateClientParam QUALIFICATION_PERIOD = new ca.uhn.fhir.rest.gclient.DateClientParam(SP_QUALIFICATION_PERIOD);

 /**
   * Search parameter: <b>address-city</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [Patient](patient.html): A city specified in an address
* [Person](person.html): A city specified in an address
* [Practitioner](practitioner.html): A city specified in an address
* [RelatedPerson](relatedperson.html): A city specified in an address
</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Patient.address.city | Person.address.city | Practitioner.address.city | RelatedPerson.address.city</b><br>
   * </p>
   */
  @SearchParamDefinition(name="address-city", path="Patient.address.city | Person.address.city | Practitioner.address.city | RelatedPerson.address.city", description="Multiple Resources: \r\n\r\n* [Patient](patient.html): A city specified in an address\r\n* [Person](person.html): A city specified in an address\r\n* [Practitioner](practitioner.html): A city specified in an address\r\n* [RelatedPerson](relatedperson.html): A city specified in an address\r\n", type="string" )
  public static final String SP_ADDRESS_CITY = "address-city";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>address-city</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [Patient](patient.html): A city specified in an address
* [Person](person.html): A city specified in an address
* [Practitioner](practitioner.html): A city specified in an address
* [RelatedPerson](relatedperson.html): A city specified in an address
</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Patient.address.city | Person.address.city | Practitioner.address.city | RelatedPerson.address.city</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam ADDRESS_CITY = new ca.uhn.fhir.rest.gclient.StringClientParam(SP_ADDRESS_CITY);

 /**
   * Search parameter: <b>address-country</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [Patient](patient.html): A country specified in an address
* [Person](person.html): A country specified in an address
* [Practitioner](practitioner.html): A country specified in an address
* [RelatedPerson](relatedperson.html): A country specified in an address
</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Patient.address.country | Person.address.country | Practitioner.address.country | RelatedPerson.address.country</b><br>
   * </p>
   */
  @SearchParamDefinition(name="address-country", path="Patient.address.country | Person.address.country | Practitioner.address.country | RelatedPerson.address.country", description="Multiple Resources: \r\n\r\n* [Patient](patient.html): A country specified in an address\r\n* [Person](person.html): A country specified in an address\r\n* [Practitioner](practitioner.html): A country specified in an address\r\n* [RelatedPerson](relatedperson.html): A country specified in an address\r\n", type="string" )
  public static final String SP_ADDRESS_COUNTRY = "address-country";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>address-country</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [Patient](patient.html): A country specified in an address
* [Person](person.html): A country specified in an address
* [Practitioner](practitioner.html): A country specified in an address
* [RelatedPerson](relatedperson.html): A country specified in an address
</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Patient.address.country | Person.address.country | Practitioner.address.country | RelatedPerson.address.country</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam ADDRESS_COUNTRY = new ca.uhn.fhir.rest.gclient.StringClientParam(SP_ADDRESS_COUNTRY);

 /**
   * Search parameter: <b>address-postalcode</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [Patient](patient.html): A postalCode specified in an address
* [Person](person.html): A postal code specified in an address
* [Practitioner](practitioner.html): A postalCode specified in an address
* [RelatedPerson](relatedperson.html): A postal code specified in an address
</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Patient.address.postalCode | Person.address.postalCode | Practitioner.address.postalCode | RelatedPerson.address.postalCode</b><br>
   * </p>
   */
  @SearchParamDefinition(name="address-postalcode", path="Patient.address.postalCode | Person.address.postalCode | Practitioner.address.postalCode | RelatedPerson.address.postalCode", description="Multiple Resources: \r\n\r\n* [Patient](patient.html): A postalCode specified in an address\r\n* [Person](person.html): A postal code specified in an address\r\n* [Practitioner](practitioner.html): A postalCode specified in an address\r\n* [RelatedPerson](relatedperson.html): A postal code specified in an address\r\n", type="string" )
  public static final String SP_ADDRESS_POSTALCODE = "address-postalcode";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>address-postalcode</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [Patient](patient.html): A postalCode specified in an address
* [Person](person.html): A postal code specified in an address
* [Practitioner](practitioner.html): A postalCode specified in an address
* [RelatedPerson](relatedperson.html): A postal code specified in an address
</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Patient.address.postalCode | Person.address.postalCode | Practitioner.address.postalCode | RelatedPerson.address.postalCode</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam ADDRESS_POSTALCODE = new ca.uhn.fhir.rest.gclient.StringClientParam(SP_ADDRESS_POSTALCODE);

 /**
   * Search parameter: <b>address-state</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [Patient](patient.html): A state specified in an address
* [Person](person.html): A state specified in an address
* [Practitioner](practitioner.html): A state specified in an address
* [RelatedPerson](relatedperson.html): A state specified in an address
</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Patient.address.state | Person.address.state | Practitioner.address.state | RelatedPerson.address.state</b><br>
   * </p>
   */
  @SearchParamDefinition(name="address-state", path="Patient.address.state | Person.address.state | Practitioner.address.state | RelatedPerson.address.state", description="Multiple Resources: \r\n\r\n* [Patient](patient.html): A state specified in an address\r\n* [Person](person.html): A state specified in an address\r\n* [Practitioner](practitioner.html): A state specified in an address\r\n* [RelatedPerson](relatedperson.html): A state specified in an address\r\n", type="string" )
  public static final String SP_ADDRESS_STATE = "address-state";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>address-state</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [Patient](patient.html): A state specified in an address
* [Person](person.html): A state specified in an address
* [Practitioner](practitioner.html): A state specified in an address
* [RelatedPerson](relatedperson.html): A state specified in an address
</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Patient.address.state | Person.address.state | Practitioner.address.state | RelatedPerson.address.state</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam ADDRESS_STATE = new ca.uhn.fhir.rest.gclient.StringClientParam(SP_ADDRESS_STATE);

 /**
   * Search parameter: <b>address-use</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [Patient](patient.html): A use code specified in an address
* [Person](person.html): A use code specified in an address
* [Practitioner](practitioner.html): A use code specified in an address
* [RelatedPerson](relatedperson.html): A use code specified in an address
</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Patient.address.use | Person.address.use | Practitioner.address.use | RelatedPerson.address.use</b><br>
   * </p>
   */
  @SearchParamDefinition(name="address-use", path="Patient.address.use | Person.address.use | Practitioner.address.use | RelatedPerson.address.use", description="Multiple Resources: \r\n\r\n* [Patient](patient.html): A use code specified in an address\r\n* [Person](person.html): A use code specified in an address\r\n* [Practitioner](practitioner.html): A use code specified in an address\r\n* [RelatedPerson](relatedperson.html): A use code specified in an address\r\n", type="token" )
  public static final String SP_ADDRESS_USE = "address-use";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>address-use</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [Patient](patient.html): A use code specified in an address
* [Person](person.html): A use code specified in an address
* [Practitioner](practitioner.html): A use code specified in an address
* [RelatedPerson](relatedperson.html): A use code specified in an address
</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Patient.address.use | Person.address.use | Practitioner.address.use | RelatedPerson.address.use</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam ADDRESS_USE = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_ADDRESS_USE);

 /**
   * Search parameter: <b>address</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [Patient](patient.html): A server defined search that may match any of the string fields in the Address, including line, city, district, state, country, postalCode, and/or text
* [Person](person.html): A server defined search that may match any of the string fields in the Address, including line, city, district, state, country, postalCode, and/or text
* [Practitioner](practitioner.html): A server defined search that may match any of the string fields in the Address, including line, city, district, state, country, postalCode, and/or text
* [RelatedPerson](relatedperson.html): A server defined search that may match any of the string fields in the Address, including line, city, district, state, country, postalCode, and/or text
</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Patient.address | Person.address | Practitioner.address | RelatedPerson.address</b><br>
   * </p>
   */
  @SearchParamDefinition(name="address", path="Patient.address | Person.address | Practitioner.address | RelatedPerson.address", description="Multiple Resources: \r\n\r\n* [Patient](patient.html): A server defined search that may match any of the string fields in the Address, including line, city, district, state, country, postalCode, and/or text\r\n* [Person](person.html): A server defined search that may match any of the string fields in the Address, including line, city, district, state, country, postalCode, and/or text\r\n* [Practitioner](practitioner.html): A server defined search that may match any of the string fields in the Address, including line, city, district, state, country, postalCode, and/or text\r\n* [RelatedPerson](relatedperson.html): A server defined search that may match any of the string fields in the Address, including line, city, district, state, country, postalCode, and/or text\r\n", type="string" )
  public static final String SP_ADDRESS = "address";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>address</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [Patient](patient.html): A server defined search that may match any of the string fields in the Address, including line, city, district, state, country, postalCode, and/or text
* [Person](person.html): A server defined search that may match any of the string fields in the Address, including line, city, district, state, country, postalCode, and/or text
* [Practitioner](practitioner.html): A server defined search that may match any of the string fields in the Address, including line, city, district, state, country, postalCode, and/or text
* [RelatedPerson](relatedperson.html): A server defined search that may match any of the string fields in the Address, including line, city, district, state, country, postalCode, and/or text
</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Patient.address | Person.address | Practitioner.address | RelatedPerson.address</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam ADDRESS = new ca.uhn.fhir.rest.gclient.StringClientParam(SP_ADDRESS);

 /**
   * Search parameter: <b>email</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [Patient](patient.html): A value in an email contact
* [Person](person.html): A value in an email contact
* [Practitioner](practitioner.html): A value in an email contact
* [PractitionerRole](practitionerrole.html): A value in an email contact
* [RelatedPerson](relatedperson.html): A value in an email contact
</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Patient.telecom.where(system='email') | Person.telecom.where(system='email') | Practitioner.telecom.where(system='email') | PractitionerRole.contact.telecom.where(system='email') | RelatedPerson.telecom.where(system='email')</b><br>
   * </p>
   */
  @SearchParamDefinition(name="email", path="Patient.telecom.where(system='email') | Person.telecom.where(system='email') | Practitioner.telecom.where(system='email') | PractitionerRole.contact.telecom.where(system='email') | RelatedPerson.telecom.where(system='email')", description="Multiple Resources: \r\n\r\n* [Patient](patient.html): A value in an email contact\r\n* [Person](person.html): A value in an email contact\r\n* [Practitioner](practitioner.html): A value in an email contact\r\n* [PractitionerRole](practitionerrole.html): A value in an email contact\r\n* [RelatedPerson](relatedperson.html): A value in an email contact\r\n", type="token" )
  public static final String SP_EMAIL = "email";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>email</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [Patient](patient.html): A value in an email contact
* [Person](person.html): A value in an email contact
* [Practitioner](practitioner.html): A value in an email contact
* [PractitionerRole](practitionerrole.html): A value in an email contact
* [RelatedPerson](relatedperson.html): A value in an email contact
</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Patient.telecom.where(system='email') | Person.telecom.where(system='email') | Practitioner.telecom.where(system='email') | PractitionerRole.contact.telecom.where(system='email') | RelatedPerson.telecom.where(system='email')</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam EMAIL = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_EMAIL);

 /**
   * Search parameter: <b>family</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [Patient](patient.html): A portion of the family name of the patient
* [Practitioner](practitioner.html): A portion of the family name
</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Patient.name.family | Practitioner.name.family</b><br>
   * </p>
   */
  @SearchParamDefinition(name="family", path="Patient.name.family | Practitioner.name.family", description="Multiple Resources: \r\n\r\n* [Patient](patient.html): A portion of the family name of the patient\r\n* [Practitioner](practitioner.html): A portion of the family name\r\n", type="string" )
  public static final String SP_FAMILY = "family";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>family</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [Patient](patient.html): A portion of the family name of the patient
* [Practitioner](practitioner.html): A portion of the family name
</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Patient.name.family | Practitioner.name.family</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam FAMILY = new ca.uhn.fhir.rest.gclient.StringClientParam(SP_FAMILY);

 /**
   * Search parameter: <b>gender</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [Patient](patient.html): Gender of the patient
* [Person](person.html): The gender of the person
* [Practitioner](practitioner.html): Gender of the practitioner
* [RelatedPerson](relatedperson.html): Gender of the related person
</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Patient.gender | Person.gender | Practitioner.gender | RelatedPerson.gender</b><br>
   * </p>
   */
  @SearchParamDefinition(name="gender", path="Patient.gender | Person.gender | Practitioner.gender | RelatedPerson.gender", description="Multiple Resources: \r\n\r\n* [Patient](patient.html): Gender of the patient\r\n* [Person](person.html): The gender of the person\r\n* [Practitioner](practitioner.html): Gender of the practitioner\r\n* [RelatedPerson](relatedperson.html): Gender of the related person\r\n", type="token" )
  public static final String SP_GENDER = "gender";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>gender</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [Patient](patient.html): Gender of the patient
* [Person](person.html): The gender of the person
* [Practitioner](practitioner.html): Gender of the practitioner
* [RelatedPerson](relatedperson.html): Gender of the related person
</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Patient.gender | Person.gender | Practitioner.gender | RelatedPerson.gender</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam GENDER = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_GENDER);

 /**
   * Search parameter: <b>given</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [Patient](patient.html): A portion of the given name of the patient
* [Practitioner](practitioner.html): A portion of the given name
</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Patient.name.given | Practitioner.name.given</b><br>
   * </p>
   */
  @SearchParamDefinition(name="given", path="Patient.name.given | Practitioner.name.given", description="Multiple Resources: \r\n\r\n* [Patient](patient.html): A portion of the given name of the patient\r\n* [Practitioner](practitioner.html): A portion of the given name\r\n", type="string" )
  public static final String SP_GIVEN = "given";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>given</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [Patient](patient.html): A portion of the given name of the patient
* [Practitioner](practitioner.html): A portion of the given name
</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Patient.name.given | Practitioner.name.given</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam GIVEN = new ca.uhn.fhir.rest.gclient.StringClientParam(SP_GIVEN);

 /**
   * Search parameter: <b>phone</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [Patient](patient.html): A value in a phone contact
* [Person](person.html): A value in a phone contact
* [Practitioner](practitioner.html): A value in a phone contact
* [PractitionerRole](practitionerrole.html): A value in a phone contact
* [RelatedPerson](relatedperson.html): A value in a phone contact
</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Patient.telecom.where(system='phone') | Person.telecom.where(system='phone') | Practitioner.telecom.where(system='phone') | PractitionerRole.contact.telecom.where(system='phone') | RelatedPerson.telecom.where(system='phone')</b><br>
   * </p>
   */
  @SearchParamDefinition(name="phone", path="Patient.telecom.where(system='phone') | Person.telecom.where(system='phone') | Practitioner.telecom.where(system='phone') | PractitionerRole.contact.telecom.where(system='phone') | RelatedPerson.telecom.where(system='phone')", description="Multiple Resources: \r\n\r\n* [Patient](patient.html): A value in a phone contact\r\n* [Person](person.html): A value in a phone contact\r\n* [Practitioner](practitioner.html): A value in a phone contact\r\n* [PractitionerRole](practitionerrole.html): A value in a phone contact\r\n* [RelatedPerson](relatedperson.html): A value in a phone contact\r\n", type="token" )
  public static final String SP_PHONE = "phone";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>phone</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [Patient](patient.html): A value in a phone contact
* [Person](person.html): A value in a phone contact
* [Practitioner](practitioner.html): A value in a phone contact
* [PractitionerRole](practitionerrole.html): A value in a phone contact
* [RelatedPerson](relatedperson.html): A value in a phone contact
</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Patient.telecom.where(system='phone') | Person.telecom.where(system='phone') | Practitioner.telecom.where(system='phone') | PractitionerRole.contact.telecom.where(system='phone') | RelatedPerson.telecom.where(system='phone')</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam PHONE = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_PHONE);

 /**
   * Search parameter: <b>phonetic</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [Patient](patient.html): A portion of either family or given name using some kind of phonetic matching algorithm
* [Person](person.html): A portion of name using some kind of phonetic matching algorithm
* [Practitioner](practitioner.html): A portion of either family or given name using some kind of phonetic matching algorithm
* [RelatedPerson](relatedperson.html): A portion of name using some kind of phonetic matching algorithm
</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Patient.name | Person.name | Practitioner.name | RelatedPerson.name</b><br>
   * </p>
   */
  @SearchParamDefinition(name="phonetic", path="Patient.name | Person.name | Practitioner.name | RelatedPerson.name", description="Multiple Resources: \r\n\r\n* [Patient](patient.html): A portion of either family or given name using some kind of phonetic matching algorithm\r\n* [Person](person.html): A portion of name using some kind of phonetic matching algorithm\r\n* [Practitioner](practitioner.html): A portion of either family or given name using some kind of phonetic matching algorithm\r\n* [RelatedPerson](relatedperson.html): A portion of name using some kind of phonetic matching algorithm\r\n", type="string" )
  public static final String SP_PHONETIC = "phonetic";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>phonetic</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [Patient](patient.html): A portion of either family or given name using some kind of phonetic matching algorithm
* [Person](person.html): A portion of name using some kind of phonetic matching algorithm
* [Practitioner](practitioner.html): A portion of either family or given name using some kind of phonetic matching algorithm
* [RelatedPerson](relatedperson.html): A portion of name using some kind of phonetic matching algorithm
</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Patient.name | Person.name | Practitioner.name | RelatedPerson.name</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam PHONETIC = new ca.uhn.fhir.rest.gclient.StringClientParam(SP_PHONETIC);

 /**
   * Search parameter: <b>telecom</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [Patient](patient.html): The value in any kind of telecom details of the patient
* [Person](person.html): The value in any kind of contact
* [Practitioner](practitioner.html): The value in any kind of contact
* [PractitionerRole](practitionerrole.html): The value in any kind of contact
* [RelatedPerson](relatedperson.html): The value in any kind of contact
</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Patient.telecom | Person.telecom | Practitioner.telecom | PractitionerRole.contact.telecom | RelatedPerson.telecom</b><br>
   * </p>
   */
  @SearchParamDefinition(name="telecom", path="Patient.telecom | Person.telecom | Practitioner.telecom | PractitionerRole.contact.telecom | RelatedPerson.telecom", description="Multiple Resources: \r\n\r\n* [Patient](patient.html): The value in any kind of telecom details of the patient\r\n* [Person](person.html): The value in any kind of contact\r\n* [Practitioner](practitioner.html): The value in any kind of contact\r\n* [PractitionerRole](practitionerrole.html): The value in any kind of contact\r\n* [RelatedPerson](relatedperson.html): The value in any kind of contact\r\n", type="token" )
  public static final String SP_TELECOM = "telecom";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>telecom</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [Patient](patient.html): The value in any kind of telecom details of the patient
* [Person](person.html): The value in any kind of contact
* [Practitioner](practitioner.html): The value in any kind of contact
* [PractitionerRole](practitionerrole.html): The value in any kind of contact
* [RelatedPerson](relatedperson.html): The value in any kind of contact
</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Patient.telecom | Person.telecom | Practitioner.telecom | PractitionerRole.contact.telecom | RelatedPerson.telecom</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam TELECOM = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_TELECOM);


}

