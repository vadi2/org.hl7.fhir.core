package org.hl7.fhir.dstu3.model;



/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/

// Generated on Fri, Mar 16, 2018 15:21+1100 for FHIR v3.0.x
import java.util.List;

import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.exceptions.FHIRFormatError;
import org.hl7.fhir.instance.model.api.ICompositeType;

import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.DatatypeDef;
import ca.uhn.fhir.model.api.annotation.Description;
/**
 * Specifies clinical/business/etc metadata that can be used to retrieve, index and/or categorize an artifact. This metadata can either be specific to the applicable population (e.g., age category, DRG) or the specific context of care (e.g., venue, care setting, provider of care).
 */
@DatatypeDef(name="UsageContext")
public class UsageContext extends Type implements ICompositeType {

    /**
     * A code that identifies the type of context being specified by this usage context.
     */
    @Child(name = "code", type = {Coding.class}, order=0, min=1, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Type of context being specified", formalDefinition="A code that identifies the type of context being specified by this usage context." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/usage-context-type")
    protected Coding code;

    /**
     * A value that defines the context specified in this context of use. The interpretation of the value is defined by the code.
     */
    @Child(name = "value", type = {CodeableConcept.class, Quantity.class, Range.class}, order=1, min=1, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Value that defines the context", formalDefinition="A value that defines the context specified in this context of use. The interpretation of the value is defined by the code." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/use-context")
    protected Type value;

    private static final long serialVersionUID = -1092486508L;

  /**
   * Constructor
   */
    public UsageContext() {
      super();
    }

  /**
   * Constructor
   */
    public UsageContext(Coding code, Type value) {
      super();
      this.code = code;
      this.value = value;
    }

    /**
     * @return {@link #code} (A code that identifies the type of context being specified by this usage context.)
     */
    public Coding getCode() { 
      if (this.code == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create UsageContext.code");
        else if (Configuration.doAutoCreate())
          this.code = new Coding(); // cc
      return this.code;
    }

    public boolean hasCode() { 
      return this.code != null && !this.code.isEmpty();
    }

    /**
     * @param value {@link #code} (A code that identifies the type of context being specified by this usage context.)
     */
    public UsageContext setCode(Coding value)  { 
      this.code = value;
      return this;
    }

    /**
     * @return {@link #value} (A value that defines the context specified in this context of use. The interpretation of the value is defined by the code.)
     */
    public Type getValue() { 
      return this.value;
    }

    /**
     * @return {@link #value} (A value that defines the context specified in this context of use. The interpretation of the value is defined by the code.)
     */
    public CodeableConcept getValueCodeableConcept() throws FHIRException { 
      if (this.value == null)
        return null;
      if (!(this.value instanceof CodeableConcept))
        throw new FHIRException("Type mismatch: the type CodeableConcept was expected, but "+this.value.getClass().getName()+" was encountered");
      return (CodeableConcept) this.value;
    }

    public boolean hasValueCodeableConcept() {
        return this.value instanceof CodeableConcept;
    }

    /**
     * @return {@link #value} (A value that defines the context specified in this context of use. The interpretation of the value is defined by the code.)
     */
    public Quantity getValueQuantity() throws FHIRException { 
      if (this.value == null)
        return null;
      if (!(this.value instanceof Quantity))
        throw new FHIRException("Type mismatch: the type Quantity was expected, but "+this.value.getClass().getName()+" was encountered");
      return (Quantity) this.value;
    }

    public boolean hasValueQuantity() {
        return this.value instanceof Quantity;
    }

    /**
     * @return {@link #value} (A value that defines the context specified in this context of use. The interpretation of the value is defined by the code.)
     */
    public Range getValueRange() throws FHIRException { 
      if (this.value == null)
        return null;
      if (!(this.value instanceof Range))
        throw new FHIRException("Type mismatch: the type Range was expected, but "+this.value.getClass().getName()+" was encountered");
      return (Range) this.value;
    }

    public boolean hasValueRange() {
        return this.value instanceof Range;
    }

    public boolean hasValue() { 
      return this.value != null && !this.value.isEmpty();
    }

    /**
     * @param value {@link #value} (A value that defines the context specified in this context of use. The interpretation of the value is defined by the code.)
     */
    public UsageContext setValue(Type value) throws FHIRFormatError { 
      if (value != null && !(value instanceof CodeableConcept || value instanceof Quantity || value instanceof Range))
        throw new FHIRFormatError("Not the right type for UsageContext.value[x]: "+value.fhirType());
      this.value = value;
      return this;
    }

      protected void listChildren(List<Property> children) {
        super.listChildren(children);
        children.add(new Property("code", "Coding", "A code that identifies the type of context being specified by this usage context.", 0, 1, code));
        children.add(new Property("value[x]", "CodeableConcept|Quantity|Range", "A value that defines the context specified in this context of use. The interpretation of the value is defined by the code.", 0, 1, value));
      }

      @Override
      public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
        switch (_hash) {
        case 3059181: /*code*/  return new Property("code", "Coding", "A code that identifies the type of context being specified by this usage context.", 0, 1, code);
        case -1410166417: /*value[x]*/  return new Property("value[x]", "CodeableConcept|Quantity|Range", "A value that defines the context specified in this context of use. The interpretation of the value is defined by the code.", 0, 1, value);
        case 111972721: /*value*/  return new Property("value[x]", "CodeableConcept|Quantity|Range", "A value that defines the context specified in this context of use. The interpretation of the value is defined by the code.", 0, 1, value);
        case 924902896: /*valueCodeableConcept*/  return new Property("value[x]", "CodeableConcept|Quantity|Range", "A value that defines the context specified in this context of use. The interpretation of the value is defined by the code.", 0, 1, value);
        case -2029823716: /*valueQuantity*/  return new Property("value[x]", "CodeableConcept|Quantity|Range", "A value that defines the context specified in this context of use. The interpretation of the value is defined by the code.", 0, 1, value);
        case 2030761548: /*valueRange*/  return new Property("value[x]", "CodeableConcept|Quantity|Range", "A value that defines the context specified in this context of use. The interpretation of the value is defined by the code.", 0, 1, value);
        default: return super.getNamedProperty(_hash, _name, _checkValid);
        }

      }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3059181: /*code*/ return this.code == null ? new Base[0] : new Base[] {this.code}; // Coding
        case 111972721: /*value*/ return this.value == null ? new Base[0] : new Base[] {this.value}; // Type
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3059181: // code
          this.code = castToCoding(value); // Coding
          return value;
        case 111972721: // value
          this.value = castToType(value); // Type
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("code")) {
          this.code = castToCoding(value); // Coding
        } else if (name.equals("value[x]")) {
          this.value = castToType(value); // Type
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3059181:  return getCode(); 
        case -1410166417:  return getValue(); 
        case 111972721:  return getValue(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3059181: /*code*/ return new String[] {"Coding"};
        case 111972721: /*value*/ return new String[] {"CodeableConcept", "Quantity", "Range"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("code")) {
          this.code = new Coding();
          return this.code;
        }
        else if (name.equals("valueCodeableConcept")) {
          this.value = new CodeableConcept();
          return this.value;
        }
        else if (name.equals("valueQuantity")) {
          this.value = new Quantity();
          return this.value;
        }
        else if (name.equals("valueRange")) {
          this.value = new Range();
          return this.value;
        }
        else
          return super.addChild(name);
      }

  public String fhirType() {
    return "UsageContext";

  }

      public UsageContext copy() {
        UsageContext dst = new UsageContext();
        copyValues(dst);
        dst.code = code == null ? null : code.copy();
        dst.value = value == null ? null : value.copy();
        return dst;
      }

      protected UsageContext typedCopy() {
        return copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof UsageContext))
          return false;
        UsageContext o = (UsageContext) other_;
        return compareDeep(code, o.code, true) && compareDeep(value, o.value, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof UsageContext))
          return false;
        UsageContext o = (UsageContext) other_;
        return true;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(code, value);
      }


}