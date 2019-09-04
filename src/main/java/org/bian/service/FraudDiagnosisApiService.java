/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface FraudDiagnosisApiService {

	SDFraudDiagnosisActivateOutputModel activate(SDFraudDiagnosisActivateInputModel request);
	
	SDFraudDiagnosisConfigureOutputModel configure(String sdReferenceId, SDFraudDiagnosisConfigureInputModel request);
	
	CRFraudDiagnosisAnalysisEvaluateOutputModel evaluate(String sdReferenceId, CRFraudDiagnosisAnalysisEvaluateInputModel request);
	
	CRFraudDiagnosisAnalysisExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRFraudDiagnosisAnalysisExecuteInputModel request);
	
	SDFraudDiagnosisFeedbackOutputModel feedback(String sdReferenceId, SDFraudDiagnosisFeedbackInputModel request);
	
	BQAnalystReviewRequestOutputModel requestAnalystreview(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAnalystReviewRequestInputModel request);
	
	CRFraudDiagnosisAnalysisRequestOutputModel request(String sdReferenceId, String crReferenceId, CRFraudDiagnosisAnalysisRequestInputModel request);
	
	CRFraudDiagnosisAnalysisRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	BQAnalystReviewRetrieveOutputModel retrieveAnalystreview(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQCustomerBehaviorRetrieveOutputModel retrieveCustomerbehavior(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQEconomicModelRetrieveOutputModel retrieveEconomicmodel(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDFraudDiagnosisRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRFraudDiagnosisAnalysisUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRFraudDiagnosisAnalysisUpdateInputModel request);
	
}
