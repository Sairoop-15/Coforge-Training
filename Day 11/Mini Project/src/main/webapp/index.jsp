<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Management System</title>
<link rel="stylesheet" href="EMSStyle.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="AjaxScript.js"></script>
</head>
<body>
	<div class="Header">
		<h1>Employee Management System</h1>
	</div>
	<br>
	<form action="EmployeeServlet" method="post">
		<div class="content p-5">
			<table>
				<tr>
					<td>Employee ID :</td>
					<td><input type="text" name="eid" id = "eid" placeholder="Employee ID"
						onblur="getEmployeeDetails()" /></td>
				</tr>
				<tr>
					<td>Employee Name :</td>
					<td><input type="text" name="ename" id="ename"/></td>
				</tr>
				<tr>
					<td>Employee Email :</td>
					<td><input type="text" name="email" id = "email"/></td>
				</tr>
				<tr>
					<td>Employee Salary :</td>
					<td><input type="text" name="salary" id = "salary"/></td>
				</tr>
				<tr>
					<td>Department Number :</td>
					<td><input type="text" name="dno" id = "dno"/></td>
				</tr>

			</table>
			<br> <input type="submit" value="Insert"
				class="m-5 btn btn-primary" name="emsbutton" /> <input type="submit"
				value="Delete" class="btn btn-danger" name="emsbutton" /> <input
				type="submit" value="Update" class="btn btn-warning"
				name="emsbutton" /> <input type="submit" value="Find"
				class="btn btn-success" name="emsbutton" /> <input type="submit"
				value="FindAll" class="btn btn-info" name="emsbutton" /> <br>
		</div>
	</form>

	<div class="alert alert-primary">
		<font color="green"> <b>Result = <%=request.getParameter("result")%></b>
		</font>

	</div>

</body>
</html>