package org.openmai.endpoint.mgmt.Resources;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.json.JSONObject;
import org.openmai.interceptors.RequestHandler;
import org.openmai.beans.MAIRequest;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourcesAttributes{
	@Autowired
	@Qualifier("maiRequest")
	private MAIRequest maiRequest;

	// PingOne-Resources : ResourceAttributes : CreateResourceAttribute
	@PostMapping("/environments/{{envID}}/resources/{{resourceID}}/attributes")
	public String postCreateResourceAttribute() {
		return "CreateResourceAttribute";
	}

	// PingOne-Resources : ResourceAttributes : ReadAllResourceAttributes
	@GetMapping("/environments/{{envID}}/resources/{{resourceID}}/attributes")
	public String getReadAllResourceAttributes() {
		return "ReadAllResourceAttributes";
	}

	// PingOne-Resources : ResourceAttributes : ReadOneResourceAttribute
	@GetMapping("/environments/{{envID}}/resources/{{resourceID}}/attributes/{{resourceAttrID}}")
	public String getReadOneResourceAttribute() {
		return "ReadOneResourceAttribute";
	}

	// PingOne-Resources : ResourceAttributes : UpdateResourceAttribute
	@PutMapping("/environments/{{envID}}/resources/{{resourceID}}/attributes/{{resourceAttrID}}")
	public String putUpdateResourceAttribute() {
		return "UpdateResourceAttribute";
	}

	// PingOne-Resources : ResourceAttributes : DeleteResourceAttribute
	@DeleteMapping("/environments/{{envID}}/resources/{{resourceID}}/attributes/{{resourceAttrID}}")
	public String deleteDeleteResourceAttribute() {
		return "DeleteResourceAttribute";
	}


}