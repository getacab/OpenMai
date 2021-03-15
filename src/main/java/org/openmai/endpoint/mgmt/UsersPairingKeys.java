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

public class UsersPairingKeys {
	@Autowired
	@Qualifier("maiRequest")
	private MAIRequest maiRequest;

	// PingOne-Users : PairingKeys : CreatePairingKey
	@PostMapping("/environments/{{envID}}/users/{{userID}}/pairingKeys")
	public String postCreatePairingKey() {
		return "CreatePairingKey";
	}

	// PingOne-Users : PairingKeys : ReadOnePairingKey
	@GetMapping("/environments/{{envID}}/users/{{userID}}/pairingKeys/{{pairingKeyID}}")
	public String getReadOnePairingKey() {
		return "ReadOnePairingKey";
	}

	// PingOne-Users : PairingKeys : DeletePairingKey
	@DeleteMapping("/environments/{{envID}}/users/{{userID}}/pairingKeys/{{pairingKeyID}}")
	public String deleteDeletePairingKey() {
		return "DeletePairingKey";
	}

}
