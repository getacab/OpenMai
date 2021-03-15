package org.openmai.endpoint.mgmt;

import org.openmai.beans.MAIRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class RiskManagmentRiskEvaluations {

	@Autowired
	@Qualifier("maiRequest")
	private MAIRequest maiRequest;

	// PingOne-Risk Managment : RiskEvaluations : CreateRiskEvaluation
	@PostMapping("/environments/{{envID}}/riskEvaluations")
	public String postCreateRiskEvaluation() {
		return "CreateRiskEvaluation";
	}

	// PingOne-Risk Managment : RiskEvaluations : ReadRiskEvaluation
	@GetMapping("/environments/{{envID}}/riskEvaluations/{{riskEvaluationID}}")
	public String getReadRiskEvaluation() {
		return "ReadRiskEvaluation";
	}

	// PingOne-Risk Managment : RiskEvaluations : UpdateRiskEvaluation
	@PutMapping("/environments/{{envID}}/riskEvaluations/{{riskEvaluationID}}/event")
	public String putUpdateRiskEvaluation() {
		return "UpdateRiskEvaluation";
	}

}
