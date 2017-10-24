package com.clientdb;

public class UserBean {
	
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String userType;
	private boolean valid;

	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String newFirstName)
	{
		this.firstName=newFirstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	public void setLastName(String newLastName) {
		this.lastName = newLastName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String newUsername) {
		this.username = newUsername;
	}
	public  String getPassword() {
		return password;
	}
	public void setPassword(String newPassword) {
		this.password = newPassword;
	}
	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean newValid) {
		this.valid = newValid;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
}
