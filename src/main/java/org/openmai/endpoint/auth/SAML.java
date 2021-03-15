package org.openmai.endpoint.auth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SAML {
	// SAML 2.0 : ReadSamlMetadata
	@GetMapping("/{{envID}}/saml20/metadata/{{appID}}")
	public String getReadSamlMetadata() {
		return "ReadSamlMetadata";
	}

	// SAML 2.0 : SamlSsoUsingPost
	@PostMapping("/{{envID}}/saml20/idp/sso")
	public String postSamlSsoUsingPost() {
		return "SamlSsoUsingPost";
	}

	// SAML 2.0 : SamlSsoUsingGet
	@GetMapping("/{{envID}}/saml20/idp/sso?SAMLRequest={{SAMLRequest}}&RelayState=token")
	public String getSamlSsoUsingGet() {
		return "SamlSsoUsingGet";
	}

	// SAML 2.0 : SamlResume
	@GetMapping("/{{envID}}/saml20/resume?flowId={{flowID}}")
	public String getSamlResume() {
		return "SamlResume";
	}

	// SAML 2.0 : SamlSloUsingGet
	@GetMapping("/{{envID}}/saml20/idp/slo?SAMLRequest={{SAMLRequest}}&RelayState=testing...")
	public String getSamlSloUsingGet() {
		return "SamlSloUsingGet";
	}

	// SAML 2.0 : SamlSloUsingPost
	@PostMapping("/{{envID}}/saml20/idp/slo")
	public String postSamlSloUsingPost() {
		return "SamlSloUsingPost";
	}
}
