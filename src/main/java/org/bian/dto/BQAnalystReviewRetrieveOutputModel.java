package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAnalystReviewRetrieveOutputModelAnalystReviewInstanceAnalysis;
import org.bian.dto.BQAnalystReviewRetrieveOutputModelAnalystReviewInstanceRecord;
import org.bian.dto.BQAnalystReviewRetrieveOutputModelAnalystReviewInstanceReport;
import org.bian.dto.BQAnalystReviewRetrieveOutputModelFraudDiagnosisAnalysisInstanceRecord;
import org.bian.dto.BQCustomerBehaviorRetrieveOutputModelOutOfPatternInstanceRecord;
import org.bian.dto.BQEconomicModelRetrieveOutputModelEconomicModelInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAnalystReviewRetrieveOutputModel
 */
public class BQAnalystReviewRetrieveOutputModel   {
  private BQAnalystReviewRetrieveOutputModelFraudDiagnosisAnalysisInstanceRecord fraudDiagnosisAnalysisInstanceRecord = null;

  private BQCustomerBehaviorRetrieveOutputModelOutOfPatternInstanceRecord outOfPatternInstanceRecord = null;

  private BQEconomicModelRetrieveOutputModelEconomicModelInstanceRecord economicModelInstanceRecord = null;

  private BQAnalystReviewRetrieveOutputModelAnalystReviewInstanceRecord analystReviewInstanceRecord = null;

  private String analystReviewRetrieveActionTaskReference = null;

  private Object analystReviewRetrieveActionTaskRecord = null;

  private String analystReviewRetrieveActionResponse = null;

  private BQAnalystReviewRetrieveOutputModelAnalystReviewInstanceReport analystReviewInstanceReport = null;

  private BQAnalystReviewRetrieveOutputModelAnalystReviewInstanceAnalysis analystReviewInstanceAnalysis = null;


  /**
   * Get fraudDiagnosisAnalysisInstanceRecord
   * @return fraudDiagnosisAnalysisInstanceRecord
  **/

  public BQAnalystReviewRetrieveOutputModelFraudDiagnosisAnalysisInstanceRecord getFraudDiagnosisAnalysisInstanceRecord() {
    return fraudDiagnosisAnalysisInstanceRecord;
  }

  public void setFraudDiagnosisAnalysisInstanceRecord(BQAnalystReviewRetrieveOutputModelFraudDiagnosisAnalysisInstanceRecord fraudDiagnosisAnalysisInstanceRecord) {
    this.fraudDiagnosisAnalysisInstanceRecord = fraudDiagnosisAnalysisInstanceRecord;
  }


  /**
   * Get outOfPatternInstanceRecord
   * @return outOfPatternInstanceRecord
  **/

  public BQCustomerBehaviorRetrieveOutputModelOutOfPatternInstanceRecord getOutOfPatternInstanceRecord() {
    return outOfPatternInstanceRecord;
  }

  public void setOutOfPatternInstanceRecord(BQCustomerBehaviorRetrieveOutputModelOutOfPatternInstanceRecord outOfPatternInstanceRecord) {
    this.outOfPatternInstanceRecord = outOfPatternInstanceRecord;
  }


  /**
   * Get economicModelInstanceRecord
   * @return economicModelInstanceRecord
  **/

  public BQEconomicModelRetrieveOutputModelEconomicModelInstanceRecord getEconomicModelInstanceRecord() {
    return economicModelInstanceRecord;
  }

  public void setEconomicModelInstanceRecord(BQEconomicModelRetrieveOutputModelEconomicModelInstanceRecord economicModelInstanceRecord) {
    this.economicModelInstanceRecord = economicModelInstanceRecord;
  }


  /**
   * Get analystReviewInstanceRecord
   * @return analystReviewInstanceRecord
  **/

  public BQAnalystReviewRetrieveOutputModelAnalystReviewInstanceRecord getAnalystReviewInstanceRecord() {
    return analystReviewInstanceRecord;
  }

  public void setAnalystReviewInstanceRecord(BQAnalystReviewRetrieveOutputModelAnalystReviewInstanceRecord analystReviewInstanceRecord) {
    this.analystReviewInstanceRecord = analystReviewInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Analyst Review instance retrieve service call 
   * @return analystReviewRetrieveActionTaskReference
  **/

  public String getAnalystReviewRetrieveActionTaskReference() {
    return analystReviewRetrieveActionTaskReference;
  }

  public void setAnalystReviewRetrieveActionTaskReference(String analystReviewRetrieveActionTaskReference) {
    this.analystReviewRetrieveActionTaskReference = analystReviewRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return analystReviewRetrieveActionTaskRecord
  **/

  public Object getAnalystReviewRetrieveActionTaskRecord() {
    return analystReviewRetrieveActionTaskRecord;
  }

  public void setAnalystReviewRetrieveActionTaskRecord(Object analystReviewRetrieveActionTaskRecord) {
    this.analystReviewRetrieveActionTaskRecord = analystReviewRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return analystReviewRetrieveActionResponse
  **/

  public String getAnalystReviewRetrieveActionResponse() {
    return analystReviewRetrieveActionResponse;
  }

  public void setAnalystReviewRetrieveActionResponse(String analystReviewRetrieveActionResponse) {
    this.analystReviewRetrieveActionResponse = analystReviewRetrieveActionResponse;
  }


  /**
   * Get analystReviewInstanceReport
   * @return analystReviewInstanceReport
  **/

  public BQAnalystReviewRetrieveOutputModelAnalystReviewInstanceReport getAnalystReviewInstanceReport() {
    return analystReviewInstanceReport;
  }

  public void setAnalystReviewInstanceReport(BQAnalystReviewRetrieveOutputModelAnalystReviewInstanceReport analystReviewInstanceReport) {
    this.analystReviewInstanceReport = analystReviewInstanceReport;
  }


  /**
   * Get analystReviewInstanceAnalysis
   * @return analystReviewInstanceAnalysis
  **/

  public BQAnalystReviewRetrieveOutputModelAnalystReviewInstanceAnalysis getAnalystReviewInstanceAnalysis() {
    return analystReviewInstanceAnalysis;
  }

  public void setAnalystReviewInstanceAnalysis(BQAnalystReviewRetrieveOutputModelAnalystReviewInstanceAnalysis analystReviewInstanceAnalysis) {
    this.analystReviewInstanceAnalysis = analystReviewInstanceAnalysis;
  }


}

