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

public class SignOnPoliciesSignOnPolicyActions {

	@Autowired
	@Qualifier("maiRequest")
	private MAIRequest maiRequest;

	// PingOne-Sign-On Policies : SignOnPolicyActions : ReadAllSignOnPolicyActions
	@GetMapping("/environments/{{envID}}/signOnPolicies/{{policyID}}/actions")
	public String getReadAllSignOnPolicyActions() {
		return "ReadAllSignOnPolicyActions";
	}

	// PingOne-Sign-On Policies : SignOnPolicyActions : ReadOneSignOnPolicyAction
	@GetMapping("/environments/{{envID}}/signOnPolicies/{{policyID}}/actions/{{actionID}}")
	public String getReadOneSignOnPolicyAction() {
		return "ReadOneSignOnPolicyAction";
	}

	// PingOne-Sign-On Policies : SignOnPolicyActions : DeleteSignOnPolicyAction
	@DeleteMapping("/environments/{{envID}}/signOnPolicies/{{policyID}}/actions/{{actionID}}")
	public String deleteDeleteSignOnPolicyAction() {
		return "DeleteSignOnPolicyAction";
	}

	// PingOne-Sign-On Policies : SignOnPolicyActions : CreateSignOnPolicyAction
	@PostMapping("/environments/{{envID}}/signOnPolicies/{{policyID}}/actions")
	public String postCreateSignOnPolicyAction() {
		return "CreateSignOnPolicyAction";
	}

	// PingOne-Sign-On Policies : SignOnPolicyActions : UpdateSignOnPolicyAction
	@PutMapping("/environments/{{envID}}/signOnPolicies/{{policyID}}/actions/{{actionID}}")
	public String putUpdateSignOnPolicyAction() {
		return "UpdateSignOnPolicyAction";
	}

}
