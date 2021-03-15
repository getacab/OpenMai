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

public class IdentityProviderManagement {
	@Autowired
	@Qualifier("maiRequest")
	private MAIRequest maiRequest;

	// PingOne-Identity Provider Management : IdentityProviders :
	// CreateIdentityProviderSaml
	@PostMapping("/environments/{{envID}}/identityProviders")
	public String postCreateIdentityProviderSaml() {
		return "CreateIdentityProviderSaml";
	}

	// PingOne-Identity Provider Management : IdentityProviders :
	// CreateIdentityProviderLinkedin
	@PostMapping("/environments/{{envID}}/identityProviders")
	public String postCreateIdentityProviderLinkedin() {
		return "CreateIdentityProviderLinkedin";
	}

	// PingOne-Identity Provider Management : IdentityProviders :
	// CreateIdentityProviderGoogle
	@PostMapping("/environments/{{envID}}/identityProviders")
	public String postCreateIdentityProviderGoogle() {
		return "CreateIdentityProviderGoogle";
	}

	// PingOne-Identity Provider Management : IdentityProviders :
	// CreateIdentityProviderApple
	@PostMapping("/environments/{{envID}}/identityProviders")
	public String postCreateIdentityProviderApple() {
		return "CreateIdentityProviderApple";
	}

	// PingOne-Identity Provider Management : IdentityProviders :
	// CreateIdentityProviderAmazon
	@PostMapping("/environments/{{envID}}/identityProviders")
	public String postCreateIdentityProviderAmazon() {
		return "CreateIdentityProviderAmazon";
	}

	// PingOne-Identity Provider Management : IdentityProviders :
	// CreateIdentityProviderTwitter
	@PostMapping("/environments/{{envID}}/identityProviders")
	public String postCreateIdentityProviderTwitter() {
		return "CreateIdentityProviderTwitter";
	}

	// PingOne-Identity Provider Management : IdentityProviders :
	// CreateIdentityProviderPaypal
	@PostMapping("/environments/{{envID}}/identityProviders")
	public String postCreateIdentityProviderPaypal() {
		return "CreateIdentityProviderPaypal";
	}

	// PingOne-Identity Provider Management : IdentityProviders :
	// CreateIdentityProviderGithub
	@PostMapping("/environments/{{envID}}/identityProviders")
	public String postCreateIdentityProviderGithub() {
		return "CreateIdentityProviderGithub";
	}

	// PingOne-Identity Provider Management : IdentityProviders :
	// CreateIdentityProviderMicrosoft
	@PostMapping("/environments/{{envID}}/identityProviders")
	public String postCreateIdentityProviderMicrosoft() {
		return "CreateIdentityProviderMicrosoft";
	}

	// PingOne-Identity Provider Management : IdentityProviders :
	// CreateIdentityProviderYahoo
	@PostMapping("/environments/{{envID}}/identityProviders")
	public String postCreateIdentityProviderYahoo() {
		return "CreateIdentityProviderYahoo";
	}

	// PingOne-Identity Provider Management : IdentityProviders :
	// ReadAllIdentityProviders
	@GetMapping("/environments/{{envID}}/identityProviders")
	public String getReadAllIdentityProviders() {
		return "ReadAllIdentityProviders";
	}

	// PingOne-Identity Provider Management : IdentityProviders :
	// ReadOneIdentityProvider
	@GetMapping("/environments/{{envID}}/identityProviders/{{idpID}}")
	public String getReadOneIdentityProvider() {
		return "ReadOneIdentityProvider";
	}

	// PingOne-Identity Provider Management : IdentityProviders :
	// UpdateIdentityProviderFacebook
	@PutMapping("/environments/{{envID}}/identityProviders")
	public String putUpdateIdentityProviderFacebook() {
		return "UpdateIdentityProviderFacebook";
	}

	// PingOne-Identity Provider Management : IdentityProviders :
	// UpdateIdentityProviderLinkedin
	@PutMapping("/environments/{{envID}}/identityProviders")
	public String putUpdateIdentityProviderLinkedin() {
		return "UpdateIdentityProviderLinkedin";
	}

	// PingOne-Identity Provider Management : IdentityProviders :
	// UpdateIdentityProviderSaml
	@PutMapping("/environments/{{envID}}/identityProviders")
	public String putUpdateIdentityProviderSaml() {
		return "UpdateIdentityProviderSaml";
	}

	// PingOne-Identity Provider Management : IdentityProviders :
	// UpdateIdentityProviderTwitter
	@PutMapping("/environments/{{envID}}/identityProviders")
	public String putUpdateIdentityProviderTwitter() {
		return "UpdateIdentityProviderTwitter";
	}

	// PingOne-Identity Provider Management : IdentityProviders :
	// UpdateIdentityProviderAmazon
	@PutMapping("/environments/{{envID}}/identityProviders")
	public String putUpdateIdentityProviderAmazon() {
		return "UpdateIdentityProviderAmazon";
	}

	// PingOne-Identity Provider Management : IdentityProviders :
	// UpdateIdentityProviderPaypal
	@PutMapping("/environments/{{envID}}/identityProviders")
	public String putUpdateIdentityProviderPaypal() {
		return "UpdateIdentityProviderPaypal";
	}

	// PingOne-Identity Provider Management : IdentityProviders :
	// UpdateIdentityProviderGithub
	@PutMapping("/environments/{{envID}}/identityProviders")
	public String putUpdateIdentityProviderGithub() {
		return "UpdateIdentityProviderGithub";
	}

	// PingOne-Identity Provider Management : IdentityProviders :
	// UpdateIdentityProviderMicrosoft
	@PutMapping("/environments/{{envID}}/identityProviders")
	public String putUpdateIdentityProviderMicrosoft() {
		return "UpdateIdentityProviderMicrosoft";
	}

	// PingOne-Identity Provider Management : IdentityProviders :
	// UpdateIdentityProviderYahoo
	@PutMapping("/environments/{{envID}}/identityProviders")
	public String putUpdateIdentityProviderYahoo() {
		return "UpdateIdentityProviderYahoo";
	}

	// PingOne-Identity Provider Management : IdentityProviders :
	// UpdateIdentityProviderApple
	@PutMapping("/environments/{{envID}}/identityProviders")
	public String putUpdateIdentityProviderApple() {
		return "UpdateIdentityProviderApple";
	}

	// PingOne-Identity Provider Management : IdentityProviders :
	// DeleteIdentityProvider
	@DeleteMapping("/environments/{{envID}}/identityProviders/{{idpID}}")
	public String deleteDeleteIdentityProvider() {
		return "DeleteIdentityProvider";
	}

	// PingOne-Identity Provider Management : IdentityProviderAttributes :
	// CreateIdentityProviderAttribute
	@PostMapping("/environments/{{envID}}/identityProviders/{{idpID}}/attributes")
	public String postCreateIdentityProviderAttribute() {
		return "CreateIdentityProviderAttribute";
	}

	// PingOne-Identity Provider Management : IdentityProviderAttributes :
	// ReadAllIdentityProviderAttributes
	@GetMapping("/environments/{{envID}}/identityProviders/{{idpID}}/attributes")
	public String getReadAllIdentityProviderAttributes() {
		return "ReadAllIdentityProviderAttributes";
	}

	// PingOne-Identity Provider Management : IdentityProviderAttributes :
	// ReadOneIdentityProviderAttribute
	@GetMapping("/environments/{{envID}}/identityProviders/{{idpID}}/attributes/{{idpAttrID}}")
	public String getReadOneIdentityProviderAttribute() {
		return "ReadOneIdentityProviderAttribute";
	}

	// PingOne-Identity Provider Management : IdentityProviderAttributes :
	// UpdateIdentityProviderAttribute
	@PutMapping("/environments/{{envID}}/identityProviders/{{idpID}}/attributes/{{idpAttrID}}")
	public String putUpdateIdentityProviderAttribute() {
		return "UpdateIdentityProviderAttribute";
	}

	// PingOne-Identity Provider Management : IdentityProviderAttributes :
	// DeleteIdentityProviderAttribute
	@DeleteMapping("1/environments/{{envID}}/identityProviders/{{idpID}}/attributes/{{idpAttrID}}")
	public String deleteDeleteIdentityProviderAttribute() {
		return "DeleteIdentityProviderAttribute";
	}

}
