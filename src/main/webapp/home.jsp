<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<c:set var="context" value="${pageContext.request.contextPath}" />
<a href="${context}/j_spring_security_logout">Logout</a>
<br>
<html>
<head>
<title>RolesAndPermissions - Home</title>
</head>

<body>

<sec:authorize access="hasRole('CREATE_RESOURCE')">
	<a href="app/resource/add">Add Resource</a>
</sec:authorize>
<br>
<sec:authorize access="hasRole('CREATE_USER')">
	<a href="app/user/add">Add User</a>
</sec:authorize>
<sec:authorize access="hasRole('CREATE_ROLE')">
	<a href="app/role/add">Add Role</a>
</sec:authorize>
<sec:authorize access="hasRole('ASSIGN_ROLE')">
	<a href="app/user/assignRole">Assign Role</a>
</sec:authorize>
<br>
<a href="app/role/all">Roles</a>
<a href="app/permission/all">Permissions</a>
<br>

<br>
<table>
<tr>
<th>Hotel Name</th>
<th>No. Of Rooms</th>
</tr>
<c:forEach var="i" begin="1" end="5">
	<tr>
   <td>H${i}</td>
   <td>H${i}</td>
   </tr>
</c:forEach>
</table>

</body>
</html>