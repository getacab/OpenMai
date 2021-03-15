package org.openmai.endpoint.mgmt;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

public class ApplicationResourceGrants {
	// PingOne-Applications : ApplicationResourceGrants : CreateGrant
	@PostMapping("{{apiPath}}/environments/{{envID}}/applications/{{appID}}/grants")
	public String postCreateGrant() {
		return "CreateGrant";
	}

	// PingOne-Applications : ApplicationResourceGrants : CreateOidcGrant
	@PostMapping("{{apiPath}}/environments/{{envID}}/applications/{{appID}}/grants")
	public String postCreateOidcGrant() {
		return "CreateOidcGrant";
	}

	// PingOne-Applications : ApplicationResourceGrants : CreatePlatformGrant
	@PostMapping("{{apiPath}}/environments/{{envID}}/applications/{{appID}}/grants")
	public String postCreatePlatformGrant() {
		return "CreatePlatformGrant";
	}

	// PingOne-Applications : ApplicationResourceGrants :
	// ReadAllGrantsForAnApplication
	@GetMapping("{{apiPath}}/environments/{{envID}}/applications/{{appID}}/grants")
	public String getReadAllGrantsForAnApplication() {
		return "ReadAllGrantsForAnApplication";
	}

	// PingOne-Applications : ApplicationResourceGrants :
	// ReadOneGrantForAnApplication
	@GetMapping("{{apiPath}}/environments/{{envID}}/applications/{{appID}}/grants/{{grantID}}")
	public String getReadOneGrantForAnApplication() {
		return "ReadOneGrantForAnApplication";
	}

	// PingOne-Applications : ApplicationResourceGrants : UpdateGrant
	@PutMapping("{{apiPath}}/environments/{{envID}}/applications/{{appID}}/grants/{{grantID}}")
	public String putUpdateGrant() {
		return "UpdateGrant";
	}

	// PingOne-Applications : ApplicationResourceGrants : DeleteGrant
	@DeleteMapping("{{apiPath}}/environments/{{envID}}/applications/{{appID}}/grants/{{grantID}}")
	public String deleteDeleteGrant() {
		return "DeleteGrant";
	}

}
