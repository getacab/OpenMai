package org.openmai.endpoint.mgmt.Notifications;

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
public class EmailAddress{
    @Autowired
	MAIRequest maiRequest;

    //  Get...
    @GetMapping("/environments/{envID}/emailDomains/{emailDomainId}/trustedEmails")
	public String readAllEmailAddress() {
		return "readAllEmailAddress";
	}
    @GetMapping("/environments/{envID}/emailDomains/{emailDomainId}/trustedEmails/{trustedEmailId}")
	public String readOneEmailAddress() {
		return "readOneEmailAddress";
	}

    //  Post..
    @PostMapping("/environments/{envID}/emailDomains/{emailDomainId}/trustedEmails")
	String createTrustedMail() {
		return "createTrustedMail";
	}
    @PostMapping("/activateVerificationMail/environments/{envID}/emailDomains/{emailDomainId}/trustedEmails/{trustedEmailId}")
	String activateTrustedMail() {
		return "activateTrustedMail";
	}
    @PostMapping("/resendVerificationMail/environments/{envID}/emailDomains/{emailDomainId}/trustedEmails/{trustedEmailId}")
	String resendVerificationMail() {
		return "resendVerificationMail";
	}

    //  Delete
    @DeleteMapping("/environments/{envID}/emailDomains/{emailDomainId}/trustedEmails/{trustedEmailId}")
	String deleteEmailAddress() {
		return "deleteEmailAddress";
	}

}