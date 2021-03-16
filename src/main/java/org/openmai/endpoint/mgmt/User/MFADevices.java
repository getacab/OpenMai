package org.openmai.endpoint.mgmt.User;

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
public class MFADevices{
    @Autowired
	MAIRequest maiRequest;

    @GetMapping("/environments/{envID}/users/{userID}/devices")
	public String readAllMFAUser(@PathVariable String envID, @PathVariable String flowID) {
		return "Read All MFA User";
	}

    @GetMapping("/environments/{envID}/users/{userID}/devices/{deviceID}")
	public String readOneMFAUser(@PathVariable String envID, @PathVariable String flowID , @PathVariable String userID) {
		return "Read One MFA User";
	}

    @PostMapping("/environments/{envID}/users/{userID}/devices")
	String createMFAUserDevices() {
		return "create MFA User Devices";
	}

    @PostMapping("/environments/{envID}/users/{userID}/devices/{deviceID}")
	String activateMFAUserDevices() {
		return "activate MFA User Devices";
	}

    @PutMapping("/environments/{envID}/users/{userID}/devices/{deviceID}")
	String sendMFADeviceLogs() {
		return "sendMFADeviceLogs";
	}

    @DeleteMapping("/environments/{envID}/users/{userID}/devices/{deviceID}/logs")
	String deleteMFAUserDevice() {
		return "deleteMFAUserDevice";
	}


    
    
}