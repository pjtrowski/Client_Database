package com.clientdb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	static Connection conn;
	static String url;
	
	public static Connection getConnection() throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		String url="jdbc:mysql://localhost:3306/client_db";
		String un="user_1";
		String pw="mrfrost";	
		conn=DriverManager.getConnection(url,un,pw);
		return conn;
	}

}
