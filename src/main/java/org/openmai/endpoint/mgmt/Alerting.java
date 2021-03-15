package org.openmai.endpoint.mgmt;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Alerting {
	
    @GetMapping("/environments/{{envID}}/alertChannels")
    public String readAlertChannels() {
    	return "readAlertChannels";
    	
    }
    @PostMapping("/environments/{{envID}}/alertChannels")
    public String createAlertChannels() {
    	return "createAlertChannels";
    	
    }

    @PutMapping("/environments/{{envID}}/alertChannels")
    public String updateAlertChannels() {
    	
    	return "updateAlertChannels";
    	
    }

    @DeleteMapping("/environments/{{envID}}/alertChannels")
    public String deleteAlertChannels() {
    	return "deleteAlertChannels";
    	
    }

}
