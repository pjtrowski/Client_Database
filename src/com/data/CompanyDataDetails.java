package com.data;

import java.io.IOException;


import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CompanyDataDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	try
	{
		String company=request.getParameter("company");
		HttpSession session=request.getSession(true);
		session.setAttribute("updatedCompany",company);
		System.out.println(company);
		request.setAttribute("companyInfo", DataDAO.companyInfo(company));
		request.getRequestDispatcher("details.jsp").forward(request, response);
	}
	catch(Throwable ex){com.clientdb.ErrorWriter.log(ex.getMessage());}	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
