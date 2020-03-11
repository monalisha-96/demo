<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Add Books</h1>
<form action="Controller" method="post">
Name:<input type="text" name="name" placeholder="Enter book name" required><br/><br/>
Author Name:<input type="text" name="author" placeholder="Enter author name" required><br/><br/>
Call Number:<input type="text" name="callno" placeholder="Enter call number" required><br/><br/>
<button name="submit" value="addBook">submit</button>
</form>
</body>
</html>