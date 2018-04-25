<%@ page contentType="text/html;charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
用户列表
<br>
<c:forEach var="list" items="${list}">
    ${list.name}<br>
</c:forEach>
</body>
</html>
