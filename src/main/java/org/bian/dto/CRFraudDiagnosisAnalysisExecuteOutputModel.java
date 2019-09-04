package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFraudDiagnosisAnalysisEvaluateOutputModelFraudDiagnosisAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRFraudDiagnosisAnalysisExecuteOutputModel
 */
public class CRFraudDiagnosisAnalysisExecuteOutputModel   {
  private CRFraudDiagnosisAnalysisEvaluateOutputModelFraudDiagnosisAnalysisInstanceRecord fraudDiagnosisAnalysisInstanceRecord = null;

  private String fraudDiagnosisAnalysisExecuteActionTaskReference = null;

  private Object fraudDiagnosisAnalysisExecuteActionTaskRecord = null;

  private String executeRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * Get fraudDiagnosisAnalysisInstanceRecord
   * @return fraudDiagnosisAnalysisInstanceRecord
  **/

  public CRFraudDiagnosisAnalysisEvaluateOutputModelFraudDiagnosisAnalysisInstanceRecord getFraudDiagnosisAnalysisInstanceRecord() {
    return fraudDiagnosisAnalysisInstanceRecord;
  }

  public void setFraudDiagnosisAnalysisInstanceRecord(CRFraudDiagnosisAnalysisEvaluateOutputModelFraudDiagnosisAnalysisInstanceRecord fraudDiagnosisAnalysisInstanceRecord) {
    this.fraudDiagnosisAnalysisInstanceRecord = fraudDiagnosisAnalysisInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Fraud Diagnosis Analysis instance execute service call 
   * @return fraudDiagnosisAnalysisExecuteActionTaskReference
  **/

  public String getFraudDiagnosisAnalysisExecuteActionTaskReference() {
    return fraudDiagnosisAnalysisExecuteActionTaskReference;
  }

  public void setFraudDiagnosisAnalysisExecuteActionTaskReference(String fraudDiagnosisAnalysisExecuteActionTaskReference) {
    this.fraudDiagnosisAnalysisExecuteActionTaskReference = fraudDiagnosisAnalysisExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return fraudDiagnosisAnalysisExecuteActionTaskRecord
  **/

  public Object getFraudDiagnosisAnalysisExecuteActionTaskRecord() {
    return fraudDiagnosisAnalysisExecuteActionTaskRecord;
  }

  public void setFraudDiagnosisAnalysisExecuteActionTaskRecord(Object fraudDiagnosisAnalysisExecuteActionTaskRecord) {
    this.fraudDiagnosisAnalysisExecuteActionTaskRecord = fraudDiagnosisAnalysisExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the execute transaction/record 
   * @return executeRecordReference
  **/

  public String getExecuteRecordReference() {
    return executeRecordReference;
  }

  public void setExecuteRecordReference(String executeRecordReference) {
    this.executeRecordReference = executeRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

