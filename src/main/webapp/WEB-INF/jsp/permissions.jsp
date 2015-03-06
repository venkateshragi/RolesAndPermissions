<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<html>
<head>
<title>
Roles
</title>
</head>

<c:set var="context" value="${pageContext.request.contextPath}" />
<a href="${context}/j_spring_security_logout">Logout</a>
<a href="${context}/home.jsp">Home</a>


<body>
<table>
<tr>
<th>Permission Name</th>
</tr>
<c:forEach items="${permissions}" var="permission">
<tr><td>${permission.name}</td></tr>
</c:forEach>

</table>
</body>