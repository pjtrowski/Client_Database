package com.clientdb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 
import javax.servlet.http.HttpSession; 

@WebServlet("/com.clientdb/Login")
public class Login extends HttpServlet 
{ 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, java.io.IOException 
	{ 
		try
		{ 
		UserBean user = new UserBean();
		user.setUsername(request.getParameter("username")); 
		user.setPassword(request.getParameter("password"));
		user = UserDAO.login(user); 
		if (user.isValid()) 
		{ 
		HttpSession session = request.getSession(true);
		String sessionUser=request.getParameter("username");
		session.setAttribute("currentSessionUser",sessionUser);
		session.setAttribute("currentSessionUserType",user.getUserType());
		session.setMaxInactiveInterval(20*60);
		Cookie userName=new Cookie("user",sessionUser);
		userName.setMaxAge(30*60);
		response.addCookie(userName);
		LogWriter.log(sessionUser,"logged in");
		response.sendRedirect(request.getContextPath()+"/index.jsp"); //main view 
		 } 
		else
			LogWriter.log(user.getUsername(),"failed to login");
			response.sendRedirect(request.getContextPath()+"/invalidlogin.html"); //error page 
		} 
		catch (Throwable ex) { com.clientdb.ErrorWriter.log(ex.getMessage());}
	}
}