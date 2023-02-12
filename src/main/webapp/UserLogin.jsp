<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Login</title>
<link rel="stylesheet" href="login.css">
</head>
<body>
	<div class="login-box">
		<h2>Login</h2>
		<form action="./logdata" method="post">
			<div class="user-box">
				<input type="text" name="un1" required=""> <label>Username</label>
			</div>
			<div class="user-box">
				<input type="password" name="pass" required=""> <label>Password</label>
				${message}
			</div>
			<center>
				<a href="OptionPage.jsp"> <span></span> <span></span> <span></span>
					<span></span> <input type="submit" value="Log In">
				</a> <br>
				<p style="margin-top: 31px; margin-bottom: 0px; color: #fff;">Don't
					have a account?</p>
				<br> <a href="UserReg.jsp"> <span></span> <span></span> <span></span>
					<span></span> Register 
			</center>
		</form>
	</div>
</body>
</html>