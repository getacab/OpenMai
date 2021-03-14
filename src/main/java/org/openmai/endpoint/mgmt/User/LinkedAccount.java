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
public class LinkedAccount{
    @Autowired
	MAIRequest maiRequest;

    @GetMapping("/environments/{envID}/users/{userID}/linkedAccounts")
	public String readLinkedAccount(@PathVariable String envID) {
		return "readLinkedAccount";
	}

    @GetMapping("/environments/{envID}/users/{userID}/linkedAccounts/{linkedAccountID}")
	public String readOneLinkedAccount(@PathVariable String envID, @PathVariable String flowID) {
		return "readOneLinkedAccount";
	}

    @DeleteMapping("/environments/{envID}/users/{userID}/linkedAccounts/{linkedAccountID}")
	String deleteLinkedAccount() {
		return "deleteLinkedAccount";
	}
    
    
}