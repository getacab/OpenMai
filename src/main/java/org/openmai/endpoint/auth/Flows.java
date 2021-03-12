package org.openmai.endpoint.auth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Flows {

	@GetMapping("/f211")
	public String first() {
		return "HRHK";
	}
}
