package com.data;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/com.data/DataUpdate")
public class DataUpdate extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request,response);
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		try
		{
			DataBean update=new DataBean();
			HttpSession session = request.getSession(true);
			update.setCompanyName(request.getParameter("update_company"));
			update.setStreet(request.getParameter("street"));
			update.setCity(request.getParameter("city"));
			update.setState(request.getParameter("state"));
			update.setZip(request.getParameter("zip"));
			update.setPhone(request.getParameter("phone"));
			update.setFax(request.getParameter("fax"));
			System.out.println("Company email to store: "+request.getParameter("email"));
			update.setEmail_company(request.getParameter("email"));
			Date date=new Date();
			SimpleDateFormat dateFormat=new SimpleDateFormat("MM/dd/yyyy");
			String modDate=dateFormat.format(date);
			update.setDateupdated(modDate);
			update.setSessionUser((String)session.getAttribute("currentSessionUser"));
			update.setNotes(request.getParameter("message-text"));
			DataDAO.updateCompany(update);
			response.sendRedirect(request.getContextPath()+"/index.jsp");
		}
		catch(Throwable ex){com.clientdb.ErrorWriter.log(ex.getMessage());}
	} 
}
