package org.openmai.endpoint.auth;

import org.openmai.beans.MAIRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

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
