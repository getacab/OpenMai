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
public class Images{
    @Autowired
    @Qualifier("maiRequest")
    private MAIRequest maiRequest;

    //  Get...
    @GetMapping("/environments/{envID}/images/{imgID}")
	public String readImage() {
		return "readImage";
	}

    // Post...
    @PostMapping("/environments/{envID}/images")
	String createImage() {
		return "createImage";
	}

    //  Delete...
    @DeleteMapping("/environments/{envID}/images/{imgID}")
	String deleteImage() {
		return "deleteImage";
	}

}
