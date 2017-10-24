<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>Welcome to sign in page</title>
    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->

    <!-- Custom styles for this template -->
    <link href="css/style.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="js/bootstrap.js/"></script>
    <script src="js/bootstrap.mini.js/"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>

   <div class="container">
	 <div class=col-6>
      <form class="form-signin" action="com.clientdb/Register" method="post">
        <h2 class="form-signin-heading">Please register</h2>
        <label for="inputUsername" class="sr-only">Username</label>
        <input type="text" name="userName" id="inputuserName" class="form-control" placeholder="Username" required autofocus>
        
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" name="userPass" id="inputPassword" class="form-control" placeholder="Password" required>
        
        <label for="inputFisrtName" class="sr-only">First Name</label>
        <input type="text" name="firstName" id="inputFirstName" class="form-control" placeholder="First Name" required>
       
        <label for="inputLastName" class="sr-only">LastName</label>
        <input type="text" name="lastName" id="inputLastName" class="form-control" placeholder="Last Name" required>
        
        <label for="inputEmail" class="sr-only">Email</label>
        <input type="email" name="userEmail" id="inputEmail" class="form-control" placeholder="Email address" required autofocus>
        
        <div class="form-group">
        <label for="userType" class="sr-only">User Type</label>
       <select class="form-control" name="userType">
      <option value="Admin">Admin</option>
      <option value="Read">Read</option>
      <option value="Write">Write</option>
       </select>
       </div>
        
        <button class="btn btn-lg btn-primary btn-block" type="submit" value="register">Register</button>
      </form>
	</div>
    </div> <!-- /container -->
  </body>
</html>
