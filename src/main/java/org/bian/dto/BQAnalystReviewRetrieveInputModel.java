package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAnalystReviewRetrieveInputModelAnalystReviewInstanceAnalysis;
import org.bian.dto.BQAnalystReviewRetrieveInputModelAnalystReviewInstanceReport;

import javax.validation.Valid;
  
/**
 * BQAnalystReviewRetrieveInputModel
 */
public class BQAnalystReviewRetrieveInputModel   {
  private Object analystReviewRetrieveActionTaskRecord = null;

  private String analystReviewRetrieveActionRequest = null;

  private BQAnalystReviewRetrieveInputModelAnalystReviewInstanceReport analystReviewInstanceReport = null;

  private BQAnalystReviewRetrieveInputModelAnalystReviewInstanceAnalysis analystReviewInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return analystReviewRetrieveActionTaskRecord
  **/

  public Object getAnalystReviewRetrieveActionTaskRecord() {
    return analystReviewRetrieveActionTaskRecord;
  }

  public void setAnalystReviewRetrieveActionTaskRecord(Object analystReviewRetrieveActionTaskRecord) {
    this.analystReviewRetrieveActionTaskRecord = analystReviewRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return analystReviewRetrieveActionRequest
  **/

  public String getAnalystReviewRetrieveActionRequest() {
    return analystReviewRetrieveActionRequest;
  }

  public void setAnalystReviewRetrieveActionRequest(String analystReviewRetrieveActionRequest) {
    this.analystReviewRetrieveActionRequest = analystReviewRetrieveActionRequest;
  }


  /**
   * Get analystReviewInstanceReport
   * @return analystReviewInstanceReport
  **/

  public BQAnalystReviewRetrieveInputModelAnalystReviewInstanceReport getAnalystReviewInstanceReport() {
    return analystReviewInstanceReport;
  }

  public void setAnalystReviewInstanceReport(BQAnalystReviewRetrieveInputModelAnalystReviewInstanceReport analystReviewInstanceReport) {
    this.analystReviewInstanceReport = analystReviewInstanceReport;
  }


  /**
   * Get analystReviewInstanceAnalysis
   * @return analystReviewInstanceAnalysis
  **/

  public BQAnalystReviewRetrieveInputModelAnalystReviewInstanceAnalysis getAnalystReviewInstanceAnalysis() {
    return analystReviewInstanceAnalysis;
  }

  public void setAnalystReviewInstanceAnalysis(BQAnalystReviewRetrieveInputModelAnalystReviewInstanceAnalysis analystReviewInstanceAnalysis) {
    this.analystReviewInstanceAnalysis = analystReviewInstanceAnalysis;
  }


}

