
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
			<tr><td height="50px;"></td><td>Enter UserId to Delete.</td></tr>
			<tr><td>User Id: </td><td><input type="text" name="userId"> <br /></td></tr>
			<tr><td height="50px;"></td><td><input type="submit"	value="Delete" /></td></tr>
			<tr><td></td><td><input type="hidden"	name="action" value="DELETE_SUBMIT" /></td></tr>
			<tr><td height="50px;"></td><td><font color="red" size="4"> ${msg}</font></td></tr>
		</table>
	</td></td></tr>
	</table>	
	</form>
</body>
</html>