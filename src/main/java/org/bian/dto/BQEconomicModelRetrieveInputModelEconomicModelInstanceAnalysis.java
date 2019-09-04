package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQEconomicModelRetrieveInputModelEconomicModelInstanceAnalysis
 */
public class BQEconomicModelRetrieveInputModelEconomicModelInstanceAnalysis   {
  private String economicModelInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return economicModelInstanceAnalysisReference
  **/

  public String getEconomicModelInstanceAnalysisReference() {
    return economicModelInstanceAnalysisReference;
  }

  public void setEconomicModelInstanceAnalysisReference(String economicModelInstanceAnalysisReference) {
    this.economicModelInstanceAnalysisReference = economicModelInstanceAnalysisReference;
  }


}

