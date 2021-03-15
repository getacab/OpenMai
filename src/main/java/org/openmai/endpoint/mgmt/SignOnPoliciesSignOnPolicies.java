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

public class SignOnPoliciesSignOnPolicies {
	@Autowired
	@Qualifier("maiRequest")
	private MAIRequest maiRequest;

	// PingOne-Sign-On Policies : SignOnPolicies : CreateSignOnPolicy
	@PostMapping("/environments/{{envID}}/signOnPolicies")
	public String postCreateSignOnPolicy() {
		return "CreateSignOnPolicy";
	}

	// PingOne-Sign-On Policies : SignOnPolicies : ReadAllSignOnPolicies
	@GetMapping("/environments/{{envID}}/signOnPolicies")
	public String getReadAllSignOnPolicies() {
		return "ReadAllSignOnPolicies";
	}

	// PingOne-Sign-On Policies : SignOnPolicies : ReadOneSignOnPolicy
	@GetMapping("/environments/{{envID}}/signOnPolicies/{{policyID}}")
	public String getReadOneSignOnPolicy() {
		return "ReadOneSignOnPolicy";
	}

	// PingOne-Sign-On Policies : SignOnPolicies : UpdateSignOnPolicy
	@PutMapping("/environments/{{envID}}/signOnPolicies/{{policyID}}")
	public String putUpdateSignOnPolicy() {
		return "UpdateSignOnPolicy";
	}

	// PingOne-Sign-On Policies : SignOnPolicies : DeleteSignOnPolicy
	@DeleteMapping("/environments/{{envID}}/signOnPolicies/{{policyID}}")
	public String deleteDeleteSignOnPolicy() {
		return "DeleteSignOnPolicy";
	}

}
