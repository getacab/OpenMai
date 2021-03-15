package org.openmai.endpoint.mgmt;

import org.openmai.beans.MAIRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UsersUsers {

	@Autowired
	@Qualifier("maiRequest")
	private MAIRequest maiRequest;

	// PingOne-Users : Users : CreateUser
	@PostMapping("/environments/{{envID}}/users")
	public String postCreateUser() {
		return "CreateUser";
	}

	// PingOne-Users : Users : CreateUserImport
	@PostMapping("/environments/{{envID}}/users")
	public String postCreateUserImport() {
		return "CreateUserImport";
	}

	// PingOne-Users : Users : ReadAllUsers
	@GetMapping("/environments/{{envID}}/users")
	public String getReadAllUsers() {
		return "ReadAllUsers";
	}

	// PingOne-Users : Users : ReadOneUser
	@GetMapping("/environments/{{envID}}/users/{{userID}}")
	public String getReadOneUser() {
		return "ReadOneUser";
	}

	// PingOne-Users : Users : UpdateUserPatch
	@PatchMapping("/environments/{{envID}}/users/{{userID}}")
	public String patchUpdateUserPatch() {
		return "UpdateUserPatch";
	}

	// PingOne-Users : Users : UpdateUserPut
	@PutMapping("/environments/{{envID}}/users/{{userID}}")
	public String putUpdateUserPut() {
		return "UpdateUserPut";
	}

	// PingOne-Users : Users : DeleteUser
	@DeleteMapping("/environments/{{envID}}/users/{{userID}}")
	public String deleteDeleteUser() {
		return "DeleteUser";
	}

}
