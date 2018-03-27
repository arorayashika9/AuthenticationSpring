package com.authentication.microservices.userloginservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@FeignClient(name="zuul-api-gateway-server")
@RibbonClient(name="user-register-service")
public interface UserRegisterServiceProxy {
	
	@PostMapping("/user-register-service/user-authenticate")
	public Boolean authenticateUser(@RequestBody UserLoginBean userLoginBean);
	
}
