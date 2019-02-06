<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Details Table</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>
<body>
	<h1>Student Details Table</h1>
	<table border=1>
		<tr>
			<th>RollNo</th>
			<th>Name</th>
			<th>Age</th>
			<th>ClassName</th>
			<th>Actions
			</th>
		</tr>
		<c:forEach var="student" items="${student}">
                <tr>
                    <td><c:out value="${studentList.rollNo}" /></td>
                    <td><c:out value="${studentList.name}" /></td>
                    <td><c:out value="${studentList.age}" /></td>
                    <td><c:out value="${studentList.className}" /></td>
                    <td><a href="" type="button">Edit</a></td>
					<td><a href="" type="button">Delete</a></td>
                </tr>
			</c:forEach>
			
	
	</table>
	<h1><a href="" type="button">Add new student details</a></h1>
</body>
</html>