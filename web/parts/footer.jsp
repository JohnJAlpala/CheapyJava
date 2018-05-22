<%-- 
    Document   : footer
    Created on : 5/05/2018, 04:33:30 PM
    Author     : richard
--%>

<%@page import="models.Mensaje"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
    <link type="text/css"  rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.12/css/all.css" integrity="sha384-G0fIWCsCzJIMAVNQPfjH08cyYaUtMwjJwqiRKxxE/rx96Uroj1BtIQ6MLJuheaO9" crossorigin="anonymous">
    <script src="${pageContext.request.contextPath}/js/app.js" > </script>
    </body>
    <footer>
        <%=Mensaje.getMensajes().get("Footer")%>
    </footer>
    <style>
            footer{
                background-color: #212529!important;
                color: white;
                text-align: center;
                margin-top: 30px;
                height: 50px;
                width: 100%;
                font-size: 16px;
                font-family: monospace;
                padding-top: 10px;
            }
    </style>    
        
</html>
