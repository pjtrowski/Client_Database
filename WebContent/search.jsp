 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*, javax.sql.*, java.io.*, javax.naming.*" %>
<html lang="en">
    <%@ page import="java.sql.*" %>  
    <%
   // InitialContext ctx;
    //DataSource ds;
    //Connection con;
    //Statement stmt;
    //ResultSet rs;
    String name=request.getParameter("company");  
    if(name==null||name.trim().equals("")){  
    out.print("<p>Please enter name!</p>");  
    }else{  
    try{  
    	Class.forName("com.mysql.jdbc.Driver").newInstance();
		String url = "jdbc:mysql://localhost:3306/client_db";
		String username = "user_1";
		String password = "mrfrost";
		Connection connection = null;
		Statement stmt = null;
		ResultSet rs = null;
		String qryStr1 = "";
   
    Connection con=DriverManager.getConnection(url,username,password); //hide when using Glassfish
    //ctx = new InitialContext();
    //ds = (DataSource) ctx.lookup("WorldConn"); //hide if not on Glassfish
    //con = ds.getConnection();
    stmt = con.createStatement();
    PreparedStatement ps=con.prepareStatement("SELECT * FROM mailing_list WHERE company_name LIKE '"+name+"%' LIMIT 12");  
    rs=ps.executeQuery();  
      
    if(!rs.isBeforeFirst()) {      
     out.println("<p>No Record Found!</p>");   
    }else{  
    	 out.print("<table class='table table-responsive table-hover'>"); 
    	    out.print("<thead><tr><th>Company Name</th></tr></thead>");
    	    //out.print("<thead><tr><th>Company Name</th></tr></thead>");
    	    int i=1;
    	    while((rs.next()&&(i<13)))
    	    {
    	    out.print("<tbody><tr class='clickable' onclick='companyInfo(this.id)' data-toggle='collapse' name='row"+i+"' id='"+rs.getString(2).toUpperCase()+"' data-target='.row"+i+"'><td>"+rs.getString(2).toUpperCase()+"</td></tbody>");
    	
    	    i++;
    	    }
    	    out.print("</table>");  
    }//end of else for rs.isBeforeFirst  
    con.close();  
    }catch(Exception e){out.print("<p>ERROR, YOU BETTER RUN!</p>");}  
    }//end of else  
    %>  