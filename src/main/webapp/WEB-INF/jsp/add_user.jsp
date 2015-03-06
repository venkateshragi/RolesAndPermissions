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
<form action="${context}/app/user/save" method="POST">
Name : <input type="text" name="username">
<br>
Password : <input type="password" name="password">
<input type="submit">
</form>

</body>
</html>