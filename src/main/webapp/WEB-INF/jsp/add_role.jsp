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
<form action="${context}/app/role/save" method="POST">
Name : <input type="text" name="roleName">
<br>
Type : <select name="permissions" multiple="multiple" >
<c:forEach items="${permissions}" var="permission">
<option value="${permission.id}">${permission.name}</option>
</c:forEach>
</select>
<input type="submit">
</form>