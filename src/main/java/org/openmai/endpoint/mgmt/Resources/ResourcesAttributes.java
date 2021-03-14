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
public class ResourcesAttributes{
    @Autowired
	MAIRequest maiRequest;

    //  Get...
    @GetMapping("/environments/{envID}/resources/{resourceID}/attributes")
	public String readAllResourcesAttributes() {
		return "readAllResourcesAttributes";
	}
    @GetMapping("/environments/{envID}/resources/{resourceID}/attributes/{resourceAttrID}")
	public String readOneResourcesAttributes() {
		return "readOneResourcesAttributes";
	}

    //  Post..
    @PostMapping("/environments/{envID}/resources/{resourceID}/attributes")
	String createResourcesAttributes() {
		return "createResourcesAttributes";
	}

    //  Put & Delete
    @PutMapping("/environments/{envID}/resources/{resourceID}/attributes/{resourceAttrID}")
	String updateResourcesAttributes() {
		return "updateResourcesAttributes";
	}

    @DeleteMapping("/environments/{envID}/resources/{resourceID}/attributes/{resourceAttrID}")
	String deleteResourcesAttributes() {
		return "deleteResourcesAttributes";
	}

}