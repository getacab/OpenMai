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
public class Settings{
    @Autowired
	MAIRequest maiRequest;

    //  Get...
    @GetMapping("/environments/{envID}/notificationsSettings")
	public String readNotificationSettings() {
		return "readNotificationSettings";
	}

    //  Put & Delete
    @PutMapping("/environments/{envID}/notificationsSettings")
	String updateNotificationSettings() {
		return "updateNotificationSettings";
	}

    @DeleteMapping("/environments/{envID}/notificationsSettings")
	String deleteNotificationSettings() {
		return "deleteNotificationSettings";
	}

}