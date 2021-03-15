package org.openmai.endpoint.auth.Flow;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@RestController

public class FlowForgotPassword 
{

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
