<%-- 
    Document   : Index
    Created on : 2/05/2018, 12:03:05 PM
    Author     : richard
--%>

<%@page import="models.Mensaje"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:include page="/parts/header.jsp"/>
<!-- INICIO BODY -->
<div class="container">
    <div class="row">
        <div class="col-4"> </div>
        <div class="col-4">
            <c:if test="${loginAdmin != null}">
                <div class="alert alert-warning center-item" style="text-align: center">
                    ${loginAdmin}
                </div>
            </c:if>
            <div class="card center-item">
                <div class="card-header">
                    <%=Mensaje.getMensajes().get("LogIn")%>
                </div>
                <div class="card-body">
                    <form action="action">
                        <div>
                            <div class="form-group">
                                <label for="loginInputEmail"><%=Mensaje.getMensajes().get("EMAIL")%></label>
                                <input id="loginInputEmail" class="form-control" type="email" name="loginInputEmail"/>
                            </div>
                            <div class="form-group">
                                <label for="loginInputPassword"><%=Mensaje.getMensajes().get("Password")%></label>
                                <input id="loginInputPassword" class="form-control" type="password" name="loginInputPassword" />
                            </div>
                            <div class="text-right">
                                <button type="submit" class="btn btn-primary" ><%=Mensaje.getMensajes().get("LogIn")%></button>
                               
                            </div>
                             <c:if test="${!ingreso}">
                                <p>
                                    <label><b><c:out value = "${respuesta}"/></b></label>
                                </p>
                            </c:if>

                        </div>
                    </form>
                    <p ><%=Mensaje.getMensajes().get("LoginQuestion")%><a href="register.jsp"><%=Mensaje.getMensajes().get("Registration")%> </a></p>
                </div>
            </div>

        </div>
        <div class="col-4"></div>
    </div>
</div>
<!-- FIN CONTAINER -->
<jsp:include page="/parts/footer.jsp" />
