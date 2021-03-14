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
public class ResourcesScopes{
    @Autowired
	MAIRequest maiRequest;

    //  Get...
    @GetMapping("/environments/{envID}/resources/{resourceID}/scopes")
	public String readAllResourcesScopes() {
		return "readAllResourcesScopes";
	}
    @GetMapping("/environments/{envID}/resources/{resourceID}/scopes/{scopeID}")
	public String readOneResourcesScopes() {
		return "readOneResourcesScopes";
	}

    //  Post..
    @PostMapping("/environments/{envID}/resources/{resourceID}/scopes")
	String createResourcesScopes() {
		return "createResourcesScopes";
	}

    //  Put & Delete
    @PutMapping("/environments/{envID}/resources/{resourceID}/scopes/{scopeID}")
	String updateResourcesScopes() {
		return "updateResourcesScopes";
	}

    @DeleteMapping("/environments/{envID}/resources/{resourceID}/scopes/{scopeID}")
	String deleteResourcesScopes() {
		return "deleteResourcesScopes";
	}

}