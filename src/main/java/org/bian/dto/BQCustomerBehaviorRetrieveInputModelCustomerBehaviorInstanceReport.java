package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCustomerBehaviorRetrieveInputModelCustomerBehaviorInstanceReport
 */
public class BQCustomerBehaviorRetrieveInputModelCustomerBehaviorInstanceReport   {
  private String customerBehaviorInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return customerBehaviorInstanceReportReference
  **/

  public String getCustomerBehaviorInstanceReportReference() {
    return customerBehaviorInstanceReportReference;
  }

  public void setCustomerBehaviorInstanceReportReference(String customerBehaviorInstanceReportReference) {
    this.customerBehaviorInstanceReportReference = customerBehaviorInstanceReportReference;
  }


}

