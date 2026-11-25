<%-- 
    Document   : error
    Created on : 10 25, 26, 1:10:53 PM
    Author     : LORENZO BARROS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login Error</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css">
</head>
<body>
    <!-- header-->
    <%@ include file="/WEB-INF/header.jsp" %>
    
    <main>
    <div class="container">
    <h2>Login Failed</h2>
    
    <hr>
    
    <p>${errorMessage}</p>
    <a href="index.jsp">Try again</a>
    </div>
    </main>
    
    <!-- footer-->
    <%@ include file="/WEB-INF/footer.jsp" %>
</body>
</html>
