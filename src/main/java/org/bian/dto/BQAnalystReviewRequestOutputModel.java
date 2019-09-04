package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAnalystReviewRequestInputModelFraudDiagnosisAnalysisInstanceRecord;
import org.bian.dto.BQAnalystReviewRequestOutputModelAnalystReviewInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAnalystReviewRequestOutputModel
 */
public class BQAnalystReviewRequestOutputModel   {
  private BQAnalystReviewRequestInputModelFraudDiagnosisAnalysisInstanceRecord fraudDiagnosisAnalysisInstanceRecord = null;

  private BQAnalystReviewRequestOutputModelAnalystReviewInstanceRecord analystReviewInstanceRecord = null;

  private String analystReviewRequestActionTaskReference = null;

  private Object analystReviewRequestActionTaskRecord = null;

  private String analystReviewRequestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * Get analystReviewInstanceRecord
   * @return analystReviewInstanceRecord
  **/

  public BQAnalystReviewRequestOutputModelAnalystReviewInstanceRecord getAnalystReviewInstanceRecord() {
    return analystReviewInstanceRecord;
  }

  public void setAnalystReviewInstanceRecord(BQAnalystReviewRequestOutputModelAnalystReviewInstanceRecord analystReviewInstanceRecord) {
    this.analystReviewInstanceRecord = analystReviewInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Analyst Review instance request service call 
   * @return analystReviewRequestActionTaskReference
  **/

  public String getAnalystReviewRequestActionTaskReference() {
    return analystReviewRequestActionTaskReference;
  }

  public void setAnalystReviewRequestActionTaskReference(String analystReviewRequestActionTaskReference) {
    this.analystReviewRequestActionTaskReference = analystReviewRequestActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Analyst Review service request record 
   * @return analystReviewRequestRecordReference
  **/

  public String getAnalystReviewRequestRecordReference() {
    return analystReviewRequestRecordReference;
  }

  public void setAnalystReviewRequestRecordReference(String analystReviewRequestRecordReference) {
    this.analystReviewRequestRecordReference = analystReviewRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

