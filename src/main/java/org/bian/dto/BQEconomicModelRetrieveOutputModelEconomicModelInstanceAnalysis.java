package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQEconomicModelRetrieveOutputModelEconomicModelInstanceAnalysis
 */
public class BQEconomicModelRetrieveOutputModelEconomicModelInstanceAnalysis   {
  private Object economicModelInstanceAnalysisRecord = null;

  private String economicModelInstanceAnalysisReportType = null;

  private String economicModelInstanceAnalysisParameters = null;

  private Object economicModelInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return economicModelInstanceAnalysisRecord
  **/

  public Object getEconomicModelInstanceAnalysisRecord() {
    return economicModelInstanceAnalysisRecord;
  }

  public void setEconomicModelInstanceAnalysisRecord(Object economicModelInstanceAnalysisRecord) {
    this.economicModelInstanceAnalysisRecord = economicModelInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return economicModelInstanceAnalysisReportType
  **/

  public String getEconomicModelInstanceAnalysisReportType() {
    return economicModelInstanceAnalysisReportType;
  }

  public void setEconomicModelInstanceAnalysisReportType(String economicModelInstanceAnalysisReportType) {
    this.economicModelInstanceAnalysisReportType = economicModelInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return economicModelInstanceAnalysisParameters
  **/

  public String getEconomicModelInstanceAnalysisParameters() {
    return economicModelInstanceAnalysisParameters;
  }

  public void setEconomicModelInstanceAnalysisParameters(String economicModelInstanceAnalysisParameters) {
    this.economicModelInstanceAnalysisParameters = economicModelInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return economicModelInstanceAnalysisReport
  **/

  public Object getEconomicModelInstanceAnalysisReport() {
    return economicModelInstanceAnalysisReport;
  }

  public void setEconomicModelInstanceAnalysisReport(Object economicModelInstanceAnalysisReport) {
    this.economicModelInstanceAnalysisReport = economicModelInstanceAnalysisReport;
  }


}

