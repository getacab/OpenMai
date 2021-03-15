package org.openmai.endpoint.mgmt.User;

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
public class UserRoleAssignment{
	@Autowired
	@Qualifier("maiRequest")
	private MAIRequest maiRequest;

	// PingOne-Users : UserRoleAssignments : ReadUser'SRoleAssignmentsAll
	@GetMapping("/environments/{{envID}}/users/{{userID}}/roleAssignments")
	public String getReadUserRoleAssignmentsAll() {
		return "ReadUsersRoleAssignmentsAll";
	}

	// PingOne-Users : UserRoleAssignments : CreateUserRoleForPop
	//??@PostMapping("/environments/{{envID}}/users/{{userID}}/roleAssignments")
	public String postCreateUserRoleForPop() {
		return "CreateUserRoleForPop";
	}

	// PingOne-Users : UserRoleAssignments : CreateUserRoleForEnv
	@PostMapping("/environments/{{envID}}/users/{{userID}}/roleAssignments")
	public String postCreateUserRoleForEnv() {
		return "CreateUserRoleForEnv";
	}

	// PingOne-Users : UserRoleAssignments : CreateUserRoleForOrg
	//??@PostMapping("/environments/{{envID}}/users/{{userID}}/roleAssignments")
	public String postCreateUserRoleForOrg() {
		return "CreateUserRoleForOrg";
	}

	// PingOne-Users : UserRoleAssignments : ReadUser'SRoleAssignmentOne
	@GetMapping("/environments/{{envID}}/users/{{userID}}/roleAssignments/{{roleAssignmentID}}")
	public String getReadUsersRoleAssignmentOne() {
		return "ReadUsersRoleAssignmentOne";
	}

	// PingOne-Users : UserRoleAssignments : DeleteUser'SRoleAssignment
	@DeleteMapping("/environments/{{envID}}/users/{{userID}}/roleAssignments/{{roleAssignmentID}}")
	public String deleteDeleteUsersRoleAssignment() {
		return "DeleteUsersRoleAssignment";
	}
   
}