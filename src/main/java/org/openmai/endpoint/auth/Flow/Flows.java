package org.openmai.endpoint.auth.Flow;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.json.JSONObject;
import org.openmai.interceptors.RequestHandler;
import org.openmai.beans.MAIRequest;
import org.springframework.web.bind.annotation.RestController;
import org.openmai.endpoint.auth.Flow.FlowRegisterVerify;
import org.openmai.endpoint.auth.Flow.FlowForgotPassword;

@RestController

public class Flows {

    @Autowired
	MAIRequest maiRequest;
	
	@GetMapping("/readFlow/{envID}/flows/{flowID}")
	public String readFlow(@PathVariable String envID, @PathVariable String flowID) {
		return "readFlow";
	}

	@PostMapping("/checkUsernamePassword/{envID}/flows/{flowID}")
	String checkUsernamePassword(String username, String password) {
		System.out.println(maiRequest.body);
		return "checkUsernamePassword";
	}

	@PostMapping("/signOnUsername/{envID}/flows/{flowID}")
	String signOnUsername(String username, String password) {
		return "signOnUsername";
	}

	@PostMapping("/resetPassword/{envID}/flows/{flowID}")
	String resetPassword() {
		return "resetPassword";
	}

	@PostMapping("/selectDevice/{envID}/flows/{flowID}")
	String selectDevice(JSONObject device) {
		return "selectDevice";
	}

	@PostMapping("/checkOtp/{envID}/flows/{flowID}")
	String checkOtp(String otp) {
		return "checkOtp";
	}
}
