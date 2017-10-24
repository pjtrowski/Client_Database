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

    <title>USERS LIST</title>
    <!-- Bootstrap Core CSS -->
    
    <link href="https://fonts.googleapis.com/css?family=Fira+Sans" rel="stylesheet">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/bootstrap.css" rel="stylesheet">
	<link href="https://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet"> 
 
    
    <!-- Custom CSS -->
    <link href="css/main.css" rel="stylesheet">
    <!-- Custom Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Ubuntu" rel="stylesheet">
   
     <!-- jQuery -->
	<script src="js/jquery.js"></script>
    <script src="js/jquery.min.js"></script>
    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>
    <script src="js/modalData.js"></script><!-- load info to modal for editing -->
 
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
Cookie[] cookies = request.getCookies();
if(cookies !=null){
for(Cookie cookie : cookies){
	if(cookie.getName().equals("user")) 
		userName = cookie.getValue();
	if(cookie.getName().equals("SessionID")) 
		sessionID = cookie.getValue();
}
}else{
	sessionID = session.getId();
}
%>

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
                    
                    <li>
                        <a href="newentry.jsp">New Entry</a>
                    </li>
                    <li>
                        <a href="contact.html">Other</a>
                    </li>
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
                    
                    
                     <li class="dropdown">
                        <a href="#" class="dropdown-toggle" style="background-color:#00447C" data-toggle="dropdown">You are login as: <%=user %><b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li style="display:flex;justify-content:center">
                            <form action="com.clientdb/Logout" method="post">
                                <button type="submit" value="submit"  class="btn btn-primary" style="display:block;margin-right:auto">LOGOUT</button>
                            </form>
                            </li>
                            
                    
                        </ul>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>

    <!-- Header Carousel -->
    <header id="myHeader" class="myHeader">
    </header>

    <!-- Page Content -->
    <div class="container"><br>
    <div class="row">
    <div class="col-lg-12">
    <!-- ADD NEW USER FORM -->
    <h3>Add User</h3>
   <table  class="table newuser" style="margin-top:20px;">
  <tbody>
     <form class="form-signin" action="com.clientdb/Register" method="post">
      <tr>
      <th>
        <label for="inputUsername" class="sr-only">Username</label>
        <input type="text" name="userName" id="inputuserName" class="form-control" placeholder="Username" required autofocus>
      </th>
      <th>  
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="text" name="userPass" id="inputPassword" class="form-control" placeholder="Password" required>
      </th>
      <th>
        <label for="inputFisrtName" class="sr-only">First Name</label>
        <input type="text" name="firstName" id="inputFirstName" class="form-control" placeholder="First Name" required>
      </th>
      <th>
        <label for="inputLastName" class="sr-only">LastName</label>
        <input type="text" name="lastName" id="inputLastName" class="form-control" placeholder="Last Name" required>
      </th>
      <th>
        <label for="inputEmail" class="sr-only">Email</label>
        <input type="email" name="userEmail" id="inputEmail" class="form-control" placeholder="Email address" required autofocus>
      </th>
      <th>
        <div class="form-group">
        <label class="sr-only" >User Type</label>
       <select class="form-control" style="width:auto;" name="userType">
      <option value="Admin">Admin</option>
      <option value="Read">Read</option>
      <option value="Write">Write</option>
       </select>
       </div>
       </th>
       <th>
        <button class="btn btn-primary" type="submit" value="register">Register</button>
        </th>
      </form>
      </tbody>
  </table>
      <!-- END OF ADD NEW USER FORM -->
      
      <!-- TABLE WITH LIST OF USERS -->
    <h3>List of Users</h3>
<table class="table table-hover listofusers"  style="margin-top:20px;">
  <thead>
    <tr>
      <th>Username</th>
      <th>Password</th>
      <th>First Name</th>
      <th>Last Name</th>
      <th>Email</th>
      <th>User Type</th>
      <th>Date Created</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${userList}" var="user">
    <tr>
      <td><c:out value="${user.username}"/></td>
      <td><c:out value="${user.password}"/></td>
      <td><c:out value="${user.firstname}"/></td>
      <td><c:out value="${user.lastname}"/></td>
      <td><c:out value="${user.email}"/></td>
      <td><c:out value="${user.usertype}"/></td>
      <td><c:out value="${user.datecreated}"/></td>
      <td>
      	<a role="button" class="btn btn-primary editButton" data-toggle="modal" data-target="#updateUser">EDIT</a>     
		<a href="DeleteUser.do?email=${user.email}" role="button" class="btn btn-danger">DELETE</a>	      
      </td>
    </tr>
  </c:forEach>
  </tbody>
</table>
	<!-- END OF TABLE WITH USERS -->
  </div>
  </div>
  <!-- temp modal -->
  <div class="modal fade" id="updateUser" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content"></div>
    </div>
    <div class="modal-dialog">
        <div class="modal-content"></div>
    </div>
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true" class="">×</span><span class="sr-only">Close</span>
                </button>
                 <h4 class="modal-title" id="myModalLabel">Edit User</h4>
            </div>
            <div class="modal-body"></div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">CLOSE</button>
                <button type="button" class="btn btn-primary" type="submit">SAVE</button>
            </div>
        </div>
    </div>
</div>
  
  
  <!-- end temp modal -->

    </div>
    <!-- /.container -->
</body>
        <!-- Footer -->
        <footer>
             <div class="row">
                <div class="col-lg-12">
                    <p id="footerfont">Copyright &copy; PJ TROWSKI 2017</p>
                </div>
            </div>
        </footer>
</html>
