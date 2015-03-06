<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<html>
<head>
<title>
Add Resource
</title>
</head>

<body>
<c:set var="context" value="${pageContext.request.contextPath}" />
<form action="${context}/app/user/save" method="POST">
Name : <input type="text" name="name">
<br>
Password : <input type="password">
<input type="submit">
</form>

</body>
</html>