package org.openmai.beans;

import java.util.HashMap;
import java.util.Map;

public class PingContentTypeXlation {

	Map<String, String> command =  new HashMap<>();
	
	public PingContentTypeXlation() {
		
        command.put("application/vnd.pingidentity.usernamePassword.check+json","checkUsernamePassword");
        command.put("application/vnd.pingidentity.user.lookup+json","signOnUsername");
        command.put("application/vnd.pingidentity.password.reset+json","resetPassword");
        command.put("application/vnd.pingidentity.device.select+json","selectDevice");
        command.put("application/vnd.pingidentity.otp.check+json","checkOtp");
        command.put("application/vnd.pingidentity.password.forgot+json","forgotPassword");
        command.put("application/vnd.pingidentity.password.sendRecoveryCode+json","sendRecoveryCode");
        command.put("application/vnd.pingidentity.password.recover+json","recoverPassword");
        command.put("application/vnd.pingidentity.user.register+json","registerUser");
        command.put("application/vnd.pingidentity.user.sendVerificationCode+json","sendVerificationCode");
        command.put("application/vnd.pingidentity.user.update+json","userProfileUpdate");
        command.put("application/vnd.pingidentity.user.confirm+json","confirmAccountInfo");
        command.put("application/vnd.pingidentity.user.verify+json","verifyUser");
	}
	
	public String getCommand(String _contentType) {
		return command.get(_contentType);
	}
	
}
