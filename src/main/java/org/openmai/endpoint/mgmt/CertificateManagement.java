package org.openmai.endpoint.mgmt;

import org.openmai.beans.MAIRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CertificateManagement {

	@Autowired
	@Qualifier("maiRequest")
	private MAIRequest maiRequest;

// PingOne-Certificate Management : GetKeys
	@GetMapping("/environments/{{envID}}/keys")
	public String getGetKeys() {
		return "GetKeys";
	}

// PingOne-Certificate Management : CreateKey
	@PostMapping("/environments/{{envID}}/keys")
	public String postCreateKey() {
		return "CreateKey";
	}

// PingOne-Certificate Management : GetKey
	@GetMapping("/environments/{{envID}}/keys/{{keyID}}")
	public String getGetKey() {
		return "GetKey";
	}

// PingOne-Certificate Management : UpdateKey
	@PutMapping("/environments/{{envID}}/keys/{{keyID}}")
	public String putUpdateKey() {
		return "UpdateKey";
	}

// PingOne-Certificate Management : CreateKeyWithPkcs12File
	//??@PostMapping("/environments/{{envID}}/keys")
	public String postCreateKeyWithPkcs12File() {
		return "CreateKeyWithPkcs12File";
	}

// PingOne-Certificate Management : GetCertificates
	@GetMapping("/environments/{{envID}}/certificates")
	public String getGetCertificates() {
		return "GetCertificates";
	}

// PingOne-Certificate Management : GetCertificate
	@GetMapping("/environments/{{envID}}/certificates/{{certID}}")
	public String getGetCertificate() {
		return "GetCertificate";
	}

// PingOne-Certificate Management : CreateCertificateWithPkcs7File
	@PostMapping("/environments/{{envID}}/certificates")
	public String postCreateCertificateWithPkcs7File() {
		return "CreateCertificateWithPkcs7File";
	}

}
