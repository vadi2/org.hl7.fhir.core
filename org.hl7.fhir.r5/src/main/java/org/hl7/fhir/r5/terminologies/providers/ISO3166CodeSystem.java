package org.hl7.fhir.r5.terminologies.providers;

import org.hl7.fhir.r5.model.CodeSystem.ConceptDefinitionComponent;
import org.hl7.fhir.r5.model.Coding;
import org.hl7.fhir.utilities.MarkedToMoveToAdjunctPackage;
import org.hl7.fhir.utilities.Utilities;

/**
 * Special code system handler for ISO 3166-1 user-assigned codes.
 *
 * ISO 3166-1 reserves certain code ranges for user assignment:
 * - AA
 * - QM to QZ
 * - XA to XZ
 * - ZZ
 *
 * These codes can be used by applications for their own purposes.
 * Common uses include:
 * - XX: Unknown or Unspecified Country
 * - XY: Anonymous Country (for privacy)
 *
 * This handler validates these user-assigned codes as valid ISO 3166 codes.
 */
@MarkedToMoveToAdjunctPackage
public class ISO3166CodeSystem extends SpecialCodeSystem {

  @Override
  public ConceptDefinitionComponent findConcept(Coding code) {
    if (code == null || code.getCode() == null) {
      return null;
    }

    String c = code.getCode().toUpperCase();

    // Check if this is a user-assigned code
    if (isUserAssignedCode(c)) {
      return new ConceptDefinitionComponent(code.getCode())
          .setDisplay(getDisplayForUserAssignedCode(c));
    }

    return null;
  }

  @Override
  public boolean inactive(String code) {
    return false;
  }

  /**
   * Checks if the given code is in the ISO 3166-1 user-assigned range.
   * User-assigned codes are: AA, QM-QZ, XA-XZ, ZZ
   */
  public static boolean isUserAssignedCode(String code) {
    if (code == null || code.length() != 2) {
      return false;
    }

    String c = code.toUpperCase();

    // AA
    if ("AA".equals(c)) {
      return true;
    }

    // QM to QZ
    if (c.charAt(0) == 'Q' && c.charAt(1) >= 'M' && c.charAt(1) <= 'Z') {
      return true;
    }

    // XA to XZ
    if (c.charAt(0) == 'X' && c.charAt(1) >= 'A' && c.charAt(1) <= 'Z') {
      return true;
    }

    // ZZ
    if ("ZZ".equals(c)) {
      return true;
    }

    return false;
  }

  /**
   * Returns a display name for user-assigned codes.
   * Some codes have commonly accepted meanings.
   */
  private String getDisplayForUserAssignedCode(String code) {
    switch (code.toUpperCase()) {
      case "XX":
        return "Unknown or Unspecified Country";
      case "XY":
        return "Anonymous Country";
      case "ZZ":
        return "Unknown or Invalid Territory";
      default:
        return "User-assigned Country Code (" + code + ")";
    }
  }
}
