package org.hl7.fhir.r4.model;

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

// Generated on Tue, May 12, 2020 07:26+1000 for FHIR v4.0.1
import java.util.Date;
import java.util.List;

import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.instance.model.api.ICompositeType;

import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.DatatypeDef;
import ca.uhn.fhir.model.api.annotation.Description;

/**
 * A text note which also contains information about who made the statement and
 * when.
 */
@DatatypeDef(name = "Annotation")
public class Annotation extends Type implements ICompositeType {

  /**
   * The individual responsible for making the annotation.
   */
  @Child(name = "author", type = { Practitioner.class, Patient.class, RelatedPerson.class, Organization.class,
      StringType.class }, order = 0, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "Individual responsible for the annotation", formalDefinition = "The individual responsible for making the annotation.")
  protected Type author;

  /**
   * Indicates when this particular annotation was made.
   */
  @Child(name = "time", type = { DateTimeType.class }, order = 1, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "When the annotation was made", formalDefinition = "Indicates when this particular annotation was made.")
  protected DateTimeType time;

  /**
   * The text of the annotation in markdown format.
   */
  @Child(name = "text", type = { MarkdownType.class }, order = 2, min = 1, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "The annotation  - text content (as markdown)", formalDefinition = "The text of the annotation in markdown format.")
  protected MarkdownType text;

  private static final long serialVersionUID = 1324090545L;

  /**
   * Constructor
   */
  public Annotation() {
    super();
  }

  /**
   * Constructor
   */
  public Annotation(MarkdownType text) {
    super();
    this.text = text;
  }

  /**
   * @return {@link #author} (The individual responsible for making the
   *         annotation.)
   */
  public Type getAuthor() {
    return this.author;
  }

  /**
   * @return {@link #author} (The individual responsible for making the
   *         annotation.)
   */
  public Reference getAuthorReference() throws FHIRException {
    if (this.author == null)
      this.author = new Reference();
    if (!(this.author instanceof Reference))
      throw new FHIRException("Type mismatch: the type Reference was expected, but " + this.author.getClass().getName()
          + " was encountered");
    return (Reference) this.author;
  }

  public boolean hasAuthorReference() {
      return this.author instanceof Reference;
  }

  /**
   * @return {@link #author} (The individual responsible for making the
   *         annotation.)
   */
  public StringType getAuthorStringType() throws FHIRException {
    if (this.author == null)
      this.author = new StringType();
    if (!(this.author instanceof StringType))
      throw new FHIRException("Type mismatch: the type StringType was expected, but " + this.author.getClass().getName()
          + " was encountered");
    return (StringType) this.author;
  }

  public boolean hasAuthorStringType() {
      return this.author instanceof StringType;
  }

  public boolean hasAuthor() {
    return this.author != null && !this.author.isEmpty();
  }

  /**
   * @param value {@link #author} (The individual responsible for making the
   *              annotation.)
   */
  public Annotation setAuthor(Type value) {
    if (value != null && !(value instanceof Reference || value instanceof StringType))
      throw new Error("Not the right type for Annotation.author[x]: " + value.fhirType());
    this.author = value;
    return this;
  }

  /**
   * @return {@link #time} (Indicates when this particular annotation was made.).
   *         This is the underlying object with id, value and extensions. The
   *         accessor "getTime" gives direct access to the value
   */
  public DateTimeType getTimeElement() {
    if (this.time == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create Annotation.time");
      else if (Configuration.doAutoCreate())
        this.time = new DateTimeType(); // bb
    return this.time;
  }

  public boolean hasTimeElement() {
    return this.time != null && !this.time.isEmpty();
  }

  public boolean hasTime() {
    return this.time != null && !this.time.isEmpty();
  }

  /**
   * @param value {@link #time} (Indicates when this particular annotation was
   *              made.). This is the underlying object with id, value and
   *              extensions. The accessor "getTime" gives direct access to the
   *              value
   */
  public Annotation setTimeElement(DateTimeType value) {
    this.time = value;
    return this;
  }

  /**
   * @return Indicates when this particular annotation was made.
   */
  public Date getTime() {
    return this.time == null ? null : this.time.getValue();
  }

  /**
   * @param value Indicates when this particular annotation was made.
   */
  public Annotation setTime(Date value) {
    if (value == null)
      this.time = null;
    else {
      if (this.time == null)
        this.time = new DateTimeType();
      this.time.setValue(value);
    }
    return this;
  }

  /**
   * @return {@link #text} (The text of the annotation in markdown format.). This
   *         is the underlying object with id, value and extensions. The accessor
   *         "getText" gives direct access to the value
   */
  public MarkdownType getTextElement() {
    if (this.text == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create Annotation.text");
      else if (Configuration.doAutoCreate())
        this.text = new MarkdownType(); // bb
    return this.text;
  }

  public boolean hasTextElement() {
    return this.text != null && !this.text.isEmpty();
  }

  public boolean hasText() {
    return this.text != null && !this.text.isEmpty();
  }

  /**
   * @param value {@link #text} (The text of the annotation in markdown format.).
   *              This is the underlying object with id, value and extensions. The
   *              accessor "getText" gives direct access to the value
   */
  public Annotation setTextElement(MarkdownType value) {
    this.text = value;
    return this;
  }

  /**
   * @return The text of the annotation in markdown format.
   */
  public String getText() {
    return this.text == null ? null : this.text.getValue();
  }

  /**
   * @param value The text of the annotation in markdown format.
   */
  public Annotation setText(String value) {
    if (this.text == null)
      this.text = new MarkdownType();
    this.text.setValue(value);
    return this;
  }

  protected void listChildren(List<Property> children) {
    super.listChildren(children);
    children.add(new Property("author[x]", "Reference(Practitioner|Patient|RelatedPerson|Organization)|string",
        "The individual responsible for making the annotation.", 0, 1, author));
    children.add(new Property("time", "dateTime", "Indicates when this particular annotation was made.", 0, 1, time));
    children.add(new Property("text", "markdown", "The text of the annotation in markdown format.", 0, 1, text));
  }

  @Override
  public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
    switch (_hash) {
    case 1475597077:
      /* author[x] */ return new Property("author[x]",
          "Reference(Practitioner|Patient|RelatedPerson|Organization)|string",
          "The individual responsible for making the annotation.", 0, 1, author);
    case -1406328437:
      /* author */ return new Property("author[x]", "Reference(Practitioner|Patient|RelatedPerson|Organization)|string",
          "The individual responsible for making the annotation.", 0, 1, author);
    case 305515008:
      /* authorReference */ return new Property("author[x]",
          "Reference(Practitioner|Patient|RelatedPerson|Organization)|string",
          "The individual responsible for making the annotation.", 0, 1, author);
    case 290249084:
      /* authorString */ return new Property("author[x]",
          "Reference(Practitioner|Patient|RelatedPerson|Organization)|string",
          "The individual responsible for making the annotation.", 0, 1, author);
    case 3560141:
      /* time */ return new Property("time", "dateTime", "Indicates when this particular annotation was made.", 0, 1,
          time);
    case 3556653:
      /* text */ return new Property("text", "markdown", "The text of the annotation in markdown format.", 0, 1, text);
    default:
      return super.getNamedProperty(_hash, _name, _checkValid);
    }

  }

  @Override
  public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
    switch (hash) {
    case -1406328437:
      /* author */ return this.author == null ? new Base[0] : new Base[] { this.author }; // Type
    case 3560141:
      /* time */ return this.time == null ? new Base[0] : new Base[] { this.time }; // DateTimeType
    case 3556653:
      /* text */ return this.text == null ? new Base[0] : new Base[] { this.text }; // MarkdownType
    default:
      return super.getProperty(hash, name, checkValid);
    }

  }

  @Override
  public Base setProperty(int hash, String name, Base value) throws FHIRException {
    switch (hash) {
    case -1406328437: // author
      this.author = castToType(value); // Type
      return value;
    case 3560141: // time
      this.time = castToDateTime(value); // DateTimeType
      return value;
    case 3556653: // text
      this.text = castToMarkdown(value); // MarkdownType
      return value;
    default:
      return super.setProperty(hash, name, value);
    }

  }

  @Override
  public Base setProperty(String name, Base value) throws FHIRException {
    if (name.equals("author[x]")) {
      this.author = castToType(value); // Type
    } else if (name.equals("time")) {
      this.time = castToDateTime(value); // DateTimeType
    } else if (name.equals("text")) {
      this.text = castToMarkdown(value); // MarkdownType
    } else
      return super.setProperty(name, value);
    return value;
  }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
    if (name.equals("author[x]")) {
      this.author = null;
    } else if (name.equals("time")) {
      this.time = null;
    } else if (name.equals("text")) {
      this.text = null;
    } else
      super.removeChild(name, value);
    
  }

  @Override
  public Base makeProperty(int hash, String name) throws FHIRException {
    switch (hash) {
    case 1475597077:
      return getAuthor();
    case -1406328437:
      return getAuthor();
    case 3560141:
      return getTimeElement();
    case 3556653:
      return getTextElement();
    default:
      return super.makeProperty(hash, name);
    }

  }

  @Override
  public String[] getTypesForProperty(int hash, String name) throws FHIRException {
    switch (hash) {
    case -1406328437:
      /* author */ return new String[] { "Reference", "string" };
    case 3560141:
      /* time */ return new String[] { "dateTime" };
    case 3556653:
      /* text */ return new String[] { "markdown" };
    default:
      return super.getTypesForProperty(hash, name);
    }

  }

  @Override
  public Base addChild(String name) throws FHIRException {
    if (name.equals("authorReference")) {
      this.author = new Reference();
      return this.author;
    } else if (name.equals("authorString")) {
      this.author = new StringType();
      return this.author;
    } else if (name.equals("time")) {
      throw new FHIRException("Cannot call addChild on a singleton property Annotation.time");
    } else if (name.equals("text")) {
      throw new FHIRException("Cannot call addChild on a singleton property Annotation.text");
    } else
      return super.addChild(name);
  }

  public String fhirType() {
    return "Annotation";

  }

  public Annotation copy() {
    Annotation dst = new Annotation();
    copyValues(dst);
    return dst;
  }

  public void copyValues(Annotation dst) {
    super.copyValues(dst);
    dst.author = author == null ? null : author.copy();
    dst.time = time == null ? null : time.copy();
    dst.text = text == null ? null : text.copy();
  }

  protected Annotation typedCopy() {
    return copy();
  }

  @Override
  public boolean equalsDeep(Base other_) {
    if (!super.equalsDeep(other_))
      return false;
    if (!(other_ instanceof Annotation))
      return false;
    Annotation o = (Annotation) other_;
    return compareDeep(author, o.author, true) && compareDeep(time, o.time, true) && compareDeep(text, o.text, true);
  }

  @Override
  public boolean equalsShallow(Base other_) {
    if (!super.equalsShallow(other_))
      return false;
    if (!(other_ instanceof Annotation))
      return false;
    Annotation o = (Annotation) other_;
    return compareValues(time, o.time, true) && compareValues(text, o.text, true);
  }

  public boolean isEmpty() {
    return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(author, time, text);
  }

}