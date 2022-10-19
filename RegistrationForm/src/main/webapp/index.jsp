<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Form</title>
		
		<style>
			.container{
				width: 30%;
				border: 1px solid black;
				margin: auto;
				padding: 20px;
				font-size: 15px;
			}
		
			#myform table tr td input{
				font-size: 15px;
				
			}
		/*	body {
			background-color: purple;
			}
		*/
			
		</style>

</head>
<body>
	<div class="container">
		<h1>My Form</h1>
		<form id ="myform" action="RegistrationServlet" method="post">
			<table>
				<tr>
					<td>Enter Your Name : </td>
					<td> <input type ="text" name="name" placeholder="Enter here"></td>
				</tr>
				<tr>
					<td>Enter Your Password : </td>
					<td> <input type ="password" name="password" placeholder="Enter here"></td>
				</tr>
				<tr>
					<td>Enter Your Email : </td>
					<td> <input type ="email" name="email" placeholder="Enter here"></td>
				</tr>
				<tr>
					<td>Select Gender : </td>
					<td><input type="radio" name="gender" value="male">Male &nbsp; &nbsp;<input type="radio" name="gender" value="female">FeMale </td>
				</tr>
				
				<tr>
					<td>Select Your Course:</td>
					<td>
						<select name="course">
							<option value="java">Java</option>
							<option value="c++">C++</option>
							<option value="Spring">Spring</option>
							<option value="Mysql">MySql</option>
						</select>
					</td>
				</tr>
				
				<tr>
					<td style="text-align:right">
						<input type="checkbox" value="checked" name="condition"/>
					</td>
					<td>Agree Term and condition</td>
				</tr>
				<tr>
				
					<td>
						
					</td>
					<td> 
						<button type="submit">Register </button>
					 	<button type="reset">Reset </button>
					 </td>
				</tr>
			</table>
		
		</form>	
	</div>
</body>
</html>