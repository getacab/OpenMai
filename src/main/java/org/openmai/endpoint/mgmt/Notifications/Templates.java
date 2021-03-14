package org.openmai.endpoint.mgmt.Notifications;

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
public class Templates{
    @Autowired
	MAIRequest maiRequest;

    //  Get...
    @GetMapping("/environments/{envID}/templates")
	public String readAllTemplates() {
		return "readAllTemplates";
	}
    @GetMapping("/environments/{envID}/templates/{templateName}")
	public String readOneTemplates() {
		return "readOneTemplates";
	}

    @GetMapping("/environments/{envID}/templates/{templateName}/contents")
	public String readAllContent() {
		return "readAllContent";
	}
    @GetMapping("/environments/{envID}/templates/{templateName}/contents/{contentID}")
	public String readOneContent() {
		return "readOneContent";
	}

    //  Post..
    @PostMapping("/environments/{envID}/templates/{templateName}/contents")
	String createEmailnText() {
		return "createEmailnText";
	}

    //  Put & Delete
    @PutMapping("/environments/{envID}/templates/{templateName}/contents/{contentID}")
	String updateEmailnText() {
		return "updateEmailnText";
	}

    @DeleteMapping("/environments/{envID}/templates/{templateName}/contents/{contentID}")
	String deleteContent() {
		return "deleteContent";
	}

}