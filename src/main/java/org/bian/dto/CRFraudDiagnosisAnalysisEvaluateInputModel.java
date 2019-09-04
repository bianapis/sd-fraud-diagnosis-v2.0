package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFraudDiagnosisAnalysisEvaluateInputModelFraudDiagnosisAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRFraudDiagnosisAnalysisEvaluateInputModel
 */
public class CRFraudDiagnosisAnalysisEvaluateInputModel   {
  private String fraudDiagnosisServicingSessionReference = null;

  private Object fraudDiagnosisAnalysisEvaluateActionRecord = null;

  private String fraudDiagnosisAnalysisInstanceStatus = null;

  private CRFraudDiagnosisAnalysisEvaluateInputModelFraudDiagnosisAnalysisInstanceRecord fraudDiagnosisAnalysisInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return fraudDiagnosisServicingSessionReference
  **/

  public String getFraudDiagnosisServicingSessionReference() {
    return fraudDiagnosisServicingSessionReference;
  }

  public void setFraudDiagnosisServicingSessionReference(String fraudDiagnosisServicingSessionReference) {
    this.fraudDiagnosisServicingSessionReference = fraudDiagnosisServicingSessionReference;
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

  public CRFraudDiagnosisAnalysisEvaluateInputModelFraudDiagnosisAnalysisInstanceRecord getFraudDiagnosisAnalysisInstanceRecord() {
    return fraudDiagnosisAnalysisInstanceRecord;
  }

  public void setFraudDiagnosisAnalysisInstanceRecord(CRFraudDiagnosisAnalysisEvaluateInputModelFraudDiagnosisAnalysisInstanceRecord fraudDiagnosisAnalysisInstanceRecord) {
    this.fraudDiagnosisAnalysisInstanceRecord = fraudDiagnosisAnalysisInstanceRecord;
  }


}

