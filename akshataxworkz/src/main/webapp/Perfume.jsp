<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
                    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
<script

	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
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
			<a href="index.jsp">home</a>
		</div>
	</nav>
	
<h3>Welcome to Perfume data saving</h3>

<c:forEach items="${error}" var="e">
<span style="color:red;">${e.message}</span></br>
</c:forEach>
<form action="perfume" method="post">
<pre>
Company<input type="text" name="company" value="${dto.company }"/>
Name<input type="text" name="name" value="${dto.name }"/>
Cost<input type="text" name="cost" value="${dto.cost }"/>
Types<select name="type">
      <option value="">SELECT</option>
      <c:forEach items="${types}" var="t">
      <option value="${t}">${t}</option>
      </c:forEach>
</select>

Countries<select name="country">
     <option value="">SELECT</option>
     <c:forEach items="${countries}" var="c">
     <option value="${c}">${c}</option>
     </c:forEach>
 </select>
</pre>

<input type="submit" value="Save" class="btn btn-secondary"/>


</form>

</body>
</html>