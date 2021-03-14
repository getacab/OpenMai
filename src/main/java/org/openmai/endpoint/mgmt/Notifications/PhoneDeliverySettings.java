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
public class PhoneDeliverySettings{
    @Autowired
	MAIRequest maiRequest;

    //  Get...
    @GetMapping("/environments/{envID}/notificationsSettings/phoneDeliverySettings")
	public String readAllPhoneDeliverySettings() {
		return "readAllPhoneDeliverySettings";
	}
    @GetMapping("/environments/{envID}/notificationsSettings/phoneDeliverySettings/{phoneDeliverySettingsId}")
	public String readOnePhoneDeliverySettings() {
		return "readOnePhoneDeliverySettings";
	}

    //  Post..
    @PostMapping("/environments/{envID}/notificationsSettings/phoneDeliverySettings")
	String createPhoneDeliverySettings() {
		return "createPhoneDeliverySettings";
	}

    //  Put & Delete
    @PutMapping("/environments/{envID}/notificationsSettings/phoneDeliverySettings/{phoneDeliverySettingsId}")
	String updatePhoneDeliverySettings() {
		return "updatePhoneDeliverySettings";
	}

    @DeleteMapping("/environments/{envID}/notificationsSettings/phoneDeliverySettings")
	String deletePhoneDeliverySettings() {
		return "deletePhoneDeliverySettings";
	}

}