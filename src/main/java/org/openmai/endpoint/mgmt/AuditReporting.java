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

public class AuditReporting {
	@Autowired
	@Qualifier("maiRequest")
	private MAIRequest maiRequest;

	// PingOne-Audit Reporting : GetUserActivities
	@GetMapping("/environments/{{envID}}/activities")
	public String getGetUserActivities() {
		return "GetUserActivities";
	}

	// PingOne-Audit Reporting : GetOneUserActivity
	@GetMapping("/environments/{{envID}}/activities/{{activityID}}")
	public String getGetOneUserActivity() {
		return "GetOneUserActivity";
	}

}
