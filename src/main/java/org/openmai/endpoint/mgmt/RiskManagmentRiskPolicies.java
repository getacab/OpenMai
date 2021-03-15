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

public class RiskManagmentRiskPolicies {
	@Autowired
	@Qualifier("maiRequest")
	private MAIRequest maiRequest;

	// PingOne-Risk Managment : RiskPolicies : ReadAllRiskPolicySets
	@GetMapping("/environments/{{envID}}/riskPolicySets")
	public String getReadAllRiskPolicySets() {
		return "ReadAllRiskPolicySets";
	}

	// PingOne-Risk Managment : RiskPolicies : ReadOneRiskPolicySet
	@GetMapping("/environments/{{envID}}/riskPolicySets/{{riskPolicySetID}}")
	public String getReadOneRiskPolicySet() {
		return "ReadOneRiskPolicySet";
	}

	// PingOne-Risk Managment : RiskPolicies : CreateRiskPolicySet
	@PostMapping("/environments/{{envID}}/riskPolicySets")
	public String postCreateRiskPolicySet() {
		return "CreateRiskPolicySet";
	}

	// PingOne-Risk Managment : RiskPolicies : UpdateRiskPolicySet
	@PutMapping("/environments/{{envID}}/riskPolicySets/{{riskPolicySetID}}")
	public String putUpdateRiskPolicySet() {
		return "UpdateRiskPolicySet";
	}

	// PingOne-Risk Managment : RiskPolicies : DeleteRiskPolicySet
	@DeleteMapping("/environments/{{envID}}/riskPolicySets/{{riskPolicySetID}}")
	public String deleteDeleteRiskPolicySet() {
		return "DeleteRiskPolicySet";
	}

}
