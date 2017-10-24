package com.clientdb;
import java.io.*;
import java.sql.*;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.util.Date;

@WebServlet("/com.clientdb/Register")
public class Register extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		String un=request.getParameter("userName");
		String pw=request.getParameter("userPass");
		String fn=request.getParameter("firstName");
		String ln=request.getParameter("lastName");
		String em=request.getParameter("userEmail");
		String ut=request.getParameter("userType");
		Date date=new Date();
		SimpleDateFormat df=new SimpleDateFormat("MM/dd/yyyy");
		String dc=df.format(date);
		String querry="INSERT INTO users(username,password,firstname,lastname,email,usertype,date_created) VALUES('"+un+"',SHA1('"+pw+"'),'"+fn+"','"+ln+"','"+em+"','"+ut+"','"+dc+"')";
		try
		{
		Connection conn=ConnectionManager.getConnection();
		Statement stm=conn.createStatement();
		stm.executeUpdate(querry);
		conn.close();
		stm.close();
		LogWriter.log(un,"was registered");
		response.sendRedirect(request.getContextPath()+"/UserAdmin.do");	
		}
		catch (Exception ex) {com.clientdb.ErrorWriter.log(ex.getMessage());}		
	}

}
