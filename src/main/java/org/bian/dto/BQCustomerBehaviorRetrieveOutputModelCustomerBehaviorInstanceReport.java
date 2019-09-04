package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCustomerBehaviorRetrieveOutputModelCustomerBehaviorInstanceReport
 */
public class BQCustomerBehaviorRetrieveOutputModelCustomerBehaviorInstanceReport   {
  private Object customerBehaviorInstanceReportRecord = null;

  private String customerBehaviorInstanceReportType = null;

  private String customerBehaviorInstanceReportParameters = null;

  private Object customerBehaviorInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return customerBehaviorInstanceReportRecord
  **/

  public Object getCustomerBehaviorInstanceReportRecord() {
    return customerBehaviorInstanceReportRecord;
  }

  public void setCustomerBehaviorInstanceReportRecord(Object customerBehaviorInstanceReportRecord) {
    this.customerBehaviorInstanceReportRecord = customerBehaviorInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return customerBehaviorInstanceReportType
  **/

  public String getCustomerBehaviorInstanceReportType() {
    return customerBehaviorInstanceReportType;
  }

  public void setCustomerBehaviorInstanceReportType(String customerBehaviorInstanceReportType) {
    this.customerBehaviorInstanceReportType = customerBehaviorInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return customerBehaviorInstanceReportParameters
  **/

  public String getCustomerBehaviorInstanceReportParameters() {
    return customerBehaviorInstanceReportParameters;
  }

  public void setCustomerBehaviorInstanceReportParameters(String customerBehaviorInstanceReportParameters) {
    this.customerBehaviorInstanceReportParameters = customerBehaviorInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return customerBehaviorInstanceReport
  **/

  public Object getCustomerBehaviorInstanceReport() {
    return customerBehaviorInstanceReport;
  }

  public void setCustomerBehaviorInstanceReport(Object customerBehaviorInstanceReport) {
    this.customerBehaviorInstanceReport = customerBehaviorInstanceReport;
  }


}

