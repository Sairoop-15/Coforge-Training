<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String name = "Sai";
	int a = 10;
	int b = 20;
	%>

	<!-- JSP Scriptlet Tag -->
	<%
	out.println("<font color = 'green'><h1>Welcome Sai</h1</font> </br>");
	if (a > b)
		out.println("A is big </br>");
	else
		out.println("B is big </br>");

	int sum = a + b;
	%>
	<!-- JSP Expression Tag -->
	Sum = <%=sum%>


</body>
</html>