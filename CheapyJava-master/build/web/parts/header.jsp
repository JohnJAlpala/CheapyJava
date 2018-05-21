<%-- 
    Document   : header
    Created on : 17/05/2018, 11:33:29 PM
    Author     : JOHNY
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
                <a class="btn btn-success" href="${pageContext.request.contextPath}/ayuda">Ayuda y soporte</a>
                <a class="btn btn-success" href="${pageContext.request.contextPath}/lista">PlayList</a>
                <a class="btn btn-success" href="${pageContext.request.contextPath}/cambiar nombre">Cambiar clave</a>
                <a class="btn btn-outline-secondary" href="${pageContext.request.contextPath}/login">Sign out</a>
            </div>
        </nav>