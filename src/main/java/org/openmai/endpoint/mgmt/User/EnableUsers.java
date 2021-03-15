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
public class EnableUsers{

	@Autowired
	@Qualifier("maiRequest")
	private MAIRequest maiRequest;

	// PingOne-Users : EnableUsers : ReadUserEnabled
	@GetMapping("/environments/{{envID}}/users/{{userID}}/enabled")
	public String getReadUserEnabled() {
		return "ReadUserEnabled";
	}

	// PingOne-Users : EnableUsers : UpdateUserEnabled
	@PutMapping("/environments/{{envID}}/users/{{userID}}/enabled")
	public String putUpdateUserEnabled() {
		return "UpdateUserEnabled";
	}

   
}