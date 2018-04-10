<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Success</title>
    <link rel="stylesheet" type="text/css" href = "style.css">
</head>
<body>
    <h3>Registration Successful!</h3>
    <h3><p>Your login: <c:out value="${requestScope.login}"/></p></h3>
    <h3><p>Your name: <c:out value="${requestScope.name}"/></p></h3>
</body>
</html>
