<%-- 
    Document   : navbar
    Created on : 5/05/2018, 04:29:10 PM
    Author     : richard
--%>

<%@page import="models.Mensaje"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <link rel="shortcut icon" type="image/x-icon" href="https://e-cdns-files.dzcdn.net/cache/images/common/favicon/favicon.8a0b99d601c22e9d77e0e74eaa1da941.ico">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cheapify</title>
       
        <style>
            
            body{
                font-family: monospace;
            }
            
            img.centro{
                display: block;
                margin-top: 10px;
                margin-bottom: 10px;
                margin-left: 40%;
                margin-right: auto;
            }
            
            .btn{
                background-color: black;
            }
            
            .pull-right{
                    margin-top: 0px;
                    margin-right: 9%;
            }
            
            
        </style>
    </head>
    <body>
        <!-- INICIO NAVBAR -->
        <nav class="navbar navbar-dark bg-dark">
            <a class="navbar-brand" href="${pageContext.request.contextPath}">Cheapyfy</a>
            <div>
                <!--<a class="btn btn-success" href="${pageContext.request.contextPath}/register">Register</a>-->
                <a class="btn btn-success" href="index.jsp">Inicio</a>
            </div>
        </nav>
    <a href="index.jsp"><img class="centro" src="image/logo Cheapify2.png" style="width:20%; height:auto; object-fit:cover;" alt="Zoof"></a>
    <div class="container text-center" style="width:100%; font-family: monospace; margin-top: 10px;">
        <h1><b><%=Mensaje.getMensajes().get("Indexwelcome")%></b></h1>
    </div>
    <div class="text-center" >
        <form method="GET" action="./Index">
                <div class="btn-group">
                    
                    <button type="submit" class="btn btn-primary btn-lg" name ="accion" value="Registrar">Registrar</button>
                    <button type="submit" class="btn btn-primary btn-lg" name ="accion" value="Iniciar sesion">Iniciar sesion</button>
                    <button onclick="myFunction()" type="submit" class="btn btn-primary btn-lg" name ="accion" value="ficticios">Datos ficticios</button>
                    
                    <script>
                        function myFunction() {
                            alert('Se han creado datos ficticios');
                        }
                    </script>
                </div>
            </form>
        </div>
    </body>
                
        <!-- END NAVBAR -->
