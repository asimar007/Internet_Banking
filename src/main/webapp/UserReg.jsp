<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Register</title>
<link rel="stylesheet" href="login.css">
</head>
<body>
	<div class="login-box">
		<h2>Registration Form</h2>
		<form action="./regdata" method="post">
			<div class="user-box">
				<input type="text" name="un1" required=""> <label>Enter
					Username</label>
			</div>
			<div class="user-box">
				<input type="password" name="pass" required=""> <label>Enter
					Password</label>
			</div>
			<div class="user-box">
				<input type="text" name="mno1" required=""> <label>Enter
					Mobile No</label>
			</div>
			<center>
				<a style="padding-bottom: 20px;" href=""> <span></span> <span></span>
					<span></span> <span></span> <input type="submit" value="Register">
				</a>
			</center>
			<br>
			<center>
				<p style="margin-top: 20px; margin-bottom: 0px; color: #fff;">
					Already have a account?</p>
				<br> <a href="UserLogin.jsp"> <span></span> <span></span> <span></span>
					<span></span> Log In 
			</center>

		</form>
	</div>
</body>
</html>