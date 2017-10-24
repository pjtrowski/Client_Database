package com.data;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/com.clientdb/DataCreate")
public class DataCreate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{try
	{
		DataBean createEntry=new DataBean();
		HttpSession session=request.getSession(true);
		createEntry.setCompanyName(request.getParameter("newCompany").toUpperCase());
		createEntry.setStreet(request.getParameter("newStreet"));
		createEntry.setCity(request.getParameter("newCity"));
		createEntry.setState(request.getParameter("newState"));
		createEntry.setZip(request.getParameter("newZip"));
		createEntry.setPhone(request.getParameter("newPhone"));
		createEntry.setFax(request.getParameter("newFax"));
		createEntry.setEmail_company(request.getParameter("newEmail"));
		createEntry.setCont1(request.getParameter("newName0"));
		createEntry.setCont2(request.getParameter("newName1"));
		createEntry.setCont3(request.getParameter("newName2"));
		createEntry.setCont4(request.getParameter("newName3"));
		createEntry.setCont5(request.getParameter("newName4"));
		createEntry.setCont6(request.getParameter("newName5"));
		createEntry.setCont7(request.getParameter("newName6"));
		createEntry.setCont8(request.getParameter("newName7"));
		createEntry.setCont9(request.getParameter("newName8"));
		createEntry.setCont10(request.getParameter("newName9"));
		createEntry.setContphn1(request.getParameter("newPhone0"));
		createEntry.setContphn2(request.getParameter("newPhone1"));
		createEntry.setContphn3(request.getParameter("newPhone2"));
		createEntry.setContphn4(request.getParameter("newPhone3"));
		createEntry.setContphn5(request.getParameter("newPhone4"));
		createEntry.setContphn6(request.getParameter("newPhone5"));
		createEntry.setContphn7(request.getParameter("newPhone6"));
		createEntry.setContphn8(request.getParameter("newPhone7"));
		createEntry.setContphn9(request.getParameter("newPhone8"));
		createEntry.setContphn10(request.getParameter("newPhone9"));
		createEntry.setEmail1(request.getParameter("newEmail0"));
		createEntry.setEmail2(request.getParameter("newEmail1"));
		createEntry.setEmail3(request.getParameter("newEmail2"));
		createEntry.setEmail4(request.getParameter("newEmail3"));
		createEntry.setEmail5(request.getParameter("newEmail4"));
		createEntry.setEmail6(request.getParameter("newEmail5"));
		createEntry.setEmail7(request.getParameter("newEmail6"));
		createEntry.setEmail8(request.getParameter("newEmail7"));
		createEntry.setEmail9(request.getParameter("newEmail8"));
		createEntry.setEmail10(request.getParameter("newEmail9"));
		createEntry.setNotes(request.getParameter("newNotes"));
		createEntry.setSessionUser((String)session.getAttribute("currentSessionUser"));
		DataDAO.createData(createEntry);
		response.sendRedirect(request.getContextPath()+"/index.jsp");
	}
	catch(Throwable ex)
	{
		com.clientdb.ErrorWriter.log(ex.getMessage());
	}  	
}
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	    {
	    	doGet(request,response);
	    }	

}