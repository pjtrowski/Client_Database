package com.admin;
 
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class UserAdmin extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                List<UserBean> userList = UserDAO.listOfUsers(); //displays list of user in userlist.jsp
				request.getSession().setAttribute("userList",userList);
				response.sendRedirect(request.getContextPath()+"/userlist.jsp");
    	}
}