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

public class NotificationsTrustedEmailDomains {

	@Autowired
	@Qualifier("maiRequest")
	private MAIRequest maiRequest;

	// PingOne-Notifications : TrustedEmailDomains : CreateEmailDomain
	@PostMapping("/environments/{{envID}}/emailDomains")
	public String postCreateEmailDomain() {
		return "CreateEmailDomain";
	}

	// PingOne-Notifications : TrustedEmailDomains : ReadEmailDomain
	@GetMapping("/environments/{{envID}}/emailDomains/{{emailDomainID}}")
	public String getReadEmailDomain() {
		return "ReadEmailDomain";
	}

	// PingOne-Notifications : TrustedEmailDomains : ReadAllEmailDomains
	@GetMapping("/environments/{{envID}}/emailDomains")
	public String getReadAllEmailDomains() {
		return "ReadAllEmailDomains";
	}

	// PingOne-Notifications : TrustedEmailDomains : DeleteEmailDomain
	@DeleteMapping("/environments/{{envID}}/emailDomains/{{emailDomainID}}")
	public String deleteDeleteEmailDomain() {
		return "DeleteEmailDomain";
	}

	// PingOne-Notifications : TrustedEmailDomains : ReadEmailDomainOwnershipTokens
	@GetMapping("/environments/{{envID}}/emailDomains/{{emailDomainID}}/ownership")
	public String getReadEmailDomainOwnershipTokens() {
		return "ReadEmailDomainOwnershipTokens";
	}

	// PingOne-Notifications : TrustedEmailDomains : ReadEmailDomainDkimTokens
	@GetMapping("/environments/{{envID}}/emailDomains/{{emailDomainID}}/dkim")
	public String getReadEmailDomainDkimTokens() {
		return "ReadEmailDomainDkimTokens";
	}

	// PingOne-Notifications : TrustedEmailDomains : ReadEmailDomainSpfTokens
	@GetMapping("/environments/{{envID}}/emailDomains/{{emailDomainID}}/spf")
	public String getReadEmailDomainSpfTokens() {
		return "ReadEmailDomainSpfTokens";
	}

	// PingOne-Notifications : TrustedEmailDomains : ReadAllEmailDomainTrustedEmails
	@GetMapping("/environments/{{envID}}/emailDomains/{{emailDomainID}}/trustedEmails")
	public String getReadAllEmailDomainTrustedEmails() {
		return "ReadAllEmailDomainTrustedEmails";
	}

	// PingOne-Notifications : TrustedEmailDomains : CreateEmailDomainTrustedEmail
	@PostMapping("/environments/{{envID}}/emailDomains/{{emailDomainID}}/trustedEmails")
	public String postCreateEmailDomainTrustedEmail() {
		return "CreateEmailDomainTrustedEmail";
	}

	// PingOne-Notifications : TrustedEmailDomains : ActivateTrustedEmail
	@PostMapping("/environments/{{envID}}/emailDomains/{{emailDomainID}}/trustedEmails/{{trustedEmailID}}")
	public String postActivateTrustedEmail() {
		return "ActivateTrustedEmail";
	}

	// PingOne-Notifications : TrustedEmailDomains :
	// ResendVerificationCodeForTrustedEmail
	@PostMapping("/environments/{{envID}}/emailDomains/{{emailDomainID}}/trustedEmails/{{trustedEmailID}}")
	public String postResendVerificationCodeForTrustedEmail() {
		return "ResendVerificationCodeForTrustedEmail";
	}

	// PingOne-Notifications : TrustedEmailDomains : ReadEmailDomainTrustedEmail
	@GetMapping("/environments/{{envID}}/emailDomains/{{emailDomainID}}/trustedEmails/{{trustedEmailID}}")
	public String getReadEmailDomainTrustedEmail() {
		return "ReadEmailDomainTrustedEmail";
	}

	// PingOne-Notifications : TrustedEmailDomains : DeleteEmailDomainTrustedEmail
	@DeleteMapping("/environments/{{envID}}/emailDomains/{{emailDomainID}}/trustedEmails/{{trustedEmailID}}")
	public String deleteDeleteEmailDomainTrustedEmail() {
		return "DeleteEmailDomainTrustedEmail";
	}

	// PingOne-Notifications : TrustedEmailDomains :
	// ReadNotificationsSettingsWithTrustedEmail
	@GetMapping("/environments/{{envID}}/notificationsSettings")
	public String getReadNotificationsSettingsWithTrustedEmail() {
		return "ReadNotificationsSettingsWithTrustedEmail";
	}

	// PingOne-Notifications : TrustedEmailDomains :
	// UpdateNotificationsSettingsWithTrustedEmail
	@PutMapping("/environments/{{envID}}/notificationsSettings")
	public String putUpdateNotificationsSettingsWithTrustedEmail() {
		return "UpdateNotificationsSettingsWithTrustedEmail";
	}

}
