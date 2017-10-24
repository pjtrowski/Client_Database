<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>CLIENT DB</title>
    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/bootstrap.css" rel="stylesheet">
    
    <!-- Custom CSS -->
    <link href="css/main.css" rel="stylesheet">
    <!-- Custom Fonts -->
    <!-- link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">-->
    <link href="https://fonts.googleapis.com/css?family=Ubuntu" rel="stylesheet">
    
     <script src="js/editCompany.js"></script>
     <script src="js/editContacts.js"></script>
     <script src="js/printCompany.js"></script>
     <script src="js/editContactsAddInput.js"></script>
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]--> 
</head>
<body>
<%
//allow access only if session exists
String user = null;
if(session.getAttribute("currentSessionUser") == null){
	response.sendRedirect("login.html");
}else user = (String) session.getAttribute("currentSessionUser");
String userName = null;
String sessionID = null;
String type=(String)session.getAttribute("currentSessionUserType");
Cookie[] cookies = request.getCookies();
if(cookies !=null){
for(Cookie cookie : cookies)
	{
		if(cookie.getName().equals("user")) 
			userName = cookie.getValue();
		if(cookie.getName().equals("SessionID")) 
			sessionID = cookie.getValue();
	}
}else{
	sessionID = session.getId();
}
%>
<c:set var="userType" value="<%=type %>"/>
    <!-- Navigation Bar-->
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation"> 
        <div class="container">
 				<!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.jsp">HOME</a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <c:choose>
                    <c:when test="${userType=='Admin'||userType=='Write'}">
                     <li>
                        <a href="newentry.jsp">New Entry</a>
                    </li>
                    </c:when>
                    <c:otherwise></c:otherwise>
                    </c:choose>
                    <li>
                        <a href="contact.html">Other</a>
                    </li>
                    <c:choose >
                    <c:when test="${userType=='Admin'}">
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" style="background-color:#00447C" data-toggle="dropdown">Admin<b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li>
                                <a href="UserAdmin.do">Users</a>
                            </li>
                            <li>
                                <a href="register.jsp">New User</a>
                            </li>
                            <li>
                                <a href="faq.html">FAQ</a>
                            </li>
                            <li>
                                <a href="404.html">404</a>
                            </li>
                            <li>
                                <a href="pricing.html">Pricing Table</a>
                            </li>
                    
                        </ul>
                    </li>
                    </c:when>
                    <c:otherwise>
                     <li class="dropdown" style="display:none">
                        <a href="#" class="dropdown-toggle" style="background-color:#00447C" data-toggle="dropdown">Admin<b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li>
                                <a href="UserAdmin.do">Users</a>
                            </li>
                            <li>
                                <a href="register.jsp">New User</a>
                            </li>
                            <li>
                                <a href="faq.html">FAQ</a>
                            </li>
                            <li>
                                <a href="404.html">404</a>
                            </li>
                            <li>
                                <a href="pricing.html">Pricing Table</a>
                            </li>
                        </ul>
                    </li>
                    </c:otherwise>
                    </c:choose>                
                     <li class="dropdown">
                        <a href="#" class="dropdown-toggle" style="background-color:#00447C" data-toggle="dropdown">Logged as: <%=user %><b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li style="display:flex;justify-content:center">
                            <form action="com.clientdb/Logout" method="post">
                                <button type="submit" value="submit"  class="btn btn-primary">LOGOUT</button>
                            </form>
                            </li>
                       </ul>
                    </li>
                </ul>
       		</div>
        </div>
        <!-- /.container -->
    </nav>
    <!-- Page Content -->
    <div class="container">
        <!-- Portfolio Heading -->
        <div class="row">
            <div class="col-lg-12">
                <h2 class="page-header">Portfolio Heading</h2>
            </div>
            <div class="col-lg-12">
           		<form class="navbar-form navbar-center" name="searchfield"style="padding-left:0px">
        			 <div class="form-group">
          				<input type="text" name="name" onkeyup="searchInfo()" class="form-control" placeholder="Company Name">
            		 </div>
      	  		</form>
      		</div>
      		<div class="col-lg-12">
            <div class="col-sm-4" style="margin-right:6px">  <!-- Table from SQL -->   
 				<div id="tableContent"></div>
           </div>   
            <div class="col-sm-8">
      	   		<div id="info"> </div>
 		   </div>
      		</div>
       </div>
	    <!-- Modal Start company info and notes-->
 <div class="modal fade" id="editCompany" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel">
  <div class="modal-dialog">
    <div class="modal-content" >
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="exampleModalLabel">EDIT INFO and NOTES</h4>
      </div>
      <div class="modal-body" id="company-info-body"></div> <!-- modal dynamic body created by editCompany.js  -->
      <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary" type="submit" value="submit">SAVE</button>
      </div>
    </div>
  </div>
</div>
 		<!-- Modal END company info and notes-->     
     
    <!-- Modal Start contacts info and edit-->
 <div class="modal fade" id="editContacts" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel">
  <div class="modal-dialog" style="width:61%">
  <div class="modal-content" >
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="exampleModalLabel">EDIT CONTACTS</h4>
      </div>
      <div class="modal-body" id="contacts-info-body"></div> <!--modal-body created by editContacts.js-->
      <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary" type="submit" value="submit">SAVE</button>
     </div>
    </div>
  </div>
</div>
 		<!-- Modal END contacts-->         
    </div>
    <!-- /.container -->
    <!-- jQuery -->
    <script src="js/jquery.js"></script>
    <script src="js/jquery.min.js"></script>
    <script src="js/jquery.js"></script>
    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>
    <!-- Custom JS -->
	<script src="js/showDetails.js"></script>
    <script src="js/searchCompany.js"></script>
</body>
  <footer>
            <div class="row">
                <div class="col-lg-12">
                    <p id="footerfont">Copyright &copy; PJ TROWSKI 2017</p>
                </div>
            </div>
  </footer>
</html>
