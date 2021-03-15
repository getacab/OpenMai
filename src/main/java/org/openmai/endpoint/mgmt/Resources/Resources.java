package org.openmai.endpoint.mgmt.Resources;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
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
public class Resources{

	// PingOne-Resources : Resources : CreateResource
	@PostMapping("/environments/{{envID}}/resources")
	public String postCreateResource() {
		return "CreateResource";
	}

	// PingOne-Resources : Resources : ReadAllResources
	@GetMapping("/environments/{{envID}}/resources")
	public String getReadAllResources() {
		return "ReadAllResources";
	}

	// PingOne-Resources : Resources : ReadOneResource
	@GetMapping("/environments/{{envID}}/resources/{{resourceID}}")
	public String getReadOneResource() {
		return "ReadOneResource";
	}

	// PingOne-Resources : Resources : UpdateResource
	@PutMapping("/environments/{{envID}}/resources/{{resourceID}}")
	public String putUpdateResource() {
		return "UpdateResource";
	}

	// PingOne-Resources : Resources : DeleteResource
	@DeleteMapping("/environments/{{envID}}/resources/{{resourceID}}")
	public String deleteDeleteResource() {
		return "DeleteResource";
	}


}