<%@page import="com.te.springMvc.model.Register"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%  Register reg=(Register) request.getAttribute("details"); %>
<h1 style ="color:blue"> <%=reg.getName() %> successfully registered</h1>
<h1> number= <%=reg.getNumber() %></h1>
<h1>email= <%=reg.getMail() %></h1>
<h1>address =<%=reg.getAddress() %></h1>
</body>
</html>