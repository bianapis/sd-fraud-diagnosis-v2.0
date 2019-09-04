package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFraudDiagnosisAnalysisEvaluateOutputModelFraudDiagnosisAnalysisInstanceRecord
 */
public class CRFraudDiagnosisAnalysisEvaluateOutputModelFraudDiagnosisAnalysisInstanceRecord   {
  private String fraudDiagnosisEvaluationProfile = null;

  private String fraudDiagnosisDetermination = null;

  private String fraudDiagnosisRecommendation = null;


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

