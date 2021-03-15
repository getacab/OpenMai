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

public class UsersLinkedAccounts {

	@Autowired
	@Qualifier("maiRequest")
	private MAIRequest maiRequest;

	// PingOne-Users : LinkedAccounts : ReadLinkedAccounts
	@GetMapping("/environments/{{envID}}/users/{{userID}}/linkedAccounts")
	public String getReadLinkedAccounts() {
		return "ReadLinkedAccounts";
	}

	// PingOne-Users : LinkedAccounts : ReadOneLinkedAccount
	@GetMapping("/environments/{{envID}}/users/{{userID}}/linkedAccounts/{{linkedAccountID}}")
	public String getReadOneLinkedAccount() {
		return "ReadOneLinkedAccount";
	}

	// PingOne-Users : LinkedAccounts : DeleteLinkedAccount
	@DeleteMapping("/environments/{{envID}}/users/{{userID}}/linkedAccounts/{{linkedAccountID}}")
	public String deleteDeleteLinkedAccount() {
		return "DeleteLinkedAccount";
	}

}
