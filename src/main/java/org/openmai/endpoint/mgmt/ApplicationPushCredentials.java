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

public class ApplicationPushCredentials {
	@Autowired
	@Qualifier("maiRequest")
	private MAIRequest maiRequest;

	// PingOne-Applications : ApplicationPushCredentials : ReadAllCredentials
	@GetMapping("/environments/{{envID}}/applications/{{appID}}/pushCredentials")
	public String getReadAllCredentials() {
		return "ReadAllCredentials";
	}

	// PingOne-Applications : ApplicationPushCredentials : ReadOneCredential
	@GetMapping("/environments/{{envID}}/applications/{{appID}}/pushCredentials/{{pushCredID}}")
	public String getReadOneCredential() {
		return "ReadOneCredential";
	}

	// PingOne-Applications : ApplicationPushCredentials : DeleteCredential
	@DeleteMapping("/environments/{{envID}}/applications/{{appID}}/pushCredentials/{{pushCredID}}")
	public String deleteDeleteCredential() {
		return "DeleteCredential";
	}

	// PingOne-Applications : ApplicationPushCredentials : CreatePushCredentialApns
	@PostMapping("/environments/{{envID}}/applications/{{appID}}/pushCredentials")
	public String postCreatePushCredentialApns() {
		return "CreatePushCredentialApns";
	}

	// PingOne-Applications : ApplicationPushCredentials : CreatePushCredentialFcm
	//??@PostMapping("/environments/{{envID}}/applications/{{appID}}/pushCredentials")
	public String postCreatePushCredentialFcm() {
		return "CreatePushCredentialFcm";
	}

	// PingOne-Applications : ApplicationPushCredentials : UpdatePushCredential
	@PutMapping("/environments/{{envID}}/applications/{{appID}}/pushCredentials/{{pushCredID}}")
	public String putUpdatePushCredential() {
		return "UpdatePushCredential";
	}

}
