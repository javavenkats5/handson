
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<%@ page isELIgnored="false"%>
</head>


<body>
<form action="manageUser.htm" method="POST">
	<table border="1" width="800px;" style="align:center;">
	<tr><td>
		<table style="padding-left:300px;">
			<tr><td height="50px;"></td><td>${msg}</td></tr>
			<tr><td height="50px;"></td><td>Welcome ${user.firstName} ${user.lastName}</td></tr>
			<tr><td height="50px;"></td><td>Select Options below</td></tr>
			
			<tr><td height="50px;"></td><td><a href="manageUser.htm?action=D">Delete User</a></td></tr>
			<tr><td height="50px;"></td><td><a href="manageUser.htm?action=U">Update User</a></td></tr>
			<tr><td height="50px;"></td><td><a href="manageUser.htm?action=A">Add User</a></td></tr>
		</table>
	</td></tr>
	</table>	
	</form>
</body>
</html>