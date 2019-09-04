package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAnalystReviewRetrieveOutputModelAnalystReviewInstanceAnalysis
 */
public class BQAnalystReviewRetrieveOutputModelAnalystReviewInstanceAnalysis   {
  private Object analystReviewInstanceAnalysisRecord = null;

  private String analystReviewInstanceAnalysisReportType = null;

  private String analystReviewInstanceAnalysisParameters = null;

  private Object analystReviewInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return analystReviewInstanceAnalysisRecord
  **/

  public Object getAnalystReviewInstanceAnalysisRecord() {
    return analystReviewInstanceAnalysisRecord;
  }

  public void setAnalystReviewInstanceAnalysisRecord(Object analystReviewInstanceAnalysisRecord) {
    this.analystReviewInstanceAnalysisRecord = analystReviewInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return analystReviewInstanceAnalysisReportType
  **/

  public String getAnalystReviewInstanceAnalysisReportType() {
    return analystReviewInstanceAnalysisReportType;
  }

  public void setAnalystReviewInstanceAnalysisReportType(String analystReviewInstanceAnalysisReportType) {
    this.analystReviewInstanceAnalysisReportType = analystReviewInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return analystReviewInstanceAnalysisParameters
  **/

  public String getAnalystReviewInstanceAnalysisParameters() {
    return analystReviewInstanceAnalysisParameters;
  }

  public void setAnalystReviewInstanceAnalysisParameters(String analystReviewInstanceAnalysisParameters) {
    this.analystReviewInstanceAnalysisParameters = analystReviewInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return analystReviewInstanceAnalysisReport
  **/

  public Object getAnalystReviewInstanceAnalysisReport() {
    return analystReviewInstanceAnalysisReport;
  }

  public void setAnalystReviewInstanceAnalysisReport(Object analystReviewInstanceAnalysisReport) {
    this.analystReviewInstanceAnalysisReport = analystReviewInstanceAnalysisReport;
  }


}

