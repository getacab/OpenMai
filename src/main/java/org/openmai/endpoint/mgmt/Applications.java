package org.openmai.endpoint.mgmt;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Applications {
	// PingOne-Applications : Applications : ReadAllApplications
	@GetMapping("{{apiPath}}/environments/{{envID}}/applications")
	public String getReadAllApplications() {
		return "ReadAllApplications";
	}

	// PingOne-Applications : Applications : ReadOneApplication
	@GetMapping("{{apiPath}}/environments/{{envID}}/applications/{{appID}}")
	public String getReadOneApplication() {
		return "ReadOneApplication";
	}

	// PingOne-Applications : Applications : CreateApplication
	@PostMapping("{{apiPath}}/environments/{{envID}}/applications")
	public String postCreateApplication() {
		return "CreateApplication";
	}

	// PingOne-Applications : Applications : DeleteApplication
	@DeleteMapping("{{apiPath}}/environments/{{envID}}/applications/{{appID}}")
	public String deleteDeleteApplication() {
		return "DeleteApplication";
	}

	// PingOne-Applications : Applications : CreateApplicationOidc
	//??@PostMapping("{{apiPath}}/environments/{{envID}}/applications")
	public String postCreateApplicationOidc() {
		return "CreateApplicationOidc";
	}

	// PingOne-Applications : Applications : CreateApplicationSaml
	//??@PostMapping("{{apiPath}}/environments/{{envID}}/applications")
	public String postCreateApplicationSaml() {
		return "CreateApplicationSaml";
	}

	// PingOne-Applications : Applications : UpdateApplicationOidc
	@PutMapping("{{apiPath}}/environments/{{envID}}/applications/{{appID}}")
	public String putUpdateApplicationOidc() {
		return "UpdateApplicationOidc";
	}

	// PingOne-Applications : Applications : UpdateApplicationSaml
	@PutMapping("{{apiPath}}/environments/{{envID}}/applications/{{samlAppID}}")
	public String putUpdateApplicationSaml() {
		return "UpdateApplicationSaml";
	}

	// PingOne-Applications : Applications : CreateApplicationSaml-MetadataImport
	@PostMapping("/{{envID}}/applications")
	public String postCreateApplicationSamlMetadataImport() {
		return "CreateApplicationSaml-MetadataImport";
	}

	// PingOne-Applications : Applications : CreateApplicationSaml-UrlImport
	//??@PostMapping("/{{envID}}/applications")
	public String postCreateApplicationSamlUrlImport() {
		return "CreateApplicationSaml-UrlImport";
	}

}
