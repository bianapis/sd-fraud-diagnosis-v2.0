package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQEconomicModelRetrieveOutputModelEconomicModelInstanceRecord
 */
public class BQEconomicModelRetrieveOutputModelEconomicModelInstanceRecord   {
  private String economicModelAnalysisResult = null;

  private String economicModelWorkProduct = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The result of the economic model, including the recommended response 
   * @return economicModelAnalysisResult
  **/

  public String getEconomicModelAnalysisResult() {
    return economicModelAnalysisResult;
  }

  public void setEconomicModelAnalysisResult(String economicModelAnalysisResult) {
    this.economicModelAnalysisResult = economicModelAnalysisResult;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Work documentation, forms and schedules produced and referenced during the analysis (for future reference) 
   * @return economicModelWorkProduct
  **/

  public String getEconomicModelWorkProduct() {
    return economicModelWorkProduct;
  }

  public void setEconomicModelWorkProduct(String economicModelWorkProduct) {
    this.economicModelWorkProduct = economicModelWorkProduct;
  }


}

