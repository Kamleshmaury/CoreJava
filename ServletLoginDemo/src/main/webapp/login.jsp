<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login page</title>
</head>
<body>
	<form action="LoginServlet" method="post">
		<h3>Enter Login details</h3>

		<table>
			<tr>
				<td>User Name:</td>
				<td><input type="text" name="usName" /></td>
			</tr>
			<tr>
				<td>User Password:</td>
				<td><input type="password" name="usPass" /></td>
			</tr>

		</table>

		<input type="submit" value="Login" />



	</form>
</body>
</html>