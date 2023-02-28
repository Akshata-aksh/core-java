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
				src="C:\Users\Sridevi\Downloads\download perfume.png"
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

<form action="searchbycompany" method="get">
<pre>
Search By company<input type="text" name="company"/>
            <input type="submit" value="Search" class="btn btn-secondary"/>
</pre>
</form>
<div>

<table>
<tr>
<th>ID</th>
<th>Company</th>
<th>Name</th>
<th>Cost</th>
<th>Type</th>
<th>Country</th>
</tr>

<c:forEach items="${list}" var="t">
<tr>
<td>${t.id}</td>
<td>${t.company}</td>
<td>${t.name}</td>
<td>${t.cost}</td>
<td>${t.type}</td>
<td>${t.country}</td>
</tr>
</c:forEach>
</table>

</div>
</body>
</html>