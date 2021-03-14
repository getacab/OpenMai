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
public class SignOnPolicies{
    @Autowired
	MAIRequest maiRequest;

    //  Get...
    @GetMapping("/environments/{envID}/signOnPolicies")
	public String readAllSignOnPolicies() {
		return "readAllSignOnPolicies";
	}
    @GetMapping("/environments/{envID}/signOnPolicies/{policyID}")
	public String readOneSignOnPolicies() {
		return "readOneSignOnPolicies";
	}

    //  Post..
    @PostMapping("/environments/{envID}/signOnPolicies")
	String createSignOnPolicies() {
		return "createSignOnPolicies";
	}

    //  Put & Delete
    @PutMapping("/environments/{envID}/signOnPolicies/{policyID}")
	String updateSignOnPolicies() {
		return "updateSignOnPolicies";
	}

    @DeleteMapping("/environments/{envID}/signOnPolicies/{policyID}")
	String deleteSignOnPolicies() {
		return "deleteSignOnPolicies";
	}

}