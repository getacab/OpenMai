package org.openmai.endpoint.auth.Flow;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.*;

import org.json.JSONObject;
@RestController

public class FlowRegisterVerify 
{
    private String username , password , otp;

    @PostMapping("/registerUser/{envID}/flows/{flowID}")
    public String registerUser(String username, String email , String password) {
        return "Initiate Password Recovery !";
    }

    @PostMapping("/sendVerificationCode/{envID}/flows/{flowID}")
    public String sendVerificationCode(String verificationCode) {
        return "Initiate send Verification Code !";
    }

    @PostMapping("/userProfileUpdate/{envID}/flows/{flowID}")
    public String userProfileUpdate(String email , JSONObject address)
    {
        return "userProfileUpdate";
    }

    @PostMapping("/confirmAccountInfo/{envID}/flows/{flowID}")
    public String confirmAccountInfo(String username) {
        return "Initiate confirm Account Info !";
    }

    @PostMapping("/verifyUser/{envID}/flows/{flowID}")
    public String verifyUser(String verificationCode) {
        return "Initiate Verify User !";
    }
}
