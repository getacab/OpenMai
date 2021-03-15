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

public class NotificationsPhoneDeliverySettings {
	@Autowired
	@Qualifier("maiRequest")
	private MAIRequest maiRequest;

	// PingOne-Notifications : PhoneDeliverySettings : ReadAllPhoneDeliverySettings
	@GetMapping("/environments/{{envID}}/templates")
	public String getReadAllPhoneDeliverySettings() {
		return "ReadAllPhoneDeliverySettings";
	}

	// PingOne-Notifications : PhoneDeliverySettings : ReadOnePhoneDeliverySettings
	@GetMapping("/environments/{{envID}}/notificationsSettings/phoneDeliverySettings/{{phoneDeliverySettingsID}}")
	public String getReadOnePhoneDeliverySettings() {
		return "ReadOnePhoneDeliverySettings";
	}

	// PingOne-Notifications : PhoneDeliverySettings : CreatePhoneDeliverySettings
	@PostMapping("/environments/{{envID}}/templates/{{templateName}}/contents")
	public String postCreatePhoneDeliverySettings() {
		return "CreatePhoneDeliverySettings";
	}

	// PingOne-Notifications : PhoneDeliverySettings : UpdatePhoneDeliverySettings
	@PutMapping("/environments/{{envID}}/templates/{{templateName}}/contents/{{contentID}}")
	public String putUpdatePhoneDeliverySettings() {
		return "UpdatePhoneDeliverySettings";
	}

	// PingOne-Notifications : PhoneDeliverySettings : DeletePhoneDeliverySettings
	@DeleteMapping("/environments/{{envID}}/notificationsSettings/phoneDeliverySettings/{{phoneDeliverySettingsID}}")
	public String deleteDeletePhoneDeliverySettings() {
		return "DeletePhoneDeliverySettings";
	}

}
