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
public class Schemas {
	@Autowired
	@Qualifier("maiRequest")
	private MAIRequest maiRequest;

	// PingOne-Schemas : ReadAllSchemas
	@GetMapping("/environments/{{envID}}/schemas")
	public String getReadAllSchemas() {
		return "ReadAllSchemas";
	}

	// PingOne-Schemas : ReadOneSchema
	@GetMapping("/environments/{{envID}}/schemas/{{schemaID}}")
	public String getReadOneSchema() {
		return "ReadOneSchema";
	}

	// PingOne-Schemas : ReadAllSchemaAttributes
	@GetMapping("/environments/{{envID}}/schemas/{{schemaID}}/attributes")
	public String getReadAllSchemaAttributes() {
		return "ReadAllSchemaAttributes";
	}

	// PingOne-Schemas : CreateAttribute
	@PostMapping("/environments/{{envID}}/schemas/{{schemaID}}/attributes")
	public String postCreateAttribute() {
		return "CreateAttribute";
	}

	// PingOne-Schemas : ReadOneAttribute
	@GetMapping("/environments/{{envID}}/schemas/{{schemaID}}/attributes/{{schemaAttrID}}")
	public String getReadOneAttribute() {
		return "ReadOneAttribute";
	}

	// PingOne-Schemas : UpdateAttributePatch
	@PatchMapping("/environments/{{envID}}/schemas/{{schemaID}}/attributes/{{schemaAttrID}}")
	public String patchUpdateAttributePatch() {
		return "UpdateAttributePatch";
	}

	// PingOne-Schemas : UpdateAttributePut
	@PutMapping("/environments/{{envID}}/schemas/{{schemaID}}/attributes/{{schemaAttrID}}")
	public String putUpdateAttributePut() {
		return "UpdateAttributePut";
	}

	// PingOne-Schemas : DeleteAttribute
	@DeleteMapping("/environments/{{envID}}/schemas/{{schemaID}}/attributes/{{schemaAttrID}}")
	public String deleteDeleteAttribute() {
		return "DeleteAttribute";
	}
}
