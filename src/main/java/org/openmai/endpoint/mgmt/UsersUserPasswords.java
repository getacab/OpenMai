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

public class UsersUserPasswords {

	@Autowired
	@Qualifier("maiRequest")
	private MAIRequest maiRequest;

	// PingOne-Users : UserPasswords : ReadPasswordState
	@GetMapping("/environments/{{envID}}/users/{{userID}}/password")
	public String getReadPasswordState() {
		return "ReadPasswordState";
	}

	// PingOne-Users : UserPasswords : PasswordCheck
	@PostMapping("/environments/{{envID}}/users/{{userID}}/password")
	public String postPasswordCheck() {
		return "PasswordCheck";
	}

	// PingOne-Users : UserPasswords : PasswordUnlock
	@PostMapping("/environments/{{envID}}/users/{{userID}}/password")
	public String postPasswordUnlock() {
		return "PasswordUnlock";
	}

	// PingOne-Users : UserPasswords : UpdatePasswordSelf
	@PutMapping("/environments/{{envID}}/users/{{userID}}/password")
	public String putUpdatePasswordSelf() {
		return "UpdatePasswordSelf";
	}

	// PingOne-Users : UserPasswords : UpdatePasswordAdmin
	@PutMapping("/environments/{{envID}}/users/{{userID}}/password")
	public String putUpdatePasswordAdmin() {
		return "UpdatePasswordAdmin";
	}

	// PingOne-Users : UserPasswords : UpdatePasswordSet
	@PutMapping("/environments/{{envID}}/users/{{userID}}/password")
	public String putUpdatePasswordSet() {
		return "UpdatePasswordSet";
	}

}
