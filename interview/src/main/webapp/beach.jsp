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
<body  style="color:red">
<nav class="navbar navbar-light bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#"> <img
    src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
    alt="" width="80" height="48" class="d-inline-block align-text-top">
    </a>
    <a href="index.jsp">home</a>
    </div>
    </nav>
    <h1>Welcome to Beach</h1>
    <form action="water" method="post">
    <pre>
    Name <input type="text" name="name">
    location <input type="text" name="location">
    games <input type="text" name="games">
    clean yes <input type="radio" name="clean" value="true">
          no <input type="radio" name="clean" value="false">
        
        <input type="submit" value="go to beach" class="btn btn=dark">
    
     </pre>
    
    </form>
    
</body>
</html>