<%@ taglib prefix="с" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset = "utf-8">
    <title>Servlet</title>
    <link rel="stylesheet" type="text/css" href = "style.css">
</head>
<body>
<div class = "app">
    <div class = "photos"> </div>
    <div class = "menu">
        <form action="servlet" method = "get">
            <div class="b-f">
                <input type="button" name="back" value="<-">
                <input type="button" name="forward" value="->">
            </div>
            <input type="button" name="delete" value="Delete">
        </form>
    </div>
</div>
</body>
<%--<body>
<с:if test = '${requestScope.error_msg != null}'>
    <div style = "color: red"><h3><с:out value = '${requestScope.error_msg}'/></h3></div><hr>
</с:if>
<div class = "register">
    <form action ="servlet" method="post">
        <input type="text" placeholder="login" name="login"><br/>
        <input type="text" placeholder="name" name="name"><br/>
        <input type="submit" value="Sign up"><br/>
    </form>
</div>
</body>--%>
</html>
