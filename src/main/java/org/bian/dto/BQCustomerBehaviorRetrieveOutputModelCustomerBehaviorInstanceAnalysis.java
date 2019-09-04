package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCustomerBehaviorRetrieveOutputModelCustomerBehaviorInstanceAnalysis
 */
public class BQCustomerBehaviorRetrieveOutputModelCustomerBehaviorInstanceAnalysis   {
  private Object customerBehaviorInstanceAnalysisRecord = null;

  private String customerBehaviorInstanceAnalysisReportType = null;

  private String customerBehaviorInstanceAnalysisParameters = null;

  private Object customerBehaviorInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return customerBehaviorInstanceAnalysisRecord
  **/

  public Object getCustomerBehaviorInstanceAnalysisRecord() {
    return customerBehaviorInstanceAnalysisRecord;
  }

  public void setCustomerBehaviorInstanceAnalysisRecord(Object customerBehaviorInstanceAnalysisRecord) {
    this.customerBehaviorInstanceAnalysisRecord = customerBehaviorInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return customerBehaviorInstanceAnalysisReportType
  **/

  public String getCustomerBehaviorInstanceAnalysisReportType() {
    return customerBehaviorInstanceAnalysisReportType;
  }

  public void setCustomerBehaviorInstanceAnalysisReportType(String customerBehaviorInstanceAnalysisReportType) {
    this.customerBehaviorInstanceAnalysisReportType = customerBehaviorInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return customerBehaviorInstanceAnalysisParameters
  **/

  public String getCustomerBehaviorInstanceAnalysisParameters() {
    return customerBehaviorInstanceAnalysisParameters;
  }

  public void setCustomerBehaviorInstanceAnalysisParameters(String customerBehaviorInstanceAnalysisParameters) {
    this.customerBehaviorInstanceAnalysisParameters = customerBehaviorInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return customerBehaviorInstanceAnalysisReport
  **/

  public Object getCustomerBehaviorInstanceAnalysisReport() {
    return customerBehaviorInstanceAnalysisReport;
  }

  public void setCustomerBehaviorInstanceAnalysisReport(Object customerBehaviorInstanceAnalysisReport) {
    this.customerBehaviorInstanceAnalysisReport = customerBehaviorInstanceAnalysisReport;
  }


}

