package com.authentication.microservices.userloginservice;

public class UserLoginBean {
	
	private Long id;
	private String password;
	
	public UserLoginBean() {
		
	}
	
		
	public UserLoginBean(Long id, String password) {
		super();
		this.id = id;
		this.password = password;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "UserLoginBean [id=" + id + ", password=" + password + "]";
	}
	
	
	

}
