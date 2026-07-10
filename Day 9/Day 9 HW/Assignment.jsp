<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.util.Date" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Assignment</title>
</head>
<body>

<%!
    // Declaration
    int num = 5;

    public int square(int n) {
        return n * n;
    }
%>

<!-- 1. Welcome Message -->
<h1 style="color:green;">Welcome to JSP</h1>
<hr>

<!-- 2. Current Date and Time -->
<h2>Current Date and Time</h2>
<p><%= new Date() %></p>
<hr>

<!-- 3. JSP Scripting Elements -->
<h2>JSP Scripting Elements</h2>

<%
    // Scriptlet
    int a = 10;
    int b = 20;
    int sum = a + b;
%>

<p>Sum = <%= sum %></p>
<p>Square of 5 = <%= square(5) %></p>

<hr>

<h2><b>Multiplication Table of 5</b></h2>

<%
for(int i = 1; i <= 10; i++) {
%>
<%= num %> × <%= i %>
 = <%= num * i %>
</br>
<%
}
%>

</body>
</html>