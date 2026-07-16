<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<h2 align="center">Product Management System</h2>

	<form action="product" method="post">

		<table align="center">

			<tr>

				<td>Product ID</td>

				<td><input type="text" name="productId" /></td>

			</tr>

			<tr>

				<td>Product Name</td>

				<td><input type="text" name="productName"/></td>

			</tr>

			<tr>

				<td>Price</td>

				<td><input type="text" name="productPrice" /></td>

			</tr>

			<tr>

				<td>Quantity</td>

				<td><input type="text" name="productQuantity" /></td>

			</tr>

		</table>

		<br>

		<center>

			<input type="submit" name="Insert" value="Insert"
				class="btn btn-primary"> <input type="submit" name="Delete"
				value="Delete" class="btn btn-danger"> <input type="submit"
				name="Update" value="Update" class="btn btn-success"> <input
				type="submit" name="Find" value="Find" class="btn btn-info">

			<input type="submit" name="FindAll" value="FindAll"
				class="btn btn-warning">

		</center>

	</form>

	<b>${result}</b>
</body>
</html>