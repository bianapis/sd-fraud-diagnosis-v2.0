/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class FraudDiagnosisApiServiceImpl implements FraudDiagnosisApiService {

	public SDFraudDiagnosisActivateOutputModel activate(SDFraudDiagnosisActivateInputModel request){
		return JsonReader.read("activate-SDFraudDiagnosisActivateOutputModel.json",new TypeReference<SDFraudDiagnosisActivateOutputModel>(){});
	}
	
	public SDFraudDiagnosisConfigureOutputModel configure(String sdReferenceId, SDFraudDiagnosisConfigureInputModel request){
		return JsonReader.read("configure-SDFraudDiagnosisConfigureOutputModel.json",new TypeReference<SDFraudDiagnosisConfigureOutputModel>(){});
	}
	
	public CRFraudDiagnosisAnalysisEvaluateOutputModel evaluate(String sdReferenceId, CRFraudDiagnosisAnalysisEvaluateInputModel request){
		return JsonReader.read("evaluate-CRFraudDiagnosisAnalysisEvaluateOutputModel.json",new TypeReference<CRFraudDiagnosisAnalysisEvaluateOutputModel>(){});
	}
	
	public CRFraudDiagnosisAnalysisExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRFraudDiagnosisAnalysisExecuteInputModel request){
		return JsonReader.read("execute-CRFraudDiagnosisAnalysisExecuteOutputModel.json",new TypeReference<CRFraudDiagnosisAnalysisExecuteOutputModel>(){});
	}
	
	public SDFraudDiagnosisFeedbackOutputModel feedback(String sdReferenceId, SDFraudDiagnosisFeedbackInputModel request){
		return JsonReader.read("feedback-SDFraudDiagnosisFeedbackOutputModel.json",new TypeReference<SDFraudDiagnosisFeedbackOutputModel>(){});
	}
	
	public BQAnalystReviewRequestOutputModel requestAnalystreview(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAnalystReviewRequestInputModel request){
		return JsonReader.read("request-BQAnalystReviewRequestOutputModel.json",new TypeReference<BQAnalystReviewRequestOutputModel>(){});
	}
	
	public CRFraudDiagnosisAnalysisRequestOutputModel request(String sdReferenceId, String crReferenceId, CRFraudDiagnosisAnalysisRequestInputModel request){
		return JsonReader.read("request-CRFraudDiagnosisAnalysisRequestOutputModel.json",new TypeReference<CRFraudDiagnosisAnalysisRequestOutputModel>(){});
	}
	
	public CRFraudDiagnosisAnalysisRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRFraudDiagnosisAnalysisRetrieveOutputModel.json",new TypeReference<CRFraudDiagnosisAnalysisRetrieveOutputModel>(){});
	}
	
	public BQAnalystReviewRetrieveOutputModel retrieveAnalystreview(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQAnalystReviewRetrieveOutputModel.json",new TypeReference<BQAnalystReviewRetrieveOutputModel>(){});
	}
	
	public BQCustomerBehaviorRetrieveOutputModel retrieveCustomerbehavior(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQCustomerBehaviorRetrieveOutputModel.json",new TypeReference<BQCustomerBehaviorRetrieveOutputModel>(){});
	}
	
	public BQEconomicModelRetrieveOutputModel retrieveEconomicmodel(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQEconomicModelRetrieveOutputModel.json",new TypeReference<BQEconomicModelRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDFraudDiagnosisRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDFraudDiagnosisRetrieveOutputModel.json",new TypeReference<SDFraudDiagnosisRetrieveOutputModel>(){});
	}
	
	public CRFraudDiagnosisAnalysisUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRFraudDiagnosisAnalysisUpdateInputModel request){
		return JsonReader.read("update-CRFraudDiagnosisAnalysisUpdateOutputModel.json",new TypeReference<CRFraudDiagnosisAnalysisUpdateOutputModel>(){});
	}
	
}
