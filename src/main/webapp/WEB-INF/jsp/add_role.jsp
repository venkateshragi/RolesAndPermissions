<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<html>
<head>
<title>
Add Resource
</title>
</head>

<c:set var="context" value="${pageContext.request.contextPath}" />
<a href="${context}/j_spring_security_logout">Logout</a>
<a href="${context}/home.jsp">Home</a>

<body>
<c:set var="context" value="${pageContext.request.contextPath}" />
<form action="${context}/app/resource/save" method="POST">
Name : <input type="text" name="name">
<br>
Type : <select name="type">
<option value="HOTEL">HOTEL</option>
</select>
<input type="submit">
</form>

<table>
<tr>
<th>RoleName</th>
</tr>
<c:forEach items="${roles}" var="role" >
<tr>
<td>${role.roleName}</td>
</tr>
</c:forEach>
</table>