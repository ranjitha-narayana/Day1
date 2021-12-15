<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html; charset=ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>demo</title>
</head>
<body>

<h1> Hi Welcome!!!${username}</h1>
<h2>
<table>
<form action="save" align =center>
<tr><td> Enter Id:<input type="number" name=id></td></tr>
<tr><td> Enter Name:<input type="text" name=name></td></tr>
<tr><td> Enter Designation:<input type="text" name=desig></td></tr>
<tr><td> <input type="submit" name=save></td></tr>
</table>
</form>
</h2>
<h3> Hi ${emp.name} your designation is ${emp.desig}</h3>
</body>
</html>