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
public class EmailDomains{
    @Autowired
	MAIRequest maiRequest;

    //  Get...
    @GetMapping("/environments/{envID}/emailDomains")
	public String readAllEmailDomains() {
		return "readAllPhoneDeliverySettings";
	}
    @GetMapping("/environments/{envID}/emailDomains/{emailDomainId}")
	public String readOneEmailDomains() {
		return "readOnePhoneDeliverySettings";
	}

    @GetMapping("/environments/{envID}/emailDomains/{emailDomainId}/ownership")
	public String readOwnershipStatus() {
		return "readOwnershipStatus";
	}
    @GetMapping("/environments/{envID}/emailDomains/{emailDomainId}/dkim")
	public String readDkimStatus() {
		return "readDkimStatus";
	}

    @GetMapping("/environments/{envID}/emailDomains/{emailDomainId}/spf")
	public String readSpfStatus() {
		return "readSpfStatus";
	}

    //  Post..
    @PostMapping("/environments/{envID}/emailDomains")
	String createEmailDomains() {
		return "createPhoneDeliverySettings";
	}

    //  Delete
    @DeleteMapping("/environments/{envID}/emailDomains/{emailDomainId}")
	String deleteEmailDomains() {
		return "deletePhoneDeliverySettings";
	}

}