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
public class UserPassword{
    @Autowired
	MAIRequest maiRequest;

    //  Get...
    @GetMapping("/environments/{envID}/users/{userID}/password")
	public String readPasswordState(@PathVariable String envID) {
		return "readPasswordState";
	}

    //  POst...    
    @PostMapping("/passwordChecknUnlock/environments/{envID}/users/{userID}/password")
	String passwordChecknUnlock() {
		return "passwordChecknUnlock";
	}

    @PostMapping("/passwordRecover/environments/{envID}/users/{userID}/password")
	String passwordRecover() {
		return "passwordRecover";
	}

    @PostMapping("/passwordLockedOut/environments/{envID}/users/{userID}/password")
	String passwordLockedOut() {
		return "passwordLockedOut";
	}

    //  Put...
    @PutMapping("/updatePasswordSelfnAdmin/environments/{envID}/users/{userID}/password")
	String updatePasswordSelfnAdmin() {
		return "updatePasswordSelfnAdmin";
	}

    @PutMapping("/updatePasswordSet/environments/{envID}/users/{userID}/password")
	String updatePasswordSet() {
		return "updatePasswordSet";
	}
    
}