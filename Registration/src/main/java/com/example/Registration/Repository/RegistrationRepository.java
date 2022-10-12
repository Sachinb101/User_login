package com.example.Registration.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Registration.Model.User;
@Repository
public interface RegistrationRepository extends JpaRepository<User,Integer>{

	//declere the method means findbyemail is not present.  
	public User findByEmailId(String emailId);
	//declere the method means findEmailIdAndPassword is not present. 
	public User findByEmailIdAndPassword(String emailId,String password);
	
}
