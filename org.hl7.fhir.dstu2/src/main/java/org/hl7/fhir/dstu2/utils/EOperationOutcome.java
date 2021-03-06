package org.hl7.fhir.dstu2.utils;

/*-
 * #%L
 * org.hl7.fhir.dstu2
 * %%
 * Copyright (C) 2014 - 2019 Health Level 7
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


import org.hl7.fhir.dstu2.model.OperationOutcome;

public class EOperationOutcome extends Exception {

  private static final long serialVersionUID = 8887222532359256131L;

  private OperationOutcome outcome;

  public EOperationOutcome(OperationOutcome outcome) {
    super();
    this.outcome = outcome;
  }

  public OperationOutcome getOutcome() {
    return outcome;
  }
  
  
}
