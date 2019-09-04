package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCustomerBehaviorRetrieveInputModelCustomerBehaviorInstanceAnalysis;
import org.bian.dto.BQCustomerBehaviorRetrieveInputModelCustomerBehaviorInstanceReport;

import javax.validation.Valid;
  
/**
 * BQCustomerBehaviorRetrieveInputModel
 */
public class BQCustomerBehaviorRetrieveInputModel   {
  private Object customerBehaviorRetrieveActionTaskRecord = null;

  private String customerBehaviorRetrieveActionRequest = null;

  private BQCustomerBehaviorRetrieveInputModelCustomerBehaviorInstanceReport customerBehaviorInstanceReport = null;

  private BQCustomerBehaviorRetrieveInputModelCustomerBehaviorInstanceAnalysis customerBehaviorInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return customerBehaviorRetrieveActionTaskRecord
  **/

  public Object getCustomerBehaviorRetrieveActionTaskRecord() {
    return customerBehaviorRetrieveActionTaskRecord;
  }

  public void setCustomerBehaviorRetrieveActionTaskRecord(Object customerBehaviorRetrieveActionTaskRecord) {
    this.customerBehaviorRetrieveActionTaskRecord = customerBehaviorRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return customerBehaviorRetrieveActionRequest
  **/

  public String getCustomerBehaviorRetrieveActionRequest() {
    return customerBehaviorRetrieveActionRequest;
  }

  public void setCustomerBehaviorRetrieveActionRequest(String customerBehaviorRetrieveActionRequest) {
    this.customerBehaviorRetrieveActionRequest = customerBehaviorRetrieveActionRequest;
  }


  /**
   * Get customerBehaviorInstanceReport
   * @return customerBehaviorInstanceReport
  **/

  public BQCustomerBehaviorRetrieveInputModelCustomerBehaviorInstanceReport getCustomerBehaviorInstanceReport() {
    return customerBehaviorInstanceReport;
  }

  public void setCustomerBehaviorInstanceReport(BQCustomerBehaviorRetrieveInputModelCustomerBehaviorInstanceReport customerBehaviorInstanceReport) {
    this.customerBehaviorInstanceReport = customerBehaviorInstanceReport;
  }


  /**
   * Get customerBehaviorInstanceAnalysis
   * @return customerBehaviorInstanceAnalysis
  **/

  public BQCustomerBehaviorRetrieveInputModelCustomerBehaviorInstanceAnalysis getCustomerBehaviorInstanceAnalysis() {
    return customerBehaviorInstanceAnalysis;
  }

  public void setCustomerBehaviorInstanceAnalysis(BQCustomerBehaviorRetrieveInputModelCustomerBehaviorInstanceAnalysis customerBehaviorInstanceAnalysis) {
    this.customerBehaviorInstanceAnalysis = customerBehaviorInstanceAnalysis;
  }


}

