package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFraudDiagnosisAnalysisRetrieveOutputModelFraudDiagnosisAnalysisInstanceAnalysis;
import org.bian.dto.CRFraudDiagnosisAnalysisRetrieveOutputModelFraudDiagnosisAnalysisInstanceRecord;
import org.bian.dto.CRFraudDiagnosisAnalysisRetrieveOutputModelFraudDiagnosisAnalysisInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRFraudDiagnosisAnalysisRetrieveOutputModel
 */
public class CRFraudDiagnosisAnalysisRetrieveOutputModel   {
  private CRFraudDiagnosisAnalysisRetrieveOutputModelFraudDiagnosisAnalysisInstanceRecord fraudDiagnosisAnalysisInstanceRecord = null;

  private String fraudDiagnosisAnalysisRetrieveActionTaskReference = null;

  private Object fraudDiagnosisAnalysisRetrieveActionTaskRecord = null;

  private String fraudDiagnosisAnalysisRetrieveActionResponse = null;

  private CRFraudDiagnosisAnalysisRetrieveOutputModelFraudDiagnosisAnalysisInstanceReportRecord fraudDiagnosisAnalysisInstanceReportRecord = null;

  private CRFraudDiagnosisAnalysisRetrieveOutputModelFraudDiagnosisAnalysisInstanceAnalysis fraudDiagnosisAnalysisInstanceAnalysis = null;


  /**
   * Get fraudDiagnosisAnalysisInstanceRecord
   * @return fraudDiagnosisAnalysisInstanceRecord
  **/

  public CRFraudDiagnosisAnalysisRetrieveOutputModelFraudDiagnosisAnalysisInstanceRecord getFraudDiagnosisAnalysisInstanceRecord() {
    return fraudDiagnosisAnalysisInstanceRecord;
  }

  public void setFraudDiagnosisAnalysisInstanceRecord(CRFraudDiagnosisAnalysisRetrieveOutputModelFraudDiagnosisAnalysisInstanceRecord fraudDiagnosisAnalysisInstanceRecord) {
    this.fraudDiagnosisAnalysisInstanceRecord = fraudDiagnosisAnalysisInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Fraud Diagnosis Analysis instance retrieve service call 
   * @return fraudDiagnosisAnalysisRetrieveActionTaskReference
  **/

  public String getFraudDiagnosisAnalysisRetrieveActionTaskReference() {
    return fraudDiagnosisAnalysisRetrieveActionTaskReference;
  }

  public void setFraudDiagnosisAnalysisRetrieveActionTaskReference(String fraudDiagnosisAnalysisRetrieveActionTaskReference) {
    this.fraudDiagnosisAnalysisRetrieveActionTaskReference = fraudDiagnosisAnalysisRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return fraudDiagnosisAnalysisRetrieveActionTaskRecord
  **/

  public Object getFraudDiagnosisAnalysisRetrieveActionTaskRecord() {
    return fraudDiagnosisAnalysisRetrieveActionTaskRecord;
  }

  public void setFraudDiagnosisAnalysisRetrieveActionTaskRecord(Object fraudDiagnosisAnalysisRetrieveActionTaskRecord) {
    this.fraudDiagnosisAnalysisRetrieveActionTaskRecord = fraudDiagnosisAnalysisRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return fraudDiagnosisAnalysisRetrieveActionResponse
  **/

  public String getFraudDiagnosisAnalysisRetrieveActionResponse() {
    return fraudDiagnosisAnalysisRetrieveActionResponse;
  }

  public void setFraudDiagnosisAnalysisRetrieveActionResponse(String fraudDiagnosisAnalysisRetrieveActionResponse) {
    this.fraudDiagnosisAnalysisRetrieveActionResponse = fraudDiagnosisAnalysisRetrieveActionResponse;
  }


  /**
   * Get fraudDiagnosisAnalysisInstanceReportRecord
   * @return fraudDiagnosisAnalysisInstanceReportRecord
  **/

  public CRFraudDiagnosisAnalysisRetrieveOutputModelFraudDiagnosisAnalysisInstanceReportRecord getFraudDiagnosisAnalysisInstanceReportRecord() {
    return fraudDiagnosisAnalysisInstanceReportRecord;
  }

  public void setFraudDiagnosisAnalysisInstanceReportRecord(CRFraudDiagnosisAnalysisRetrieveOutputModelFraudDiagnosisAnalysisInstanceReportRecord fraudDiagnosisAnalysisInstanceReportRecord) {
    this.fraudDiagnosisAnalysisInstanceReportRecord = fraudDiagnosisAnalysisInstanceReportRecord;
  }


  /**
   * Get fraudDiagnosisAnalysisInstanceAnalysis
   * @return fraudDiagnosisAnalysisInstanceAnalysis
  **/

  public CRFraudDiagnosisAnalysisRetrieveOutputModelFraudDiagnosisAnalysisInstanceAnalysis getFraudDiagnosisAnalysisInstanceAnalysis() {
    return fraudDiagnosisAnalysisInstanceAnalysis;
  }

  public void setFraudDiagnosisAnalysisInstanceAnalysis(CRFraudDiagnosisAnalysisRetrieveOutputModelFraudDiagnosisAnalysisInstanceAnalysis fraudDiagnosisAnalysisInstanceAnalysis) {
    this.fraudDiagnosisAnalysisInstanceAnalysis = fraudDiagnosisAnalysisInstanceAnalysis;
  }


}

