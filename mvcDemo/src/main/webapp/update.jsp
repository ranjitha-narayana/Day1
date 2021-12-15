<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html; charset=ISO-8859-1"%>
<html>
<head>
<body>
<h2>
<h3>Hai Enter Employee details</h3>
<table>
<form action="save" method="post"><tr>
<tr><td>Enter id::<input type="number" name="id" value="${id}"></td></tr>
<tr><td>Enter name::<input type="text" name="name"/></td></tr>
<tr><td>Enter Designation::<input type="text" name="desig"/></td></tr>
<tr><td><input type="submit" value="update"/></td></tr>
</tr>

</form>
</table>
</h2>
</body>
</html>