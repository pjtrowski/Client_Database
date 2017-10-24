<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
    
	    <!-- jQuery -->
    <script src="js/jquery.js"></script>
    <script src="js/jquery.min.js"></script>
    <script src="js/jquery.js"></script>
    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>
	<script src="js/printCompany.js"></script>
    <script src="js/newCompanyContacts.js"></script>
	    
    <script src="js/editCompany.js"></script>
    <script src="js/editContacts.js"></script>
    <script src="js/newCompanyExist.js"></script>
     

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

<!-- Main container -->
<div class="container">
        <!-- Portfolio Heading -->
        <div class="row">
            <div class="col-lg-12">
                <h2 class="page-header">NEW ENTRY</h2>
            </div>
            <div class="col-lg-12" id="newentry">
           <form action="com.clientdb/DataCreate" method="post" name="createEntry" >
           
          <div class="col-md-3" id="newCompanyInfo">			 	
           <div class="form-group">
            <label for="company-name"  class="control-label">Company Name:</label>
            <input type="text" onBlur="newCompanyExist()" class="form-control"  name="newCompany" required >
          	<span id="existAlert"></span>
          </div>
          
           <div class="form-group">
            <label for="address" class="control-label">Address:</label>
            <input type="text" class="form-control" name="newStreet" placeholder="street">
           </div>
           <div id="newEntryCityStateZip" class="form-group">  
            <input type="text" class="form-control"  name="newCity" id="compNewCity"  placeholder="city">
            <input type="text" class="form-control"  name="newState" id="compNewState" placeholder="state">
            <input type="text" class="form-control"  name="newZip" id="compNewZip" placeholder="ZIP">
           </div>
            <div class="form-group">
            <label for="contact-name" class="control-label">Company Email:</label>
            <input type="text" class="form-control" name="newEmail" placeholder="Email">
          </div>
           <div class="form-group">
            <label for="phone" class="control-label">Company Phone:</label>
            <input type="text" class="form-control" name="newPhone" placeholder="Phone">
          </div>
           <div class="form-group">
            <label for="fax" class="control-label">Company Fax:</label>
            <input type="text" class="form-control" name="newFax" placeholder="Fax">
          </div>   
           </div>
               
           <div class="col-md-9">
      	    	<table class="table" id="newCompanyContact">
      	    	<thead>
      	    	<button id="add_row" class="btn btn-success pull-right" style="margin-right:1%;">Add Row</button>
      	    	</thead>
      	    	<label for="company-name"  class="control-label" style="margin-left:1%;">Contacts:</label>
				<tbody>
					<tr id='addr0'>
						<td>
						1
						</td>
						<td>
						<input type="text" name="newName0" placeholder='Name' class="form-control"/>
						</td>
						<td>
						<input type="text" name='newPhone0' placeholder='Phone' class="form-control"/>
						</td>
						<td>
						<input type="text" name='newEmail0' placeholder='Email' class="form-control"/>
						</td>
					</tr>
                    <tr id='addr1'></tr>
				</tbody>
				
			</table>
			<div>
				<button id="delete_row" class="pull-right btn btn-danger" style="margin-right:1%;">Delete Row</button>
			</div><br>
			<div id="newCompanyNotes">
			<label for="company-name"  class="control-label">Notes:</label>
			<textarea class="form-control" name="newNotes" style="width:100%;height:200px"></textarea>
			</div>
			<p id="notesWarning">Timestemp and user signature will upload automaticly</p>
 		   <div>
				<button type="submit" value="submit"  class="btn btn-primary pull-right" style="margin-right:1%;margin-bottom:2%;">SAVE</button>
			</div>
 		   </div>
 		   </form>
 		   </div>
 		   
       </div>
</div>

    <!-- /.container -->


</body>
  <footer>
            <div class="row">
                <div class="col-lg-12">
                    <p id="footerfont">Copyright &copy; PJ TROWSKI 2017</p>
                </div>
            </div>
  </footer>
</html>
