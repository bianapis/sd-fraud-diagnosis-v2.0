package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQEconomicModelRetrieveInputModelEconomicModelInstanceReport
 */
public class BQEconomicModelRetrieveInputModelEconomicModelInstanceReport   {
  private String economicModelInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return economicModelInstanceReportReference
  **/

  public String getEconomicModelInstanceReportReference() {
    return economicModelInstanceReportReference;
  }

  public void setEconomicModelInstanceReportReference(String economicModelInstanceReportReference) {
    this.economicModelInstanceReportReference = economicModelInstanceReportReference;
  }


}

