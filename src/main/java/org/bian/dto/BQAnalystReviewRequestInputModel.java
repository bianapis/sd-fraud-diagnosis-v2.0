package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAnalystReviewRequestInputModelAnalystReviewInstanceRecord;
import org.bian.dto.BQAnalystReviewRequestInputModelFraudDiagnosisAnalysisInstanceRecord;
import org.bian.dto.CRFraudDiagnosisAnalysisRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQAnalystReviewRequestInputModel
 */
public class BQAnalystReviewRequestInputModel   {
  private BQAnalystReviewRequestInputModelFraudDiagnosisAnalysisInstanceRecord fraudDiagnosisAnalysisInstanceRecord = null;

  private String fraudDiagnosisAnalysisInstanceReference = null;

  private String analystReviewInstanceReference = null;

  private BQAnalystReviewRequestInputModelAnalystReviewInstanceRecord analystReviewInstanceRecord = null;

  private Object analystReviewRequestActionTaskRecord = null;

  private CRFraudDiagnosisAnalysisRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * Get fraudDiagnosisAnalysisInstanceRecord
   * @return fraudDiagnosisAnalysisInstanceRecord
  **/

  public BQAnalystReviewRequestInputModelFraudDiagnosisAnalysisInstanceRecord getFraudDiagnosisAnalysisInstanceRecord() {
    return fraudDiagnosisAnalysisInstanceRecord;
  }

  public void setFraudDiagnosisAnalysisInstanceRecord(BQAnalystReviewRequestInputModelFraudDiagnosisAnalysisInstanceRecord fraudDiagnosisAnalysisInstanceRecord) {
    this.fraudDiagnosisAnalysisInstanceRecord = fraudDiagnosisAnalysisInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Fraud Diagnosis Analysis instance 
   * @return fraudDiagnosisAnalysisInstanceReference
  **/

  public String getFraudDiagnosisAnalysisInstanceReference() {
    return fraudDiagnosisAnalysisInstanceReference;
  }

  public void setFraudDiagnosisAnalysisInstanceReference(String fraudDiagnosisAnalysisInstanceReference) {
    this.fraudDiagnosisAnalysisInstanceReference = fraudDiagnosisAnalysisInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Analyst Review instance 
   * @return analystReviewInstanceReference
  **/

  public String getAnalystReviewInstanceReference() {
    return analystReviewInstanceReference;
  }

  public void setAnalystReviewInstanceReference(String analystReviewInstanceReference) {
    this.analystReviewInstanceReference = analystReviewInstanceReference;
  }


  /**
   * Get analystReviewInstanceRecord
   * @return analystReviewInstanceRecord
  **/

  public BQAnalystReviewRequestInputModelAnalystReviewInstanceRecord getAnalystReviewInstanceRecord() {
    return analystReviewInstanceRecord;
  }

  public void setAnalystReviewInstanceRecord(BQAnalystReviewRequestInputModelAnalystReviewInstanceRecord analystReviewInstanceRecord) {
    this.analystReviewInstanceRecord = analystReviewInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return analystReviewRequestActionTaskRecord
  **/

  public Object getAnalystReviewRequestActionTaskRecord() {
    return analystReviewRequestActionTaskRecord;
  }

  public void setAnalystReviewRequestActionTaskRecord(Object analystReviewRequestActionTaskRecord) {
    this.analystReviewRequestActionTaskRecord = analystReviewRequestActionTaskRecord;
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

