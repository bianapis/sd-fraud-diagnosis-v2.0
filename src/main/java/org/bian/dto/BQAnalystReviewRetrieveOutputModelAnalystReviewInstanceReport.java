package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAnalystReviewRetrieveOutputModelAnalystReviewInstanceReport
 */
public class BQAnalystReviewRetrieveOutputModelAnalystReviewInstanceReport   {
  private Object analystReviewInstanceReportRecord = null;

  private String analystReviewInstanceReportType = null;

  private String analystReviewInstanceReportParameters = null;

  private Object analystReviewInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return analystReviewInstanceReportRecord
  **/

  public Object getAnalystReviewInstanceReportRecord() {
    return analystReviewInstanceReportRecord;
  }

  public void setAnalystReviewInstanceReportRecord(Object analystReviewInstanceReportRecord) {
    this.analystReviewInstanceReportRecord = analystReviewInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return analystReviewInstanceReportType
  **/

  public String getAnalystReviewInstanceReportType() {
    return analystReviewInstanceReportType;
  }

  public void setAnalystReviewInstanceReportType(String analystReviewInstanceReportType) {
    this.analystReviewInstanceReportType = analystReviewInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return analystReviewInstanceReportParameters
  **/

  public String getAnalystReviewInstanceReportParameters() {
    return analystReviewInstanceReportParameters;
  }

  public void setAnalystReviewInstanceReportParameters(String analystReviewInstanceReportParameters) {
    this.analystReviewInstanceReportParameters = analystReviewInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return analystReviewInstanceReport
  **/

  public Object getAnalystReviewInstanceReport() {
    return analystReviewInstanceReport;
  }

  public void setAnalystReviewInstanceReport(Object analystReviewInstanceReport) {
    this.analystReviewInstanceReport = analystReviewInstanceReport;
  }


}

