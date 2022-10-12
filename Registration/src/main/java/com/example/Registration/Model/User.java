package com.example.Registration.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String emailId;
	private String username;
	private String password;
//	Generated the bydefault constructor
	public User() {
		
	}
	
//	generated constructor using fields
	public User(int id, String emailId, String username, String password) {
		super();
		this.id = id;
		this.emailId = emailId;
		this.username = username;
		this.password = password;
	}
	
//	generated getter and setter
	public long getid() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
