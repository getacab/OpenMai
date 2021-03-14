package org.openmai.endpoint.mgmt;

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
public class Schemas{
    @Autowired
    @Qualifier("maiRequest")
    private MAIRequest maiRequest;

    //  Get...
    @GetMapping("/environments/{envID}/schemas")
	public String readAllSchemas() {
		return "readAllSchemas";
	}
    @GetMapping("/environments/{envID}/schemas/{schemasID}")
	public String readOneSchemas() {
		return "readOneSchemas";
	}
    @GetMapping("/environments/{envID}/schemas/attributes")
	public String readAllSchemasAttribute() {
		return "readAllSchemas";
	}
    @GetMapping("/environments/{envID}/schemas/{schemasID}/attributes/{attributeID}")
	public String readOneSchemasAttribute() {
		return "readOneSchemas";
	}

    //  Post
    @PostMapping("/environments/{envID}/schemas/{schemasID}/attributes")
	String createAttribute() {
		return "createAttribute";
	}

    //  Patch , Put , Delete...
    @PatchMapping("/environments/{envID}/schemas/{schemasID}/attributes/{attributeID}")
	String updateAttributePatch() {
		return "updateAttributePatch";
	}

    @PutMapping("/environments/{envID}/schemas/{schemasID}/attributes/{attributeID}")
	String updateAttributePut() {
		return "updateAttributePut";
	}

    @DeleteMapping("/environments/{envID}/schemas/{schemasID}/attributes/{attributeID}")
	String deleteUser() {
		return "deleteUser";
	}

}
