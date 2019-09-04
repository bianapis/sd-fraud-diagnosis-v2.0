package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQEconomicModelRetrieveOutputModelEconomicModelInstanceAnalysis;
import org.bian.dto.BQEconomicModelRetrieveOutputModelEconomicModelInstanceRecord;
import org.bian.dto.BQEconomicModelRetrieveOutputModelEconomicModelInstanceReport;
import org.bian.dto.BQEconomicModelRetrieveOutputModelFraudDiagnosisAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQEconomicModelRetrieveOutputModel
 */
public class BQEconomicModelRetrieveOutputModel   {
  private BQEconomicModelRetrieveOutputModelFraudDiagnosisAnalysisInstanceRecord fraudDiagnosisAnalysisInstanceRecord = null;

  private BQEconomicModelRetrieveOutputModelEconomicModelInstanceRecord economicModelInstanceRecord = null;

  private String economicModelRetrieveActionTaskReference = null;

  private Object economicModelRetrieveActionTaskRecord = null;

  private String economicModelRetrieveActionResponse = null;

  private BQEconomicModelRetrieveOutputModelEconomicModelInstanceReport economicModelInstanceReport = null;

  private BQEconomicModelRetrieveOutputModelEconomicModelInstanceAnalysis economicModelInstanceAnalysis = null;


  /**
   * Get fraudDiagnosisAnalysisInstanceRecord
   * @return fraudDiagnosisAnalysisInstanceRecord
  **/

  public BQEconomicModelRetrieveOutputModelFraudDiagnosisAnalysisInstanceRecord getFraudDiagnosisAnalysisInstanceRecord() {
    return fraudDiagnosisAnalysisInstanceRecord;
  }

  public void setFraudDiagnosisAnalysisInstanceRecord(BQEconomicModelRetrieveOutputModelFraudDiagnosisAnalysisInstanceRecord fraudDiagnosisAnalysisInstanceRecord) {
    this.fraudDiagnosisAnalysisInstanceRecord = fraudDiagnosisAnalysisInstanceRecord;
  }


  /**
   * Get economicModelInstanceRecord
   * @return economicModelInstanceRecord
  **/

  public BQEconomicModelRetrieveOutputModelEconomicModelInstanceRecord getEconomicModelInstanceRecord() {
    return economicModelInstanceRecord;
  }

  public void setEconomicModelInstanceRecord(BQEconomicModelRetrieveOutputModelEconomicModelInstanceRecord economicModelInstanceRecord) {
    this.economicModelInstanceRecord = economicModelInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Economic Model instance retrieve service call 
   * @return economicModelRetrieveActionTaskReference
  **/

  public String getEconomicModelRetrieveActionTaskReference() {
    return economicModelRetrieveActionTaskReference;
  }

  public void setEconomicModelRetrieveActionTaskReference(String economicModelRetrieveActionTaskReference) {
    this.economicModelRetrieveActionTaskReference = economicModelRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return economicModelRetrieveActionTaskRecord
  **/

  public Object getEconomicModelRetrieveActionTaskRecord() {
    return economicModelRetrieveActionTaskRecord;
  }

  public void setEconomicModelRetrieveActionTaskRecord(Object economicModelRetrieveActionTaskRecord) {
    this.economicModelRetrieveActionTaskRecord = economicModelRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return economicModelRetrieveActionResponse
  **/

  public String getEconomicModelRetrieveActionResponse() {
    return economicModelRetrieveActionResponse;
  }

  public void setEconomicModelRetrieveActionResponse(String economicModelRetrieveActionResponse) {
    this.economicModelRetrieveActionResponse = economicModelRetrieveActionResponse;
  }


  /**
   * Get economicModelInstanceReport
   * @return economicModelInstanceReport
  **/

  public BQEconomicModelRetrieveOutputModelEconomicModelInstanceReport getEconomicModelInstanceReport() {
    return economicModelInstanceReport;
  }

  public void setEconomicModelInstanceReport(BQEconomicModelRetrieveOutputModelEconomicModelInstanceReport economicModelInstanceReport) {
    this.economicModelInstanceReport = economicModelInstanceReport;
  }


  /**
   * Get economicModelInstanceAnalysis
   * @return economicModelInstanceAnalysis
  **/

  public BQEconomicModelRetrieveOutputModelEconomicModelInstanceAnalysis getEconomicModelInstanceAnalysis() {
    return economicModelInstanceAnalysis;
  }

  public void setEconomicModelInstanceAnalysis(BQEconomicModelRetrieveOutputModelEconomicModelInstanceAnalysis economicModelInstanceAnalysis) {
    this.economicModelInstanceAnalysis = economicModelInstanceAnalysis;
  }


}

