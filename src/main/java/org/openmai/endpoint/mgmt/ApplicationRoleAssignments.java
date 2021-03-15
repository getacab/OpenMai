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

public class ApplicationRoleAssignments {
	@Autowired
	@Qualifier("maiRequest")
	private MAIRequest maiRequest;

	// PingOne-Applications : ApplicationRoleAssignments :
	// ReadApplicationRoleAssignments
	@GetMapping("{{apiPath}}/environments/{{envID}}/applications/{{appID}}/roleAssignments")
	public String getReadApplicationRoleAssignments() {
		return "ReadApplicationRoleAssignments";
	}

	// PingOne-Applications : ApplicationRoleAssignments :
	// CreateApplicationRoleAssignments
	@PostMapping("{{apiPath}}/environments/{{envID}}/applications/{{appID}}/roleAssignments")
	public String postCreateApplicationRoleAssignments() {
		return "CreateApplicationRoleAssignments";
	}

	// PingOne-Applications : ApplicationRoleAssignments :
	// ReadOneApplicationRoleAssignment
	@GetMapping("{{apiPath}}/environments/{{envID}}/applications/{{appID}}/roleAssignments/{{roleAssignmentID}}")
	public String getReadOneApplicationRoleAssignment() {
		return "ReadOneApplicationRoleAssignment";
	}

	// PingOne-Applications : ApplicationRoleAssignments :
	// DeleteApplicationRoleAssignment
	@DeleteMapping("{{apiPath}}/environments/{{envID}}/applications/{{appID}}/roleAssignments/{{roleAssignmentID}}")
	public String deleteDeleteApplicationRoleAssignment() {
		return "DeleteApplicationRoleAssignment";
	}

}
