<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
 rel="stylesheet" 
 integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
  crossorigin="anonymous">
 
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" 
 integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
  crossorigin="anonymous"></script>
 
</head>
<body  style="color:blue">
<nav class="navbar navbar-light bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#"> <img
    src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
    alt="" width="85" height="50" class="d-inline-block align-text-top">
    </a><a href="index.jsp">Home Page</a>
</div>
</nav>

	<h3>Display Bakery details: </h3>
	
	
		<label>Bakery name:          ${bdto.name}</label><br>
		<label>Bakery Owner Name:    ${bdto.ownerName}</label><br> 
		<label>Bakery Owner WifeName:${bdto.ownerWifeName}</label><br>
		<label>Bakery Owner Married: ${bdto.married}</label><br> 
		<label>Bakery Famous for :   ${bdto.famousFor}</label><br>
		<label>Bakery Since :        ${bdto.since}</label><br>
		</body>
</html>