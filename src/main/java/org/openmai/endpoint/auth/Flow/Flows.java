package org.openmai.endpoint.auth.Flow;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.json.JSONObject;
import org.openmai.interceptors.RequestHandler;
import org.openmai.beans.MAIRequest;
import org.springframework.web.bind.annotation.RestController;
import org.openmai.endpoint.auth.Flow.FlowRegisterVerify;
import org.openmai.endpoint.auth.Flow.FlowForgotPassword;

@RestController

public class Flows {

	private String envID , flowID;
    private String username , password , otp;

    private FlowForgotPassword forgotPasswordInstance = new FlowForgotPassword();
    private FlowRegisterVerify registerVerifyInstance = new FlowRegisterVerify();
	private RequestHandler requestHandler = new RequestHandler();	

    @GetMapping("/{envID}/flows/{flowID}")
	public String readFlow(@PathVariable String envID , @PathVariable String flowID ) {
        
        if(envID == null || flowID == null || envID == "" || flowID == "")
            return "Invalid Arguments";

		return "Valid Arguments !, It works";
	}

	//  Handler for All Post Requests...
    @PostMapping("/{envID}/flows/{flowID}")
    public String postFlowHandler(HttpServletRequest request) {

		MAIRequest requestObj = new MAIRequest(request);
		
        JSONObject body = requestObj.body;
        String contentType = requestObj.headers.get("content-type");
        
        //  Flow ...
        if(contentType.equals(new String("application/vnd.pingidentity.usernamePassword.check+json")))
        {
            return checkUsernamePassword(body.getString("username"), body.getString("password"));
        }
        else if(contentType.equals(new String("application/vnd.pingidentity.user.lookup+json")))
        {
            return signOnUsername(body.getString("username"), body.getString("password"));
        }
        else if(contentType.equals(new String("application/vnd.pingidentity.password.reset+json")))
        {
            return resetPassword(body.getString("currentPassword"), body.getString("newPassword"));
        }
        else if(contentType.equals(new String("application/vnd.pingidentity.device.select+json")))
        {
            return selectDevice(body.getJSONObject("device"));
        }
        else if(contentType.equals(new String("application/vnd.pingidentity.otp.check+json")))
        {
            return checkOtp(body.getString("otp"));
        }
        //  Forgot Password...
        else if(contentType.equals(new String("application/vnd.pingidentity.password.forgot+json")))
        {
            return forgotPasswordInstance.forgotPassword(body.getString("username"));
        }
        else if(contentType.equals(new String("application/vnd.pingidentity.password.sendRecoveryCode+json")))
        {
            return forgotPasswordInstance.sendRecoveryCode();
        }
        else if(contentType.equals(new String("application/vnd.pingidentity.password.recover+json")))
        {
            return forgotPasswordInstance.recoverPassword(body.getString("recoveryCode"), body.getString("newPassword"));
        }
        //  Registration & Verification...
        else if(contentType.equals(new String("application/vnd.pingidentity.user.register+json")))
        {
            return registerVerifyInstance.registerUser(body.getString("username"), body.getString("email"), body.getString("password"));
        }
        else if(contentType.equals(new String("application/vnd.pingidentity.user.sendVerificationCode+json")))
        {
            return registerVerifyInstance.sendVerificationCode(body.getString("verificationCode"));
        }
        else if(contentType.equals(new String("application/vnd.pingidentity.user.update+json")))
        {
            return registerVerifyInstance.userProfileUpdate(body.getString("email"), body.getJSONObject("address"));
        }
        else if(contentType.equals(new String("application/vnd.pingidentity.user.confirm+json")))
        {
            return registerVerifyInstance.confirmAccountInfo(body.getString("username"));
        }
        else if(contentType.equals(new String("application/vnd.pingidentity.user.verify+json")))
        {
            return registerVerifyInstance.verifyUser(body.getString("verificationCode"));
        }
        else{
            return "Invalid Arguments !";
        }
	}

	String checkUsernamePassword(String username , String password)
    {
        System.out.println(this.username + "-" + this.password);
        if(username == null || password == null)
            return "Invalid Credentials !";

        if(username.equals(this.username) && password.equals(this.password))
            return "Valid Credentials !";
        else
            return "Incorrect Credentials !";
    }

    String signOnUsername(String username , String password)
    {
        if(username == null || password == null)
        {
            return "Invalid Credentials !";
        }
        else
        {
            //  Add a new User...
            this.username = username;
            this.password = password;
            
            System.out.println(this.username + "-" + this.password);
            return "SignOn Success !";
        }        
    }

    String resetPassword(String currentPassword , String newPassword)
    {
        if(currentPassword == null || newPassword == null)
            return "Invalid Credentials !";
        else
        {
            if(this.password.equals(currentPassword))
            {
                this.password = newPassword;
                return "Password Changed !";
            }
            else
                return "Invalid Current password";
        }
    }

    String selectDevice(JSONObject device)
    {
        System.out.println(device.getString("id"));
        /*
        device.entrySet().forEach(entry->{
            System.out.println(entry.getKey() + " " + entry.getValue());  
        });*/
        return "Initiate Device Select !";
    }

    String checkOtp(String otp)
    {
        if(otp == null)
            return "Invalid Data !";
        else
        {
            if(this.otp.equals(otp))
                return "Valid Otp !";
            else
                return "Invalid Otp";
        }
    }	
}
