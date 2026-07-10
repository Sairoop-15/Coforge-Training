<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="FactorialInput.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Factorial Output</title>
</head>
<body>
<!-- 
	Factorial of
	<%=request.getParameter("n")%>
	is
	<%=request.getParameter("fact")%>
	-->
	
		Factorial of
	<%=request.getAttribute("n")%>
	is
	<%=request.getAttribute("fact")%>

</body>
</html>