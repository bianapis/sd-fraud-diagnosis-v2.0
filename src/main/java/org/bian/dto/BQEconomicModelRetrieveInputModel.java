package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQEconomicModelRetrieveInputModelEconomicModelInstanceAnalysis;
import org.bian.dto.BQEconomicModelRetrieveInputModelEconomicModelInstanceReport;

import javax.validation.Valid;
  
/**
 * BQEconomicModelRetrieveInputModel
 */
public class BQEconomicModelRetrieveInputModel   {
  private Object economicModelRetrieveActionTaskRecord = null;

  private String economicModelRetrieveActionRequest = null;

  private BQEconomicModelRetrieveInputModelEconomicModelInstanceReport economicModelInstanceReport = null;

  private BQEconomicModelRetrieveInputModelEconomicModelInstanceAnalysis economicModelInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return economicModelRetrieveActionTaskRecord
  **/

  public Object getEconomicModelRetrieveActionTaskRecord() {
    return economicModelRetrieveActionTaskRecord;
  }

  public void setEconomicModelRetrieveActionTaskRecord(Object economicModelRetrieveActionTaskRecord) {
    this.economicModelRetrieveActionTaskRecord = economicModelRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return economicModelRetrieveActionRequest
  **/

  public String getEconomicModelRetrieveActionRequest() {
    return economicModelRetrieveActionRequest;
  }

  public void setEconomicModelRetrieveActionRequest(String economicModelRetrieveActionRequest) {
    this.economicModelRetrieveActionRequest = economicModelRetrieveActionRequest;
  }


  /**
   * Get economicModelInstanceReport
   * @return economicModelInstanceReport
  **/

  public BQEconomicModelRetrieveInputModelEconomicModelInstanceReport getEconomicModelInstanceReport() {
    return economicModelInstanceReport;
  }

  public void setEconomicModelInstanceReport(BQEconomicModelRetrieveInputModelEconomicModelInstanceReport economicModelInstanceReport) {
    this.economicModelInstanceReport = economicModelInstanceReport;
  }


  /**
   * Get economicModelInstanceAnalysis
   * @return economicModelInstanceAnalysis
  **/

  public BQEconomicModelRetrieveInputModelEconomicModelInstanceAnalysis getEconomicModelInstanceAnalysis() {
    return economicModelInstanceAnalysis;
  }

  public void setEconomicModelInstanceAnalysis(BQEconomicModelRetrieveInputModelEconomicModelInstanceAnalysis economicModelInstanceAnalysis) {
    this.economicModelInstanceAnalysis = economicModelInstanceAnalysis;
  }


}

