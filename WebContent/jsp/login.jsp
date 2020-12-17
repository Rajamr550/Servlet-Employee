<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/style.css" />

</head>
<link href="https://unpkg.com/bootstrap@4.1.0/dist/css/bootstrap.min.css" rel="stylesheet"/>
<body>
    <div class="login">
        <h1>Welcome to the login page !</h1>
	
		<h3>Employee Login</h3>
           <form  method = "post" action = "/One/LoginProcess" autocomplete="on">

        <input type="hidden" name="choice" value="0" /> <br> <br>

		<div class="form-group">
		<label>email</label>
        <input type="email"  class="form-control" name="email"/> <br> <br>
        </div>
        <div class="form-group">
       	<label>password</label>
        <input type="password" class="form-control" name="pass" /> <br> <br>
        </div>
        <input type="submit" class= "btn btn-info" value="submit"  /> <br> <br>
        </form>
</div>

</body>
</html>