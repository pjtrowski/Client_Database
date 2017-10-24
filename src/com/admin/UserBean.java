package com.admin;

public class UserBean {
	private String password;
	private String firstname;
	private String lastname;
	private String email;
	private String usertype;
	private String datecreated;
	private String username; 
	
	public UserBean(){};
	
	public UserBean(String username2, String password2, String firstname2, String lastname2, String email2,
			String usertype2, String datecreated2) {
		username=username2;
		password=password2;
		firstname=firstname2;
		lastname=lastname2;
		email=email2;
		usertype=usertype2;
		datecreated=datecreated2;
	}	
	public UserBean(String email3)
	{
		email=email3;
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
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	public String getDatecreated() {
		return datecreated;
	}
	public void setDatecreated(String datecreated) {
		this.datecreated = datecreated;
	}
}
