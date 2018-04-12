<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>
<%@ page import="ua.kpi.tef.model.Photos" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <meta charset = "utf-8">
    <title>Servlet</title>
    <link rel="stylesheet" type="text/css" href = "style.css">

    <script type="text/javascript">
        function redirect(){
            window.location="servlet";
        }
    </script>
</head>
<body onload=redirect()>

</body>
</html>





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

