package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFraudDiagnosisAnalysisExecuteInputModelExecuteRecordType;
import org.bian.dto.CRFraudDiagnosisAnalysisExecuteInputModelFraudDiagnosisAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRFraudDiagnosisAnalysisExecuteInputModel
 */
public class CRFraudDiagnosisAnalysisExecuteInputModel   {
  private String fraudDiagnosisServicingSessionReference = null;

  private String fraudDiagnosisAnalysisInstanceReference = null;

  private CRFraudDiagnosisAnalysisExecuteInputModelFraudDiagnosisAnalysisInstanceRecord fraudDiagnosisAnalysisInstanceRecord = null;

  private Object fraudDiagnosisAnalysisExecuteActionTaskRecord = null;

  private CRFraudDiagnosisAnalysisExecuteInputModelExecuteRecordType executeRecordType = null;


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

  public CRFraudDiagnosisAnalysisExecuteInputModelFraudDiagnosisAnalysisInstanceRecord getFraudDiagnosisAnalysisInstanceRecord() {
    return fraudDiagnosisAnalysisInstanceRecord;
  }

  public void setFraudDiagnosisAnalysisInstanceRecord(CRFraudDiagnosisAnalysisExecuteInputModelFraudDiagnosisAnalysisInstanceRecord fraudDiagnosisAnalysisInstanceRecord) {
    this.fraudDiagnosisAnalysisInstanceRecord = fraudDiagnosisAnalysisInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return fraudDiagnosisAnalysisExecuteActionTaskRecord
  **/

  public Object getFraudDiagnosisAnalysisExecuteActionTaskRecord() {
    return fraudDiagnosisAnalysisExecuteActionTaskRecord;
  }

  public void setFraudDiagnosisAnalysisExecuteActionTaskRecord(Object fraudDiagnosisAnalysisExecuteActionTaskRecord) {
    this.fraudDiagnosisAnalysisExecuteActionTaskRecord = fraudDiagnosisAnalysisExecuteActionTaskRecord;
  }


  /**
   * Get executeRecordType
   * @return executeRecordType
  **/

  public CRFraudDiagnosisAnalysisExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(CRFraudDiagnosisAnalysisExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

