package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFraudDiagnosisAnalysisEvaluateOutputModelFraudDiagnosisAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRFraudDiagnosisAnalysisEvaluateOutputModel
 */
public class CRFraudDiagnosisAnalysisEvaluateOutputModel   {
  private String fraudDiagnosisAnalysisInstanceReference = null;

  private String fraudDiagnosisAnalysisEvaluateActionReference = null;

  private Object fraudDiagnosisAnalysisEvaluateActionRecord = null;

  private String fraudDiagnosisAnalysisInstanceStatus = null;

  private CRFraudDiagnosisAnalysisEvaluateOutputModelFraudDiagnosisAnalysisInstanceRecord fraudDiagnosisAnalysisInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Fraud Diagnosis Analysis instance 
   * @return fraudDiagnosisAnalysisInstanceReference
  **/

  public String getFraudDiagnosisAnalysisInstanceReference() {
    return fraudDiagnosisAnalysisInstanceReference;
  }

  public void setFraudDiagnosisAnalysisInstanceReference(String fraudDiagnosisAnalysisInstanceReference) {
    this.fraudDiagnosisAnalysisInstanceReference = fraudDiagnosisAnalysisInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Evaluate service call 
   * @return fraudDiagnosisAnalysisEvaluateActionReference
  **/

  public String getFraudDiagnosisAnalysisEvaluateActionReference() {
    return fraudDiagnosisAnalysisEvaluateActionReference;
  }

  public void setFraudDiagnosisAnalysisEvaluateActionReference(String fraudDiagnosisAnalysisEvaluateActionReference) {
    this.fraudDiagnosisAnalysisEvaluateActionReference = fraudDiagnosisAnalysisEvaluateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Evaluate service call input and output record 
   * @return fraudDiagnosisAnalysisEvaluateActionRecord
  **/

  public Object getFraudDiagnosisAnalysisEvaluateActionRecord() {
    return fraudDiagnosisAnalysisEvaluateActionRecord;
  }

  public void setFraudDiagnosisAnalysisEvaluateActionRecord(Object fraudDiagnosisAnalysisEvaluateActionRecord) {
    this.fraudDiagnosisAnalysisEvaluateActionRecord = fraudDiagnosisAnalysisEvaluateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Fraud Diagnosis Analysis instance (e.g. initialised, pending, active) 
   * @return fraudDiagnosisAnalysisInstanceStatus
  **/

  public String getFraudDiagnosisAnalysisInstanceStatus() {
    return fraudDiagnosisAnalysisInstanceStatus;
  }

  public void setFraudDiagnosisAnalysisInstanceStatus(String fraudDiagnosisAnalysisInstanceStatus) {
    this.fraudDiagnosisAnalysisInstanceStatus = fraudDiagnosisAnalysisInstanceStatus;
  }


  /**
   * Get fraudDiagnosisAnalysisInstanceRecord
   * @return fraudDiagnosisAnalysisInstanceRecord
  **/

  public CRFraudDiagnosisAnalysisEvaluateOutputModelFraudDiagnosisAnalysisInstanceRecord getFraudDiagnosisAnalysisInstanceRecord() {
    return fraudDiagnosisAnalysisInstanceRecord;
  }

  public void setFraudDiagnosisAnalysisInstanceRecord(CRFraudDiagnosisAnalysisEvaluateOutputModelFraudDiagnosisAnalysisInstanceRecord fraudDiagnosisAnalysisInstanceRecord) {
    this.fraudDiagnosisAnalysisInstanceRecord = fraudDiagnosisAnalysisInstanceRecord;
  }


}

