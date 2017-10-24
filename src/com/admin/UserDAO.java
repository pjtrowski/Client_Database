package com.admin;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.clientdb.ConnectionManager;

public class UserDAO {
	
	public static List<UserBean> listOfUsers()
	{
		List<UserBean> userList=new ArrayList<>();
		String querry="SELECT username,password,firstname,lastname,email,usertype,date_created FROM users";	
		try
		{
			Connection conn=ConnectionManager.getConnection();
			Statement stm=conn.createStatement();
			ResultSet rs=stm.executeQuery(querry);
			while(rs.next())
			{
				String username=rs.getString("username");
				String password=rs.getString("password");
				String firstname=rs.getString("firstname");
				String lastname=rs.getString("lastname");
				String email=rs.getString("email");
				String usertype=rs.getString("usertype");
				String datecreated=rs.getString("date_created");
				UserBean user=new UserBean(username,password,firstname,lastname,email,usertype,datecreated);
				userList.add(user);
			}
			stm.close();
			rs.close();
			conn.close();
		}
			catch(Exception ex){com.clientdb.ErrorWriter.log((ex.getMessage()));}

		return userList;	
}
	public static void deleteUser(UserBean user) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException  {
		String querry="DELETE FROM users WHERE email='"+user.getEmail()+"'";
		Connection conn=ConnectionManager.getConnection();
		java.sql.PreparedStatement stm=conn.prepareStatement(querry);	
		stm.executeUpdate();
		stm.close();
		conn.close();
			}
	public static void editUser(UserBean user) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		String un=user.getUsername();
		String pw=user.getPassword();
		String fn=user.getFirstname();
		String ln=user.getLastname();
		String em=user.getEmail();
		String ut=user.getUsertype();
		String querry="UPDATE users SET username='"+un+"',password='"+pw+"',firstname='"+fn+"',lastname='"+ln+"',email='"+em+"',usertype='"+ut+"' WHERE(email='"+em+"')";
		System.out.println(querry);;
		Connection conn=ConnectionManager.getConnection();
		Statement stm=conn.createStatement();
		stm.executeUpdate(querry);
		conn.close();
		stm.close();
		}	
	}
