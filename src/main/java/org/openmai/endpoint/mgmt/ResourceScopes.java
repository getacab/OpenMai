package org.openmai.endpoint.mgmt;

import org.openmai.beans.MAIRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ResourceScopes {
	@Autowired
	@Qualifier("maiRequest")
	private MAIRequest maiRequest;

	// PingOne-Resources : ResourceScopes : CreateScope
	@PostMapping("/environments/{{envID}}/resources/{{resourceID}}/scopes")
	public String postCreateScope() {
		return "CreateScope";
	}

	// PingOne-Resources : ResourceScopes : ReadAllScopesResource
	@GetMapping("/environments/{{envID}}/resources/{{resourceID}}/scopes")
	public String getReadAllScopesResource() {
		return "ReadAllScopesResource";
	}

	// PingOne-Resources : ResourceScopes : ReadOneScope
	@GetMapping("/environments/{{envID}}/resources/{{resourceID}}/scopes/{{scopeID}}")
	public String getReadOneScope() {
		return "ReadOneScope";
	}

	// PingOne-Resources : ResourceScopes : UpdateScope
	@PutMapping("/environments/{{envID}}/resources/{{resourceID}}/scopes/{{scopeID}}")
	public String putUpdateScope() {
		return "UpdateScope";
	}

	// PingOne-Resources : ResourceScopes : DeleteScope
	@DeleteMapping("/environments/{{envID}}/resources/{{resourceID}}/scopes/{{scopeID}}")
	public String deleteDeleteScope() {
		return "DeleteScope";
	}

}
