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
public class UserRoleAssignment{
    @Autowired
	MAIRequest maiRequest;

    //  Get...
    @GetMapping("/environments/{envID}/users/{userID}/roleAssignments")
	public String readRoleAssignment() {
		return "readOneRoleAssignment";
	}

    @GetMapping("/environments/{envID}/users/{userID}/roleAssignments/{roleAssignmentID}")
	public String readOneRoleAssignment() {
		return "readOneRoleAssignment";
	}
    
    
    //  Post...
    @PostMapping("/ping/environments/{envID}/users/{userID}/roleAssignments")
	String createUserRoleAssignment() {
		return "createUserRoleAssignment";
	}

    //  Delete...
    @DeleteMapping("/environments/{envID}/users/{userID}/roleAssignments/{roleAssignmentID}")
	String deleteUserRoleAssignment() {
		return "deleteUserRoleAssignment";
	}
    
}