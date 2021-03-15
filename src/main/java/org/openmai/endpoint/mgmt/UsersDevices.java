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

public class UsersDevices {
	@Autowired
	@Qualifier("maiRequest")
	private MAIRequest maiRequest;

	// PingOne-Users : Devices : CreateUserDeviceEmail
	@PostMapping("/environments/{{envID}}/users/{{userID}}/devices")
	public String postCreateUserDeviceEmail() {
		return "CreateUserDeviceEmail";
	}

	// PingOne-Users : Devices : CreateUserDeviceSms
	@PostMapping("/environments/{{envID}}/users/{{userID}}/devices")
	public String postCreateUserDeviceSms() {
		return "CreateUserDeviceSms";
	}

	// PingOne-Users : Devices : ReadAllUserDevices
	@GetMapping("/environments/{{envID}}/users/{{userID}}/devices")
	public String getReadAllUserDevices() {
		return "ReadAllUserDevices";
	}

	// PingOne-Users : Devices : ReadOneUserDevice
	@GetMapping("/environments/{{envID}}/users/{{userID}}/devices/{{deviceID}}")
	public String getReadOneUserDevice() {
		return "ReadOneUserDevice";
	}

	// PingOne-Users : Devices : ActivateUserDevice
	@PostMapping("/environments/{{envID}}/users/{{userID}}/devices/{{deviceID}}")
	public String postActivateUserDevice() {
		return "ActivateUserDevice";
	}

	// PingOne-Users : Devices : DeleteUserDevice
	@DeleteMapping("/environments/{{envID}}/users/{{userID}}/devices/{{deviceID}}")
	public String deleteDeleteUserDevice() {
		return "DeleteUserDevice";
	}

}
