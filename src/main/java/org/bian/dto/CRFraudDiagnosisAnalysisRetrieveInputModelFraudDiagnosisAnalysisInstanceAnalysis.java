package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFraudDiagnosisAnalysisRetrieveInputModelFraudDiagnosisAnalysisInstanceAnalysis
 */
public class CRFraudDiagnosisAnalysisRetrieveInputModelFraudDiagnosisAnalysisInstanceAnalysis   {
  private String fraudDiagnosisAnalysisInstanceAnalysisReference = null;

  private String fraudDiagnosisAnalysisInstanceAnalysisReportType = null;

  private String fraudDiagnosisAnalysisInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return fraudDiagnosisAnalysisInstanceAnalysisReference
  **/

  public String getFraudDiagnosisAnalysisInstanceAnalysisReference() {
    return fraudDiagnosisAnalysisInstanceAnalysisReference;
  }

  public void setFraudDiagnosisAnalysisInstanceAnalysisReference(String fraudDiagnosisAnalysisInstanceAnalysisReference) {
    this.fraudDiagnosisAnalysisInstanceAnalysisReference = fraudDiagnosisAnalysisInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return fraudDiagnosisAnalysisInstanceAnalysisParameters
  **/

  public String getFraudDiagnosisAnalysisInstanceAnalysisParameters() {
    return fraudDiagnosisAnalysisInstanceAnalysisParameters;
  }

  public void setFraudDiagnosisAnalysisInstanceAnalysisParameters(String fraudDiagnosisAnalysisInstanceAnalysisParameters) {
    this.fraudDiagnosisAnalysisInstanceAnalysisParameters = fraudDiagnosisAnalysisInstanceAnalysisParameters;
  }


}

