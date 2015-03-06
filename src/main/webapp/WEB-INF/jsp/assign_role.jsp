<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<html>
<head>
<title>
Assign Role
</title>
</head>

<c:set var="context" value="${pageContext.request.contextPath}" />
<a href="${context}/j_spring_security_logout">Logout</a>
<a href="${context}/home.jsp">Home</a>

<body>
<c:set var="context" value="${pageContext.request.contextPath}" />
<form action="${context}/app/user/assign" method="POST">
Users : <select name="userId">
<c:forEach items="${users}" var="user">
<option value="${user.id}">${user.username}</option>
</c:forEach>
</select>
<br>
Roles : <select name="roleId">
<c:forEach items="${roles}" var="role">
<option value="${role.id}">${role.roleName}</option>
</c:forEach>
</select>
<input type="submit">
</form>

</body>
</html>

