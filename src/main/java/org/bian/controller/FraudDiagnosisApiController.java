/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Analyse;

@BianRestController
public class FraudDiagnosisApiController {

	@Autowired
	FraudDiagnosisApiService service;
	
	@Analyse.Activate
	public BianResponse<SDFraudDiagnosisActivateOutputModel> activate(@RequestBody BianRequest<SDFraudDiagnosisActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Analyse.Configure
	public BianResponse<SDFraudDiagnosisConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDFraudDiagnosisConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Analyse.Evaluate
	public BianResponse<CRFraudDiagnosisAnalysisEvaluateOutputModel> evaluate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRFraudDiagnosisAnalysisEvaluateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.evaluate(sdReferenceId, bianRequest.getData()));
	}
	
	@Analyse.Execute
	public BianResponse<CRFraudDiagnosisAnalysisExecuteOutputModel> execute(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRFraudDiagnosisAnalysisExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.execute(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Analyse.Feedback
	public BianResponse<SDFraudDiagnosisFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDFraudDiagnosisFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("analystreview")
	@Analyse.Request
	public BianResponse<BQAnalystReviewRequestOutputModel> requestAnalystreview(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAnalystReviewRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestAnalystreview(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Analyse.Request
	public BianResponse<CRFraudDiagnosisAnalysisRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRFraudDiagnosisAnalysisRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Analyse.Retrieve
	public BianResponse<CRFraudDiagnosisAnalysisRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@BQ("analystreview")
	@Analyse.Retrieve
	public BianResponse<BQAnalystReviewRetrieveOutputModel> retrieveAnalystreview(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAnalystreview(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("customerbehavior")
	@Analyse.Retrieve
	public BianResponse<BQCustomerBehaviorRetrieveOutputModel> retrieveCustomerbehavior(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCustomerbehavior(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("economicmodel")
	@Analyse.Retrieve
	public BianResponse<BQEconomicModelRetrieveOutputModel> retrieveEconomicmodel(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveEconomicmodel(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Analyse.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Analyse.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Analyse.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Analyse.RetrieveSD
	public BianResponse<SDFraudDiagnosisRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Analyse.Update
	public BianResponse<CRFraudDiagnosisAnalysisUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRFraudDiagnosisAnalysisUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
}
