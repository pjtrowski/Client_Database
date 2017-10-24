<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*, javax.sql.*, java.io.*, javax.naming.*" %>
<html lang="en">
    <%@ page import="java.sql.*" %>  
    <%
   // InitialContext ctx;
    //DataSource ds;
    //Connection con;
    //Statement stmt;
    //ResultSet rs;
    String name=request.getParameter("companyname");
    System.out.println("Checking company:"+name);
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
    PreparedStatement ps=con.prepareStatement("SELECT * FROM mailing_list WHERE company_name='"+name+"'");
  
    rs=ps.executeQuery();  
      
    if(rs.first()) 
    {      
     out.print("Company already exist!");   
    }
    else{  
    	out.print("<p>Company doesn't exist in our database!</p>"); 
        }// end of if
    con.close();  
    }catch(Exception e){out.print("<p>ERROR, YOU BETTER RUN!</p>");}  
    }//end of else  
    %>  