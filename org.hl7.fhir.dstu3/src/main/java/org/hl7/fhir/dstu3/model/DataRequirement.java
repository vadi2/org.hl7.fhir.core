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
import java.util.ArrayList;
import java.util.List;

import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.exceptions.FHIRFormatError;
import org.hl7.fhir.instance.model.api.IBaseDatatypeElement;
import org.hl7.fhir.instance.model.api.ICompositeType;

import ca.uhn.fhir.model.api.annotation.Block;
import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.DatatypeDef;
import ca.uhn.fhir.model.api.annotation.Description;
/**
 * Describes a required data item for evaluation in terms of the type of data, and optional code or date-based filters of the data.
 */
@DatatypeDef(name="DataRequirement")
public class DataRequirement extends Type implements ICompositeType {

    @Block()
    public static class DataRequirementCodeFilterComponent extends Element implements IBaseDatatypeElement {
        /**
         * The code-valued attribute of the filter. The specified path must be resolvable from the type of the required data. The path is allowed to contain qualifiers (.) to traverse sub-elements, as well as indexers ([x]) to traverse multiple-cardinality sub-elements. Note that the index must be an integer constant. The path must resolve to an element of type code, Coding, or CodeableConcept.
         */
        @Child(name = "path", type = {StringType.class}, order=1, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="The code-valued attribute of the filter", formalDefinition="The code-valued attribute of the filter. The specified path must be resolvable from the type of the required data. The path is allowed to contain qualifiers (.) to traverse sub-elements, as well as indexers ([x]) to traverse multiple-cardinality sub-elements. Note that the index must be an integer constant. The path must resolve to an element of type code, Coding, or CodeableConcept." )
        protected StringType path;

        /**
         * The valueset for the code filter. The valueSet and value elements are exclusive. If valueSet is specified, the filter will return only those data items for which the value of the code-valued element specified in the path is a member of the specified valueset.
         */
        @Child(name = "valueSet", type = {StringType.class, ValueSet.class}, order=2, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Valueset for the filter", formalDefinition="The valueset for the code filter. The valueSet and value elements are exclusive. If valueSet is specified, the filter will return only those data items for which the value of the code-valued element specified in the path is a member of the specified valueset." )
        protected Type valueSet;

        /**
         * The codes for the code filter. Only one of valueSet, valueCode, valueCoding, or valueCodeableConcept may be specified. If values are given, the filter will return only those data items for which the code-valued attribute specified by the path has a value that is one of the specified codes.
         */
        @Child(name = "valueCode", type = {CodeType.class}, order=3, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
        @Description(shortDefinition="What code is expected", formalDefinition="The codes for the code filter. Only one of valueSet, valueCode, valueCoding, or valueCodeableConcept may be specified. If values are given, the filter will return only those data items for which the code-valued attribute specified by the path has a value that is one of the specified codes." )
        protected List<CodeType> valueCode;

        /**
         * The Codings for the code filter. Only one of valueSet, valueCode, valueConding, or valueCodeableConcept may be specified. If values are given, the filter will return only those data items for which the code-valued attribute specified by the path has a value that is one of the specified Codings.
         */
        @Child(name = "valueCoding", type = {Coding.class}, order=4, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
        @Description(shortDefinition="What Coding is expected", formalDefinition="The Codings for the code filter. Only one of valueSet, valueCode, valueConding, or valueCodeableConcept may be specified. If values are given, the filter will return only those data items for which the code-valued attribute specified by the path has a value that is one of the specified Codings." )
        protected List<Coding> valueCoding;

        /**
         * The CodeableConcepts for the code filter. Only one of valueSet, valueCode, valueConding, or valueCodeableConcept may be specified. If values are given, the filter will return only those data items for which the code-valued attribute specified by the path has a value that is one of the specified CodeableConcepts.
         */
        @Child(name = "valueCodeableConcept", type = {CodeableConcept.class}, order=5, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
        @Description(shortDefinition="What CodeableConcept is expected", formalDefinition="The CodeableConcepts for the code filter. Only one of valueSet, valueCode, valueConding, or valueCodeableConcept may be specified. If values are given, the filter will return only those data items for which the code-valued attribute specified by the path has a value that is one of the specified CodeableConcepts." )
        protected List<CodeableConcept> valueCodeableConcept;

        private static final long serialVersionUID = -888422840L;

    /**
     * Constructor
     */
      public DataRequirementCodeFilterComponent() {
        super();
      }

    /**
     * Constructor
     */
      public DataRequirementCodeFilterComponent(StringType path) {
        super();
        this.path = path;
      }

        /**
         * @return {@link #path} (The code-valued attribute of the filter. The specified path must be resolvable from the type of the required data. The path is allowed to contain qualifiers (.) to traverse sub-elements, as well as indexers ([x]) to traverse multiple-cardinality sub-elements. Note that the index must be an integer constant. The path must resolve to an element of type code, Coding, or CodeableConcept.). This is the underlying object with id, value and extensions. The accessor "getPath" gives direct access to the value
         */
        public StringType getPathElement() { 
          if (this.path == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create DataRequirementCodeFilterComponent.path");
            else if (Configuration.doAutoCreate())
              this.path = new StringType(); // bb
          return this.path;
        }

        public boolean hasPathElement() { 
          return this.path != null && !this.path.isEmpty();
        }

        public boolean hasPath() { 
          return this.path != null && !this.path.isEmpty();
        }

        /**
         * @param value {@link #path} (The code-valued attribute of the filter. The specified path must be resolvable from the type of the required data. The path is allowed to contain qualifiers (.) to traverse sub-elements, as well as indexers ([x]) to traverse multiple-cardinality sub-elements. Note that the index must be an integer constant. The path must resolve to an element of type code, Coding, or CodeableConcept.). This is the underlying object with id, value and extensions. The accessor "getPath" gives direct access to the value
         */
        public DataRequirementCodeFilterComponent setPathElement(StringType value) { 
          this.path = value;
          return this;
        }

        /**
         * @return The code-valued attribute of the filter. The specified path must be resolvable from the type of the required data. The path is allowed to contain qualifiers (.) to traverse sub-elements, as well as indexers ([x]) to traverse multiple-cardinality sub-elements. Note that the index must be an integer constant. The path must resolve to an element of type code, Coding, or CodeableConcept.
         */
        public String getPath() { 
          return this.path == null ? null : this.path.getValue();
        }

        /**
         * @param value The code-valued attribute of the filter. The specified path must be resolvable from the type of the required data. The path is allowed to contain qualifiers (.) to traverse sub-elements, as well as indexers ([x]) to traverse multiple-cardinality sub-elements. Note that the index must be an integer constant. The path must resolve to an element of type code, Coding, or CodeableConcept.
         */
        public DataRequirementCodeFilterComponent setPath(String value) { 
            if (this.path == null)
              this.path = new StringType();
            this.path.setValue(value);
          return this;
        }

        /**
         * @return {@link #valueSet} (The valueset for the code filter. The valueSet and value elements are exclusive. If valueSet is specified, the filter will return only those data items for which the value of the code-valued element specified in the path is a member of the specified valueset.)
         */
        public Type getValueSet() { 
          return this.valueSet;
        }

        /**
         * @return {@link #valueSet} (The valueset for the code filter. The valueSet and value elements are exclusive. If valueSet is specified, the filter will return only those data items for which the value of the code-valued element specified in the path is a member of the specified valueset.)
         */
        public StringType getValueSetStringType() throws FHIRException { 
          if (this.valueSet == null)
            return null;
          if (!(this.valueSet instanceof StringType))
            throw new FHIRException("Type mismatch: the type StringType was expected, but "+this.valueSet.getClass().getName()+" was encountered");
          return (StringType) this.valueSet;
        }

        public boolean hasValueSetStringType() {
          return this.valueSet instanceof StringType;
        }

        /**
         * @return {@link #valueSet} (The valueset for the code filter. The valueSet and value elements are exclusive. If valueSet is specified, the filter will return only those data items for which the value of the code-valued element specified in the path is a member of the specified valueset.)
         */
        public Reference getValueSetReference() throws FHIRException { 
          if (this.valueSet == null)
            return null;
          if (!(this.valueSet instanceof Reference))
            throw new FHIRException("Type mismatch: the type Reference was expected, but "+this.valueSet.getClass().getName()+" was encountered");
          return (Reference) this.valueSet;
        }

        public boolean hasValueSetReference() {
          return this.valueSet instanceof Reference;
        }

        public boolean hasValueSet() { 
          return this.valueSet != null && !this.valueSet.isEmpty();
        }

        /**
         * @param value {@link #valueSet} (The valueset for the code filter. The valueSet and value elements are exclusive. If valueSet is specified, the filter will return only those data items for which the value of the code-valued element specified in the path is a member of the specified valueset.)
         */
        public DataRequirementCodeFilterComponent setValueSet(Type value) throws FHIRFormatError { 
          if (value != null && !(value instanceof StringType || value instanceof Reference))
            throw new FHIRFormatError("Not the right type for DataRequirement.codeFilter.valueSet[x]: "+value.fhirType());
          this.valueSet = value;
          return this;
        }

        /**
         * @return {@link #valueCode} (The codes for the code filter. Only one of valueSet, valueCode, valueCoding, or valueCodeableConcept may be specified. If values are given, the filter will return only those data items for which the code-valued attribute specified by the path has a value that is one of the specified codes.)
         */
        public List<CodeType> getValueCode() { 
          if (this.valueCode == null)
            this.valueCode = new ArrayList<CodeType>();
          return this.valueCode;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public DataRequirementCodeFilterComponent setValueCode(List<CodeType> theValueCode) { 
          this.valueCode = theValueCode;
          return this;
        }

        public boolean hasValueCode() { 
          if (this.valueCode == null)
            return false;
          for (CodeType item : this.valueCode)
            if (!item.isEmpty())
              return true;
          return false;
        }

        /**
         * @return {@link #valueCode} (The codes for the code filter. Only one of valueSet, valueCode, valueCoding, or valueCodeableConcept may be specified. If values are given, the filter will return only those data items for which the code-valued attribute specified by the path has a value that is one of the specified codes.)
         */
        public CodeType addValueCodeElement() {//2 
          CodeType t = new CodeType();
          if (this.valueCode == null)
            this.valueCode = new ArrayList<CodeType>();
          this.valueCode.add(t);
          return t;
        }

        /**
         * @param value {@link #valueCode} (The codes for the code filter. Only one of valueSet, valueCode, valueCoding, or valueCodeableConcept may be specified. If values are given, the filter will return only those data items for which the code-valued attribute specified by the path has a value that is one of the specified codes.)
         */
        public DataRequirementCodeFilterComponent addValueCode(String value) { //1
          CodeType t = new CodeType();
          t.setValue(value);
          if (this.valueCode == null)
            this.valueCode = new ArrayList<CodeType>();
          this.valueCode.add(t);
          return this;
        }

        /**
         * @param value {@link #valueCode} (The codes for the code filter. Only one of valueSet, valueCode, valueCoding, or valueCodeableConcept may be specified. If values are given, the filter will return only those data items for which the code-valued attribute specified by the path has a value that is one of the specified codes.)
         */
        public boolean hasValueCode(String value) { 
          if (this.valueCode == null)
            return false;
          for (CodeType v : this.valueCode)
            if (v.getValue().equals(value)) // code
              return true;
          return false;
        }

        /**
         * @return {@link #valueCoding} (The Codings for the code filter. Only one of valueSet, valueCode, valueConding, or valueCodeableConcept may be specified. If values are given, the filter will return only those data items for which the code-valued attribute specified by the path has a value that is one of the specified Codings.)
         */
        public List<Coding> getValueCoding() { 
          if (this.valueCoding == null)
            this.valueCoding = new ArrayList<Coding>();
          return this.valueCoding;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public DataRequirementCodeFilterComponent setValueCoding(List<Coding> theValueCoding) { 
          this.valueCoding = theValueCoding;
          return this;
        }

        public boolean hasValueCoding() { 
          if (this.valueCoding == null)
            return false;
          for (Coding item : this.valueCoding)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public Coding addValueCoding() { //3
          Coding t = new Coding();
          if (this.valueCoding == null)
            this.valueCoding = new ArrayList<Coding>();
          this.valueCoding.add(t);
          return t;
        }

        public DataRequirementCodeFilterComponent addValueCoding(Coding t) { //3
          if (t == null)
            return this;
          if (this.valueCoding == null)
            this.valueCoding = new ArrayList<Coding>();
          this.valueCoding.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #valueCoding}, creating it if it does not already exist
         */
        public Coding getValueCodingFirstRep() { 
          if (getValueCoding().isEmpty()) {
            addValueCoding();
          }
          return getValueCoding().get(0);
        }

        /**
         * @return {@link #valueCodeableConcept} (The CodeableConcepts for the code filter. Only one of valueSet, valueCode, valueConding, or valueCodeableConcept may be specified. If values are given, the filter will return only those data items for which the code-valued attribute specified by the path has a value that is one of the specified CodeableConcepts.)
         */
        public List<CodeableConcept> getValueCodeableConcept() { 
          if (this.valueCodeableConcept == null)
            this.valueCodeableConcept = new ArrayList<CodeableConcept>();
          return this.valueCodeableConcept;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public DataRequirementCodeFilterComponent setValueCodeableConcept(List<CodeableConcept> theValueCodeableConcept) { 
          this.valueCodeableConcept = theValueCodeableConcept;
          return this;
        }

        public boolean hasValueCodeableConcept() { 
          if (this.valueCodeableConcept == null)
            return false;
          for (CodeableConcept item : this.valueCodeableConcept)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public CodeableConcept addValueCodeableConcept() { //3
          CodeableConcept t = new CodeableConcept();
          if (this.valueCodeableConcept == null)
            this.valueCodeableConcept = new ArrayList<CodeableConcept>();
          this.valueCodeableConcept.add(t);
          return t;
        }

        public DataRequirementCodeFilterComponent addValueCodeableConcept(CodeableConcept t) { //3
          if (t == null)
            return this;
          if (this.valueCodeableConcept == null)
            this.valueCodeableConcept = new ArrayList<CodeableConcept>();
          this.valueCodeableConcept.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #valueCodeableConcept}, creating it if it does not already exist
         */
        public CodeableConcept getValueCodeableConceptFirstRep() { 
          if (getValueCodeableConcept().isEmpty()) {
            addValueCodeableConcept();
          }
          return getValueCodeableConcept().get(0);
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("path", "string", "The code-valued attribute of the filter. The specified path must be resolvable from the type of the required data. The path is allowed to contain qualifiers (.) to traverse sub-elements, as well as indexers ([x]) to traverse multiple-cardinality sub-elements. Note that the index must be an integer constant. The path must resolve to an element of type code, Coding, or CodeableConcept.", 0, 1, path));
          children.add(new Property("valueSet[x]", "string|Reference(ValueSet)", "The valueset for the code filter. The valueSet and value elements are exclusive. If valueSet is specified, the filter will return only those data items for which the value of the code-valued element specified in the path is a member of the specified valueset.", 0, 1, valueSet));
          children.add(new Property("valueCode", "code", "The codes for the code filter. Only one of valueSet, valueCode, valueCoding, or valueCodeableConcept may be specified. If values are given, the filter will return only those data items for which the code-valued attribute specified by the path has a value that is one of the specified codes.", 0, java.lang.Integer.MAX_VALUE, valueCode));
          children.add(new Property("valueCoding", "Coding", "The Codings for the code filter. Only one of valueSet, valueCode, valueConding, or valueCodeableConcept may be specified. If values are given, the filter will return only those data items for which the code-valued attribute specified by the path has a value that is one of the specified Codings.", 0, java.lang.Integer.MAX_VALUE, valueCoding));
          children.add(new Property("valueCodeableConcept", "CodeableConcept", "The CodeableConcepts for the code filter. Only one of valueSet, valueCode, valueConding, or valueCodeableConcept may be specified. If values are given, the filter will return only those data items for which the code-valued attribute specified by the path has a value that is one of the specified CodeableConcepts.", 0, java.lang.Integer.MAX_VALUE, valueCodeableConcept));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 3433509: /*path*/  return new Property("path", "string", "The code-valued attribute of the filter. The specified path must be resolvable from the type of the required data. The path is allowed to contain qualifiers (.) to traverse sub-elements, as well as indexers ([x]) to traverse multiple-cardinality sub-elements. Note that the index must be an integer constant. The path must resolve to an element of type code, Coding, or CodeableConcept.", 0, 1, path);
          case -1438410321: /*valueSet[x]*/  return new Property("valueSet[x]", "string|Reference(ValueSet)", "The valueset for the code filter. The valueSet and value elements are exclusive. If valueSet is specified, the filter will return only those data items for which the value of the code-valued element specified in the path is a member of the specified valueset.", 0, 1, valueSet);
          case -1410174671: /*valueSet*/  return new Property("valueSet[x]", "string|Reference(ValueSet)", "The valueset for the code filter. The valueSet and value elements are exclusive. If valueSet is specified, the filter will return only those data items for which the value of the code-valued element specified in the path is a member of the specified valueset.", 0, 1, valueSet);
          case -1025157982: /*valueSetString*/  return new Property("valueSet[x]", "string|Reference(ValueSet)", "The valueset for the code filter. The valueSet and value elements are exclusive. If valueSet is specified, the filter will return only those data items for which the value of the code-valued element specified in the path is a member of the specified valueset.", 0, 1, valueSet);
          case 295220506: /*valueSetReference*/  return new Property("valueSet[x]", "string|Reference(ValueSet)", "The valueset for the code filter. The valueSet and value elements are exclusive. If valueSet is specified, the filter will return only those data items for which the value of the code-valued element specified in the path is a member of the specified valueset.", 0, 1, valueSet);
          case -766209282: /*valueCode*/  return new Property("valueCode", "code", "The codes for the code filter. Only one of valueSet, valueCode, valueCoding, or valueCodeableConcept may be specified. If values are given, the filter will return only those data items for which the code-valued attribute specified by the path has a value that is one of the specified codes.", 0, java.lang.Integer.MAX_VALUE, valueCode);
          case -1887705029: /*valueCoding*/  return new Property("valueCoding", "Coding", "The Codings for the code filter. Only one of valueSet, valueCode, valueConding, or valueCodeableConcept may be specified. If values are given, the filter will return only those data items for which the code-valued attribute specified by the path has a value that is one of the specified Codings.", 0, java.lang.Integer.MAX_VALUE, valueCoding);
          case 924902896: /*valueCodeableConcept*/  return new Property("valueCodeableConcept", "CodeableConcept", "The CodeableConcepts for the code filter. Only one of valueSet, valueCode, valueConding, or valueCodeableConcept may be specified. If values are given, the filter will return only those data items for which the code-valued attribute specified by the path has a value that is one of the specified CodeableConcepts.", 0, java.lang.Integer.MAX_VALUE, valueCodeableConcept);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3433509: /*path*/ return this.path == null ? new Base[0] : new Base[] {this.path}; // StringType
        case -1410174671: /*valueSet*/ return this.valueSet == null ? new Base[0] : new Base[] {this.valueSet}; // Type
        case -766209282: /*valueCode*/ return this.valueCode == null ? new Base[0] : this.valueCode.toArray(new Base[this.valueCode.size()]); // CodeType
        case -1887705029: /*valueCoding*/ return this.valueCoding == null ? new Base[0] : this.valueCoding.toArray(new Base[this.valueCoding.size()]); // Coding
        case 924902896: /*valueCodeableConcept*/ return this.valueCodeableConcept == null ? new Base[0] : this.valueCodeableConcept.toArray(new Base[this.valueCodeableConcept.size()]); // CodeableConcept
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3433509: // path
          this.path = castToString(value); // StringType
          return value;
        case -1410174671: // valueSet
          this.valueSet = castToType(value); // Type
          return value;
        case -766209282: // valueCode
          this.getValueCode().add(castToCode(value)); // CodeType
          return value;
        case -1887705029: // valueCoding
          this.getValueCoding().add(castToCoding(value)); // Coding
          return value;
        case 924902896: // valueCodeableConcept
          this.getValueCodeableConcept().add(castToCodeableConcept(value)); // CodeableConcept
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("path")) {
          this.path = castToString(value); // StringType
        } else if (name.equals("valueSet[x]")) {
          this.valueSet = castToType(value); // Type
        } else if (name.equals("valueCode")) {
          this.getValueCode().add(castToCode(value));
        } else if (name.equals("valueCoding")) {
          this.getValueCoding().add(castToCoding(value));
        } else if (name.equals("valueCodeableConcept")) {
          this.getValueCodeableConcept().add(castToCodeableConcept(value));
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3433509:  return getPathElement();
        case -1438410321:  return getValueSet(); 
        case -1410174671:  return getValueSet(); 
        case -766209282:  return addValueCodeElement();
        case -1887705029:  return addValueCoding(); 
        case 924902896:  return addValueCodeableConcept(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3433509: /*path*/ return new String[] {"string"};
        case -1410174671: /*valueSet*/ return new String[] {"string", "Reference"};
        case -766209282: /*valueCode*/ return new String[] {"code"};
        case -1887705029: /*valueCoding*/ return new String[] {"Coding"};
        case 924902896: /*valueCodeableConcept*/ return new String[] {"CodeableConcept"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("path")) {
          throw new FHIRException("Cannot call addChild on a singleton property DataRequirement.path");
        }
        else if (name.equals("valueSetString")) {
          this.valueSet = new StringType();
          return this.valueSet;
        }
        else if (name.equals("valueSetReference")) {
          this.valueSet = new Reference();
          return this.valueSet;
        }
        else if (name.equals("valueCode")) {
          throw new FHIRException("Cannot call addChild on a singleton property DataRequirement.valueCode");
        }
        else if (name.equals("valueCoding")) {
          return addValueCoding();
        }
        else if (name.equals("valueCodeableConcept")) {
          return addValueCodeableConcept();
        }
        else
          return super.addChild(name);
      }

      public DataRequirementCodeFilterComponent copy() {
        DataRequirementCodeFilterComponent dst = new DataRequirementCodeFilterComponent();
        copyValues(dst);
        dst.path = path == null ? null : path.copy();
        dst.valueSet = valueSet == null ? null : valueSet.copy();
        if (valueCode != null) {
          dst.valueCode = new ArrayList<CodeType>();
          for (CodeType i : valueCode)
            dst.valueCode.add(i.copy());
        };
        if (valueCoding != null) {
          dst.valueCoding = new ArrayList<Coding>();
          for (Coding i : valueCoding)
            dst.valueCoding.add(i.copy());
        };
        if (valueCodeableConcept != null) {
          dst.valueCodeableConcept = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : valueCodeableConcept)
            dst.valueCodeableConcept.add(i.copy());
        };
        return dst;
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof DataRequirementCodeFilterComponent))
          return false;
        DataRequirementCodeFilterComponent o = (DataRequirementCodeFilterComponent) other_;
        return compareDeep(path, o.path, true) && compareDeep(valueSet, o.valueSet, true) && compareDeep(valueCode, o.valueCode, true)
           && compareDeep(valueCoding, o.valueCoding, true) && compareDeep(valueCodeableConcept, o.valueCodeableConcept, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof DataRequirementCodeFilterComponent))
          return false;
        DataRequirementCodeFilterComponent o = (DataRequirementCodeFilterComponent) other_;
        return compareValues(path, o.path, true) && compareValues(valueCode, o.valueCode, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(path, valueSet, valueCode
          , valueCoding, valueCodeableConcept);
      }

  public String fhirType() {
    return "DataRequirement.codeFilter";

  }

  }

    @Block()
    public static class DataRequirementDateFilterComponent extends Element implements IBaseDatatypeElement {
        /**
         * The date-valued attribute of the filter. The specified path must be resolvable from the type of the required data. The path is allowed to contain qualifiers (.) to traverse sub-elements, as well as indexers ([x]) to traverse multiple-cardinality sub-elements. Note that the index must be an integer constant. The path must resolve to an element of type dateTime, Period, Schedule, or Timing.
         */
        @Child(name = "path", type = {StringType.class}, order=1, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="The date-valued attribute of the filter", formalDefinition="The date-valued attribute of the filter. The specified path must be resolvable from the type of the required data. The path is allowed to contain qualifiers (.) to traverse sub-elements, as well as indexers ([x]) to traverse multiple-cardinality sub-elements. Note that the index must be an integer constant. The path must resolve to an element of type dateTime, Period, Schedule, or Timing." )
        protected StringType path;

        /**
         * The value of the filter. If period is specified, the filter will return only those data items that fall within the bounds determined by the Period, inclusive of the period boundaries. If dateTime is specified, the filter will return only those data items that are equal to the specified dateTime. If a Duration is specified, the filter will return only those data items that fall within Duration from now.
         */
        @Child(name = "value", type = {DateTimeType.class, Period.class, Duration.class}, order=2, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="The value of the filter, as a Period, DateTime, or Duration value", formalDefinition="The value of the filter. If period is specified, the filter will return only those data items that fall within the bounds determined by the Period, inclusive of the period boundaries. If dateTime is specified, the filter will return only those data items that are equal to the specified dateTime. If a Duration is specified, the filter will return only those data items that fall within Duration from now." )
        protected Type value;

        private static final long serialVersionUID = 1791957163L;

    /**
     * Constructor
     */
      public DataRequirementDateFilterComponent() {
        super();
      }

    /**
     * Constructor
     */
      public DataRequirementDateFilterComponent(StringType path) {
        super();
        this.path = path;
      }

        /**
         * @return {@link #path} (The date-valued attribute of the filter. The specified path must be resolvable from the type of the required data. The path is allowed to contain qualifiers (.) to traverse sub-elements, as well as indexers ([x]) to traverse multiple-cardinality sub-elements. Note that the index must be an integer constant. The path must resolve to an element of type dateTime, Period, Schedule, or Timing.). This is the underlying object with id, value and extensions. The accessor "getPath" gives direct access to the value
         */
        public StringType getPathElement() { 
          if (this.path == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create DataRequirementDateFilterComponent.path");
            else if (Configuration.doAutoCreate())
              this.path = new StringType(); // bb
          return this.path;
        }

        public boolean hasPathElement() { 
          return this.path != null && !this.path.isEmpty();
        }

        public boolean hasPath() { 
          return this.path != null && !this.path.isEmpty();
        }

        /**
         * @param value {@link #path} (The date-valued attribute of the filter. The specified path must be resolvable from the type of the required data. The path is allowed to contain qualifiers (.) to traverse sub-elements, as well as indexers ([x]) to traverse multiple-cardinality sub-elements. Note that the index must be an integer constant. The path must resolve to an element of type dateTime, Period, Schedule, or Timing.). This is the underlying object with id, value and extensions. The accessor "getPath" gives direct access to the value
         */
        public DataRequirementDateFilterComponent setPathElement(StringType value) { 
          this.path = value;
          return this;
        }

        /**
         * @return The date-valued attribute of the filter. The specified path must be resolvable from the type of the required data. The path is allowed to contain qualifiers (.) to traverse sub-elements, as well as indexers ([x]) to traverse multiple-cardinality sub-elements. Note that the index must be an integer constant. The path must resolve to an element of type dateTime, Period, Schedule, or Timing.
         */
        public String getPath() { 
          return this.path == null ? null : this.path.getValue();
        }

        /**
         * @param value The date-valued attribute of the filter. The specified path must be resolvable from the type of the required data. The path is allowed to contain qualifiers (.) to traverse sub-elements, as well as indexers ([x]) to traverse multiple-cardinality sub-elements. Note that the index must be an integer constant. The path must resolve to an element of type dateTime, Period, Schedule, or Timing.
         */
        public DataRequirementDateFilterComponent setPath(String value) { 
            if (this.path == null)
              this.path = new StringType();
            this.path.setValue(value);
          return this;
        }

        /**
         * @return {@link #value} (The value of the filter. If period is specified, the filter will return only those data items that fall within the bounds determined by the Period, inclusive of the period boundaries. If dateTime is specified, the filter will return only those data items that are equal to the specified dateTime. If a Duration is specified, the filter will return only those data items that fall within Duration from now.)
         */
        public Type getValue() { 
          return this.value;
        }

        /**
         * @return {@link #value} (The value of the filter. If period is specified, the filter will return only those data items that fall within the bounds determined by the Period, inclusive of the period boundaries. If dateTime is specified, the filter will return only those data items that are equal to the specified dateTime. If a Duration is specified, the filter will return only those data items that fall within Duration from now.)
         */
        public DateTimeType getValueDateTimeType() throws FHIRException { 
          if (this.value == null)
            return null;
          if (!(this.value instanceof DateTimeType))
            throw new FHIRException("Type mismatch: the type DateTimeType was expected, but "+this.value.getClass().getName()+" was encountered");
          return (DateTimeType) this.value;
        }

        public boolean hasValueDateTimeType() {
          return this.value instanceof DateTimeType;
        }

        /**
         * @return {@link #value} (The value of the filter. If period is specified, the filter will return only those data items that fall within the bounds determined by the Period, inclusive of the period boundaries. If dateTime is specified, the filter will return only those data items that are equal to the specified dateTime. If a Duration is specified, the filter will return only those data items that fall within Duration from now.)
         */
        public Period getValuePeriod() throws FHIRException { 
          if (this.value == null)
            return null;
          if (!(this.value instanceof Period))
            throw new FHIRException("Type mismatch: the type Period was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Period) this.value;
        }

        public boolean hasValuePeriod() {
          return this.value instanceof Period;
        }

        /**
         * @return {@link #value} (The value of the filter. If period is specified, the filter will return only those data items that fall within the bounds determined by the Period, inclusive of the period boundaries. If dateTime is specified, the filter will return only those data items that are equal to the specified dateTime. If a Duration is specified, the filter will return only those data items that fall within Duration from now.)
         */
        public Duration getValueDuration() throws FHIRException { 
          if (this.value == null)
            return null;
          if (!(this.value instanceof Duration))
            throw new FHIRException("Type mismatch: the type Duration was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Duration) this.value;
        }

        public boolean hasValueDuration() {
          return this.value instanceof Duration;
        }

        public boolean hasValue() { 
          return this.value != null && !this.value.isEmpty();
        }

        /**
         * @param value {@link #value} (The value of the filter. If period is specified, the filter will return only those data items that fall within the bounds determined by the Period, inclusive of the period boundaries. If dateTime is specified, the filter will return only those data items that are equal to the specified dateTime. If a Duration is specified, the filter will return only those data items that fall within Duration from now.)
         */
        public DataRequirementDateFilterComponent setValue(Type value) throws FHIRFormatError { 
          if (value != null && !(value instanceof DateTimeType || value instanceof Period || value instanceof Duration))
            throw new FHIRFormatError("Not the right type for DataRequirement.dateFilter.value[x]: "+value.fhirType());
          this.value = value;
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("path", "string", "The date-valued attribute of the filter. The specified path must be resolvable from the type of the required data. The path is allowed to contain qualifiers (.) to traverse sub-elements, as well as indexers ([x]) to traverse multiple-cardinality sub-elements. Note that the index must be an integer constant. The path must resolve to an element of type dateTime, Period, Schedule, or Timing.", 0, 1, path));
          children.add(new Property("value[x]", "dateTime|Period|Duration", "The value of the filter. If period is specified, the filter will return only those data items that fall within the bounds determined by the Period, inclusive of the period boundaries. If dateTime is specified, the filter will return only those data items that are equal to the specified dateTime. If a Duration is specified, the filter will return only those data items that fall within Duration from now.", 0, 1, value));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 3433509: /*path*/  return new Property("path", "string", "The date-valued attribute of the filter. The specified path must be resolvable from the type of the required data. The path is allowed to contain qualifiers (.) to traverse sub-elements, as well as indexers ([x]) to traverse multiple-cardinality sub-elements. Note that the index must be an integer constant. The path must resolve to an element of type dateTime, Period, Schedule, or Timing.", 0, 1, path);
          case -1410166417: /*value[x]*/  return new Property("value[x]", "dateTime|Period|Duration", "The value of the filter. If period is specified, the filter will return only those data items that fall within the bounds determined by the Period, inclusive of the period boundaries. If dateTime is specified, the filter will return only those data items that are equal to the specified dateTime. If a Duration is specified, the filter will return only those data items that fall within Duration from now.", 0, 1, value);
          case 111972721: /*value*/  return new Property("value[x]", "dateTime|Period|Duration", "The value of the filter. If period is specified, the filter will return only those data items that fall within the bounds determined by the Period, inclusive of the period boundaries. If dateTime is specified, the filter will return only those data items that are equal to the specified dateTime. If a Duration is specified, the filter will return only those data items that fall within Duration from now.", 0, 1, value);
          case 1047929900: /*valueDateTime*/  return new Property("value[x]", "dateTime|Period|Duration", "The value of the filter. If period is specified, the filter will return only those data items that fall within the bounds determined by the Period, inclusive of the period boundaries. If dateTime is specified, the filter will return only those data items that are equal to the specified dateTime. If a Duration is specified, the filter will return only those data items that fall within Duration from now.", 0, 1, value);
          case -1524344174: /*valuePeriod*/  return new Property("value[x]", "dateTime|Period|Duration", "The value of the filter. If period is specified, the filter will return only those data items that fall within the bounds determined by the Period, inclusive of the period boundaries. If dateTime is specified, the filter will return only those data items that are equal to the specified dateTime. If a Duration is specified, the filter will return only those data items that fall within Duration from now.", 0, 1, value);
          case 1558135333: /*valueDuration*/  return new Property("value[x]", "dateTime|Period|Duration", "The value of the filter. If period is specified, the filter will return only those data items that fall within the bounds determined by the Period, inclusive of the period boundaries. If dateTime is specified, the filter will return only those data items that are equal to the specified dateTime. If a Duration is specified, the filter will return only those data items that fall within Duration from now.", 0, 1, value);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3433509: /*path*/ return this.path == null ? new Base[0] : new Base[] {this.path}; // StringType
        case 111972721: /*value*/ return this.value == null ? new Base[0] : new Base[] {this.value}; // Type
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3433509: // path
          this.path = castToString(value); // StringType
          return value;
        case 111972721: // value
          this.value = castToType(value); // Type
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("path")) {
          this.path = castToString(value); // StringType
        } else if (name.equals("value[x]")) {
          this.value = castToType(value); // Type
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3433509:  return getPathElement();
        case -1410166417:  return getValue(); 
        case 111972721:  return getValue(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3433509: /*path*/ return new String[] {"string"};
        case 111972721: /*value*/ return new String[] {"dateTime", "Period", "Duration"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("path")) {
          throw new FHIRException("Cannot call addChild on a singleton property DataRequirement.path");
        }
        else if (name.equals("valueDateTime")) {
          this.value = new DateTimeType();
          return this.value;
        }
        else if (name.equals("valuePeriod")) {
          this.value = new Period();
          return this.value;
        }
        else if (name.equals("valueDuration")) {
          this.value = new Duration();
          return this.value;
        }
        else
          return super.addChild(name);
      }

      public DataRequirementDateFilterComponent copy() {
        DataRequirementDateFilterComponent dst = new DataRequirementDateFilterComponent();
        copyValues(dst);
        dst.path = path == null ? null : path.copy();
        dst.value = value == null ? null : value.copy();
        return dst;
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof DataRequirementDateFilterComponent))
          return false;
        DataRequirementDateFilterComponent o = (DataRequirementDateFilterComponent) other_;
        return compareDeep(path, o.path, true) && compareDeep(value, o.value, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof DataRequirementDateFilterComponent))
          return false;
        DataRequirementDateFilterComponent o = (DataRequirementDateFilterComponent) other_;
        return compareValues(path, o.path, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(path, value);
      }

  public String fhirType() {
    return "DataRequirement.dateFilter";

  }

  }

    /**
     * The type of the required data, specified as the type name of a resource. For profiles, this value is set to the type of the base resource of the profile.
     */
    @Child(name = "type", type = {CodeType.class}, order=0, min=1, max=1, modifier=false, summary=true)
    @Description(shortDefinition="The type of the required data", formalDefinition="The type of the required data, specified as the type name of a resource. For profiles, this value is set to the type of the base resource of the profile." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/all-types")
    protected CodeType type;

    /**
     * The profile of the required data, specified as the uri of the profile definition.
     */
    @Child(name = "profile", type = {UriType.class}, order=1, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="The profile of the required data", formalDefinition="The profile of the required data, specified as the uri of the profile definition." )
    protected List<UriType> profile;

    /**
     * Indicates that specific elements of the type are referenced by the knowledge module and must be supported by the consumer in order to obtain an effective evaluation. This does not mean that a value is required for this element, only that the consuming system must understand the element and be able to provide values for it if they are available. Note that the value for this element can be a path to allow references to nested elements. In that case, all the elements along the path must be supported.
     */
    @Child(name = "mustSupport", type = {StringType.class}, order=2, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Indicates that specific structure elements are referenced by the knowledge module", formalDefinition="Indicates that specific elements of the type are referenced by the knowledge module and must be supported by the consumer in order to obtain an effective evaluation. This does not mean that a value is required for this element, only that the consuming system must understand the element and be able to provide values for it if they are available. Note that the value for this element can be a path to allow references to nested elements. In that case, all the elements along the path must be supported." )
    protected List<StringType> mustSupport;

    /**
     * Code filters specify additional constraints on the data, specifying the value set of interest for a particular element of the data.
     */
    @Child(name = "codeFilter", type = {}, order=3, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="What codes are expected", formalDefinition="Code filters specify additional constraints on the data, specifying the value set of interest for a particular element of the data." )
    protected List<DataRequirementCodeFilterComponent> codeFilter;

    /**
     * Date filters specify additional constraints on the data in terms of the applicable date range for specific elements.
     */
    @Child(name = "dateFilter", type = {}, order=4, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="What dates/date ranges are expected", formalDefinition="Date filters specify additional constraints on the data in terms of the applicable date range for specific elements." )
    protected List<DataRequirementDateFilterComponent> dateFilter;

    private static final long serialVersionUID = 274786645L;

  /**
   * Constructor
   */
    public DataRequirement() {
      super();
    }

  /**
   * Constructor
   */
    public DataRequirement(CodeType type) {
      super();
      this.type = type;
    }

    /**
     * @return {@link #type} (The type of the required data, specified as the type name of a resource. For profiles, this value is set to the type of the base resource of the profile.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
     */
    public CodeType getTypeElement() { 
      if (this.type == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create DataRequirement.type");
        else if (Configuration.doAutoCreate())
          this.type = new CodeType(); // bb
      return this.type;
    }

    public boolean hasTypeElement() { 
      return this.type != null && !this.type.isEmpty();
    }

    public boolean hasType() { 
      return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (The type of the required data, specified as the type name of a resource. For profiles, this value is set to the type of the base resource of the profile.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
     */
    public DataRequirement setTypeElement(CodeType value) { 
      this.type = value;
      return this;
    }

    /**
     * @return The type of the required data, specified as the type name of a resource. For profiles, this value is set to the type of the base resource of the profile.
     */
    public String getType() { 
      return this.type == null ? null : this.type.getValue();
    }

    /**
     * @param value The type of the required data, specified as the type name of a resource. For profiles, this value is set to the type of the base resource of the profile.
     */
    public DataRequirement setType(String value) { 
        if (this.type == null)
          this.type = new CodeType();
        this.type.setValue(value);
      return this;
    }

    /**
     * @return {@link #profile} (The profile of the required data, specified as the uri of the profile definition.)
     */
    public List<UriType> getProfile() { 
      if (this.profile == null)
        this.profile = new ArrayList<UriType>();
      return this.profile;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public DataRequirement setProfile(List<UriType> theProfile) { 
      this.profile = theProfile;
      return this;
    }

    public boolean hasProfile() { 
      if (this.profile == null)
        return false;
      for (UriType item : this.profile)
        if (!item.isEmpty())
          return true;
      return false;
    }

    /**
     * @return {@link #profile} (The profile of the required data, specified as the uri of the profile definition.)
     */
    public UriType addProfileElement() {//2 
      UriType t = new UriType();
      if (this.profile == null)
        this.profile = new ArrayList<UriType>();
      this.profile.add(t);
      return t;
    }

    /**
     * @param value {@link #profile} (The profile of the required data, specified as the uri of the profile definition.)
     */
    public DataRequirement addProfile(String value) { //1
      UriType t = new UriType();
      t.setValue(value);
      if (this.profile == null)
        this.profile = new ArrayList<UriType>();
      this.profile.add(t);
      return this;
    }

    /**
     * @param value {@link #profile} (The profile of the required data, specified as the uri of the profile definition.)
     */
    public boolean hasProfile(String value) { 
      if (this.profile == null)
        return false;
      for (UriType v : this.profile)
        if (v.getValue().equals(value)) // uri
          return true;
      return false;
    }

    /**
     * @return {@link #mustSupport} (Indicates that specific elements of the type are referenced by the knowledge module and must be supported by the consumer in order to obtain an effective evaluation. This does not mean that a value is required for this element, only that the consuming system must understand the element and be able to provide values for it if they are available. Note that the value for this element can be a path to allow references to nested elements. In that case, all the elements along the path must be supported.)
     */
    public List<StringType> getMustSupport() { 
      if (this.mustSupport == null)
        this.mustSupport = new ArrayList<StringType>();
      return this.mustSupport;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public DataRequirement setMustSupport(List<StringType> theMustSupport) { 
      this.mustSupport = theMustSupport;
      return this;
    }

    public boolean hasMustSupport() { 
      if (this.mustSupport == null)
        return false;
      for (StringType item : this.mustSupport)
        if (!item.isEmpty())
          return true;
      return false;
    }

    /**
     * @return {@link #mustSupport} (Indicates that specific elements of the type are referenced by the knowledge module and must be supported by the consumer in order to obtain an effective evaluation. This does not mean that a value is required for this element, only that the consuming system must understand the element and be able to provide values for it if they are available. Note that the value for this element can be a path to allow references to nested elements. In that case, all the elements along the path must be supported.)
     */
    public StringType addMustSupportElement() {//2 
      StringType t = new StringType();
      if (this.mustSupport == null)
        this.mustSupport = new ArrayList<StringType>();
      this.mustSupport.add(t);
      return t;
    }

    /**
     * @param value {@link #mustSupport} (Indicates that specific elements of the type are referenced by the knowledge module and must be supported by the consumer in order to obtain an effective evaluation. This does not mean that a value is required for this element, only that the consuming system must understand the element and be able to provide values for it if they are available. Note that the value for this element can be a path to allow references to nested elements. In that case, all the elements along the path must be supported.)
     */
    public DataRequirement addMustSupport(String value) { //1
      StringType t = new StringType();
      t.setValue(value);
      if (this.mustSupport == null)
        this.mustSupport = new ArrayList<StringType>();
      this.mustSupport.add(t);
      return this;
    }

    /**
     * @param value {@link #mustSupport} (Indicates that specific elements of the type are referenced by the knowledge module and must be supported by the consumer in order to obtain an effective evaluation. This does not mean that a value is required for this element, only that the consuming system must understand the element and be able to provide values for it if they are available. Note that the value for this element can be a path to allow references to nested elements. In that case, all the elements along the path must be supported.)
     */
    public boolean hasMustSupport(String value) { 
      if (this.mustSupport == null)
        return false;
      for (StringType v : this.mustSupport)
        if (v.getValue().equals(value)) // string
          return true;
      return false;
    }

    /**
     * @return {@link #codeFilter} (Code filters specify additional constraints on the data, specifying the value set of interest for a particular element of the data.)
     */
    public List<DataRequirementCodeFilterComponent> getCodeFilter() { 
      if (this.codeFilter == null)
        this.codeFilter = new ArrayList<DataRequirementCodeFilterComponent>();
      return this.codeFilter;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public DataRequirement setCodeFilter(List<DataRequirementCodeFilterComponent> theCodeFilter) { 
      this.codeFilter = theCodeFilter;
      return this;
    }

    public boolean hasCodeFilter() { 
      if (this.codeFilter == null)
        return false;
      for (DataRequirementCodeFilterComponent item : this.codeFilter)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public DataRequirementCodeFilterComponent addCodeFilter() { //3
      DataRequirementCodeFilterComponent t = new DataRequirementCodeFilterComponent();
      if (this.codeFilter == null)
        this.codeFilter = new ArrayList<DataRequirementCodeFilterComponent>();
      this.codeFilter.add(t);
      return t;
    }

    public DataRequirement addCodeFilter(DataRequirementCodeFilterComponent t) { //3
      if (t == null)
        return this;
      if (this.codeFilter == null)
        this.codeFilter = new ArrayList<DataRequirementCodeFilterComponent>();
      this.codeFilter.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #codeFilter}, creating it if it does not already exist
     */
    public DataRequirementCodeFilterComponent getCodeFilterFirstRep() { 
      if (getCodeFilter().isEmpty()) {
        addCodeFilter();
      }
      return getCodeFilter().get(0);
    }

    /**
     * @return {@link #dateFilter} (Date filters specify additional constraints on the data in terms of the applicable date range for specific elements.)
     */
    public List<DataRequirementDateFilterComponent> getDateFilter() { 
      if (this.dateFilter == null)
        this.dateFilter = new ArrayList<DataRequirementDateFilterComponent>();
      return this.dateFilter;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public DataRequirement setDateFilter(List<DataRequirementDateFilterComponent> theDateFilter) { 
      this.dateFilter = theDateFilter;
      return this;
    }

    public boolean hasDateFilter() { 
      if (this.dateFilter == null)
        return false;
      for (DataRequirementDateFilterComponent item : this.dateFilter)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public DataRequirementDateFilterComponent addDateFilter() { //3
      DataRequirementDateFilterComponent t = new DataRequirementDateFilterComponent();
      if (this.dateFilter == null)
        this.dateFilter = new ArrayList<DataRequirementDateFilterComponent>();
      this.dateFilter.add(t);
      return t;
    }

    public DataRequirement addDateFilter(DataRequirementDateFilterComponent t) { //3
      if (t == null)
        return this;
      if (this.dateFilter == null)
        this.dateFilter = new ArrayList<DataRequirementDateFilterComponent>();
      this.dateFilter.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #dateFilter}, creating it if it does not already exist
     */
    public DataRequirementDateFilterComponent getDateFilterFirstRep() { 
      if (getDateFilter().isEmpty()) {
        addDateFilter();
      }
      return getDateFilter().get(0);
    }

      protected void listChildren(List<Property> children) {
        super.listChildren(children);
        children.add(new Property("type", "code", "The type of the required data, specified as the type name of a resource. For profiles, this value is set to the type of the base resource of the profile.", 0, 1, type));
        children.add(new Property("profile", "uri", "The profile of the required data, specified as the uri of the profile definition.", 0, java.lang.Integer.MAX_VALUE, profile));
        children.add(new Property("mustSupport", "string", "Indicates that specific elements of the type are referenced by the knowledge module and must be supported by the consumer in order to obtain an effective evaluation. This does not mean that a value is required for this element, only that the consuming system must understand the element and be able to provide values for it if they are available. Note that the value for this element can be a path to allow references to nested elements. In that case, all the elements along the path must be supported.", 0, java.lang.Integer.MAX_VALUE, mustSupport));
        children.add(new Property("codeFilter", "", "Code filters specify additional constraints on the data, specifying the value set of interest for a particular element of the data.", 0, java.lang.Integer.MAX_VALUE, codeFilter));
        children.add(new Property("dateFilter", "", "Date filters specify additional constraints on the data in terms of the applicable date range for specific elements.", 0, java.lang.Integer.MAX_VALUE, dateFilter));
      }

      @Override
      public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
        switch (_hash) {
        case 3575610: /*type*/  return new Property("type", "code", "The type of the required data, specified as the type name of a resource. For profiles, this value is set to the type of the base resource of the profile.", 0, 1, type);
        case -309425751: /*profile*/  return new Property("profile", "uri", "The profile of the required data, specified as the uri of the profile definition.", 0, java.lang.Integer.MAX_VALUE, profile);
        case -1402857082: /*mustSupport*/  return new Property("mustSupport", "string", "Indicates that specific elements of the type are referenced by the knowledge module and must be supported by the consumer in order to obtain an effective evaluation. This does not mean that a value is required for this element, only that the consuming system must understand the element and be able to provide values for it if they are available. Note that the value for this element can be a path to allow references to nested elements. In that case, all the elements along the path must be supported.", 0, java.lang.Integer.MAX_VALUE, mustSupport);
        case -1303674939: /*codeFilter*/  return new Property("codeFilter", "", "Code filters specify additional constraints on the data, specifying the value set of interest for a particular element of the data.", 0, java.lang.Integer.MAX_VALUE, codeFilter);
        case 149531846: /*dateFilter*/  return new Property("dateFilter", "", "Date filters specify additional constraints on the data in terms of the applicable date range for specific elements.", 0, java.lang.Integer.MAX_VALUE, dateFilter);
        default: return super.getNamedProperty(_hash, _name, _checkValid);
        }

      }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3575610: /*type*/ return this.type == null ? new Base[0] : new Base[] {this.type}; // CodeType
        case -309425751: /*profile*/ return this.profile == null ? new Base[0] : this.profile.toArray(new Base[this.profile.size()]); // UriType
        case -1402857082: /*mustSupport*/ return this.mustSupport == null ? new Base[0] : this.mustSupport.toArray(new Base[this.mustSupport.size()]); // StringType
        case -1303674939: /*codeFilter*/ return this.codeFilter == null ? new Base[0] : this.codeFilter.toArray(new Base[this.codeFilter.size()]); // DataRequirementCodeFilterComponent
        case 149531846: /*dateFilter*/ return this.dateFilter == null ? new Base[0] : this.dateFilter.toArray(new Base[this.dateFilter.size()]); // DataRequirementDateFilterComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3575610: // type
          this.type = castToCode(value); // CodeType
          return value;
        case -309425751: // profile
          this.getProfile().add(castToUri(value)); // UriType
          return value;
        case -1402857082: // mustSupport
          this.getMustSupport().add(castToString(value)); // StringType
          return value;
        case -1303674939: // codeFilter
          this.getCodeFilter().add((DataRequirementCodeFilterComponent) value); // DataRequirementCodeFilterComponent
          return value;
        case 149531846: // dateFilter
          this.getDateFilter().add((DataRequirementDateFilterComponent) value); // DataRequirementDateFilterComponent
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("type")) {
          this.type = castToCode(value); // CodeType
        } else if (name.equals("profile")) {
          this.getProfile().add(castToUri(value));
        } else if (name.equals("mustSupport")) {
          this.getMustSupport().add(castToString(value));
        } else if (name.equals("codeFilter")) {
          this.getCodeFilter().add((DataRequirementCodeFilterComponent) value);
        } else if (name.equals("dateFilter")) {
          this.getDateFilter().add((DataRequirementDateFilterComponent) value);
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3575610:  return getTypeElement();
        case -309425751:  return addProfileElement();
        case -1402857082:  return addMustSupportElement();
        case -1303674939:  return addCodeFilter(); 
        case 149531846:  return addDateFilter(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3575610: /*type*/ return new String[] {"code"};
        case -309425751: /*profile*/ return new String[] {"uri"};
        case -1402857082: /*mustSupport*/ return new String[] {"string"};
        case -1303674939: /*codeFilter*/ return new String[] {};
        case 149531846: /*dateFilter*/ return new String[] {};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("type")) {
          throw new FHIRException("Cannot call addChild on a singleton property DataRequirement.type");
        }
        else if (name.equals("profile")) {
          throw new FHIRException("Cannot call addChild on a singleton property DataRequirement.profile");
        }
        else if (name.equals("mustSupport")) {
          throw new FHIRException("Cannot call addChild on a singleton property DataRequirement.mustSupport");
        }
        else if (name.equals("codeFilter")) {
          return addCodeFilter();
        }
        else if (name.equals("dateFilter")) {
          return addDateFilter();
        }
        else
          return super.addChild(name);
      }

  public String fhirType() {
    return "DataRequirement";

  }

      public DataRequirement copy() {
        DataRequirement dst = new DataRequirement();
        copyValues(dst);
        dst.type = type == null ? null : type.copy();
        if (profile != null) {
          dst.profile = new ArrayList<UriType>();
          for (UriType i : profile)
            dst.profile.add(i.copy());
        };
        if (mustSupport != null) {
          dst.mustSupport = new ArrayList<StringType>();
          for (StringType i : mustSupport)
            dst.mustSupport.add(i.copy());
        };
        if (codeFilter != null) {
          dst.codeFilter = new ArrayList<DataRequirementCodeFilterComponent>();
          for (DataRequirementCodeFilterComponent i : codeFilter)
            dst.codeFilter.add(i.copy());
        };
        if (dateFilter != null) {
          dst.dateFilter = new ArrayList<DataRequirementDateFilterComponent>();
          for (DataRequirementDateFilterComponent i : dateFilter)
            dst.dateFilter.add(i.copy());
        };
        return dst;
      }

      protected DataRequirement typedCopy() {
        return copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof DataRequirement))
          return false;
        DataRequirement o = (DataRequirement) other_;
        return compareDeep(type, o.type, true) && compareDeep(profile, o.profile, true) && compareDeep(mustSupport, o.mustSupport, true)
           && compareDeep(codeFilter, o.codeFilter, true) && compareDeep(dateFilter, o.dateFilter, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof DataRequirement))
          return false;
        DataRequirement o = (DataRequirement) other_;
        return compareValues(type, o.type, true) && compareValues(profile, o.profile, true) && compareValues(mustSupport, o.mustSupport, true)
          ;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(type, profile, mustSupport
          , codeFilter, dateFilter);
      }


}