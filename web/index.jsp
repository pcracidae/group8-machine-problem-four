<%-- 
    Document   : index
    Created on : Nov 23, 2026, 7:49:27 AM
    Author     : Gabriel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Login</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css">
</head>
<body>
     <!-- header-->
    <%@ include file="/WEB-INF/header.jsp" %>
    
    <main>
    <form action="LoginServlet" method="post">
        <div class="container">
            <h2>Login</h2>
            
            <hr>
            
            <input type="text" name="username" placeholder="Username">
            <input type="password" name="password" placeholder="Password">
            <button class="btn login" type="submit">Login</button>
        </div>
    </form>
    </main>
    
    <!-- footer-->
    <%@ include file="/WEB-INF/footer.jsp" %>
</body>
</html>
