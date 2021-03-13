package org.openmai.endpoint.auth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Flows {

	@GetMapping("/readFlow/{{envID}}/flows/{{flowID}}")
	public String readFlow() {
		return "HRHK";
	}
	@PostMapping("/checkUserNamePassword/{{envID}}/flows/{{flowID}}")
	public String checkUserNamePassword() {
		return "checkUserNamePassword";
	}

	@PostMapping("/resetPassword/{{envID}}/flows/{{flowID}}")
	public String resetPassword() {
		return "resetPassword";
	}

	@PostMapping("/resetPassword/{{envID}}/flows/{{flowID}}")
	public String selectDevice() {
		return "resetPassword";
	}

	@PostMapping("/checkOneTimePassword/{{envID}}/flows/{{flowID}}")
	public String checkOneTimePassword() {
		return "checkOneTimePassword";
	}

	
	
}
