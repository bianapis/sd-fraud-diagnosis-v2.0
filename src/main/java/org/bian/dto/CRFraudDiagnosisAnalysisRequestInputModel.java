package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFraudDiagnosisAnalysisRequestInputModelFraudDiagnosisAnalysisInstanceRecord;
import org.bian.dto.CRFraudDiagnosisAnalysisRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRFraudDiagnosisAnalysisRequestInputModel
 */
public class CRFraudDiagnosisAnalysisRequestInputModel   {
  private String fraudDiagnosisServicingSessionReference = null;

  private String fraudDiagnosisAnalysisInstanceReference = null;

  private CRFraudDiagnosisAnalysisRequestInputModelFraudDiagnosisAnalysisInstanceRecord fraudDiagnosisAnalysisInstanceRecord = null;

  private Object fraudDiagnosisAnalysisRequestActionTaskRecord = null;

  private CRFraudDiagnosisAnalysisRequestInputModelRequestRecordType requestRecordType = null;


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

  public CRFraudDiagnosisAnalysisRequestInputModelFraudDiagnosisAnalysisInstanceRecord getFraudDiagnosisAnalysisInstanceRecord() {
    return fraudDiagnosisAnalysisInstanceRecord;
  }

  public void setFraudDiagnosisAnalysisInstanceRecord(CRFraudDiagnosisAnalysisRequestInputModelFraudDiagnosisAnalysisInstanceRecord fraudDiagnosisAnalysisInstanceRecord) {
    this.fraudDiagnosisAnalysisInstanceRecord = fraudDiagnosisAnalysisInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return fraudDiagnosisAnalysisRequestActionTaskRecord
  **/

  public Object getFraudDiagnosisAnalysisRequestActionTaskRecord() {
    return fraudDiagnosisAnalysisRequestActionTaskRecord;
  }

  public void setFraudDiagnosisAnalysisRequestActionTaskRecord(Object fraudDiagnosisAnalysisRequestActionTaskRecord) {
    this.fraudDiagnosisAnalysisRequestActionTaskRecord = fraudDiagnosisAnalysisRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRFraudDiagnosisAnalysisRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRFraudDiagnosisAnalysisRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

