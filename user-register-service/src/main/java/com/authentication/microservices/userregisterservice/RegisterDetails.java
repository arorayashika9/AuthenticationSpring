package com.authentication.microservices.userregisterservice;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RegisterDetails {
	
	@Id
	private Long id;
	private String name;
	private Long mobileNo;
	private String  username;
	private String password;
	
	
	public RegisterDetails() {
		
	}
	
	public RegisterDetails(Long id, String name, Long mobileNo, String username, String password) {
		super();
		this.id = id;
		this.name = name;
		this.mobileNo = mobileNo;
		this.username = username;
		this.password = password;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
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

	@Override
	public String toString() {
		return "RegisterDetails [id=" + id + ", name=" + name + ", MobileNo=" + mobileNo + ", username=" + username
				+ ", password=" + password + "]";
	}
	
	
	
	
	
	

}
