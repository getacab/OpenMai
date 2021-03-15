package org.openmai.endpoint.auth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class OIDC {
	// PingOne-OpenID Connect/OAuth 2 : DiscoveryOpenidConfiguration
	@GetMapping("/{{envID}}/as/.well-known/openid-configuration")
	public String getDiscoveryOpenidConfiguration() {
		return "DiscoveryOpenidConfiguration";
	}

	// PingOne-OpenID Connect/OAuth 2 : AuthorizeAuthorizationCode
	@GetMapping("/{{envID}}/as/authorize?response_type=code&redirect_uri=http://localhost:8080/&scope=openid profile p1:read:user&client_id={{appID}}")
	public String getAuthorizeAuthorizationCode() {
		return "AuthorizeAuthorizationCode";
	}

	// PingOne-OpenID Connect/OAuth 2 : AuthorizeAuthorizationCode
	@PostMapping("/{{envID}}/as/authorize")
	public String postAuthorizeAuthorizationCode() {
		return "AuthorizeAuthorizationCode";
	}

	// PingOne-OpenID Connect/OAuth 2 : AuthorizeImplicit
	@GetMapping("/{{envID}}/as/authorize?response_type=token&client_id={{appID}}&redirect_uri=https://example.com&scope=openid profile p1:read:user&nonce=123")
	public String getAuthorizeImplicit() {
		return "AuthorizeImplicit";
	}

	// PingOne-OpenID Connect/OAuth 2 : AuthorizeImplicit
	@PostMapping("/{{envID}}/as/authorize")
	public String postAuthorizeImplicit() {
		return "AuthorizeImplicit";
	}

	// PingOne-OpenID Connect/OAuth 2 : AdminUserAuthorize
	@GetMapping("/{{envID}}/as/authorize?response_type=token&client_id=adminui&redirect_uri=https://console.pingone.com/index.html&scope=openid")
	public String getAdminUserAuthorize() {
		return "AdminUserAuthorize";
	}

	// PingOne-OpenID Connect/OAuth 2 : Resume
	@GetMapping("/{{envID}}/as/resume?flowId={{flowID}}")
	public String getResume() {
		return "Resume";
	}

	// PingOne-OpenID Connect/OAuth 2 : TokenAuthorizationCode
	@PostMapping("/{{envID}}/as/token")
	public String postTokenAuthorizationCode() {
		return "TokenAuthorizationCode";
	}

	// PingOne-OpenID Connect/OAuth 2 : TokenAdminAppClientCredentials
	@PostMapping("/{{envID}}/as/token")
	public String postTokenAdminAppClientCredentials() {
		return "TokenAdminAppClientCredentials";
	}

	// PingOne-OpenID Connect/OAuth 2 : TokenIntrospectionAccessToken
	@PostMapping("/{{envID}}/as/introspect")
	public String postTokenIntrospectionAccessToken() {
		return "TokenIntrospectionAccessToken";
	}

	// PingOne-OpenID Connect/OAuth 2 : TokenIntrospectionIdToken
	@PostMapping("/{{envID}}/as/introspect")
	public String postTokenIntrospectionIdToken() {
		return "TokenIntrospectionIdToken";
	}

	// PingOne-OpenID Connect/OAuth 2 : TokenIntrospectionRefreshToken
	@PostMapping("/{{envID}}/as/introspect")
	public String postTokenIntrospectionRefreshToken() {
		return "TokenIntrospectionRefreshToken";
	}

	// PingOne-OpenID Connect/OAuth 2 : TokenRevocation
	@PostMapping("/{{envID}}/as/revoke")
	public String postTokenRevocation() {
		return "TokenRevocation";
	}

	// PingOne-OpenID Connect/OAuth 2 : Userinfo
	@GetMapping("/{{envID}}/as/userinfo")
	public String getUserinfo() {
		return "Userinfo";
	}

	// PingOne-OpenID Connect/OAuth 2 : Userinfo
	@PostMapping("/{{envID}}/as/userinfo")
	public String postUserinfo() {
		return "Userinfo";
	}

	// PingOne-OpenID Connect/OAuth 2 : Signoff
	@GetMapping("/{{envID}}/as/signoff?id_token_hint={{idToken}}")
	public String getSignoff() {
		return "Signoff";
	}

	// PingOne-OpenID Connect/OAuth 2 : ReadJwks
	@GetMapping("/{{envID}}/as/jwks")
	public String getReadJwks() {
		return "ReadJwks";
	}

}
