package org.openmai.endpoint.mgmt;

import org.openmai.beans.MAIRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

//??@RestController

public class Notifications1 {

	@Autowired
	@Qualifier("maiRequest")
	private MAIRequest maiRequest;


	// PingOne-Notifications : Templates : ReadOneTemplate
	@GetMapping("/environments/{{envID}}/templates/{{templateName}}")
	public String getReadOneTemplate() {
		return "ReadOneTemplate";
	}

	// PingOne-Notifications : Templates : CreateEmailContent
	@PostMapping("/environments/{{envID}}/templates/{{templateName}}/contents")
	public String postCreateEmailContent() {
		return "CreateEmailContent";
	}

	// PingOne-Notifications : Templates : CreateTextMessageContent
	@PostMapping("/environments/{{envID}}/templates/{{templateName}}/contents")
	public String postCreateTextMessageContent() {
		return "CreateTextMessageContent";
	}

	// PingOne-Notifications : Templates : UpdateEmailContent
	@PutMapping("/environments/{{envID}}/templates/{{templateName}}/contents/{{contentID}}")
	public String putUpdateEmailContent() {
		return "UpdateEmailContent";
	}

	// PingOne-Notifications : Templates : UpdateTextMessageContent
	@PutMapping("/environments/{{envID}}/templates/{{templateName}}/contents/{{contentID}}")
	public String putUpdateTextMessageContent() {
		return "UpdateTextMessageContent";
	}

	// PingOne-Notifications : Templates : ReadOneContent
	@GetMapping("/environments/{{envID}}/templates/{{templateName}}/contents/{{contentID}}")
	public String getReadOneContent() {
		return "ReadOneContent";
	}

	// PingOne-Notifications : Templates : ReadAllContent
	@GetMapping("/environments/{{envID}}/templates/{{templateName}}/contents")
	public String getReadAllContent() {
		return "ReadAllContent";
	}

	// PingOne-Notifications : Templates : DeleteContent
	@DeleteMapping("/environments/{{envID}}/templates/{{templateName}}/contents/{{contentID}}")
	public String deleteDeleteContent() {
		return "DeleteContent";
	}

}
