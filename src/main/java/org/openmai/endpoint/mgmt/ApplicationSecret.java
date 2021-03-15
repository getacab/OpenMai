package org.openmai.endpoint.mgmt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class ApplicationSecret {
	// PingOne-Applications : ApplicationSecret : ReadApplicationSecret
	@GetMapping("{{apiPath}}/environments/{{envID}}/applications/{{appID}}/secret")
	public String getReadApplicationSecret() {
		return "ReadApplicationSecret";
	}

	// PingOne-Applications : ApplicationSecret : UpdateApplicationSecret
	@PostMapping("{{apiPath}}/environments/{{envID}}/applications/{{appID}}/secret")
	public String postUpdateApplicationSecret() {
		return "UpdateApplicationSecret";
	}

}
