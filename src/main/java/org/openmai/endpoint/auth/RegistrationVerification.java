package org.openmai.endpoint.auth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class RegistrationVerification {

	@PostMapping("registerUser/{{envID}}/flows/{{flowID}}")
	public String registerUser() {
		return "registerUser";
	}
	@PostMapping("sendVerificationCode/{{envID}}/flows/{{flowID}}")
	public String sendVerificationCode() {
		return "sendVerificationCode";
	}

	@PostMapping("verifyUser/{{envID}}/flows/{{flowID}}")
	public String verifyUser() {
		return "verifyUser";
	}

}
