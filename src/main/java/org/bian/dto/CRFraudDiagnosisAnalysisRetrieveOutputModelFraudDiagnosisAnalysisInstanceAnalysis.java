package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFraudDiagnosisAnalysisRetrieveOutputModelFraudDiagnosisAnalysisInstanceAnalysis
 */
public class CRFraudDiagnosisAnalysisRetrieveOutputModelFraudDiagnosisAnalysisInstanceAnalysis   {
  private String fraudDiagnosisAnalysisInstanceAnalysisData = null;

  private String fraudDiagnosisAnalysisInstanceAnalysisReportType = null;

  private Object fraudDiagnosisAnalysisInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return fraudDiagnosisAnalysisInstanceAnalysisData
  **/

  public String getFraudDiagnosisAnalysisInstanceAnalysisData() {
    return fraudDiagnosisAnalysisInstanceAnalysisData;
  }

  public void setFraudDiagnosisAnalysisInstanceAnalysisData(String fraudDiagnosisAnalysisInstanceAnalysisData) {
    this.fraudDiagnosisAnalysisInstanceAnalysisData = fraudDiagnosisAnalysisInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return fraudDiagnosisAnalysisInstanceAnalysisReportType
  **/

  public String getFraudDiagnosisAnalysisInstanceAnalysisReportType() {
    return fraudDiagnosisAnalysisInstanceAnalysisReportType;
  }

  public void setFraudDiagnosisAnalysisInstanceAnalysisReportType(String fraudDiagnosisAnalysisInstanceAnalysisReportType) {
    this.fraudDiagnosisAnalysisInstanceAnalysisReportType = fraudDiagnosisAnalysisInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return fraudDiagnosisAnalysisInstanceAnalysisReport
  **/

  public Object getFraudDiagnosisAnalysisInstanceAnalysisReport() {
    return fraudDiagnosisAnalysisInstanceAnalysisReport;
  }

  public void setFraudDiagnosisAnalysisInstanceAnalysisReport(Object fraudDiagnosisAnalysisInstanceAnalysisReport) {
    this.fraudDiagnosisAnalysisInstanceAnalysisReport = fraudDiagnosisAnalysisInstanceAnalysisReport;
  }


}

