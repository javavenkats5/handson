
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<%@ page isELIgnored="false"%>
</head>


<body>
	<form action="submitLogin.htm" method="POST">
	<table border="1" width="800px;" style="align:center;">
	<tr><td>
		<table style="padding-left:300px;">
			<tr><td height="50px;"></td><td>${msg}</td></tr>
			<tr><td height="50px;"></td><td>Login here.</td></tr>
			<tr><td>User Name: </td><td><input type="text" name="userId"> <br /></td></tr>
			<tr><td>Password: </td><td><input type="text" name="password" /></td></tr>
			<tr><td height="50px;"></td><td><input type="submit"	value="Submit Form" /></td></tr>
			<tr><td height="50px;"></td><td><font color="red" size="4"> ${errMsg}</font></td></tr>
		</table>
	</td></td></tr>
	</table>	
	</form>
</body>
</html>