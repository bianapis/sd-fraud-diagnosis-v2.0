package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFraudDiagnosisAnalysisRetrieveInputModelFraudDiagnosisAnalysisInstanceAnalysis;
import org.bian.dto.CRFraudDiagnosisAnalysisRetrieveInputModelFraudDiagnosisAnalysisInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRFraudDiagnosisAnalysisRetrieveInputModel
 */
public class CRFraudDiagnosisAnalysisRetrieveInputModel   {
  private Object fraudDiagnosisAnalysisRetrieveActionTaskRecord = null;

  private String fraudDiagnosisAnalysisRetrieveActionRequest = null;

  private CRFraudDiagnosisAnalysisRetrieveInputModelFraudDiagnosisAnalysisInstanceReportRecord fraudDiagnosisAnalysisInstanceReportRecord = null;

  private CRFraudDiagnosisAnalysisRetrieveInputModelFraudDiagnosisAnalysisInstanceAnalysis fraudDiagnosisAnalysisInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return fraudDiagnosisAnalysisRetrieveActionTaskRecord
  **/

  public Object getFraudDiagnosisAnalysisRetrieveActionTaskRecord() {
    return fraudDiagnosisAnalysisRetrieveActionTaskRecord;
  }

  public void setFraudDiagnosisAnalysisRetrieveActionTaskRecord(Object fraudDiagnosisAnalysisRetrieveActionTaskRecord) {
    this.fraudDiagnosisAnalysisRetrieveActionTaskRecord = fraudDiagnosisAnalysisRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return fraudDiagnosisAnalysisRetrieveActionRequest
  **/

  public String getFraudDiagnosisAnalysisRetrieveActionRequest() {
    return fraudDiagnosisAnalysisRetrieveActionRequest;
  }

  public void setFraudDiagnosisAnalysisRetrieveActionRequest(String fraudDiagnosisAnalysisRetrieveActionRequest) {
    this.fraudDiagnosisAnalysisRetrieveActionRequest = fraudDiagnosisAnalysisRetrieveActionRequest;
  }


  /**
   * Get fraudDiagnosisAnalysisInstanceReportRecord
   * @return fraudDiagnosisAnalysisInstanceReportRecord
  **/

  public CRFraudDiagnosisAnalysisRetrieveInputModelFraudDiagnosisAnalysisInstanceReportRecord getFraudDiagnosisAnalysisInstanceReportRecord() {
    return fraudDiagnosisAnalysisInstanceReportRecord;
  }

  public void setFraudDiagnosisAnalysisInstanceReportRecord(CRFraudDiagnosisAnalysisRetrieveInputModelFraudDiagnosisAnalysisInstanceReportRecord fraudDiagnosisAnalysisInstanceReportRecord) {
    this.fraudDiagnosisAnalysisInstanceReportRecord = fraudDiagnosisAnalysisInstanceReportRecord;
  }


  /**
   * Get fraudDiagnosisAnalysisInstanceAnalysis
   * @return fraudDiagnosisAnalysisInstanceAnalysis
  **/

  public CRFraudDiagnosisAnalysisRetrieveInputModelFraudDiagnosisAnalysisInstanceAnalysis getFraudDiagnosisAnalysisInstanceAnalysis() {
    return fraudDiagnosisAnalysisInstanceAnalysis;
  }

  public void setFraudDiagnosisAnalysisInstanceAnalysis(CRFraudDiagnosisAnalysisRetrieveInputModelFraudDiagnosisAnalysisInstanceAnalysis fraudDiagnosisAnalysisInstanceAnalysis) {
    this.fraudDiagnosisAnalysisInstanceAnalysis = fraudDiagnosisAnalysisInstanceAnalysis;
  }


}

