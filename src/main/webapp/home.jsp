<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<html>
<head>
<title>RolesAndPermissions - Home</title>
</head>

<body>

<sec:authorize access="hasRole('Admin')">

	<a href="app/add">Add Hotel</a>

</sec:authorize>
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