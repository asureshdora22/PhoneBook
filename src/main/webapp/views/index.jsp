<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
	body{
	background-color: skyblue;
	}
</style>
</head>
<body ><center>
<h1>Welcome to PhoneBook</h1></center>
<hr>
<u><h2>
Contact Info:</h2></u>
<font color="blue">${success}</font>
<font color="red">${ussuccess}</font>
<form:form action="/saveContact" method="post" modelAttribute="contact">
	<h3><table>
		<tr>
		<form:hidden path="c_Id"/>
		<td>Contact Name:</td>
			<td><form:input path="c_Name"/>
				
			</td>
		</tr>
		<tr><td>Contact Email:</td>
			<td><form:input path="c_Email"/></td>
		</tr>
		<tr><td>Contact Number:</td>
			<td><form:input path="c_Num"/></td>
		</tr>
		<tr>
		<td><input type="submit" value="save"></td>
		<td><input type="reset" value="clear"></td>
		</tr>
	
	</table></h3>
	
<h2><a href="/ContactList">View All Contacts</a></h2>

</form:form>
</body>
</html>