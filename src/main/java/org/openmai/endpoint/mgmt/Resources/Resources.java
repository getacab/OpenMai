package org.openmai.endpoint.mgmt.Resources;

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
public class Resources{
    @Autowired
	MAIRequest maiRequest;

    //  Get...
    @GetMapping("/environments/{envID}/resources")
	public String readAllResources() {
		return "readAllResources";
	}
    @GetMapping("/environments/{envID}/resources/{resourceID}")
	public String readOneResources() {
		return "readOneResources";
	}

    //  Post..
    @PostMapping("/environments/{envID}/resources")
	String createResources() {
		return "createResources";
	}

    //  Put & Delete
    @PutMapping("/environments/{envID}/resources/{resourceID}")
	String updateResources() {
		return "updateResources";
	}

    @DeleteMapping("/environments/{envID}/resources/{resourceID}")
	String deleteResources() {
		return "deleteResources";
	}

}