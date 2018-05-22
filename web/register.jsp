<%-- 
    Document   : register
    Created on : 6/05/2018, 01:47:45 PM
    Author     : richard
--%>


<%@page import="models.Mensaje"%>
<jsp:include page="/parts/header.jsp"/>
<div class="container">
    <div class="row">
        <div class="col-3"></div>
        <div class="col-6">      
            <div class="card center-item">
                <div class="card-header">
                    <%=Mensaje.getMensajes().get("Registration")%>
                </div>
                <div class="card-body">
                    <form action="${pageContext.request.contextPath}/register" method="POST">
                        <div class="form-group">
                            <label for="usernameRegister"><%=Mensaje.getMensajes().get("UserName")%></label>
                            <input type="text" class="form-control" id="usernameRegister" placeholder="User name" name="usernameRegister" required/>
                        </div>
                        <div class="form-group">
                            <label for="emailRegister"><%=Mensaje.getMensajes().get("EMAIL")%></label>
                            <input type="email" class="form-control" id="emailRegister" placeholder="example@gmail.com" name="emailRegister" required/>
                        </div>
                        <div class="form-group">
                            <label for="passwordRegister"><%=Mensaje.getMensajes().get("Password")%></label>
                            <input type="password" class="form-control" id="passwordRegister" placeholder="Password" name="passwordRegister" required/>
                        </div>
                        <div class="text-right">
                            <button type="submit" class="btn btn-primary"><%=Mensaje.getMensajes().get("Register")%> </button>
                        </div>
                        <c:if test="${!ingreso}">
                            <p>
                                <label><b><c:out value = "${respuesta}"/></b></label>
                            </p>
                        </c:if>
                    </form>
                            <p><%=Mensaje.getMensajes().get("RegisterQuestion")%> <a href="login.jsp"><%=Mensaje.getMensajes().get("LogIn")%></a></p>
                </div>
            </div>
        </div>
        <div class="col-3"></div>
    </div>
</div>
<jsp:include page="/parts/footer.jsp" />