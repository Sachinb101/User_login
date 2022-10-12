package com.example.Registration.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Registration.Model.User;
import com.example.Registration.Service.RegistrationService;

@CrossOrigin("http://localhost:3000") 
@RestController
public class RegistrationController {
 
	@Autowired
	private RegistrationService service;
//	user Registration
	@PostMapping("/registeruser")
	public User registerUser(@RequestBody User user) throws Exception{
		String tempEmailId=user.getEmailId();
		if(tempEmailId !=null && "".equals(tempEmailId));{
			User userobj=service.fetchUserByEmailId(tempEmailId);
			if(userobj !=null) {
				throw new Exception("user with "+tempEmailId+"is already exist");
			}
		}
		User userobj=null;
		userobj=service.saveUser(user);
		return userobj;
	}
//	user login
	@PostMapping("/login")
	public User loginUser(@RequestBody User user) throws Exception {
		String tempEmailId =user.getEmailId();
		String temppass=user.getPassword();
		User userobj =null;
		if(tempEmailId !=null && temppass != null) {
			userobj=service.fetchUserByEmailIdAndPassword(tempEmailId, temppass);
		}
		if(userobj==null) {
			throw new Exception("User Not Found");
		}
		return userobj;
	}
}
