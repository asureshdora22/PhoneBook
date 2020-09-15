<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
    
	body{
	background-color: skyblue;
	}
	
</style>
<script type="text/javascript">
function deleteConfirm(){
	return confirm("R U SURE , U WANT TO DELETE?");
}

</script>
</head>
<body>
<center>
<h1>Welcome to PhoneBook</h1></center>
<hr><h2>

<u><center>All Contacts</center></u> 

<p><font color="green">${deletecont}</font></p>
<a href="/addContactHyperlink">+Add New Contact</a>

<table border="2px" bgcolor="green" align="center">

	<tr>
		<th>ID</th>
		<th>Name</th>
		<th>Mail ID</th>
		<th>Contact Number</th>
		<th>Action</th>
	</tr>
	
	<c:forEach var="contact" items="${allcontact}">
	<tr>
	<td>${contact.c_Id}</td>
	<td>${contact.c_Name}</td>
	<td>${contact.c_Email}</td>
	<td>${contact.c_Num}</td>
	<td><a href="editContact?cid=${contact.c_Id}">Edit</a>
	<a href="deleteContact?cid=${contact.c_Id}" onclick="return deleteConfirm()">Delete</a></td>
	</tr>
	</c:forEach>
</table>
<hr>
</body>
</html>