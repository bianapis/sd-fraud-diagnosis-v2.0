package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFraudDiagnosisAnalysisRetrieveOutputModelFraudDiagnosisAnalysisInstanceRecord
 */
public class CRFraudDiagnosisAnalysisRetrieveOutputModelFraudDiagnosisAnalysisInstanceRecord   {
  private String productProductionSessionReference = null;

  private String fraudDiagnosisEvaluationProfile = null;

  private Object fraudDiagnosisTransactionConsolidationRecord = null;

  private Object fraudEvaluationProductionAnomalyRecord = null;

  private String fraudEvaluationProductionAnomalyProductionTransactionReference = null;

  private String fraudDiagnosisDetermination = null;

  private String fraudDiagnosisRecommendation = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the product fulfillment production session for which fraud diagnosis is performed 
   * @return productProductionSessionReference
  **/

  public String getProductProductionSessionReference() {
    return productProductionSessionReference;
  }

  public void setProductProductionSessionReference(String productProductionSessionReference) {
    this.productProductionSessionReference = productProductionSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details the types of fraud diagnosis algorithms and tests are applied 
   * @return fraudDiagnosisEvaluationProfile
  **/

  public String getFraudDiagnosisEvaluationProfile() {
    return fraudDiagnosisEvaluationProfile;
  }

  public void setFraudDiagnosisEvaluationProfile(String fraudDiagnosisEvaluationProfile) {
    this.fraudDiagnosisEvaluationProfile = fraudDiagnosisEvaluationProfile;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The production transaction details that are submitted for fraud diagnosis 
   * @return fraudDiagnosisTransactionConsolidationRecord
  **/

  public Object getFraudDiagnosisTransactionConsolidationRecord() {
    return fraudDiagnosisTransactionConsolidationRecord;
  }

  public void setFraudDiagnosisTransactionConsolidationRecord(Object fraudDiagnosisTransactionConsolidationRecord) {
    this.fraudDiagnosisTransactionConsolidationRecord = fraudDiagnosisTransactionConsolidationRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of detected out of pattern production activity that could be fraud highlighted by Fraud Evaluation 
   * @return fraudEvaluationProductionAnomalyRecord
  **/

  public Object getFraudEvaluationProductionAnomalyRecord() {
    return fraudEvaluationProductionAnomalyRecord;
  }

  public void setFraudEvaluationProductionAnomalyRecord(Object fraudEvaluationProductionAnomalyRecord) {
    this.fraudEvaluationProductionAnomalyRecord = fraudEvaluationProductionAnomalyRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the one or more production transactions isolated by the fraud evaluation tests identified by Fraud Evaluation 
   * @return fraudEvaluationProductionAnomalyProductionTransactionReference
  **/

  public String getFraudEvaluationProductionAnomalyProductionTransactionReference() {
    return fraudEvaluationProductionAnomalyProductionTransactionReference;
  }

  public void setFraudEvaluationProductionAnomalyProductionTransactionReference(String fraudEvaluationProductionAnomalyProductionTransactionReference) {
    this.fraudEvaluationProductionAnomalyProductionTransactionReference = fraudEvaluationProductionAnomalyProductionTransactionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details the conclusion of the analysis and determination (e.g. diagnosis of likely fraud) 
   * @return fraudDiagnosisDetermination
  **/

  public String getFraudDiagnosisDetermination() {
    return fraudDiagnosisDetermination;
  }

  public void setFraudDiagnosisDetermination(String fraudDiagnosisDetermination) {
    this.fraudDiagnosisDetermination = fraudDiagnosisDetermination;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details the recommended action in response to the analysis (e.g. accept or reject the transaction, flag account for fraud) 
   * @return fraudDiagnosisRecommendation
  **/

  public String getFraudDiagnosisRecommendation() {
    return fraudDiagnosisRecommendation;
  }

  public void setFraudDiagnosisRecommendation(String fraudDiagnosisRecommendation) {
    this.fraudDiagnosisRecommendation = fraudDiagnosisRecommendation;
  }


}

