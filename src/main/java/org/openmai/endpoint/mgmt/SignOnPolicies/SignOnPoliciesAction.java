package org.openmai.endpoint.mgmt.SignOnPolicies;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.json.JSONObject;
import org.openmai.interceptors.RequestHandler;
import org.openmai.beans.MAIRequest;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignOnPoliciesAction{
    @Autowired
	MAIRequest maiRequest;

    //  Get...
    @GetMapping("/environments/{envID}/signOnPolicies/actions")
	public String readAllSignOnPoliciesAction() {
		return "readAllSignOnPolicies";
	}
    @GetMapping("/environments/{envID}/signOnPolicies/{policyID}/actions/{actionID}")
	public String readOneSignOnPoliciesAction() {
		return "readOneSignOnPolicies";
	}

    //  Post..
    @PostMapping("/environments/{envID}/signOnPolicies/actions")
	String createSignOnPoliciesAction() {
		return "createSignOnPoliciesAction";
	}

    //  Put & Delete
    @PutMapping("/environments/{envID}/signOnPolicies/{policyID}/actions/{actionID}")
	String updateSignOnPoliciesAction() {
		return "updateSignOnPoliciesAction";
	}

    @DeleteMapping("/environments/{envID}/signOnPolicies/{policyID}/actions/{actionID}")
	String deleteSignOnPoliciesAction() {
		return "deleteSignOnPoliciesAction";
	}

}