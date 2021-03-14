package org.openmai.endpoint.auth.Flow;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@RestController

public class FlowForgotPassword 
{

    //@PostMapping("recoverPassword/{envID}/flows/{flowID}")
    @PostMapping("/recoverPassword/{envID}/flows/{flowID}")
    public String recoverPassword(String recoveryCode, String newPassword) {
        return "recoverPassword";
    }

    @PostMapping("/sendRecoveryCode/{envID}/flows/{flowID}")
    public String sendRecoveryCode() {
        return "Return a Recovery Code ! : 1235125";
    }

    @PostMapping("/forgotPassword/{envID}/flows/{flowID}")
    public String forgotPassword(String username) 
    {
        return "Forgot Password needs to be added !";
    }   
}
