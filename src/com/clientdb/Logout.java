package com.clientdb;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/com.clientdb/Logout")
public class Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		Cookie[] cookies=request.getCookies();
		if(cookies!=null)
		{
			for(Cookie cookie:cookies)
			{
				if(cookie.getName().equals("SessionID"))
				{
					System.out.println("SessionID: "+cookie.getValue());
				}
				cookie.setMaxAge(0);
				response.addCookie(cookie);	
			}
		}
		HttpSession session=request.getSession(false);
		LogWriter.log((String)session.getAttribute("currentSessionUser"),"logged out");
		if(session!=null)
		{
			session.invalidate();
		}
		response.sendRedirect(request.getContextPath()+"/login.html");
	}
}
