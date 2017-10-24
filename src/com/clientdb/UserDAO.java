package com.clientdb;
import java.sql.*;

public class UserDAO {	
	static Connection conn=null;
	static ResultSet rs=null;
	
	public static UserBean login(UserBean user)
	{
		Statement stm = null;
		String username=user.getUsername();
		String password=user.getPassword();
		String querry="select * from users where username='" + username + "' AND password=SHA1('" + password + "')";
	try
	{
		conn=ConnectionManager.getConnection();
		stm=conn.createStatement();
		rs=stm.executeQuery(querry);
		boolean more=rs.next();	
		if(!more)
		{
			System.out.println("Sorry, not registred user");
			user.setValid(false);
		}
		else if(more)
			{	
			System.out.print("Welcome " + rs.getString("firstname"));
			user.setFirstName(rs.getString("firstname"));
			user.setLastName(rs.getString("lastname"));
			user.setUserType(rs.getString("usertype"));
			user.setValid(true);
			}
		}
	catch(Exception ex)
	{
		com.clientdb.ErrorWriter.log(ex.getMessage());
	}
	 finally 
	 { 
		 if (rs != null) 
		 { 
			 try 
			 { rs.close(); } 
			 catch (Exception e) {} rs = null; 
	     } 
	if (stm != null) 
	{ 
		try 
		{ stm.close(); } 
		catch (Exception e) {} 
		stm = null;
		} 
	if (conn != null) 
	{ 
		try { conn.close(); } 
		catch (Exception e) { } 
		conn = null; } }
	return user;
	}
}
