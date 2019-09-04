package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQEconomicModelRetrieveOutputModelEconomicModelInstanceReport
 */
public class BQEconomicModelRetrieveOutputModelEconomicModelInstanceReport   {
  private Object economicModelInstanceReportRecord = null;

  private String economicModelInstanceReportType = null;

  private String economicModelInstanceReportParameters = null;

  private Object economicModelInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return economicModelInstanceReportRecord
  **/

  public Object getEconomicModelInstanceReportRecord() {
    return economicModelInstanceReportRecord;
  }

  public void setEconomicModelInstanceReportRecord(Object economicModelInstanceReportRecord) {
    this.economicModelInstanceReportRecord = economicModelInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return economicModelInstanceReportType
  **/

  public String getEconomicModelInstanceReportType() {
    return economicModelInstanceReportType;
  }

  public void setEconomicModelInstanceReportType(String economicModelInstanceReportType) {
    this.economicModelInstanceReportType = economicModelInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return economicModelInstanceReportParameters
  **/

  public String getEconomicModelInstanceReportParameters() {
    return economicModelInstanceReportParameters;
  }

  public void setEconomicModelInstanceReportParameters(String economicModelInstanceReportParameters) {
    this.economicModelInstanceReportParameters = economicModelInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return economicModelInstanceReport
  **/

  public Object getEconomicModelInstanceReport() {
    return economicModelInstanceReport;
  }

  public void setEconomicModelInstanceReport(Object economicModelInstanceReport) {
    this.economicModelInstanceReport = economicModelInstanceReport;
  }


}

