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

public class UsersEnableUsersMfa {

	@Autowired
	@Qualifier("maiRequest")
	private MAIRequest maiRequest;

	// PingOne-Users : EnableUsersMfa : ReadUserMfaEnabled
	@GetMapping("/environments/{{envID}}/users/{{userID}}/mfaEnabled")
	public String getReadUserMfaEnabled() {
		return "ReadUserMfaEnabled";
	}

	// PingOne-Users : EnableUsersMfa : UpdateUserMfaEnabled
	@PutMapping("/environments/{{envID}}/users/{{userID}}/mfaEnabled")
	public String putUpdateUserMfaEnabled() {
		return "UpdateUserMfaEnabled";
	}

}
