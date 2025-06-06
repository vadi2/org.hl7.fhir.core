package org.hl7.fhir.dstu3.utils.validation.constants;

@Deprecated
public enum ReferenceValidationPolicy {
  IGNORE,
  CHECK_TYPE_IF_EXISTS,
  CHECK_EXISTS,
  CHECK_EXISTS_AND_TYPE,
  CHECK_VALID;

  public boolean checkExists() {
    return this == CHECK_EXISTS_AND_TYPE || this == CHECK_EXISTS || this == CHECK_VALID;
  }

  public boolean checkType() {
    return this == CHECK_TYPE_IF_EXISTS || this == CHECK_EXISTS_AND_TYPE || this == CHECK_VALID;
  }

  public boolean checkValid() {
    return this == CHECK_VALID;
  }
}
