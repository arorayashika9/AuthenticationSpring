package com.authentication.microservices.userloginservice;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class UserLoginController {
	
	@Autowired
	private UserRegisterServiceProxy proxy;
	
	@PostMapping("/user-register-feign")
	public Boolean checkUserCredentials(@RequestBody UserLoginBean userLoginBean ) {
				
		Boolean response = proxy.authenticateUser(userLoginBean);

		return response;
	}

}
