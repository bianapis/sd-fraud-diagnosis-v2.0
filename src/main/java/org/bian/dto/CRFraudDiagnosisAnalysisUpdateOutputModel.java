package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFraudDiagnosisAnalysisUpdateInputModelFraudDiagnosisAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRFraudDiagnosisAnalysisUpdateOutputModel
 */
public class CRFraudDiagnosisAnalysisUpdateOutputModel   {
  private CRFraudDiagnosisAnalysisUpdateInputModelFraudDiagnosisAnalysisInstanceRecord fraudDiagnosisAnalysisInstanceRecord = null;

  private String fraudDiagnosisAnalysisUpdateActionTaskReference = null;

  private Object fraudDiagnosisAnalysisUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get fraudDiagnosisAnalysisInstanceRecord
   * @return fraudDiagnosisAnalysisInstanceRecord
  **/

  public CRFraudDiagnosisAnalysisUpdateInputModelFraudDiagnosisAnalysisInstanceRecord getFraudDiagnosisAnalysisInstanceRecord() {
    return fraudDiagnosisAnalysisInstanceRecord;
  }

  public void setFraudDiagnosisAnalysisInstanceRecord(CRFraudDiagnosisAnalysisUpdateInputModelFraudDiagnosisAnalysisInstanceRecord fraudDiagnosisAnalysisInstanceRecord) {
    this.fraudDiagnosisAnalysisInstanceRecord = fraudDiagnosisAnalysisInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return fraudDiagnosisAnalysisUpdateActionTaskReference
  **/

  public String getFraudDiagnosisAnalysisUpdateActionTaskReference() {
    return fraudDiagnosisAnalysisUpdateActionTaskReference;
  }

  public void setFraudDiagnosisAnalysisUpdateActionTaskReference(String fraudDiagnosisAnalysisUpdateActionTaskReference) {
    this.fraudDiagnosisAnalysisUpdateActionTaskReference = fraudDiagnosisAnalysisUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return fraudDiagnosisAnalysisUpdateActionTaskRecord
  **/

  public Object getFraudDiagnosisAnalysisUpdateActionTaskRecord() {
    return fraudDiagnosisAnalysisUpdateActionTaskRecord;
  }

  public void setFraudDiagnosisAnalysisUpdateActionTaskRecord(Object fraudDiagnosisAnalysisUpdateActionTaskRecord) {
    this.fraudDiagnosisAnalysisUpdateActionTaskRecord = fraudDiagnosisAnalysisUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

