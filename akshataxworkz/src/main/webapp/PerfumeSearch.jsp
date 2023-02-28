<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
                        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
<script

	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
	crossorigin="anonymous"></script>
</head>
<body  style="color:blue">
<nav class="navbar navbar-light bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"> <img
				src="  https://w7.pngwing.com/pngs/499/882/png-transparent-delhi-air-india-limited-airline-logo-others-thumbnail.png"
				alt="" width="85" height="50" class="d-inline-block align text-top">
			</a> 
			<a href="index.jsp">Home</a>
		</div>
	</nav>
	
<h3>Welcome to Perfume success</h3>
<h4>
<span style="color: red;">${message }
</span>
</h4>

<form action="perfumesearch" method="get">
<pre>
Search By id<input type="text" name="id" value="${dto.id }"/>
            <input type="submit" value="Search" class="btn btn-secondary"/>
</pre>
</form>
<div>
<h3>Search Results...</h3>
Company:${dto.company}<br>
Name:${dto.name}<br>
Cost:${dto.cost}<br>
Type:${dto.type}<br>
Country:${dto.country}<br>

</div>
</body>
</html>