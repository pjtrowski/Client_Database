package com.clientdb;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
import java.sql.DriverManager;


/**
 * Servlet implementation class PasswordReset
 */
@WebServlet("/com.clientdb/PasswordReset")
public class PasswordReset extends HttpServlet

	{

	private static final long serialVersionUID = 1L;

public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {
	
        try
       {	res.setContentType("text/html");
       	    String un=req.getParameter("userName");
        	//String oldpw=req.getParameter("userEmail");
        	String newpw=req.getParameter("newPassword");
        	String newpwconf=req.getParameter("newPasswordConfirm");

        if (newpw.equals("") || newpwconf.equals("")) // You don't need this is using JS or Bootstrap to veryfi form!
            {
                    //msg="New Password and Comfirm password , both are required.";
                   // req.setAttribute("reg", msg);
        			res.sendRedirect("http://localhost:8080/ClinetDB/reset.html");
             }
       else if (!newpw.equals(newpwconf))
       		{
                   //msg="Your New password and confirm password does not match.";
                   //req.setAttribute("reg", msg);
                   res.sendRedirect("http://localhost:8080/ClinetDB/reset.html");
            }  
        		try
        		{    
        			Class.forName("com.mysql.jdbc.Driver").newInstance();
        			java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/client_db","user_1","mrfrost");

        				try
        				{
        					java.sql.PreparedStatement ps=con.prepareStatement("UPDATE users SET password=? WHERE username=?");
        					ps.setString(1,newpw);
        					ps.setString(2,un);
        					//ps.setString(3,oldpw);
        					int i= ps.executeUpdate();
        					if(i>0)
        					{
        						//msg="Password doesnot Change..Try Again…";
        						//req.setAttribute("reg", msg);
        						res.sendRedirect("http://localhost:8080/ClinetDB/reset.html");
        					}
        					else
        						{
        						//msg="Your password Change Successfully….";
        						//req.setAttribute("reg", msg);
        						res.sendRedirect("http://localhost:8080/ClinetDB/resetconfirmation.html");
        						ps.close();
        						con.close();
        						}
        				}catch(Exception e){e.getMessage();}

        		}catch(Exception e){e.getMessage();}
    
    	}catch(Exception e){e.getMessage();}

	}

}
