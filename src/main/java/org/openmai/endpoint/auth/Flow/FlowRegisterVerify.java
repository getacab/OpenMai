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

    public String registerUser(String username, String email , String password) {
        return "Initiate Password Recovery !";
    }

    public String sendVerificationCode(String verificationCode) {
        return "Initiate send Verification Code !";
    }
    @PostMapping("/userProfileUpdate/checkUsernamePassword/{envID}/flows/{flowID}")
    public String userProfileUpdate(String email , JSONObject address)
    {
        return "userProfileUpdate";
    }

    public String confirmAccountInfo(String username) {
        return "Initiate confirm Account Info !";
    }

    public String verifyUser(String verificationCode) {
        return "Initiate Verify User !";
    }
}
