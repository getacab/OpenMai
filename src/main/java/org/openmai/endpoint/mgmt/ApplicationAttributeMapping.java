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

public class ApplicationAttributeMapping {
	@Autowired
	@Qualifier("maiRequest")
	private MAIRequest maiRequest;

	// PingOne-Applications : ApplicationAttributeMapping : CreateAttribute
	@PostMapping("/environments/{{envID}}/applications/{{appID}}/attributes")
	public String postCreateAttribute() {
		return "CreateAttribute";
	}

	// PingOne-Applications : ApplicationAttributeMapping : ReadAllAttributes
	@GetMapping("/environments/{{envID}}/applications/{{appID}}/attributes")
	public String getReadAllAttributes() {
		return "ReadAllAttributes";
	}

	// PingOne-Applications : ApplicationAttributeMapping : ReadOneAttribute
	@GetMapping("/environments/{{envID}}/applications/{{appID}}/attributes/{{samlAttrID}}")
	public String getReadOneAttribute() {
		return "ReadOneAttribute";
	}

	// PingOne-Applications : ApplicationAttributeMapping : UpdateAttribute
	@PutMapping("/environments/{{envID}}/applications/{{appID}}/attributes/{{samlAttrID}}")
	public String putUpdateAttribute() {
		return "UpdateAttribute";
	}

	// PingOne-Applications : ApplicationAttributeMapping : DeleteAttribute
	@DeleteMapping("/environments/{{envID}}/applications/{{appID}}/attributes/{{samlAttrID}}")
	public String deleteDeleteAttribute() {
		return "DeleteAttribute";
	}

}
