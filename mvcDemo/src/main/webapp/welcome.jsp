<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html; charset=ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<body>
<h1> Hai Welcome ${Username}</h1>
<h2>
<h3>Hai Enter Employee details</h3>
<table>
<form action="save" align="center" method="post"><tr>
<tr><td>Enter id::<input type="number" name="id"/></td></tr>
<tr><td>Enter name::<input type="text" name="name"/></td></tr>
<tr><td>Enter Designation::<input type="text" name="desig"/></td></tr>
<tr><td><input type="submit" value="save"/></td></tr>
</tr>

</form>
</table>
</h2>
<h3>
<table>
<thead>
<tr>
<Th>Id</Th><Th>Name</Th><Th>Designation</Th>

</tr>
</thead>
<tbody>
<c:forEach items="${all}" var="list">
<tr><td>${list.id }</td>
<td>${list.name }</td>
<td>${list.desig}</td>
</tr>
</c:forEach>
</tbody>
</table>
</h3>
</body>
</head>
</html>