package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFraudDiagnosisAnalysisRetrieveOutputModelFraudDiagnosisAnalysisInstanceReportRecord
 */
public class CRFraudDiagnosisAnalysisRetrieveOutputModelFraudDiagnosisAnalysisInstanceReportRecord   {
  private String fraudDiagnosisAnalysisInstanceReportData = null;

  private String fraudDiagnosisAnalysisInstanceReportType = null;

  private Object fraudDiagnosisAnalysisInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return fraudDiagnosisAnalysisInstanceReportData
  **/

  public String getFraudDiagnosisAnalysisInstanceReportData() {
    return fraudDiagnosisAnalysisInstanceReportData;
  }

  public void setFraudDiagnosisAnalysisInstanceReportData(String fraudDiagnosisAnalysisInstanceReportData) {
    this.fraudDiagnosisAnalysisInstanceReportData = fraudDiagnosisAnalysisInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return fraudDiagnosisAnalysisInstanceReportType
  **/

  public String getFraudDiagnosisAnalysisInstanceReportType() {
    return fraudDiagnosisAnalysisInstanceReportType;
  }

  public void setFraudDiagnosisAnalysisInstanceReportType(String fraudDiagnosisAnalysisInstanceReportType) {
    this.fraudDiagnosisAnalysisInstanceReportType = fraudDiagnosisAnalysisInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return fraudDiagnosisAnalysisInstanceReport
  **/

  public Object getFraudDiagnosisAnalysisInstanceReport() {
    return fraudDiagnosisAnalysisInstanceReport;
  }

  public void setFraudDiagnosisAnalysisInstanceReport(Object fraudDiagnosisAnalysisInstanceReport) {
    this.fraudDiagnosisAnalysisInstanceReport = fraudDiagnosisAnalysisInstanceReport;
  }


}

