<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="library.Data"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.Design{
color:white;
font-size:18px;
margin-left:15px;
}
</style>
</head>
<body>
<% Data obj=(Data)request.getAttribute("lib"); %>
<h1>Welcome to e-library <%out.print(' '+obj.getName()); %></h1>
<div style="background:black;height:50px;width:100%;padding-top:15px;">
<a class="Design" href="Home.jsp">Home</a>
<a class="Design" href="Book.jsp">Create New Book</a>
<a class="Design" href="View.jsp">View All Book</a>
</div>
</body>
</html>