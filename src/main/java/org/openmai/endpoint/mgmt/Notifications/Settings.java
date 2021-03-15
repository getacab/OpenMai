package org.openmai.endpoint.mgmt.Notifications; 

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
public class Settings{

	@Autowired
	@Qualifier("maiRequest")
	private MAIRequest maiRequest;

	// ------------------PingOne-NotificationsNotificationssettings
	// PingOne-Notifications : Notificationssettings : ReadNotificationsSettings
	@GetMapping("/environments/{{envID}}/notificationsSettings")
	public String getReadNotificationsSettings() {
		return "ReadNotificationsSettings";
	}

	// PingOne-Notifications : Notificationssettings : UpdateNotificationsSettings
	@PutMapping("/environments/{{envID}}/notificationsSettings")
	public String putUpdateNotificationsSettings() {
		return "UpdateNotificationsSettings";
	}

	// PingOne-Notifications : Notificationssettings : DeleteNotificationsSettings
	@DeleteMapping("/environments/{{envID}}/notificationsSettings")
	public String deleteDeleteNotificationsSettings() {
		return "DeleteNotificationsSettings";
	}


}