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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Enumerations.PublicationStatus;
import org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory;
import org.hl7.fhir.utilities.Utilities;

import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.ChildOrder;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.api.annotation.ResourceDef;
import ca.uhn.fhir.model.api.annotation.SearchParamDefinition;

/**
 * The EventDefinition resource provides a reusable description of when a
 * particular event can occur.
 */
@ResourceDef(name = "EventDefinition", profile = "http://hl7.org/fhir/StructureDefinition/EventDefinition")
@ChildOrder(names = { "url", "identifier", "version", "name", "title", "subtitle", "status", "experimental",
    "subject[x]", "date", "publisher", "contact", "description", "useContext", "jurisdiction", "purpose", "usage",
    "copyright", "approvalDate", "lastReviewDate", "effectivePeriod", "topic", "author", "editor", "reviewer",
    "endorser", "relatedArtifact", "trigger" })
public class EventDefinition extends MetadataResource {

  /**
   * A formal identifier that is used to identify this event definition when it is
   * represented in other formats, or referenced in a specification, model, design
   * or an instance.
   */
  @Child(name = "identifier", type = {
      Identifier.class }, order = 0, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
  @Description(shortDefinition = "Additional identifier for the event definition", formalDefinition = "A formal identifier that is used to identify this event definition when it is represented in other formats, or referenced in a specification, model, design or an instance.")
  protected List<Identifier> identifier;

  /**
   * An explanatory or alternate title for the event definition giving additional
   * information about its content.
   */
  @Child(name = "subtitle", type = { StringType.class }, order = 1, min = 0, max = 1, modifier = false, summary = false)
  @Description(shortDefinition = "Subordinate title of the event definition", formalDefinition = "An explanatory or alternate title for the event definition giving additional information about its content.")
  protected StringType subtitle;

  /**
   * A code or group definition that describes the intended subject of the event
   * definition.
   */
  @Child(name = "subject", type = { CodeableConcept.class,
      Group.class }, order = 2, min = 0, max = 1, modifier = false, summary = false)
  @Description(shortDefinition = "Type of individual the event definition is focused on", formalDefinition = "A code or group definition that describes the intended subject of the event definition.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/subject-type")
  protected Type subject;

  /**
   * Explanation of why this event definition is needed and why it has been
   * designed as it has.
   */
  @Child(name = "purpose", type = {
      MarkdownType.class }, order = 3, min = 0, max = 1, modifier = false, summary = false)
  @Description(shortDefinition = "Why this event definition is defined", formalDefinition = "Explanation of why this event definition is needed and why it has been designed as it has.")
  protected MarkdownType purpose;

  /**
   * A detailed description of how the event definition is used from a clinical
   * perspective.
   */
  @Child(name = "usage", type = { StringType.class }, order = 4, min = 0, max = 1, modifier = false, summary = false)
  @Description(shortDefinition = "Describes the clinical usage of the event definition", formalDefinition = "A detailed description of how the event definition is used from a clinical perspective.")
  protected StringType usage;

  /**
   * A copyright statement relating to the event definition and/or its contents.
   * Copyright statements are generally legal restrictions on the use and
   * publishing of the event definition.
   */
  @Child(name = "copyright", type = {
      MarkdownType.class }, order = 5, min = 0, max = 1, modifier = false, summary = false)
  @Description(shortDefinition = "Use and/or publishing restrictions", formalDefinition = "A copyright statement relating to the event definition and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the event definition.")
  protected MarkdownType copyright;

  /**
   * The date on which the resource content was approved by the publisher.
   * Approval happens once when the content is officially approved for usage.
   */
  @Child(name = "approvalDate", type = {
      DateType.class }, order = 6, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "When the event definition was approved by publisher", formalDefinition = "The date on which the resource content was approved by the publisher. Approval happens once when the content is officially approved for usage.")
  protected DateType approvalDate;

  /**
   * The date on which the resource content was last reviewed. Review happens
   * periodically after approval but does not change the original approval date.
   */
  @Child(name = "lastReviewDate", type = {
      DateType.class }, order = 7, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "When the event definition was last reviewed", formalDefinition = "The date on which the resource content was last reviewed. Review happens periodically after approval but does not change the original approval date.")
  protected DateType lastReviewDate;

  /**
   * The period during which the event definition content was or is planned to be
   * in active use.
   */
  @Child(name = "effectivePeriod", type = {
      Period.class }, order = 8, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "When the event definition is expected to be used", formalDefinition = "The period during which the event definition content was or is planned to be in active use.")
  protected Period effectivePeriod;

  /**
   * Descriptive topics related to the module. Topics provide a high-level
   * categorization of the module that can be useful for filtering and searching.
   */
  @Child(name = "topic", type = {
      CodeableConcept.class }, order = 9, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "E.g. Education, Treatment, Assessment, etc.", formalDefinition = "Descriptive topics related to the module. Topics provide a high-level categorization of the module that can be useful for filtering and searching.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/definition-topic")
  protected List<CodeableConcept> topic;

  /**
   * An individiual or organization primarily involved in the creation and
   * maintenance of the content.
   */
  @Child(name = "author", type = {
      ContactDetail.class }, order = 10, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "Who authored the content", formalDefinition = "An individiual or organization primarily involved in the creation and maintenance of the content.")
  protected List<ContactDetail> author;

  /**
   * An individual or organization primarily responsible for internal coherence of
   * the content.
   */
  @Child(name = "editor", type = {
      ContactDetail.class }, order = 11, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "Who edited the content", formalDefinition = "An individual or organization primarily responsible for internal coherence of the content.")
  protected List<ContactDetail> editor;

  /**
   * An individual or organization primarily responsible for review of some aspect
   * of the content.
   */
  @Child(name = "reviewer", type = {
      ContactDetail.class }, order = 12, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "Who reviewed the content", formalDefinition = "An individual or organization primarily responsible for review of some aspect of the content.")
  protected List<ContactDetail> reviewer;

  /**
   * An individual or organization responsible for officially endorsing the
   * content for use in some setting.
   */
  @Child(name = "endorser", type = {
      ContactDetail.class }, order = 13, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "Who endorsed the content", formalDefinition = "An individual or organization responsible for officially endorsing the content for use in some setting.")
  protected List<ContactDetail> endorser;

  /**
   * Related resources such as additional documentation, justification, or
   * bibliographic references.
   */
  @Child(name = "relatedArtifact", type = {
      RelatedArtifact.class }, order = 14, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "Additional documentation, citations, etc.", formalDefinition = "Related resources such as additional documentation, justification, or bibliographic references.")
  protected List<RelatedArtifact> relatedArtifact;

  /**
   * The trigger element defines when the event occurs. If more than one trigger
   * condition is specified, the event fires whenever any one of the trigger
   * conditions is met.
   */
  @Child(name = "trigger", type = {
      TriggerDefinition.class }, order = 15, min = 1, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
  @Description(shortDefinition = "\"when\" the event occurs (multiple = 'or')", formalDefinition = "The trigger element defines when the event occurs. If more than one trigger condition is specified, the event fires whenever any one of the trigger conditions is met.")
  protected List<TriggerDefinition> trigger;

  private static final long serialVersionUID = 1022506246L;

  /**
   * Constructor
   */
  public EventDefinition() {
    super();
  }

  /**
   * Constructor
   */
  public EventDefinition(Enumeration<PublicationStatus> status) {
    super();
    this.status = status;
  }

  /**
   * @return {@link #url} (An absolute URI that is used to identify this event
   *         definition when it is referenced in a specification, model, design or
   *         an instance; also called its canonical identifier. This SHOULD be
   *         globally unique and SHOULD be a literal address at which at which an
   *         authoritative instance of this event definition is (or will be)
   *         published. This URL can be the target of a canonical reference. It
   *         SHALL remain the same when the event definition is stored on
   *         different servers.). This is the underlying object with id, value and
   *         extensions. The accessor "getUrl" gives direct access to the value
   */
  public UriType getUrlElement() {
    if (this.url == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create EventDefinition.url");
      else if (Configuration.doAutoCreate())
        this.url = new UriType(); // bb
    return this.url;
  }

  public boolean hasUrlElement() {
    return this.url != null && !this.url.isEmpty();
  }

  public boolean hasUrl() {
    return this.url != null && !this.url.isEmpty();
  }

  /**
   * @param value {@link #url} (An absolute URI that is used to identify this
   *              event definition when it is referenced in a specification,
   *              model, design or an instance; also called its canonical
   *              identifier. This SHOULD be globally unique and SHOULD be a
   *              literal address at which at which an authoritative instance of
   *              this event definition is (or will be) published. This URL can be
   *              the target of a canonical reference. It SHALL remain the same
   *              when the event definition is stored on different servers.). This
   *              is the underlying object with id, value and extensions. The
   *              accessor "getUrl" gives direct access to the value
   */
  public EventDefinition setUrlElement(UriType value) {
    this.url = value;
    return this;
  }

  /**
   * @return An absolute URI that is used to identify this event definition when
   *         it is referenced in a specification, model, design or an instance;
   *         also called its canonical identifier. This SHOULD be globally unique
   *         and SHOULD be a literal address at which at which an authoritative
   *         instance of this event definition is (or will be) published. This URL
   *         can be the target of a canonical reference. It SHALL remain the same
   *         when the event definition is stored on different servers.
   */
  public String getUrl() {
    return this.url == null ? null : this.url.getValue();
  }

  /**
   * @param value An absolute URI that is used to identify this event definition
   *              when it is referenced in a specification, model, design or an
   *              instance; also called its canonical identifier. This SHOULD be
   *              globally unique and SHOULD be a literal address at which at
   *              which an authoritative instance of this event definition is (or
   *              will be) published. This URL can be the target of a canonical
   *              reference. It SHALL remain the same when the event definition is
   *              stored on different servers.
   */
  public EventDefinition setUrl(String value) {
    if (Utilities.noString(value))
      this.url = null;
    else {
      if (this.url == null)
        this.url = new UriType();
      this.url.setValue(value);
    }
    return this;
  }

  /**
   * @return {@link #identifier} (A formal identifier that is used to identify
   *         this event definition when it is represented in other formats, or
   *         referenced in a specification, model, design or an instance.)
   */
  public List<Identifier> getIdentifier() {
    if (this.identifier == null)
      this.identifier = new ArrayList<Identifier>();
    return this.identifier;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public EventDefinition setIdentifier(List<Identifier> theIdentifier) {
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

  public EventDefinition addIdentifier(Identifier t) { // 3
    if (t == null)
      return this;
    if (this.identifier == null)
      this.identifier = new ArrayList<Identifier>();
    this.identifier.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #identifier}, creating
   *         it if it does not already exist
   */
  public Identifier getIdentifierFirstRep() {
    if (getIdentifier().isEmpty()) {
      addIdentifier();
    }
    return getIdentifier().get(0);
  }

  /**
   * @return {@link #version} (The identifier that is used to identify this
   *         version of the event definition when it is referenced in a
   *         specification, model, design or instance. This is an arbitrary value
   *         managed by the event definition author and is not expected to be
   *         globally unique. For example, it might be a timestamp (e.g. yyyymmdd)
   *         if a managed version is not available. There is also no expectation
   *         that versions can be placed in a lexicographical sequence.). This is
   *         the underlying object with id, value and extensions. The accessor
   *         "getVersion" gives direct access to the value
   */
  public StringType getVersionElement() {
    if (this.version == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create EventDefinition.version");
      else if (Configuration.doAutoCreate())
        this.version = new StringType(); // bb
    return this.version;
  }

  public boolean hasVersionElement() {
    return this.version != null && !this.version.isEmpty();
  }

  public boolean hasVersion() {
    return this.version != null && !this.version.isEmpty();
  }

  /**
   * @param value {@link #version} (The identifier that is used to identify this
   *              version of the event definition when it is referenced in a
   *              specification, model, design or instance. This is an arbitrary
   *              value managed by the event definition author and is not expected
   *              to be globally unique. For example, it might be a timestamp
   *              (e.g. yyyymmdd) if a managed version is not available. There is
   *              also no expectation that versions can be placed in a
   *              lexicographical sequence.). This is the underlying object with
   *              id, value and extensions. The accessor "getVersion" gives direct
   *              access to the value
   */
  public EventDefinition setVersionElement(StringType value) {
    this.version = value;
    return this;
  }

  /**
   * @return The identifier that is used to identify this version of the event
   *         definition when it is referenced in a specification, model, design or
   *         instance. This is an arbitrary value managed by the event definition
   *         author and is not expected to be globally unique. For example, it
   *         might be a timestamp (e.g. yyyymmdd) if a managed version is not
   *         available. There is also no expectation that versions can be placed
   *         in a lexicographical sequence.
   */
  public String getVersion() {
    return this.version == null ? null : this.version.getValue();
  }

  /**
   * @param value The identifier that is used to identify this version of the
   *              event definition when it is referenced in a specification,
   *              model, design or instance. This is an arbitrary value managed by
   *              the event definition author and is not expected to be globally
   *              unique. For example, it might be a timestamp (e.g. yyyymmdd) if
   *              a managed version is not available. There is also no expectation
   *              that versions can be placed in a lexicographical sequence.
   */
  public EventDefinition setVersion(String value) {
    if (Utilities.noString(value))
      this.version = null;
    else {
      if (this.version == null)
        this.version = new StringType();
      this.version.setValue(value);
    }
    return this;
  }

  /**
   * @return {@link #name} (A natural language name identifying the event
   *         definition. This name should be usable as an identifier for the
   *         module by machine processing applications such as code generation.).
   *         This is the underlying object with id, value and extensions. The
   *         accessor "getName" gives direct access to the value
   */
  public StringType getNameElement() {
    if (this.name == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create EventDefinition.name");
      else if (Configuration.doAutoCreate())
        this.name = new StringType(); // bb
    return this.name;
  }

  public boolean hasNameElement() {
    return this.name != null && !this.name.isEmpty();
  }

  public boolean hasName() {
    return this.name != null && !this.name.isEmpty();
  }

  /**
   * @param value {@link #name} (A natural language name identifying the event
   *              definition. This name should be usable as an identifier for the
   *              module by machine processing applications such as code
   *              generation.). This is the underlying object with id, value and
   *              extensions. The accessor "getName" gives direct access to the
   *              value
   */
  public EventDefinition setNameElement(StringType value) {
    this.name = value;
    return this;
  }

  /**
   * @return A natural language name identifying the event definition. This name
   *         should be usable as an identifier for the module by machine
   *         processing applications such as code generation.
   */
  public String getName() {
    return this.name == null ? null : this.name.getValue();
  }

  /**
   * @param value A natural language name identifying the event definition. This
   *              name should be usable as an identifier for the module by machine
   *              processing applications such as code generation.
   */
  public EventDefinition setName(String value) {
    if (Utilities.noString(value))
      this.name = null;
    else {
      if (this.name == null)
        this.name = new StringType();
      this.name.setValue(value);
    }
    return this;
  }

  /**
   * @return {@link #title} (A short, descriptive, user-friendly title for the
   *         event definition.). This is the underlying object with id, value and
   *         extensions. The accessor "getTitle" gives direct access to the value
   */
  public StringType getTitleElement() {
    if (this.title == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create EventDefinition.title");
      else if (Configuration.doAutoCreate())
        this.title = new StringType(); // bb
    return this.title;
  }

  public boolean hasTitleElement() {
    return this.title != null && !this.title.isEmpty();
  }

  public boolean hasTitle() {
    return this.title != null && !this.title.isEmpty();
  }

  /**
   * @param value {@link #title} (A short, descriptive, user-friendly title for
   *              the event definition.). This is the underlying object with id,
   *              value and extensions. The accessor "getTitle" gives direct
   *              access to the value
   */
  public EventDefinition setTitleElement(StringType value) {
    this.title = value;
    return this;
  }

  /**
   * @return A short, descriptive, user-friendly title for the event definition.
   */
  public String getTitle() {
    return this.title == null ? null : this.title.getValue();
  }

  /**
   * @param value A short, descriptive, user-friendly title for the event
   *              definition.
   */
  public EventDefinition setTitle(String value) {
    if (Utilities.noString(value))
      this.title = null;
    else {
      if (this.title == null)
        this.title = new StringType();
      this.title.setValue(value);
    }
    return this;
  }

  /**
   * @return {@link #subtitle} (An explanatory or alternate title for the event
   *         definition giving additional information about its content.). This is
   *         the underlying object with id, value and extensions. The accessor
   *         "getSubtitle" gives direct access to the value
   */
  public StringType getSubtitleElement() {
    if (this.subtitle == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create EventDefinition.subtitle");
      else if (Configuration.doAutoCreate())
        this.subtitle = new StringType(); // bb
    return this.subtitle;
  }

  public boolean hasSubtitleElement() {
    return this.subtitle != null && !this.subtitle.isEmpty();
  }

  public boolean hasSubtitle() {
    return this.subtitle != null && !this.subtitle.isEmpty();
  }

  /**
   * @param value {@link #subtitle} (An explanatory or alternate title for the
   *              event definition giving additional information about its
   *              content.). This is the underlying object with id, value and
   *              extensions. The accessor "getSubtitle" gives direct access to
   *              the value
   */
  public EventDefinition setSubtitleElement(StringType value) {
    this.subtitle = value;
    return this;
  }

  /**
   * @return An explanatory or alternate title for the event definition giving
   *         additional information about its content.
   */
  public String getSubtitle() {
    return this.subtitle == null ? null : this.subtitle.getValue();
  }

  /**
   * @param value An explanatory or alternate title for the event definition
   *              giving additional information about its content.
   */
  public EventDefinition setSubtitle(String value) {
    if (Utilities.noString(value))
      this.subtitle = null;
    else {
      if (this.subtitle == null)
        this.subtitle = new StringType();
      this.subtitle.setValue(value);
    }
    return this;
  }

  /**
   * @return {@link #status} (The status of this event definition. Enables
   *         tracking the life-cycle of the content.). This is the underlying
   *         object with id, value and extensions. The accessor "getStatus" gives
   *         direct access to the value
   */
  public Enumeration<PublicationStatus> getStatusElement() {
    if (this.status == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create EventDefinition.status");
      else if (Configuration.doAutoCreate())
        this.status = new Enumeration<PublicationStatus>(new PublicationStatusEnumFactory()); // bb
    return this.status;
  }

  public boolean hasStatusElement() {
    return this.status != null && !this.status.isEmpty();
  }

  public boolean hasStatus() {
    return this.status != null && !this.status.isEmpty();
  }

  /**
   * @param value {@link #status} (The status of this event definition. Enables
   *              tracking the life-cycle of the content.). This is the underlying
   *              object with id, value and extensions. The accessor "getStatus"
   *              gives direct access to the value
   */
  public EventDefinition setStatusElement(Enumeration<PublicationStatus> value) {
    this.status = value;
    return this;
  }

  /**
   * @return The status of this event definition. Enables tracking the life-cycle
   *         of the content.
   */
  public PublicationStatus getStatus() {
    return this.status == null ? null : this.status.getValue();
  }

  /**
   * @param value The status of this event definition. Enables tracking the
   *              life-cycle of the content.
   */
  public EventDefinition setStatus(PublicationStatus value) {
    if (this.status == null)
      this.status = new Enumeration<PublicationStatus>(new PublicationStatusEnumFactory());
    this.status.setValue(value);
    return this;
  }

  /**
   * @return {@link #experimental} (A Boolean value to indicate that this event
   *         definition is authored for testing purposes (or
   *         education/evaluation/marketing) and is not intended to be used for
   *         genuine usage.). This is the underlying object with id, value and
   *         extensions. The accessor "getExperimental" gives direct access to the
   *         value
   */
  public BooleanType getExperimentalElement() {
    if (this.experimental == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create EventDefinition.experimental");
      else if (Configuration.doAutoCreate())
        this.experimental = new BooleanType(); // bb
    return this.experimental;
  }

  public boolean hasExperimentalElement() {
    return this.experimental != null && !this.experimental.isEmpty();
  }

  public boolean hasExperimental() {
    return this.experimental != null && !this.experimental.isEmpty();
  }

  /**
   * @param value {@link #experimental} (A Boolean value to indicate that this
   *              event definition is authored for testing purposes (or
   *              education/evaluation/marketing) and is not intended to be used
   *              for genuine usage.). This is the underlying object with id,
   *              value and extensions. The accessor "getExperimental" gives
   *              direct access to the value
   */
  public EventDefinition setExperimentalElement(BooleanType value) {
    this.experimental = value;
    return this;
  }

  /**
   * @return A Boolean value to indicate that this event definition is authored
   *         for testing purposes (or education/evaluation/marketing) and is not
   *         intended to be used for genuine usage.
   */
  public boolean getExperimental() {
    return this.experimental == null || this.experimental.isEmpty() ? false : this.experimental.getValue();
  }

  /**
   * @param value A Boolean value to indicate that this event definition is
   *              authored for testing purposes (or
   *              education/evaluation/marketing) and is not intended to be used
   *              for genuine usage.
   */
  public EventDefinition setExperimental(boolean value) {
    if (this.experimental == null)
      this.experimental = new BooleanType();
    this.experimental.setValue(value);
    return this;
  }

  /**
   * @return {@link #subject} (A code or group definition that describes the
   *         intended subject of the event definition.)
   */
  public Type getSubject() {
    return this.subject;
  }

  /**
   * @return {@link #subject} (A code or group definition that describes the
   *         intended subject of the event definition.)
   */
  public CodeableConcept getSubjectCodeableConcept() throws FHIRException {
    if (this.subject == null)
      this.subject = new CodeableConcept();
    if (!(this.subject instanceof CodeableConcept))
      throw new FHIRException("Type mismatch: the type CodeableConcept was expected, but "
          + this.subject.getClass().getName() + " was encountered");
    return (CodeableConcept) this.subject;
  }

  public boolean hasSubjectCodeableConcept() {
      return this.subject instanceof CodeableConcept;
  }

  /**
   * @return {@link #subject} (A code or group definition that describes the
   *         intended subject of the event definition.)
   */
  public Reference getSubjectReference() throws FHIRException {
    if (this.subject == null)
      this.subject = new Reference();
    if (!(this.subject instanceof Reference))
      throw new FHIRException("Type mismatch: the type Reference was expected, but " + this.subject.getClass().getName()
          + " was encountered");
    return (Reference) this.subject;
  }

  public boolean hasSubjectReference() {
      return this.subject instanceof Reference;
  }

  public boolean hasSubject() {
    return this.subject != null && !this.subject.isEmpty();
  }

  /**
   * @param value {@link #subject} (A code or group definition that describes the
   *              intended subject of the event definition.)
   */
  public EventDefinition setSubject(Type value) {
    if (value != null && !(value instanceof CodeableConcept || value instanceof Reference))
      throw new Error("Not the right type for EventDefinition.subject[x]: " + value.fhirType());
    this.subject = value;
    return this;
  }

  /**
   * @return {@link #date} (The date (and optionally time) when the event
   *         definition was published. The date must change when the business
   *         version changes and it must change if the status code changes. In
   *         addition, it should change when the substantive content of the event
   *         definition changes.). This is the underlying object with id, value
   *         and extensions. The accessor "getDate" gives direct access to the
   *         value
   */
  public DateTimeType getDateElement() {
    if (this.date == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create EventDefinition.date");
      else if (Configuration.doAutoCreate())
        this.date = new DateTimeType(); // bb
    return this.date;
  }

  public boolean hasDateElement() {
    return this.date != null && !this.date.isEmpty();
  }

  public boolean hasDate() {
    return this.date != null && !this.date.isEmpty();
  }

  /**
   * @param value {@link #date} (The date (and optionally time) when the event
   *              definition was published. The date must change when the business
   *              version changes and it must change if the status code changes.
   *              In addition, it should change when the substantive content of
   *              the event definition changes.). This is the underlying object
   *              with id, value and extensions. The accessor "getDate" gives
   *              direct access to the value
   */
  public EventDefinition setDateElement(DateTimeType value) {
    this.date = value;
    return this;
  }

  /**
   * @return The date (and optionally time) when the event definition was
   *         published. The date must change when the business version changes and
   *         it must change if the status code changes. In addition, it should
   *         change when the substantive content of the event definition changes.
   */
  public Date getDate() {
    return this.date == null ? null : this.date.getValue();
  }

  /**
   * @param value The date (and optionally time) when the event definition was
   *              published. The date must change when the business version
   *              changes and it must change if the status code changes. In
   *              addition, it should change when the substantive content of the
   *              event definition changes.
   */
  public EventDefinition setDate(Date value) {
    if (value == null)
      this.date = null;
    else {
      if (this.date == null)
        this.date = new DateTimeType();
      this.date.setValue(value);
    }
    return this;
  }

  /**
   * @return {@link #publisher} (The name of the organization or individual that
   *         published the event definition.). This is the underlying object with
   *         id, value and extensions. The accessor "getPublisher" gives direct
   *         access to the value
   */
  public StringType getPublisherElement() {
    if (this.publisher == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create EventDefinition.publisher");
      else if (Configuration.doAutoCreate())
        this.publisher = new StringType(); // bb
    return this.publisher;
  }

  public boolean hasPublisherElement() {
    return this.publisher != null && !this.publisher.isEmpty();
  }

  public boolean hasPublisher() {
    return this.publisher != null && !this.publisher.isEmpty();
  }

  /**
   * @param value {@link #publisher} (The name of the organization or individual
   *              that published the event definition.). This is the underlying
   *              object with id, value and extensions. The accessor
   *              "getPublisher" gives direct access to the value
   */
  public EventDefinition setPublisherElement(StringType value) {
    this.publisher = value;
    return this;
  }

  /**
   * @return The name of the organization or individual that published the event
   *         definition.
   */
  public String getPublisher() {
    return this.publisher == null ? null : this.publisher.getValue();
  }

  /**
   * @param value The name of the organization or individual that published the
   *              event definition.
   */
  public EventDefinition setPublisher(String value) {
    if (Utilities.noString(value))
      this.publisher = null;
    else {
      if (this.publisher == null)
        this.publisher = new StringType();
      this.publisher.setValue(value);
    }
    return this;
  }

  /**
   * @return {@link #contact} (Contact details to assist a user in finding and
   *         communicating with the publisher.)
   */
  public List<ContactDetail> getContact() {
    if (this.contact == null)
      this.contact = new ArrayList<ContactDetail>();
    return this.contact;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public EventDefinition setContact(List<ContactDetail> theContact) {
    this.contact = theContact;
    return this;
  }

  public boolean hasContact() {
    if (this.contact == null)
      return false;
    for (ContactDetail item : this.contact)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public ContactDetail addContact() { // 3
    ContactDetail t = new ContactDetail();
    if (this.contact == null)
      this.contact = new ArrayList<ContactDetail>();
    this.contact.add(t);
    return t;
  }

  public EventDefinition addContact(ContactDetail t) { // 3
    if (t == null)
      return this;
    if (this.contact == null)
      this.contact = new ArrayList<ContactDetail>();
    this.contact.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #contact}, creating it
   *         if it does not already exist
   */
  public ContactDetail getContactFirstRep() {
    if (getContact().isEmpty()) {
      addContact();
    }
    return getContact().get(0);
  }

  /**
   * @return {@link #description} (A free text natural language description of the
   *         event definition from a consumer's perspective.). This is the
   *         underlying object with id, value and extensions. The accessor
   *         "getDescription" gives direct access to the value
   */
  public MarkdownType getDescriptionElement() {
    if (this.description == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create EventDefinition.description");
      else if (Configuration.doAutoCreate())
        this.description = new MarkdownType(); // bb
    return this.description;
  }

  public boolean hasDescriptionElement() {
    return this.description != null && !this.description.isEmpty();
  }

  public boolean hasDescription() {
    return this.description != null && !this.description.isEmpty();
  }

  /**
   * @param value {@link #description} (A free text natural language description
   *              of the event definition from a consumer's perspective.). This is
   *              the underlying object with id, value and extensions. The
   *              accessor "getDescription" gives direct access to the value
   */
  public EventDefinition setDescriptionElement(MarkdownType value) {
    this.description = value;
    return this;
  }

  /**
   * @return A free text natural language description of the event definition from
   *         a consumer's perspective.
   */
  public String getDescription() {
    return this.description == null ? null : this.description.getValue();
  }

  /**
   * @param value A free text natural language description of the event definition
   *              from a consumer's perspective.
   */
  public EventDefinition setDescription(String value) {
    if (value == null)
      this.description = null;
    else {
      if (this.description == null)
        this.description = new MarkdownType();
      this.description.setValue(value);
    }
    return this;
  }

  /**
   * @return {@link #useContext} (The content was developed with a focus and
   *         intent of supporting the contexts that are listed. These contexts may
   *         be general categories (gender, age, ...) or may be references to
   *         specific programs (insurance plans, studies, ...) and may be used to
   *         assist with indexing and searching for appropriate event definition
   *         instances.)
   */
  public List<UsageContext> getUseContext() {
    if (this.useContext == null)
      this.useContext = new ArrayList<UsageContext>();
    return this.useContext;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public EventDefinition setUseContext(List<UsageContext> theUseContext) {
    this.useContext = theUseContext;
    return this;
  }

  public boolean hasUseContext() {
    if (this.useContext == null)
      return false;
    for (UsageContext item : this.useContext)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public UsageContext addUseContext() { // 3
    UsageContext t = new UsageContext();
    if (this.useContext == null)
      this.useContext = new ArrayList<UsageContext>();
    this.useContext.add(t);
    return t;
  }

  public EventDefinition addUseContext(UsageContext t) { // 3
    if (t == null)
      return this;
    if (this.useContext == null)
      this.useContext = new ArrayList<UsageContext>();
    this.useContext.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #useContext}, creating
   *         it if it does not already exist
   */
  public UsageContext getUseContextFirstRep() {
    if (getUseContext().isEmpty()) {
      addUseContext();
    }
    return getUseContext().get(0);
  }

  /**
   * @return {@link #jurisdiction} (A legal or geographic region in which the
   *         event definition is intended to be used.)
   */
  public List<CodeableConcept> getJurisdiction() {
    if (this.jurisdiction == null)
      this.jurisdiction = new ArrayList<CodeableConcept>();
    return this.jurisdiction;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public EventDefinition setJurisdiction(List<CodeableConcept> theJurisdiction) {
    this.jurisdiction = theJurisdiction;
    return this;
  }

  public boolean hasJurisdiction() {
    if (this.jurisdiction == null)
      return false;
    for (CodeableConcept item : this.jurisdiction)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public CodeableConcept addJurisdiction() { // 3
    CodeableConcept t = new CodeableConcept();
    if (this.jurisdiction == null)
      this.jurisdiction = new ArrayList<CodeableConcept>();
    this.jurisdiction.add(t);
    return t;
  }

  public EventDefinition addJurisdiction(CodeableConcept t) { // 3
    if (t == null)
      return this;
    if (this.jurisdiction == null)
      this.jurisdiction = new ArrayList<CodeableConcept>();
    this.jurisdiction.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #jurisdiction},
   *         creating it if it does not already exist
   */
  public CodeableConcept getJurisdictionFirstRep() {
    if (getJurisdiction().isEmpty()) {
      addJurisdiction();
    }
    return getJurisdiction().get(0);
  }

  /**
   * @return {@link #purpose} (Explanation of why this event definition is needed
   *         and why it has been designed as it has.). This is the underlying
   *         object with id, value and extensions. The accessor "getPurpose" gives
   *         direct access to the value
   */
  public MarkdownType getPurposeElement() {
    if (this.purpose == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create EventDefinition.purpose");
      else if (Configuration.doAutoCreate())
        this.purpose = new MarkdownType(); // bb
    return this.purpose;
  }

  public boolean hasPurposeElement() {
    return this.purpose != null && !this.purpose.isEmpty();
  }

  public boolean hasPurpose() {
    return this.purpose != null && !this.purpose.isEmpty();
  }

  /**
   * @param value {@link #purpose} (Explanation of why this event definition is
   *              needed and why it has been designed as it has.). This is the
   *              underlying object with id, value and extensions. The accessor
   *              "getPurpose" gives direct access to the value
   */
  public EventDefinition setPurposeElement(MarkdownType value) {
    this.purpose = value;
    return this;
  }

  /**
   * @return Explanation of why this event definition is needed and why it has
   *         been designed as it has.
   */
  public String getPurpose() {
    return this.purpose == null ? null : this.purpose.getValue();
  }

  /**
   * @param value Explanation of why this event definition is needed and why it
   *              has been designed as it has.
   */
  public EventDefinition setPurpose(String value) {
    if (value == null)
      this.purpose = null;
    else {
      if (this.purpose == null)
        this.purpose = new MarkdownType();
      this.purpose.setValue(value);
    }
    return this;
  }

  /**
   * @return {@link #usage} (A detailed description of how the event definition is
   *         used from a clinical perspective.). This is the underlying object
   *         with id, value and extensions. The accessor "getUsage" gives direct
   *         access to the value
   */
  public StringType getUsageElement() {
    if (this.usage == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create EventDefinition.usage");
      else if (Configuration.doAutoCreate())
        this.usage = new StringType(); // bb
    return this.usage;
  }

  public boolean hasUsageElement() {
    return this.usage != null && !this.usage.isEmpty();
  }

  public boolean hasUsage() {
    return this.usage != null && !this.usage.isEmpty();
  }

  /**
   * @param value {@link #usage} (A detailed description of how the event
   *              definition is used from a clinical perspective.). This is the
   *              underlying object with id, value and extensions. The accessor
   *              "getUsage" gives direct access to the value
   */
  public EventDefinition setUsageElement(StringType value) {
    this.usage = value;
    return this;
  }

  /**
   * @return A detailed description of how the event definition is used from a
   *         clinical perspective.
   */
  public String getUsage() {
    return this.usage == null ? null : this.usage.getValue();
  }

  /**
   * @param value A detailed description of how the event definition is used from
   *              a clinical perspective.
   */
  public EventDefinition setUsage(String value) {
    if (Utilities.noString(value))
      this.usage = null;
    else {
      if (this.usage == null)
        this.usage = new StringType();
      this.usage.setValue(value);
    }
    return this;
  }

  /**
   * @return {@link #copyright} (A copyright statement relating to the event
   *         definition and/or its contents. Copyright statements are generally
   *         legal restrictions on the use and publishing of the event
   *         definition.). This is the underlying object with id, value and
   *         extensions. The accessor "getCopyright" gives direct access to the
   *         value
   */
  public MarkdownType getCopyrightElement() {
    if (this.copyright == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create EventDefinition.copyright");
      else if (Configuration.doAutoCreate())
        this.copyright = new MarkdownType(); // bb
    return this.copyright;
  }

  public boolean hasCopyrightElement() {
    return this.copyright != null && !this.copyright.isEmpty();
  }

  public boolean hasCopyright() {
    return this.copyright != null && !this.copyright.isEmpty();
  }

  /**
   * @param value {@link #copyright} (A copyright statement relating to the event
   *              definition and/or its contents. Copyright statements are
   *              generally legal restrictions on the use and publishing of the
   *              event definition.). This is the underlying object with id, value
   *              and extensions. The accessor "getCopyright" gives direct access
   *              to the value
   */
  public EventDefinition setCopyrightElement(MarkdownType value) {
    this.copyright = value;
    return this;
  }

  /**
   * @return A copyright statement relating to the event definition and/or its
   *         contents. Copyright statements are generally legal restrictions on
   *         the use and publishing of the event definition.
   */
  public String getCopyright() {
    return this.copyright == null ? null : this.copyright.getValue();
  }

  /**
   * @param value A copyright statement relating to the event definition and/or
   *              its contents. Copyright statements are generally legal
   *              restrictions on the use and publishing of the event definition.
   */
  public EventDefinition setCopyright(String value) {
    if (value == null)
      this.copyright = null;
    else {
      if (this.copyright == null)
        this.copyright = new MarkdownType();
      this.copyright.setValue(value);
    }
    return this;
  }

  /**
   * @return {@link #approvalDate} (The date on which the resource content was
   *         approved by the publisher. Approval happens once when the content is
   *         officially approved for usage.). This is the underlying object with
   *         id, value and extensions. The accessor "getApprovalDate" gives direct
   *         access to the value
   */
  public DateType getApprovalDateElement() {
    if (this.approvalDate == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create EventDefinition.approvalDate");
      else if (Configuration.doAutoCreate())
        this.approvalDate = new DateType(); // bb
    return this.approvalDate;
  }

  public boolean hasApprovalDateElement() {
    return this.approvalDate != null && !this.approvalDate.isEmpty();
  }

  public boolean hasApprovalDate() {
    return this.approvalDate != null && !this.approvalDate.isEmpty();
  }

  /**
   * @param value {@link #approvalDate} (The date on which the resource content
   *              was approved by the publisher. Approval happens once when the
   *              content is officially approved for usage.). This is the
   *              underlying object with id, value and extensions. The accessor
   *              "getApprovalDate" gives direct access to the value
   */
  public EventDefinition setApprovalDateElement(DateType value) {
    this.approvalDate = value;
    return this;
  }

  /**
   * @return The date on which the resource content was approved by the publisher.
   *         Approval happens once when the content is officially approved for
   *         usage.
   */
  public Date getApprovalDate() {
    return this.approvalDate == null ? null : this.approvalDate.getValue();
  }

  /**
   * @param value The date on which the resource content was approved by the
   *              publisher. Approval happens once when the content is officially
   *              approved for usage.
   */
  public EventDefinition setApprovalDate(Date value) {
    if (value == null)
      this.approvalDate = null;
    else {
      if (this.approvalDate == null)
        this.approvalDate = new DateType();
      this.approvalDate.setValue(value);
    }
    return this;
  }

  /**
   * @return {@link #lastReviewDate} (The date on which the resource content was
   *         last reviewed. Review happens periodically after approval but does
   *         not change the original approval date.). This is the underlying
   *         object with id, value and extensions. The accessor
   *         "getLastReviewDate" gives direct access to the value
   */
  public DateType getLastReviewDateElement() {
    if (this.lastReviewDate == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create EventDefinition.lastReviewDate");
      else if (Configuration.doAutoCreate())
        this.lastReviewDate = new DateType(); // bb
    return this.lastReviewDate;
  }

  public boolean hasLastReviewDateElement() {
    return this.lastReviewDate != null && !this.lastReviewDate.isEmpty();
  }

  public boolean hasLastReviewDate() {
    return this.lastReviewDate != null && !this.lastReviewDate.isEmpty();
  }

  /**
   * @param value {@link #lastReviewDate} (The date on which the resource content
   *              was last reviewed. Review happens periodically after approval
   *              but does not change the original approval date.). This is the
   *              underlying object with id, value and extensions. The accessor
   *              "getLastReviewDate" gives direct access to the value
   */
  public EventDefinition setLastReviewDateElement(DateType value) {
    this.lastReviewDate = value;
    return this;
  }

  /**
   * @return The date on which the resource content was last reviewed. Review
   *         happens periodically after approval but does not change the original
   *         approval date.
   */
  public Date getLastReviewDate() {
    return this.lastReviewDate == null ? null : this.lastReviewDate.getValue();
  }

  /**
   * @param value The date on which the resource content was last reviewed. Review
   *              happens periodically after approval but does not change the
   *              original approval date.
   */
  public EventDefinition setLastReviewDate(Date value) {
    if (value == null)
      this.lastReviewDate = null;
    else {
      if (this.lastReviewDate == null)
        this.lastReviewDate = new DateType();
      this.lastReviewDate.setValue(value);
    }
    return this;
  }

  /**
   * @return {@link #effectivePeriod} (The period during which the event
   *         definition content was or is planned to be in active use.)
   */
  public Period getEffectivePeriod() {
    if (this.effectivePeriod == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create EventDefinition.effectivePeriod");
      else if (Configuration.doAutoCreate())
        this.effectivePeriod = new Period(); // cc
    return this.effectivePeriod;
  }

  public boolean hasEffectivePeriod() {
    return this.effectivePeriod != null && !this.effectivePeriod.isEmpty();
  }

  /**
   * @param value {@link #effectivePeriod} (The period during which the event
   *              definition content was or is planned to be in active use.)
   */
  public EventDefinition setEffectivePeriod(Period value) {
    this.effectivePeriod = value;
    return this;
  }

  /**
   * @return {@link #topic} (Descriptive topics related to the module. Topics
   *         provide a high-level categorization of the module that can be useful
   *         for filtering and searching.)
   */
  public List<CodeableConcept> getTopic() {
    if (this.topic == null)
      this.topic = new ArrayList<CodeableConcept>();
    return this.topic;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public EventDefinition setTopic(List<CodeableConcept> theTopic) {
    this.topic = theTopic;
    return this;
  }

  public boolean hasTopic() {
    if (this.topic == null)
      return false;
    for (CodeableConcept item : this.topic)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public CodeableConcept addTopic() { // 3
    CodeableConcept t = new CodeableConcept();
    if (this.topic == null)
      this.topic = new ArrayList<CodeableConcept>();
    this.topic.add(t);
    return t;
  }

  public EventDefinition addTopic(CodeableConcept t) { // 3
    if (t == null)
      return this;
    if (this.topic == null)
      this.topic = new ArrayList<CodeableConcept>();
    this.topic.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #topic}, creating it
   *         if it does not already exist
   */
  public CodeableConcept getTopicFirstRep() {
    if (getTopic().isEmpty()) {
      addTopic();
    }
    return getTopic().get(0);
  }

  /**
   * @return {@link #author} (An individiual or organization primarily involved in
   *         the creation and maintenance of the content.)
   */
  public List<ContactDetail> getAuthor() {
    if (this.author == null)
      this.author = new ArrayList<ContactDetail>();
    return this.author;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public EventDefinition setAuthor(List<ContactDetail> theAuthor) {
    this.author = theAuthor;
    return this;
  }

  public boolean hasAuthor() {
    if (this.author == null)
      return false;
    for (ContactDetail item : this.author)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public ContactDetail addAuthor() { // 3
    ContactDetail t = new ContactDetail();
    if (this.author == null)
      this.author = new ArrayList<ContactDetail>();
    this.author.add(t);
    return t;
  }

  public EventDefinition addAuthor(ContactDetail t) { // 3
    if (t == null)
      return this;
    if (this.author == null)
      this.author = new ArrayList<ContactDetail>();
    this.author.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #author}, creating it
   *         if it does not already exist
   */
  public ContactDetail getAuthorFirstRep() {
    if (getAuthor().isEmpty()) {
      addAuthor();
    }
    return getAuthor().get(0);
  }

  /**
   * @return {@link #editor} (An individual or organization primarily responsible
   *         for internal coherence of the content.)
   */
  public List<ContactDetail> getEditor() {
    if (this.editor == null)
      this.editor = new ArrayList<ContactDetail>();
    return this.editor;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public EventDefinition setEditor(List<ContactDetail> theEditor) {
    this.editor = theEditor;
    return this;
  }

  public boolean hasEditor() {
    if (this.editor == null)
      return false;
    for (ContactDetail item : this.editor)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public ContactDetail addEditor() { // 3
    ContactDetail t = new ContactDetail();
    if (this.editor == null)
      this.editor = new ArrayList<ContactDetail>();
    this.editor.add(t);
    return t;
  }

  public EventDefinition addEditor(ContactDetail t) { // 3
    if (t == null)
      return this;
    if (this.editor == null)
      this.editor = new ArrayList<ContactDetail>();
    this.editor.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #editor}, creating it
   *         if it does not already exist
   */
  public ContactDetail getEditorFirstRep() {
    if (getEditor().isEmpty()) {
      addEditor();
    }
    return getEditor().get(0);
  }

  /**
   * @return {@link #reviewer} (An individual or organization primarily
   *         responsible for review of some aspect of the content.)
   */
  public List<ContactDetail> getReviewer() {
    if (this.reviewer == null)
      this.reviewer = new ArrayList<ContactDetail>();
    return this.reviewer;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public EventDefinition setReviewer(List<ContactDetail> theReviewer) {
    this.reviewer = theReviewer;
    return this;
  }

  public boolean hasReviewer() {
    if (this.reviewer == null)
      return false;
    for (ContactDetail item : this.reviewer)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public ContactDetail addReviewer() { // 3
    ContactDetail t = new ContactDetail();
    if (this.reviewer == null)
      this.reviewer = new ArrayList<ContactDetail>();
    this.reviewer.add(t);
    return t;
  }

  public EventDefinition addReviewer(ContactDetail t) { // 3
    if (t == null)
      return this;
    if (this.reviewer == null)
      this.reviewer = new ArrayList<ContactDetail>();
    this.reviewer.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #reviewer}, creating
   *         it if it does not already exist
   */
  public ContactDetail getReviewerFirstRep() {
    if (getReviewer().isEmpty()) {
      addReviewer();
    }
    return getReviewer().get(0);
  }

  /**
   * @return {@link #endorser} (An individual or organization responsible for
   *         officially endorsing the content for use in some setting.)
   */
  public List<ContactDetail> getEndorser() {
    if (this.endorser == null)
      this.endorser = new ArrayList<ContactDetail>();
    return this.endorser;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public EventDefinition setEndorser(List<ContactDetail> theEndorser) {
    this.endorser = theEndorser;
    return this;
  }

  public boolean hasEndorser() {
    if (this.endorser == null)
      return false;
    for (ContactDetail item : this.endorser)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public ContactDetail addEndorser() { // 3
    ContactDetail t = new ContactDetail();
    if (this.endorser == null)
      this.endorser = new ArrayList<ContactDetail>();
    this.endorser.add(t);
    return t;
  }

  public EventDefinition addEndorser(ContactDetail t) { // 3
    if (t == null)
      return this;
    if (this.endorser == null)
      this.endorser = new ArrayList<ContactDetail>();
    this.endorser.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #endorser}, creating
   *         it if it does not already exist
   */
  public ContactDetail getEndorserFirstRep() {
    if (getEndorser().isEmpty()) {
      addEndorser();
    }
    return getEndorser().get(0);
  }

  /**
   * @return {@link #relatedArtifact} (Related resources such as additional
   *         documentation, justification, or bibliographic references.)
   */
  public List<RelatedArtifact> getRelatedArtifact() {
    if (this.relatedArtifact == null)
      this.relatedArtifact = new ArrayList<RelatedArtifact>();
    return this.relatedArtifact;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public EventDefinition setRelatedArtifact(List<RelatedArtifact> theRelatedArtifact) {
    this.relatedArtifact = theRelatedArtifact;
    return this;
  }

  public boolean hasRelatedArtifact() {
    if (this.relatedArtifact == null)
      return false;
    for (RelatedArtifact item : this.relatedArtifact)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public RelatedArtifact addRelatedArtifact() { // 3
    RelatedArtifact t = new RelatedArtifact();
    if (this.relatedArtifact == null)
      this.relatedArtifact = new ArrayList<RelatedArtifact>();
    this.relatedArtifact.add(t);
    return t;
  }

  public EventDefinition addRelatedArtifact(RelatedArtifact t) { // 3
    if (t == null)
      return this;
    if (this.relatedArtifact == null)
      this.relatedArtifact = new ArrayList<RelatedArtifact>();
    this.relatedArtifact.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #relatedArtifact},
   *         creating it if it does not already exist
   */
  public RelatedArtifact getRelatedArtifactFirstRep() {
    if (getRelatedArtifact().isEmpty()) {
      addRelatedArtifact();
    }
    return getRelatedArtifact().get(0);
  }

  /**
   * @return {@link #trigger} (The trigger element defines when the event occurs.
   *         If more than one trigger condition is specified, the event fires
   *         whenever any one of the trigger conditions is met.)
   */
  public List<TriggerDefinition> getTrigger() {
    if (this.trigger == null)
      this.trigger = new ArrayList<TriggerDefinition>();
    return this.trigger;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public EventDefinition setTrigger(List<TriggerDefinition> theTrigger) {
    this.trigger = theTrigger;
    return this;
  }

  public boolean hasTrigger() {
    if (this.trigger == null)
      return false;
    for (TriggerDefinition item : this.trigger)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public TriggerDefinition addTrigger() { // 3
    TriggerDefinition t = new TriggerDefinition();
    if (this.trigger == null)
      this.trigger = new ArrayList<TriggerDefinition>();
    this.trigger.add(t);
    return t;
  }

  public EventDefinition addTrigger(TriggerDefinition t) { // 3
    if (t == null)
      return this;
    if (this.trigger == null)
      this.trigger = new ArrayList<TriggerDefinition>();
    this.trigger.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #trigger}, creating it
   *         if it does not already exist
   */
  public TriggerDefinition getTriggerFirstRep() {
    if (getTrigger().isEmpty()) {
      addTrigger();
    }
    return getTrigger().get(0);
  }

  protected void listChildren(List<Property> children) {
    super.listChildren(children);
    children.add(new Property("url", "uri",
        "An absolute URI that is used to identify this event definition when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which at which an authoritative instance of this event definition is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the event definition is stored on different servers.",
        0, 1, url));
    children.add(new Property("identifier", "Identifier",
        "A formal identifier that is used to identify this event definition when it is represented in other formats, or referenced in a specification, model, design or an instance.",
        0, java.lang.Integer.MAX_VALUE, identifier));
    children.add(new Property("version", "string",
        "The identifier that is used to identify this version of the event definition when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the event definition author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.",
        0, 1, version));
    children.add(new Property("name", "string",
        "A natural language name identifying the event definition. This name should be usable as an identifier for the module by machine processing applications such as code generation.",
        0, 1, name));
    children.add(new Property("title", "string", "A short, descriptive, user-friendly title for the event definition.",
        0, 1, title));
    children.add(new Property("subtitle", "string",
        "An explanatory or alternate title for the event definition giving additional information about its content.",
        0, 1, subtitle));
    children.add(new Property("status", "code",
        "The status of this event definition. Enables tracking the life-cycle of the content.", 0, 1, status));
    children.add(new Property("experimental", "boolean",
        "A Boolean value to indicate that this event definition is authored for testing purposes (or education/evaluation/marketing) and is not intended to be used for genuine usage.",
        0, 1, experimental));
    children.add(new Property("subject[x]", "CodeableConcept|Reference(Group)",
        "A code or group definition that describes the intended subject of the event definition.", 0, 1, subject));
    children.add(new Property("date", "dateTime",
        "The date  (and optionally time) when the event definition was published. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the event definition changes.",
        0, 1, date));
    children.add(new Property("publisher", "string",
        "The name of the organization or individual that published the event definition.", 0, 1, publisher));
    children.add(new Property("contact", "ContactDetail",
        "Contact details to assist a user in finding and communicating with the publisher.", 0,
        java.lang.Integer.MAX_VALUE, contact));
    children.add(new Property("description", "markdown",
        "A free text natural language description of the event definition from a consumer's perspective.", 0, 1,
        description));
    children.add(new Property("useContext", "UsageContext",
        "The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate event definition instances.",
        0, java.lang.Integer.MAX_VALUE, useContext));
    children.add(new Property("jurisdiction", "CodeableConcept",
        "A legal or geographic region in which the event definition is intended to be used.", 0,
        java.lang.Integer.MAX_VALUE, jurisdiction));
    children.add(new Property("purpose", "markdown",
        "Explanation of why this event definition is needed and why it has been designed as it has.", 0, 1, purpose));
    children.add(new Property("usage", "string",
        "A detailed description of how the event definition is used from a clinical perspective.", 0, 1, usage));
    children.add(new Property("copyright", "markdown",
        "A copyright statement relating to the event definition and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the event definition.",
        0, 1, copyright));
    children.add(new Property("approvalDate", "date",
        "The date on which the resource content was approved by the publisher. Approval happens once when the content is officially approved for usage.",
        0, 1, approvalDate));
    children.add(new Property("lastReviewDate", "date",
        "The date on which the resource content was last reviewed. Review happens periodically after approval but does not change the original approval date.",
        0, 1, lastReviewDate));
    children.add(new Property("effectivePeriod", "Period",
        "The period during which the event definition content was or is planned to be in active use.", 0, 1,
        effectivePeriod));
    children.add(new Property("topic", "CodeableConcept",
        "Descriptive topics related to the module. Topics provide a high-level categorization of the module that can be useful for filtering and searching.",
        0, java.lang.Integer.MAX_VALUE, topic));
    children.add(new Property("author", "ContactDetail",
        "An individiual or organization primarily involved in the creation and maintenance of the content.", 0,
        java.lang.Integer.MAX_VALUE, author));
    children.add(new Property("editor", "ContactDetail",
        "An individual or organization primarily responsible for internal coherence of the content.", 0,
        java.lang.Integer.MAX_VALUE, editor));
    children.add(new Property("reviewer", "ContactDetail",
        "An individual or organization primarily responsible for review of some aspect of the content.", 0,
        java.lang.Integer.MAX_VALUE, reviewer));
    children.add(new Property("endorser", "ContactDetail",
        "An individual or organization responsible for officially endorsing the content for use in some setting.", 0,
        java.lang.Integer.MAX_VALUE, endorser));
    children.add(new Property("relatedArtifact", "RelatedArtifact",
        "Related resources such as additional documentation, justification, or bibliographic references.", 0,
        java.lang.Integer.MAX_VALUE, relatedArtifact));
    children.add(new Property("trigger", "TriggerDefinition",
        "The trigger element defines when the event occurs. If more than one trigger condition is specified, the event fires whenever any one of the trigger conditions is met.",
        0, java.lang.Integer.MAX_VALUE, trigger));
  }

  @Override
  public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
    switch (_hash) {
    case 116079:
      /* url */ return new Property("url", "uri",
          "An absolute URI that is used to identify this event definition when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which at which an authoritative instance of this event definition is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the event definition is stored on different servers.",
          0, 1, url);
    case -1618432855:
      /* identifier */ return new Property("identifier", "Identifier",
          "A formal identifier that is used to identify this event definition when it is represented in other formats, or referenced in a specification, model, design or an instance.",
          0, java.lang.Integer.MAX_VALUE, identifier);
    case 351608024:
      /* version */ return new Property("version", "string",
          "The identifier that is used to identify this version of the event definition when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the event definition author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.",
          0, 1, version);
    case 3373707:
      /* name */ return new Property("name", "string",
          "A natural language name identifying the event definition. This name should be usable as an identifier for the module by machine processing applications such as code generation.",
          0, 1, name);
    case 110371416:
      /* title */ return new Property("title", "string",
          "A short, descriptive, user-friendly title for the event definition.", 0, 1, title);
    case -2060497896:
      /* subtitle */ return new Property("subtitle", "string",
          "An explanatory or alternate title for the event definition giving additional information about its content.",
          0, 1, subtitle);
    case -892481550:
      /* status */ return new Property("status", "code",
          "The status of this event definition. Enables tracking the life-cycle of the content.", 0, 1, status);
    case -404562712:
      /* experimental */ return new Property("experimental", "boolean",
          "A Boolean value to indicate that this event definition is authored for testing purposes (or education/evaluation/marketing) and is not intended to be used for genuine usage.",
          0, 1, experimental);
    case -573640748:
      /* subject[x] */ return new Property("subject[x]", "CodeableConcept|Reference(Group)",
          "A code or group definition that describes the intended subject of the event definition.", 0, 1, subject);
    case -1867885268:
      /* subject */ return new Property("subject[x]", "CodeableConcept|Reference(Group)",
          "A code or group definition that describes the intended subject of the event definition.", 0, 1, subject);
    case -1257122603:
      /* subjectCodeableConcept */ return new Property("subject[x]", "CodeableConcept|Reference(Group)",
          "A code or group definition that describes the intended subject of the event definition.", 0, 1, subject);
    case 772938623:
      /* subjectReference */ return new Property("subject[x]", "CodeableConcept|Reference(Group)",
          "A code or group definition that describes the intended subject of the event definition.", 0, 1, subject);
    case 3076014:
      /* date */ return new Property("date", "dateTime",
          "The date  (and optionally time) when the event definition was published. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the event definition changes.",
          0, 1, date);
    case 1447404028:
      /* publisher */ return new Property("publisher", "string",
          "The name of the organization or individual that published the event definition.", 0, 1, publisher);
    case 951526432:
      /* contact */ return new Property("contact", "ContactDetail",
          "Contact details to assist a user in finding and communicating with the publisher.", 0,
          java.lang.Integer.MAX_VALUE, contact);
    case -1724546052:
      /* description */ return new Property("description", "markdown",
          "A free text natural language description of the event definition from a consumer's perspective.", 0, 1,
          description);
    case -669707736:
      /* useContext */ return new Property("useContext", "UsageContext",
          "The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate event definition instances.",
          0, java.lang.Integer.MAX_VALUE, useContext);
    case -507075711:
      /* jurisdiction */ return new Property("jurisdiction", "CodeableConcept",
          "A legal or geographic region in which the event definition is intended to be used.", 0,
          java.lang.Integer.MAX_VALUE, jurisdiction);
    case -220463842:
      /* purpose */ return new Property("purpose", "markdown",
          "Explanation of why this event definition is needed and why it has been designed as it has.", 0, 1, purpose);
    case 111574433:
      /* usage */ return new Property("usage", "string",
          "A detailed description of how the event definition is used from a clinical perspective.", 0, 1, usage);
    case 1522889671:
      /* copyright */ return new Property("copyright", "markdown",
          "A copyright statement relating to the event definition and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the event definition.",
          0, 1, copyright);
    case 223539345:
      /* approvalDate */ return new Property("approvalDate", "date",
          "The date on which the resource content was approved by the publisher. Approval happens once when the content is officially approved for usage.",
          0, 1, approvalDate);
    case -1687512484:
      /* lastReviewDate */ return new Property("lastReviewDate", "date",
          "The date on which the resource content was last reviewed. Review happens periodically after approval but does not change the original approval date.",
          0, 1, lastReviewDate);
    case -403934648:
      /* effectivePeriod */ return new Property("effectivePeriod", "Period",
          "The period during which the event definition content was or is planned to be in active use.", 0, 1,
          effectivePeriod);
    case 110546223:
      /* topic */ return new Property("topic", "CodeableConcept",
          "Descriptive topics related to the module. Topics provide a high-level categorization of the module that can be useful for filtering and searching.",
          0, java.lang.Integer.MAX_VALUE, topic);
    case -1406328437:
      /* author */ return new Property("author", "ContactDetail",
          "An individiual or organization primarily involved in the creation and maintenance of the content.", 0,
          java.lang.Integer.MAX_VALUE, author);
    case -1307827859:
      /* editor */ return new Property("editor", "ContactDetail",
          "An individual or organization primarily responsible for internal coherence of the content.", 0,
          java.lang.Integer.MAX_VALUE, editor);
    case -261190139:
      /* reviewer */ return new Property("reviewer", "ContactDetail",
          "An individual or organization primarily responsible for review of some aspect of the content.", 0,
          java.lang.Integer.MAX_VALUE, reviewer);
    case 1740277666:
      /* endorser */ return new Property("endorser", "ContactDetail",
          "An individual or organization responsible for officially endorsing the content for use in some setting.", 0,
          java.lang.Integer.MAX_VALUE, endorser);
    case 666807069:
      /* relatedArtifact */ return new Property("relatedArtifact", "RelatedArtifact",
          "Related resources such as additional documentation, justification, or bibliographic references.", 0,
          java.lang.Integer.MAX_VALUE, relatedArtifact);
    case -1059891784:
      /* trigger */ return new Property("trigger", "TriggerDefinition",
          "The trigger element defines when the event occurs. If more than one trigger condition is specified, the event fires whenever any one of the trigger conditions is met.",
          0, java.lang.Integer.MAX_VALUE, trigger);
    default:
      return super.getNamedProperty(_hash, _name, _checkValid);
    }

  }

  @Override
  public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
    switch (hash) {
    case 116079:
      /* url */ return this.url == null ? new Base[0] : new Base[] { this.url }; // UriType
    case -1618432855:
      /* identifier */ return this.identifier == null ? new Base[0]
          : this.identifier.toArray(new Base[this.identifier.size()]); // Identifier
    case 351608024:
      /* version */ return this.version == null ? new Base[0] : new Base[] { this.version }; // StringType
    case 3373707:
      /* name */ return this.name == null ? new Base[0] : new Base[] { this.name }; // StringType
    case 110371416:
      /* title */ return this.title == null ? new Base[0] : new Base[] { this.title }; // StringType
    case -2060497896:
      /* subtitle */ return this.subtitle == null ? new Base[0] : new Base[] { this.subtitle }; // StringType
    case -892481550:
      /* status */ return this.status == null ? new Base[0] : new Base[] { this.status }; // Enumeration<PublicationStatus>
    case -404562712:
      /* experimental */ return this.experimental == null ? new Base[0] : new Base[] { this.experimental }; // BooleanType
    case -1867885268:
      /* subject */ return this.subject == null ? new Base[0] : new Base[] { this.subject }; // Type
    case 3076014:
      /* date */ return this.date == null ? new Base[0] : new Base[] { this.date }; // DateTimeType
    case 1447404028:
      /* publisher */ return this.publisher == null ? new Base[0] : new Base[] { this.publisher }; // StringType
    case 951526432:
      /* contact */ return this.contact == null ? new Base[0] : this.contact.toArray(new Base[this.contact.size()]); // ContactDetail
    case -1724546052:
      /* description */ return this.description == null ? new Base[0] : new Base[] { this.description }; // MarkdownType
    case -669707736:
      /* useContext */ return this.useContext == null ? new Base[0]
          : this.useContext.toArray(new Base[this.useContext.size()]); // UsageContext
    case -507075711:
      /* jurisdiction */ return this.jurisdiction == null ? new Base[0]
          : this.jurisdiction.toArray(new Base[this.jurisdiction.size()]); // CodeableConcept
    case -220463842:
      /* purpose */ return this.purpose == null ? new Base[0] : new Base[] { this.purpose }; // MarkdownType
    case 111574433:
      /* usage */ return this.usage == null ? new Base[0] : new Base[] { this.usage }; // StringType
    case 1522889671:
      /* copyright */ return this.copyright == null ? new Base[0] : new Base[] { this.copyright }; // MarkdownType
    case 223539345:
      /* approvalDate */ return this.approvalDate == null ? new Base[0] : new Base[] { this.approvalDate }; // DateType
    case -1687512484:
      /* lastReviewDate */ return this.lastReviewDate == null ? new Base[0] : new Base[] { this.lastReviewDate }; // DateType
    case -403934648:
      /* effectivePeriod */ return this.effectivePeriod == null ? new Base[0] : new Base[] { this.effectivePeriod }; // Period
    case 110546223:
      /* topic */ return this.topic == null ? new Base[0] : this.topic.toArray(new Base[this.topic.size()]); // CodeableConcept
    case -1406328437:
      /* author */ return this.author == null ? new Base[0] : this.author.toArray(new Base[this.author.size()]); // ContactDetail
    case -1307827859:
      /* editor */ return this.editor == null ? new Base[0] : this.editor.toArray(new Base[this.editor.size()]); // ContactDetail
    case -261190139:
      /* reviewer */ return this.reviewer == null ? new Base[0] : this.reviewer.toArray(new Base[this.reviewer.size()]); // ContactDetail
    case 1740277666:
      /* endorser */ return this.endorser == null ? new Base[0] : this.endorser.toArray(new Base[this.endorser.size()]); // ContactDetail
    case 666807069:
      /* relatedArtifact */ return this.relatedArtifact == null ? new Base[0]
          : this.relatedArtifact.toArray(new Base[this.relatedArtifact.size()]); // RelatedArtifact
    case -1059891784:
      /* trigger */ return this.trigger == null ? new Base[0] : this.trigger.toArray(new Base[this.trigger.size()]); // TriggerDefinition
    default:
      return super.getProperty(hash, name, checkValid);
    }

  }

  @Override
  public Base setProperty(int hash, String name, Base value) throws FHIRException {
    switch (hash) {
    case 116079: // url
      this.url = castToUri(value); // UriType
      return value;
    case -1618432855: // identifier
      this.getIdentifier().add(castToIdentifier(value)); // Identifier
      return value;
    case 351608024: // version
      this.version = castToString(value); // StringType
      return value;
    case 3373707: // name
      this.name = castToString(value); // StringType
      return value;
    case 110371416: // title
      this.title = castToString(value); // StringType
      return value;
    case -2060497896: // subtitle
      this.subtitle = castToString(value); // StringType
      return value;
    case -892481550: // status
      value = new PublicationStatusEnumFactory().fromType(castToCode(value));
      this.status = (Enumeration) value; // Enumeration<PublicationStatus>
      return value;
    case -404562712: // experimental
      this.experimental = castToBoolean(value); // BooleanType
      return value;
    case -1867885268: // subject
      this.subject = castToType(value); // Type
      return value;
    case 3076014: // date
      this.date = castToDateTime(value); // DateTimeType
      return value;
    case 1447404028: // publisher
      this.publisher = castToString(value); // StringType
      return value;
    case 951526432: // contact
      this.getContact().add(castToContactDetail(value)); // ContactDetail
      return value;
    case -1724546052: // description
      this.description = castToMarkdown(value); // MarkdownType
      return value;
    case -669707736: // useContext
      this.getUseContext().add(castToUsageContext(value)); // UsageContext
      return value;
    case -507075711: // jurisdiction
      this.getJurisdiction().add(castToCodeableConcept(value)); // CodeableConcept
      return value;
    case -220463842: // purpose
      this.purpose = castToMarkdown(value); // MarkdownType
      return value;
    case 111574433: // usage
      this.usage = castToString(value); // StringType
      return value;
    case 1522889671: // copyright
      this.copyright = castToMarkdown(value); // MarkdownType
      return value;
    case 223539345: // approvalDate
      this.approvalDate = castToDate(value); // DateType
      return value;
    case -1687512484: // lastReviewDate
      this.lastReviewDate = castToDate(value); // DateType
      return value;
    case -403934648: // effectivePeriod
      this.effectivePeriod = castToPeriod(value); // Period
      return value;
    case 110546223: // topic
      this.getTopic().add(castToCodeableConcept(value)); // CodeableConcept
      return value;
    case -1406328437: // author
      this.getAuthor().add(castToContactDetail(value)); // ContactDetail
      return value;
    case -1307827859: // editor
      this.getEditor().add(castToContactDetail(value)); // ContactDetail
      return value;
    case -261190139: // reviewer
      this.getReviewer().add(castToContactDetail(value)); // ContactDetail
      return value;
    case 1740277666: // endorser
      this.getEndorser().add(castToContactDetail(value)); // ContactDetail
      return value;
    case 666807069: // relatedArtifact
      this.getRelatedArtifact().add(castToRelatedArtifact(value)); // RelatedArtifact
      return value;
    case -1059891784: // trigger
      this.getTrigger().add(castToTriggerDefinition(value)); // TriggerDefinition
      return value;
    default:
      return super.setProperty(hash, name, value);
    }

  }

  @Override
  public Base setProperty(String name, Base value) throws FHIRException {
    if (name.equals("url")) {
      this.url = castToUri(value); // UriType
    } else if (name.equals("identifier")) {
      this.getIdentifier().add(castToIdentifier(value));
    } else if (name.equals("version")) {
      this.version = castToString(value); // StringType
    } else if (name.equals("name")) {
      this.name = castToString(value); // StringType
    } else if (name.equals("title")) {
      this.title = castToString(value); // StringType
    } else if (name.equals("subtitle")) {
      this.subtitle = castToString(value); // StringType
    } else if (name.equals("status")) {
      value = new PublicationStatusEnumFactory().fromType(castToCode(value));
      this.status = (Enumeration) value; // Enumeration<PublicationStatus>
    } else if (name.equals("experimental")) {
      this.experimental = castToBoolean(value); // BooleanType
    } else if (name.equals("subject[x]")) {
      this.subject = castToType(value); // Type
    } else if (name.equals("date")) {
      this.date = castToDateTime(value); // DateTimeType
    } else if (name.equals("publisher")) {
      this.publisher = castToString(value); // StringType
    } else if (name.equals("contact")) {
      this.getContact().add(castToContactDetail(value));
    } else if (name.equals("description")) {
      this.description = castToMarkdown(value); // MarkdownType
    } else if (name.equals("useContext")) {
      this.getUseContext().add(castToUsageContext(value));
    } else if (name.equals("jurisdiction")) {
      this.getJurisdiction().add(castToCodeableConcept(value));
    } else if (name.equals("purpose")) {
      this.purpose = castToMarkdown(value); // MarkdownType
    } else if (name.equals("usage")) {
      this.usage = castToString(value); // StringType
    } else if (name.equals("copyright")) {
      this.copyright = castToMarkdown(value); // MarkdownType
    } else if (name.equals("approvalDate")) {
      this.approvalDate = castToDate(value); // DateType
    } else if (name.equals("lastReviewDate")) {
      this.lastReviewDate = castToDate(value); // DateType
    } else if (name.equals("effectivePeriod")) {
      this.effectivePeriod = castToPeriod(value); // Period
    } else if (name.equals("topic")) {
      this.getTopic().add(castToCodeableConcept(value));
    } else if (name.equals("author")) {
      this.getAuthor().add(castToContactDetail(value));
    } else if (name.equals("editor")) {
      this.getEditor().add(castToContactDetail(value));
    } else if (name.equals("reviewer")) {
      this.getReviewer().add(castToContactDetail(value));
    } else if (name.equals("endorser")) {
      this.getEndorser().add(castToContactDetail(value));
    } else if (name.equals("relatedArtifact")) {
      this.getRelatedArtifact().add(castToRelatedArtifact(value));
    } else if (name.equals("trigger")) {
      this.getTrigger().add(castToTriggerDefinition(value));
    } else
      return super.setProperty(name, value);
    return value;
  }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
    if (name.equals("url")) {
      this.url = null;
    } else if (name.equals("identifier")) {
      this.getIdentifier().remove(castToIdentifier(value));
    } else if (name.equals("version")) {
      this.version = null;
    } else if (name.equals("name")) {
      this.name = null;
    } else if (name.equals("title")) {
      this.title = null;
    } else if (name.equals("subtitle")) {
      this.subtitle = null;
    } else if (name.equals("status")) {
      this.status = null;
    } else if (name.equals("experimental")) {
      this.experimental = null;
    } else if (name.equals("subject[x]")) {
      this.subject = null;
    } else if (name.equals("date")) {
      this.date = null;
    } else if (name.equals("publisher")) {
      this.publisher = null;
    } else if (name.equals("contact")) {
      this.getContact().remove(castToContactDetail(value));
    } else if (name.equals("description")) {
      this.description = null;
    } else if (name.equals("useContext")) {
      this.getUseContext().remove(castToUsageContext(value));
    } else if (name.equals("jurisdiction")) {
      this.getJurisdiction().remove(castToCodeableConcept(value));
    } else if (name.equals("purpose")) {
      this.purpose = null;
    } else if (name.equals("usage")) {
      this.usage = null;
    } else if (name.equals("copyright")) {
      this.copyright = null;
    } else if (name.equals("approvalDate")) {
      this.approvalDate = null;
    } else if (name.equals("lastReviewDate")) {
      this.lastReviewDate = null;
    } else if (name.equals("effectivePeriod")) {
      this.effectivePeriod = null;
    } else if (name.equals("topic")) {
      this.getTopic().remove(castToCodeableConcept(value));
    } else if (name.equals("author")) {
      this.getAuthor().remove(castToContactDetail(value));
    } else if (name.equals("editor")) {
      this.getEditor().remove(castToContactDetail(value));
    } else if (name.equals("reviewer")) {
      this.getReviewer().remove(castToContactDetail(value));
    } else if (name.equals("endorser")) {
      this.getEndorser().remove(castToContactDetail(value));
    } else if (name.equals("relatedArtifact")) {
      this.getRelatedArtifact().remove(castToRelatedArtifact(value));
    } else if (name.equals("trigger")) {
      this.getTrigger().remove(castToTriggerDefinition(value));
    } else
      super.removeChild(name, value);
    
  }

  @Override
  public Base makeProperty(int hash, String name) throws FHIRException {
    switch (hash) {
    case 116079:
      return getUrlElement();
    case -1618432855:
      return addIdentifier();
    case 351608024:
      return getVersionElement();
    case 3373707:
      return getNameElement();
    case 110371416:
      return getTitleElement();
    case -2060497896:
      return getSubtitleElement();
    case -892481550:
      return getStatusElement();
    case -404562712:
      return getExperimentalElement();
    case -573640748:
      return getSubject();
    case -1867885268:
      return getSubject();
    case 3076014:
      return getDateElement();
    case 1447404028:
      return getPublisherElement();
    case 951526432:
      return addContact();
    case -1724546052:
      return getDescriptionElement();
    case -669707736:
      return addUseContext();
    case -507075711:
      return addJurisdiction();
    case -220463842:
      return getPurposeElement();
    case 111574433:
      return getUsageElement();
    case 1522889671:
      return getCopyrightElement();
    case 223539345:
      return getApprovalDateElement();
    case -1687512484:
      return getLastReviewDateElement();
    case -403934648:
      return getEffectivePeriod();
    case 110546223:
      return addTopic();
    case -1406328437:
      return addAuthor();
    case -1307827859:
      return addEditor();
    case -261190139:
      return addReviewer();
    case 1740277666:
      return addEndorser();
    case 666807069:
      return addRelatedArtifact();
    case -1059891784:
      return addTrigger();
    default:
      return super.makeProperty(hash, name);
    }

  }

  @Override
  public String[] getTypesForProperty(int hash, String name) throws FHIRException {
    switch (hash) {
    case 116079:
      /* url */ return new String[] { "uri" };
    case -1618432855:
      /* identifier */ return new String[] { "Identifier" };
    case 351608024:
      /* version */ return new String[] { "string" };
    case 3373707:
      /* name */ return new String[] { "string" };
    case 110371416:
      /* title */ return new String[] { "string" };
    case -2060497896:
      /* subtitle */ return new String[] { "string" };
    case -892481550:
      /* status */ return new String[] { "code" };
    case -404562712:
      /* experimental */ return new String[] { "boolean" };
    case -1867885268:
      /* subject */ return new String[] { "CodeableConcept", "Reference" };
    case 3076014:
      /* date */ return new String[] { "dateTime" };
    case 1447404028:
      /* publisher */ return new String[] { "string" };
    case 951526432:
      /* contact */ return new String[] { "ContactDetail" };
    case -1724546052:
      /* description */ return new String[] { "markdown" };
    case -669707736:
      /* useContext */ return new String[] { "UsageContext" };
    case -507075711:
      /* jurisdiction */ return new String[] { "CodeableConcept" };
    case -220463842:
      /* purpose */ return new String[] { "markdown" };
    case 111574433:
      /* usage */ return new String[] { "string" };
    case 1522889671:
      /* copyright */ return new String[] { "markdown" };
    case 223539345:
      /* approvalDate */ return new String[] { "date" };
    case -1687512484:
      /* lastReviewDate */ return new String[] { "date" };
    case -403934648:
      /* effectivePeriod */ return new String[] { "Period" };
    case 110546223:
      /* topic */ return new String[] { "CodeableConcept" };
    case -1406328437:
      /* author */ return new String[] { "ContactDetail" };
    case -1307827859:
      /* editor */ return new String[] { "ContactDetail" };
    case -261190139:
      /* reviewer */ return new String[] { "ContactDetail" };
    case 1740277666:
      /* endorser */ return new String[] { "ContactDetail" };
    case 666807069:
      /* relatedArtifact */ return new String[] { "RelatedArtifact" };
    case -1059891784:
      /* trigger */ return new String[] { "TriggerDefinition" };
    default:
      return super.getTypesForProperty(hash, name);
    }

  }

  @Override
  public Base addChild(String name) throws FHIRException {
    if (name.equals("url")) {
      throw new FHIRException("Cannot call addChild on a singleton property EventDefinition.url");
    } else if (name.equals("identifier")) {
      return addIdentifier();
    } else if (name.equals("version")) {
      throw new FHIRException("Cannot call addChild on a singleton property EventDefinition.version");
    } else if (name.equals("name")) {
      throw new FHIRException("Cannot call addChild on a singleton property EventDefinition.name");
    } else if (name.equals("title")) {
      throw new FHIRException("Cannot call addChild on a singleton property EventDefinition.title");
    } else if (name.equals("subtitle")) {
      throw new FHIRException("Cannot call addChild on a singleton property EventDefinition.subtitle");
    } else if (name.equals("status")) {
      throw new FHIRException("Cannot call addChild on a singleton property EventDefinition.status");
    } else if (name.equals("experimental")) {
      throw new FHIRException("Cannot call addChild on a singleton property EventDefinition.experimental");
    } else if (name.equals("subjectCodeableConcept")) {
      this.subject = new CodeableConcept();
      return this.subject;
    } else if (name.equals("subjectReference")) {
      this.subject = new Reference();
      return this.subject;
    } else if (name.equals("date")) {
      throw new FHIRException("Cannot call addChild on a singleton property EventDefinition.date");
    } else if (name.equals("publisher")) {
      throw new FHIRException("Cannot call addChild on a singleton property EventDefinition.publisher");
    } else if (name.equals("contact")) {
      return addContact();
    } else if (name.equals("description")) {
      throw new FHIRException("Cannot call addChild on a singleton property EventDefinition.description");
    } else if (name.equals("useContext")) {
      return addUseContext();
    } else if (name.equals("jurisdiction")) {
      return addJurisdiction();
    } else if (name.equals("purpose")) {
      throw new FHIRException("Cannot call addChild on a singleton property EventDefinition.purpose");
    } else if (name.equals("usage")) {
      throw new FHIRException("Cannot call addChild on a singleton property EventDefinition.usage");
    } else if (name.equals("copyright")) {
      throw new FHIRException("Cannot call addChild on a singleton property EventDefinition.copyright");
    } else if (name.equals("approvalDate")) {
      throw new FHIRException("Cannot call addChild on a singleton property EventDefinition.approvalDate");
    } else if (name.equals("lastReviewDate")) {
      throw new FHIRException("Cannot call addChild on a singleton property EventDefinition.lastReviewDate");
    } else if (name.equals("effectivePeriod")) {
      this.effectivePeriod = new Period();
      return this.effectivePeriod;
    } else if (name.equals("topic")) {
      return addTopic();
    } else if (name.equals("author")) {
      return addAuthor();
    } else if (name.equals("editor")) {
      return addEditor();
    } else if (name.equals("reviewer")) {
      return addReviewer();
    } else if (name.equals("endorser")) {
      return addEndorser();
    } else if (name.equals("relatedArtifact")) {
      return addRelatedArtifact();
    } else if (name.equals("trigger")) {
      return addTrigger();
    } else
      return super.addChild(name);
  }

  public String fhirType() {
    return "EventDefinition";

  }

  public EventDefinition copy() {
    EventDefinition dst = new EventDefinition();
    copyValues(dst);
    return dst;
  }

  public void copyValues(EventDefinition dst) {
    super.copyValues(dst);
    dst.url = url == null ? null : url.copy();
    if (identifier != null) {
      dst.identifier = new ArrayList<Identifier>();
      for (Identifier i : identifier)
        dst.identifier.add(i.copy());
    }
    ;
    dst.version = version == null ? null : version.copy();
    dst.name = name == null ? null : name.copy();
    dst.title = title == null ? null : title.copy();
    dst.subtitle = subtitle == null ? null : subtitle.copy();
    dst.status = status == null ? null : status.copy();
    dst.experimental = experimental == null ? null : experimental.copy();
    dst.subject = subject == null ? null : subject.copy();
    dst.date = date == null ? null : date.copy();
    dst.publisher = publisher == null ? null : publisher.copy();
    if (contact != null) {
      dst.contact = new ArrayList<ContactDetail>();
      for (ContactDetail i : contact)
        dst.contact.add(i.copy());
    }
    ;
    dst.description = description == null ? null : description.copy();
    if (useContext != null) {
      dst.useContext = new ArrayList<UsageContext>();
      for (UsageContext i : useContext)
        dst.useContext.add(i.copy());
    }
    ;
    if (jurisdiction != null) {
      dst.jurisdiction = new ArrayList<CodeableConcept>();
      for (CodeableConcept i : jurisdiction)
        dst.jurisdiction.add(i.copy());
    }
    ;
    dst.purpose = purpose == null ? null : purpose.copy();
    dst.usage = usage == null ? null : usage.copy();
    dst.copyright = copyright == null ? null : copyright.copy();
    dst.approvalDate = approvalDate == null ? null : approvalDate.copy();
    dst.lastReviewDate = lastReviewDate == null ? null : lastReviewDate.copy();
    dst.effectivePeriod = effectivePeriod == null ? null : effectivePeriod.copy();
    if (topic != null) {
      dst.topic = new ArrayList<CodeableConcept>();
      for (CodeableConcept i : topic)
        dst.topic.add(i.copy());
    }
    ;
    if (author != null) {
      dst.author = new ArrayList<ContactDetail>();
      for (ContactDetail i : author)
        dst.author.add(i.copy());
    }
    ;
    if (editor != null) {
      dst.editor = new ArrayList<ContactDetail>();
      for (ContactDetail i : editor)
        dst.editor.add(i.copy());
    }
    ;
    if (reviewer != null) {
      dst.reviewer = new ArrayList<ContactDetail>();
      for (ContactDetail i : reviewer)
        dst.reviewer.add(i.copy());
    }
    ;
    if (endorser != null) {
      dst.endorser = new ArrayList<ContactDetail>();
      for (ContactDetail i : endorser)
        dst.endorser.add(i.copy());
    }
    ;
    if (relatedArtifact != null) {
      dst.relatedArtifact = new ArrayList<RelatedArtifact>();
      for (RelatedArtifact i : relatedArtifact)
        dst.relatedArtifact.add(i.copy());
    }
    ;
    if (trigger != null) {
      dst.trigger = new ArrayList<TriggerDefinition>();
      for (TriggerDefinition i : trigger)
        dst.trigger.add(i.copy());
    }
    ;
  }

  protected EventDefinition typedCopy() {
    return copy();
  }

  @Override
  public boolean equalsDeep(Base other_) {
    if (!super.equalsDeep(other_))
      return false;
    if (!(other_ instanceof EventDefinition))
      return false;
    EventDefinition o = (EventDefinition) other_;
    return compareDeep(identifier, o.identifier, true) && compareDeep(subtitle, o.subtitle, true)
        && compareDeep(subject, o.subject, true) && compareDeep(purpose, o.purpose, true)
        && compareDeep(usage, o.usage, true) && compareDeep(copyright, o.copyright, true)
        && compareDeep(approvalDate, o.approvalDate, true) && compareDeep(lastReviewDate, o.lastReviewDate, true)
        && compareDeep(effectivePeriod, o.effectivePeriod, true) && compareDeep(topic, o.topic, true)
        && compareDeep(author, o.author, true) && compareDeep(editor, o.editor, true)
        && compareDeep(reviewer, o.reviewer, true) && compareDeep(endorser, o.endorser, true)
        && compareDeep(relatedArtifact, o.relatedArtifact, true) && compareDeep(trigger, o.trigger, true);
  }

  @Override
  public boolean equalsShallow(Base other_) {
    if (!super.equalsShallow(other_))
      return false;
    if (!(other_ instanceof EventDefinition))
      return false;
    EventDefinition o = (EventDefinition) other_;
    return compareValues(subtitle, o.subtitle, true) && compareValues(purpose, o.purpose, true)
        && compareValues(usage, o.usage, true) && compareValues(copyright, o.copyright, true)
        && compareValues(approvalDate, o.approvalDate, true) && compareValues(lastReviewDate, o.lastReviewDate, true);
  }

  public boolean isEmpty() {
    return super.isEmpty()
        && ca.uhn.fhir.util.ElementUtil.isEmpty(identifier, subtitle, subject, purpose, usage, copyright, approvalDate,
            lastReviewDate, effectivePeriod, topic, author, editor, reviewer, endorser, relatedArtifact, trigger);
  }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.EventDefinition;
  }

  /**
   * Search parameter: <b>date</b>
   * <p>
   * Description: <b>The event definition publication date</b><br>
   * Type: <b>date</b><br>
   * Path: <b>EventDefinition.date</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "date", path = "EventDefinition.date", description = "The event definition publication date", type = "date")
  public static final String SP_DATE = "date";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>date</b>
   * <p>
   * Description: <b>The event definition publication date</b><br>
   * Type: <b>date</b><br>
   * Path: <b>EventDefinition.date</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.DateClientParam DATE = new ca.uhn.fhir.rest.gclient.DateClientParam(
      SP_DATE);

  /**
   * Search parameter: <b>identifier</b>
   * <p>
   * Description: <b>External identifier for the event definition</b><br>
   * Type: <b>token</b><br>
   * Path: <b>EventDefinition.identifier</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "identifier", path = "EventDefinition.identifier", description = "External identifier for the event definition", type = "token")
  public static final String SP_IDENTIFIER = "identifier";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
   * <p>
   * Description: <b>External identifier for the event definition</b><br>
   * Type: <b>token</b><br>
   * Path: <b>EventDefinition.identifier</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam IDENTIFIER = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_IDENTIFIER);

  /**
   * Search parameter: <b>successor</b>
   * <p>
   * Description: <b>What resource is being referenced</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>EventDefinition.relatedArtifact.resource</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "successor", path = "EventDefinition.relatedArtifact.where(type='successor').resource", description = "What resource is being referenced", type = "reference")
  public static final String SP_SUCCESSOR = "successor";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>successor</b>
   * <p>
   * Description: <b>What resource is being referenced</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>EventDefinition.relatedArtifact.resource</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam SUCCESSOR = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(
      SP_SUCCESSOR);

  /**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>EventDefinition:successor</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_SUCCESSOR = new ca.uhn.fhir.model.api.Include(
      "EventDefinition:successor").toLocked();

  /**
   * Search parameter: <b>context-type-value</b>
   * <p>
   * Description: <b>A use context type and value assigned to the event
   * definition</b><br>
   * Type: <b>composite</b><br>
   * Path: <b></b><br>
   * </p>
   */
  @SearchParamDefinition(name = "context-type-value", path = "EventDefinition.useContext", description = "A use context type and value assigned to the event definition", type = "composite", compositeOf = {
      "context-type", "context" })
  public static final String SP_CONTEXT_TYPE_VALUE = "context-type-value";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>context-type-value</b>
   * <p>
   * Description: <b>A use context type and value assigned to the event
   * definition</b><br>
   * Type: <b>composite</b><br>
   * Path: <b></b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.CompositeClientParam<ca.uhn.fhir.rest.gclient.TokenClientParam, ca.uhn.fhir.rest.gclient.TokenClientParam> CONTEXT_TYPE_VALUE = new ca.uhn.fhir.rest.gclient.CompositeClientParam<ca.uhn.fhir.rest.gclient.TokenClientParam, ca.uhn.fhir.rest.gclient.TokenClientParam>(
      SP_CONTEXT_TYPE_VALUE);

  /**
   * Search parameter: <b>jurisdiction</b>
   * <p>
   * Description: <b>Intended jurisdiction for the event definition</b><br>
   * Type: <b>token</b><br>
   * Path: <b>EventDefinition.jurisdiction</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "jurisdiction", path = "EventDefinition.jurisdiction", description = "Intended jurisdiction for the event definition", type = "token")
  public static final String SP_JURISDICTION = "jurisdiction";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>jurisdiction</b>
   * <p>
   * Description: <b>Intended jurisdiction for the event definition</b><br>
   * Type: <b>token</b><br>
   * Path: <b>EventDefinition.jurisdiction</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam JURISDICTION = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_JURISDICTION);

  /**
   * Search parameter: <b>description</b>
   * <p>
   * Description: <b>The description of the event definition</b><br>
   * Type: <b>string</b><br>
   * Path: <b>EventDefinition.description</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "description", path = "EventDefinition.description", description = "The description of the event definition", type = "string")
  public static final String SP_DESCRIPTION = "description";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>description</b>
   * <p>
   * Description: <b>The description of the event definition</b><br>
   * Type: <b>string</b><br>
   * Path: <b>EventDefinition.description</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam DESCRIPTION = new ca.uhn.fhir.rest.gclient.StringClientParam(
      SP_DESCRIPTION);

  /**
   * Search parameter: <b>derived-from</b>
   * <p>
   * Description: <b>What resource is being referenced</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>EventDefinition.relatedArtifact.resource</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "derived-from", path = "EventDefinition.relatedArtifact.where(type='derived-from').resource", description = "What resource is being referenced", type = "reference")
  public static final String SP_DERIVED_FROM = "derived-from";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>derived-from</b>
   * <p>
   * Description: <b>What resource is being referenced</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>EventDefinition.relatedArtifact.resource</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam DERIVED_FROM = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(
      SP_DERIVED_FROM);

  /**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>EventDefinition:derived-from</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_DERIVED_FROM = new ca.uhn.fhir.model.api.Include(
      "EventDefinition:derived-from").toLocked();

  /**
   * Search parameter: <b>context-type</b>
   * <p>
   * Description: <b>A type of use context assigned to the event
   * definition</b><br>
   * Type: <b>token</b><br>
   * Path: <b>EventDefinition.useContext.code</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "context-type", path = "EventDefinition.useContext.code", description = "A type of use context assigned to the event definition", type = "token")
  public static final String SP_CONTEXT_TYPE = "context-type";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>context-type</b>
   * <p>
   * Description: <b>A type of use context assigned to the event
   * definition</b><br>
   * Type: <b>token</b><br>
   * Path: <b>EventDefinition.useContext.code</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam CONTEXT_TYPE = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_CONTEXT_TYPE);

  /**
   * Search parameter: <b>predecessor</b>
   * <p>
   * Description: <b>What resource is being referenced</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>EventDefinition.relatedArtifact.resource</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "predecessor", path = "EventDefinition.relatedArtifact.where(type='predecessor').resource", description = "What resource is being referenced", type = "reference")
  public static final String SP_PREDECESSOR = "predecessor";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>predecessor</b>
   * <p>
   * Description: <b>What resource is being referenced</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>EventDefinition.relatedArtifact.resource</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam PREDECESSOR = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(
      SP_PREDECESSOR);

  /**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>EventDefinition:predecessor</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_PREDECESSOR = new ca.uhn.fhir.model.api.Include(
      "EventDefinition:predecessor").toLocked();

  /**
   * Search parameter: <b>title</b>
   * <p>
   * Description: <b>The human-friendly name of the event definition</b><br>
   * Type: <b>string</b><br>
   * Path: <b>EventDefinition.title</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "title", path = "EventDefinition.title", description = "The human-friendly name of the event definition", type = "string")
  public static final String SP_TITLE = "title";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>title</b>
   * <p>
   * Description: <b>The human-friendly name of the event definition</b><br>
   * Type: <b>string</b><br>
   * Path: <b>EventDefinition.title</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam TITLE = new ca.uhn.fhir.rest.gclient.StringClientParam(
      SP_TITLE);

  /**
   * Search parameter: <b>composed-of</b>
   * <p>
   * Description: <b>What resource is being referenced</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>EventDefinition.relatedArtifact.resource</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "composed-of", path = "EventDefinition.relatedArtifact.where(type='composed-of').resource", description = "What resource is being referenced", type = "reference")
  public static final String SP_COMPOSED_OF = "composed-of";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>composed-of</b>
   * <p>
   * Description: <b>What resource is being referenced</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>EventDefinition.relatedArtifact.resource</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam COMPOSED_OF = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(
      SP_COMPOSED_OF);

  /**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>EventDefinition:composed-of</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_COMPOSED_OF = new ca.uhn.fhir.model.api.Include(
      "EventDefinition:composed-of").toLocked();

  /**
   * Search parameter: <b>version</b>
   * <p>
   * Description: <b>The business version of the event definition</b><br>
   * Type: <b>token</b><br>
   * Path: <b>EventDefinition.version</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "version", path = "EventDefinition.version", description = "The business version of the event definition", type = "token")
  public static final String SP_VERSION = "version";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>version</b>
   * <p>
   * Description: <b>The business version of the event definition</b><br>
   * Type: <b>token</b><br>
   * Path: <b>EventDefinition.version</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam VERSION = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_VERSION);

  /**
   * Search parameter: <b>url</b>
   * <p>
   * Description: <b>The uri that identifies the event definition</b><br>
   * Type: <b>uri</b><br>
   * Path: <b>EventDefinition.url</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "url", path = "EventDefinition.url", description = "The uri that identifies the event definition", type = "uri")
  public static final String SP_URL = "url";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>url</b>
   * <p>
   * Description: <b>The uri that identifies the event definition</b><br>
   * Type: <b>uri</b><br>
   * Path: <b>EventDefinition.url</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.UriClientParam URL = new ca.uhn.fhir.rest.gclient.UriClientParam(SP_URL);

  /**
   * Search parameter: <b>context-quantity</b>
   * <p>
   * Description: <b>A quantity- or range-valued use context assigned to the event
   * definition</b><br>
   * Type: <b>quantity</b><br>
   * Path: <b>EventDefinition.useContext.valueQuantity,
   * EventDefinition.useContext.valueRange</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "context-quantity", path = "(EventDefinition.useContext.value as Quantity) | (EventDefinition.useContext.value as Range)", description = "A quantity- or range-valued use context assigned to the event definition", type = "quantity")
  public static final String SP_CONTEXT_QUANTITY = "context-quantity";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>context-quantity</b>
   * <p>
   * Description: <b>A quantity- or range-valued use context assigned to the event
   * definition</b><br>
   * Type: <b>quantity</b><br>
   * Path: <b>EventDefinition.useContext.valueQuantity,
   * EventDefinition.useContext.valueRange</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.QuantityClientParam CONTEXT_QUANTITY = new ca.uhn.fhir.rest.gclient.QuantityClientParam(
      SP_CONTEXT_QUANTITY);

  /**
   * Search parameter: <b>effective</b>
   * <p>
   * Description: <b>The time during which the event definition is intended to be
   * in use</b><br>
   * Type: <b>date</b><br>
   * Path: <b>EventDefinition.effectivePeriod</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "effective", path = "EventDefinition.effectivePeriod", description = "The time during which the event definition is intended to be in use", type = "date")
  public static final String SP_EFFECTIVE = "effective";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>effective</b>
   * <p>
   * Description: <b>The time during which the event definition is intended to be
   * in use</b><br>
   * Type: <b>date</b><br>
   * Path: <b>EventDefinition.effectivePeriod</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.DateClientParam EFFECTIVE = new ca.uhn.fhir.rest.gclient.DateClientParam(
      SP_EFFECTIVE);

  /**
   * Search parameter: <b>depends-on</b>
   * <p>
   * Description: <b>What resource is being referenced</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>EventDefinition.relatedArtifact.resource</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "depends-on", path = "EventDefinition.relatedArtifact.where(type='depends-on').resource", description = "What resource is being referenced", type = "reference")
  public static final String SP_DEPENDS_ON = "depends-on";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>depends-on</b>
   * <p>
   * Description: <b>What resource is being referenced</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>EventDefinition.relatedArtifact.resource</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam DEPENDS_ON = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(
      SP_DEPENDS_ON);

  /**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>EventDefinition:depends-on</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_DEPENDS_ON = new ca.uhn.fhir.model.api.Include(
      "EventDefinition:depends-on").toLocked();

  /**
   * Search parameter: <b>name</b>
   * <p>
   * Description: <b>Computationally friendly name of the event definition</b><br>
   * Type: <b>string</b><br>
   * Path: <b>EventDefinition.name</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "name", path = "EventDefinition.name", description = "Computationally friendly name of the event definition", type = "string")
  public static final String SP_NAME = "name";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>name</b>
   * <p>
   * Description: <b>Computationally friendly name of the event definition</b><br>
   * Type: <b>string</b><br>
   * Path: <b>EventDefinition.name</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam NAME = new ca.uhn.fhir.rest.gclient.StringClientParam(
      SP_NAME);

  /**
   * Search parameter: <b>context</b>
   * <p>
   * Description: <b>A use context assigned to the event definition</b><br>
   * Type: <b>token</b><br>
   * Path: <b>EventDefinition.useContext.valueCodeableConcept</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "context", path = "(EventDefinition.useContext.value as CodeableConcept)", description = "A use context assigned to the event definition", type = "token")
  public static final String SP_CONTEXT = "context";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>context</b>
   * <p>
   * Description: <b>A use context assigned to the event definition</b><br>
   * Type: <b>token</b><br>
   * Path: <b>EventDefinition.useContext.valueCodeableConcept</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam CONTEXT = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_CONTEXT);

  /**
   * Search parameter: <b>publisher</b>
   * <p>
   * Description: <b>Name of the publisher of the event definition</b><br>
   * Type: <b>string</b><br>
   * Path: <b>EventDefinition.publisher</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "publisher", path = "EventDefinition.publisher", description = "Name of the publisher of the event definition", type = "string")
  public static final String SP_PUBLISHER = "publisher";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>publisher</b>
   * <p>
   * Description: <b>Name of the publisher of the event definition</b><br>
   * Type: <b>string</b><br>
   * Path: <b>EventDefinition.publisher</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam PUBLISHER = new ca.uhn.fhir.rest.gclient.StringClientParam(
      SP_PUBLISHER);

  /**
   * Search parameter: <b>topic</b>
   * <p>
   * Description: <b>Topics associated with the module</b><br>
   * Type: <b>token</b><br>
   * Path: <b>EventDefinition.topic</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "topic", path = "EventDefinition.topic", description = "Topics associated with the module", type = "token")
  public static final String SP_TOPIC = "topic";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>topic</b>
   * <p>
   * Description: <b>Topics associated with the module</b><br>
   * Type: <b>token</b><br>
   * Path: <b>EventDefinition.topic</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam TOPIC = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_TOPIC);

  /**
   * Search parameter: <b>context-type-quantity</b>
   * <p>
   * Description: <b>A use context type and quantity- or range-based value
   * assigned to the event definition</b><br>
   * Type: <b>composite</b><br>
   * Path: <b></b><br>
   * </p>
   */
  @SearchParamDefinition(name = "context-type-quantity", path = "EventDefinition.useContext", description = "A use context type and quantity- or range-based value assigned to the event definition", type = "composite", compositeOf = {
      "context-type", "context-quantity" })
  public static final String SP_CONTEXT_TYPE_QUANTITY = "context-type-quantity";
  /**
   * <b>Fluent Client</b> search parameter constant for
   * <b>context-type-quantity</b>
   * <p>
   * Description: <b>A use context type and quantity- or range-based value
   * assigned to the event definition</b><br>
   * Type: <b>composite</b><br>
   * Path: <b></b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.CompositeClientParam<ca.uhn.fhir.rest.gclient.TokenClientParam, ca.uhn.fhir.rest.gclient.QuantityClientParam> CONTEXT_TYPE_QUANTITY = new ca.uhn.fhir.rest.gclient.CompositeClientParam<ca.uhn.fhir.rest.gclient.TokenClientParam, ca.uhn.fhir.rest.gclient.QuantityClientParam>(
      SP_CONTEXT_TYPE_QUANTITY);

  /**
   * Search parameter: <b>status</b>
   * <p>
   * Description: <b>The current status of the event definition</b><br>
   * Type: <b>token</b><br>
   * Path: <b>EventDefinition.status</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "status", path = "EventDefinition.status", description = "The current status of the event definition", type = "token")
  public static final String SP_STATUS = "status";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>status</b>
   * <p>
   * Description: <b>The current status of the event definition</b><br>
   * Type: <b>token</b><br>
   * Path: <b>EventDefinition.status</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam STATUS = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_STATUS);

}