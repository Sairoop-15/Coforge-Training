<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1><font color = 'green'>Welcome <%= session.getAttribute("username") %></font></h1>
<%
Cookie[] cookies = request.getCookies();
out.println("<h1><font color = 'green'>Welcome " + cookies[0].getValue() +  "</font></h1> ");

%>

</body>
</html>