package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAnalystReviewRetrieveInputModelAnalystReviewInstanceAnalysis
 */
public class BQAnalystReviewRetrieveInputModelAnalystReviewInstanceAnalysis   {
  private String analystReviewInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return analystReviewInstanceAnalysisReference
  **/

  public String getAnalystReviewInstanceAnalysisReference() {
    return analystReviewInstanceAnalysisReference;
  }

  public void setAnalystReviewInstanceAnalysisReference(String analystReviewInstanceAnalysisReference) {
    this.analystReviewInstanceAnalysisReference = analystReviewInstanceAnalysisReference;
  }


}

