package com.authentication.microservices.userregisterservice;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRegisterController {
	
	@Autowired
	private RegisterDetailsRepository registerDetailsRepository;
	
	@PostMapping("/user-register")
	public void registerUser(@RequestBody RegisterDetails userRegisterDetails) {
		
		registerDetailsRepository.save(userRegisterDetails);

	}
	
	@PostMapping("/user-authenticate")
	public Boolean authenticateUser(@RequestBody RegisterDetails userRegisterDetails) {
		
		Optional<RegisterDetails> findById = registerDetailsRepository.findById(userRegisterDetails.getId());
		
		
		if(findById.isPresent()) {
		RegisterDetails register=findById.get();
		
		
		if(register.getPassword().equals(userRegisterDetails.getPassword())) {
			return true;			
		}}
		
		return false;
		

	}
	

}
