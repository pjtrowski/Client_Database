package com.admin;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/com.admin/EditUser")
public class EditUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		try
		{
			UserBean user=new UserBean();
			user.setEmail(request.getParameter("Email"));
			user.setUsername(request.getParameter("Username"));
			user.setPassword(request.getParameter("Password"));
			user.setFirstname(request.getParameter("First Name"));
			user.setLastname(request.getParameter("Last Name"));
			user.setUsertype(request.getParameter("User Type"));		
			UserDAO.editUser(user);
			com.clientdb.LogWriter.log(user.getUsername(),"was modified");
	    }
		catch(InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException ex)
		{
			com.clientdb.ErrorWriter.log(ex.getMessage());
		}
		response.sendRedirect(request.getContextPath()+"/UserAdmin.do");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
