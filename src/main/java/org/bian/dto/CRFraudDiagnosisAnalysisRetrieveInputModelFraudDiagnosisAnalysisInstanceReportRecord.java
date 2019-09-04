package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFraudDiagnosisAnalysisRetrieveInputModelFraudDiagnosisAnalysisInstanceReportRecord
 */
public class CRFraudDiagnosisAnalysisRetrieveInputModelFraudDiagnosisAnalysisInstanceReportRecord   {
  private String fraudDiagnosisAnalysisInstanceReportReference = null;

  private String fraudDiagnosisAnalysisInstanceReportType = null;

  private String fraudDiagnosisAnalysisInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return fraudDiagnosisAnalysisInstanceReportReference
  **/

  public String getFraudDiagnosisAnalysisInstanceReportReference() {
    return fraudDiagnosisAnalysisInstanceReportReference;
  }

  public void setFraudDiagnosisAnalysisInstanceReportReference(String fraudDiagnosisAnalysisInstanceReportReference) {
    this.fraudDiagnosisAnalysisInstanceReportReference = fraudDiagnosisAnalysisInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return fraudDiagnosisAnalysisInstanceReportParameters
  **/

  public String getFraudDiagnosisAnalysisInstanceReportParameters() {
    return fraudDiagnosisAnalysisInstanceReportParameters;
  }

  public void setFraudDiagnosisAnalysisInstanceReportParameters(String fraudDiagnosisAnalysisInstanceReportParameters) {
    this.fraudDiagnosisAnalysisInstanceReportParameters = fraudDiagnosisAnalysisInstanceReportParameters;
  }


}

