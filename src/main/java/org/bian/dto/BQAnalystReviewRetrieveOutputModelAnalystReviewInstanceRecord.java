package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAnalystReviewRetrieveOutputModelAnalystReviewInstanceRecord
 */
public class BQAnalystReviewRetrieveOutputModelAnalystReviewInstanceRecord   {
  private String customerReference = null;

  private String outboundContactReference = null;

  private String analystReviewAnalysisResult = null;

  private String analystReviewWorkProduct = null;

  private String analystReviewRecommendedAction = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the customer, extracted from the financial transaction details, used to access customer details 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an outbound contact established with the customer 
   * @return outboundContactReference
  **/

  public String getOutboundContactReference() {
    return outboundContactReference;
  }

  public void setOutboundContactReference(String outboundContactReference) {
    this.outboundContactReference = outboundContactReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The result of the economic model, including the recommended response 
   * @return analystReviewAnalysisResult
  **/

  public String getAnalystReviewAnalysisResult() {
    return analystReviewAnalysisResult;
  }

  public void setAnalystReviewAnalysisResult(String analystReviewAnalysisResult) {
    this.analystReviewAnalysisResult = analystReviewAnalysisResult;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Work documentation, forms and schedules produced and referenced during the analysis (for future reference) 
   * @return analystReviewWorkProduct
  **/

  public String getAnalystReviewWorkProduct() {
    return analystReviewWorkProduct;
  }

  public void setAnalystReviewWorkProduct(String analystReviewWorkProduct) {
    this.analystReviewWorkProduct = analystReviewWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The recommended action resulting from the analysts review 
   * @return analystReviewRecommendedAction
  **/

  public String getAnalystReviewRecommendedAction() {
    return analystReviewRecommendedAction;
  }

  public void setAnalystReviewRecommendedAction(String analystReviewRecommendedAction) {
    this.analystReviewRecommendedAction = analystReviewRecommendedAction;
  }


}

