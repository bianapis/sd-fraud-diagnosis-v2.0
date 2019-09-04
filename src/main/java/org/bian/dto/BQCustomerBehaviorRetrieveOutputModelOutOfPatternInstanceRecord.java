package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCustomerBehaviorRetrieveOutputModelOutOfPatternInstanceRecord
 */
public class BQCustomerBehaviorRetrieveOutputModelOutOfPatternInstanceRecord   {
  private String customerBehaviorAnalysisResult = null;

  private String customerBehaviorAnalysisWorkProduct = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The production transaction customer behavior analysis results 
   * @return customerBehaviorAnalysisResult
  **/

  public String getCustomerBehaviorAnalysisResult() {
    return customerBehaviorAnalysisResult;
  }

  public void setCustomerBehaviorAnalysisResult(String customerBehaviorAnalysisResult) {
    this.customerBehaviorAnalysisResult = customerBehaviorAnalysisResult;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Work documentation, forms and schedules produced and referenced during the analysis (for future reference) 
   * @return customerBehaviorAnalysisWorkProduct
  **/

  public String getCustomerBehaviorAnalysisWorkProduct() {
    return customerBehaviorAnalysisWorkProduct;
  }

  public void setCustomerBehaviorAnalysisWorkProduct(String customerBehaviorAnalysisWorkProduct) {
    this.customerBehaviorAnalysisWorkProduct = customerBehaviorAnalysisWorkProduct;
  }


}

