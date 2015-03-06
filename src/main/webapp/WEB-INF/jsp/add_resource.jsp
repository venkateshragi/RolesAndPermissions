<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<html>
<head>
<title>
Add Resource
</title>
</head>

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
<th>ResourceName</th>
<th>Type</th>
</tr>
<c:forEach items="${resources}" var="resource" >
<tr>
<td>${resource.name}</td>
<td>${resource.resourceType}</td>
</tr>
</c:forEach>
</table>
</body>
</html>