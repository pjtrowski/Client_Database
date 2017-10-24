package com.admin;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class deleteUser
 */
@WebServlet("/deleteUser")
public class DeleteUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String deleteEmail=request.getParameter("email");
		UserBean user=new UserBean(deleteEmail);
		try {
			UserDAO.deleteUser(user);
			com.clientdb.LogWriter.log("User with emai: "+deleteEmail,"was deleted");	
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException ex) {
			com.clientdb.ErrorWriter.log(ex.getMessage());
		}
		response.sendRedirect(request.getContextPath()+"/UserAdmin.do");	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
