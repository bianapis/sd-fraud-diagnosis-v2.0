package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAnalystReviewRetrieveInputModelAnalystReviewInstanceReport
 */
public class BQAnalystReviewRetrieveInputModelAnalystReviewInstanceReport   {
  private String analystReviewInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return analystReviewInstanceReportReference
  **/

  public String getAnalystReviewInstanceReportReference() {
    return analystReviewInstanceReportReference;
  }

  public void setAnalystReviewInstanceReportReference(String analystReviewInstanceReportReference) {
    this.analystReviewInstanceReportReference = analystReviewInstanceReportReference;
  }


}

