package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFraudDiagnosisAnalysisEvaluateOutputModelFraudDiagnosisAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRFraudDiagnosisAnalysisRequestOutputModel
 */
public class CRFraudDiagnosisAnalysisRequestOutputModel   {
  private CRFraudDiagnosisAnalysisEvaluateOutputModelFraudDiagnosisAnalysisInstanceRecord fraudDiagnosisAnalysisInstanceRecord = null;

  private String fraudDiagnosisAnalysisRequestActionTaskReference = null;

  private Object fraudDiagnosisAnalysisRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Fraud Diagnosis Analysis instance request service call 
   * @return fraudDiagnosisAnalysisRequestActionTaskReference
  **/

  public String getFraudDiagnosisAnalysisRequestActionTaskReference() {
    return fraudDiagnosisAnalysisRequestActionTaskReference;
  }

  public void setFraudDiagnosisAnalysisRequestActionTaskReference(String fraudDiagnosisAnalysisRequestActionTaskReference) {
    this.fraudDiagnosisAnalysisRequestActionTaskReference = fraudDiagnosisAnalysisRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return fraudDiagnosisAnalysisRequestActionTaskRecord
  **/

  public Object getFraudDiagnosisAnalysisRequestActionTaskRecord() {
    return fraudDiagnosisAnalysisRequestActionTaskRecord;
  }

  public void setFraudDiagnosisAnalysisRequestActionTaskRecord(Object fraudDiagnosisAnalysisRequestActionTaskRecord) {
    this.fraudDiagnosisAnalysisRequestActionTaskRecord = fraudDiagnosisAnalysisRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

