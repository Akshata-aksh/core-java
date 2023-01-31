<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h4>Page to send message</h4>

<form action="msg" method="post">
<pre>
FirstNamen <input type="text" name="fName"/>
LastName   <input type="text" name="lName"/>
Gender     <input type="radio" name="gender" value="male"/>male
           <input type="radio" name="gender" value="female"/>female
           <input type="radio" name="gender" value="other"/>other
Reason     <textarea rows="5" cols="25" name="reason"></textarea>
Address     <input type="text" name="address"/>
           <input type="submit" value="send">



</pre>

</form>

</body>
</html>