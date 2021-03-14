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
public class User{
    @Autowired
	MAIRequest maiRequest;
	
	@GetMapping("/{envID}/users")
	public String readAllUser(@PathVariable String envID, @PathVariable String flowID) {
		return "Read All User";
	}

    @GetMapping("/{envID}/users/{userID}")
	public String readOneUser(@PathVariable String envID, @PathVariable String flowID , @PathVariable String userID) {
		return "Read One User";
	}
    //  Confusing Content-type Below...
    @PostMapping("/Content/{envID}/users")
	String createUser() {
		return "createUser";
	}

    @PostMapping("/createUserImport/{envID}/users")
	String createUserImport() {
		return "createUserImport";
	}

    @PostMapping("/verifyUser/{envID}/users/{userID}")
	String verifyUser() {
		return "verifyUser";
	}

    @PostMapping("/sendResendVerificationCode/{envID}/user/{userID}")
	String sendResendVerificationCode() {
		return "sendResendVerificationCode";
	}

    @PatchMapping("/{envID}/users/{userID}")
	String updateUserPatch() {
		return "updateUserPatch";
	}

    @PutMapping("/{envID}/users/{userID}")
	String updateUserPut() {
		return "updateUserPut";
	}

    @DeleteMapping("/{envID}/users/{userID}")
	String deleteUser() {
		return "deleteUser";
	}


}