<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/style.css" />

<style type="text/css">
body{
font-size:20px;
color:black;
}

h2{
font-size:20px;
color:black;
}

</style>



</head>
<link href="https://unpkg.com/bootstrap@4.1.0/dist/css/bootstrap.min.css" rel="stylesheet"/>

<body>

<div class="login">


	<div class="jumbotron">

    First Name:<%= session.getAttribute("fname") %><br>
	Last Name:<%= session.getAttribute("lname") %><br>
	Age:<%= session.getAttribute("age") %><br>
	Mobile:<%= session.getAttribute("mobile") %><br>
	<a href="/One/jsp/edit.jsp"><button class="btn btn-info">Edit</button></a><br>
	
	</div>
	
	</div>
</body>
</html>