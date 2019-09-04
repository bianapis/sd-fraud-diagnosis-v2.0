package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFraudDiagnosisAnalysisUpdateInputModelFraudDiagnosisAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRFraudDiagnosisAnalysisUpdateInputModel
 */
public class CRFraudDiagnosisAnalysisUpdateInputModel   {
  private String fraudDiagnosisServicingSessionReference = null;

  private String fraudDiagnosisAnalysisInstanceReference = null;

  private CRFraudDiagnosisAnalysisUpdateInputModelFraudDiagnosisAnalysisInstanceRecord fraudDiagnosisAnalysisInstanceRecord = null;

  private Object fraudDiagnosisAnalysisUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * Get fraudDiagnosisAnalysisInstanceRecord
   * @return fraudDiagnosisAnalysisInstanceRecord
  **/

  public CRFraudDiagnosisAnalysisUpdateInputModelFraudDiagnosisAnalysisInstanceRecord getFraudDiagnosisAnalysisInstanceRecord() {
    return fraudDiagnosisAnalysisInstanceRecord;
  }

  public void setFraudDiagnosisAnalysisInstanceRecord(CRFraudDiagnosisAnalysisUpdateInputModelFraudDiagnosisAnalysisInstanceRecord fraudDiagnosisAnalysisInstanceRecord) {
    this.fraudDiagnosisAnalysisInstanceRecord = fraudDiagnosisAnalysisInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return fraudDiagnosisAnalysisUpdateActionTaskRecord
  **/

  public Object getFraudDiagnosisAnalysisUpdateActionTaskRecord() {
    return fraudDiagnosisAnalysisUpdateActionTaskRecord;
  }

  public void setFraudDiagnosisAnalysisUpdateActionTaskRecord(Object fraudDiagnosisAnalysisUpdateActionTaskRecord) {
    this.fraudDiagnosisAnalysisUpdateActionTaskRecord = fraudDiagnosisAnalysisUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

