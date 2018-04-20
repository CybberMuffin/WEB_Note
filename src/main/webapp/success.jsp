
<%@ page import="ua.kpi.tef.controller.command.DisplayImage" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="с" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Success</title>
    <link rel="stylesheet" type="text/css" href = "style.css">
</head>
<body>
<% DisplayImage photos = (DisplayImage)request.getAttribute("photos"); %>
<div class = "app">
    <div class = "menu">
        <form action="${pageContext.request.contextPath}/servlet" method="post">
            <div class = "photos">
                <div style = "color: red"><h3><с:out value = '${requestScope.kek}'/></h3></div><hr>
                <%--<h2><%=photos.getFirstEntry().getKey()%></h2><br/>
                <h3><%=photos.getFirstEntry().getValue()%></h3>--%>
            </div>
            <form action="${pageContext.request.contextPath}/servlet"></form>
            <button type="button" name="back" value="<-">Back</button>

            <form action="${pageContext.request.contextPath}/app/forward"  method="post">
                <input type="submit" value="Forward">
            </form>

            <%--<button type="button" name="forward" value="->">Forward</button>--%>
            <button type="button" name="delete" value="Delete">Delete</button>
        </form>
    </div>
</div>
</body>
</html>





<%--<body>
    <h3>Registration Successful!</h3>
    <h3><p>Your login: <c:out value="${requestScope.login}"/></p></h3>
    <h3><p>Your name: <c:out value="${requestScope.name}"/></p></h3>
</body>--%>