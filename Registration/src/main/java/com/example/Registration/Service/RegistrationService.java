package com.example.Registration.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Registration.Model.User;
import com.example.Registration.Repository.RegistrationRepository;

@Service
public class RegistrationService {

	@Autowired
	private RegistrationRepository repo;
	
//	this method is used to save user
	public User saveUser(User user) {
	   return repo.save(user);
	   }
//this method is to check the emailid is already present or not  
	public User fetchUserByEmailId(String email) {
		return repo.findByEmailId(email);
	}
//	this method is used 
	public User fetchUserByEmailIdAndPassword(String email,String password) {
		return repo.findByEmailIdAndPassword(email, password);
	}
	

	
	}
 
