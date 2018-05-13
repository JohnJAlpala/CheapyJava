<%-- 
    Document   : navbar
    Created on : 5/05/2018, 04:29:10 PM
    Author     : richard
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <!-- INICIO NAVBAR -->
        <nav class="navbar navbar-dark bg-dark">
            <a class="navbar-brand" href="${pageContext.request.contextPath}">Cheapyfy</a>
            <div>
                <a class="btn btn-success" href="${pageContext.request.contextPath}/register">Register</a>
                <a class="btn btn-outline-secondary" href="${pageContext.request.contextPath}/login">Login</a>
            </div>
        </nav>
        <!-- END NAVBAR -->
