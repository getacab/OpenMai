package org.openmai.endpoint.auth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ForgotPassword {

	@PostMapping("/forgotPassword/{{envID}}/flows/{{flowID}}")
	public String forgotPassword() {
		return "forgotPassword";
	}
	@PostMapping("/sendRecoveryCode/{{envID}}/flows/{{flowID}}")
	public String sendRecoveryCode() {
		return "sendRecoveryCode";
	}

	@PostMapping("/recoverPassword/{{envID}}/flows/{{flowID}}")
	public String recoverPassword() {
		return "recoverPassword";
	}

}
