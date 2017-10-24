package com.data;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ContactsUpdate
 */
@WebServlet("/com.data/ContactsUpdate")
public class ContactsUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		DataBean update=new DataBean();
		HttpSession session=request.getSession(true);
		update.setCompanyName((String)session.getAttribute("updatedCompany"));
		update.setCont1(request.getParameter("cont1"));
		update.setCont2(request.getParameter("cont2"));
		update.setCont3(request.getParameter("cont3"));
		update.setCont4(request.getParameter("cont4"));
		update.setCont5(request.getParameter("cont5"));
		update.setCont6(request.getParameter("cont6"));
		update.setCont7(request.getParameter("cont7"));
		update.setCont8(request.getParameter("cont8"));
		update.setCont9(request.getParameter("cont9"));
		update.setCont10(request.getParameter("cont10"));
		update.setContphn1(request.getParameter("contphn1"));
		update.setContphn2(request.getParameter("contphn2"));
		update.setContphn3(request.getParameter("contphn3"));
		update.setContphn4(request.getParameter("contphn4"));
		update.setContphn5(request.getParameter("contphn5"));
		update.setContphn6(request.getParameter("contphn6"));
		update.setContphn7(request.getParameter("contphn7"));
		update.setContphn8(request.getParameter("contphn8"));
		update.setContphn9(request.getParameter("contphn9"));
		update.setContphn10(request.getParameter("contphn10"));
		update.setEmail1(request.getParameter("email1"));
		update.setEmail2(request.getParameter("email2"));
		update.setEmail3(request.getParameter("email3"));
		update.setEmail4(request.getParameter("email4"));
		update.setEmail5(request.getParameter("email5"));
		update.setEmail6(request.getParameter("email6"));
		update.setEmail7(request.getParameter("email7"));
		update.setEmail8(request.getParameter("email8"));
		update.setEmail9(request.getParameter("email9"));
		update.setEmail10(request.getParameter("email10"));
		update.setSessionUser((String)session.getAttribute("currentSessionUser"));
		DataDAO.updateContacts(update);
		com.clientdb.LogWriter.log((String)session.getAttribute("currentSessionUser")," modifed "+update.getCompanyName()+" info ");
		response.sendRedirect(request.getContextPath()+"/index.jsp");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
