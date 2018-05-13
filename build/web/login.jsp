<%-- 
    Document   : Index
    Created on : 2/05/2018, 12:03:05 PM
    Author     : richard
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:include page="/parts/navbar.jsp"/>
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
                    Login
                </div>
                <div class="card-body">
                    <form action="action">
                        <div>
                            <div class="form-group">
                                <label for="loginInputEmail">Email: </label>
                                <input id="loginInputEmail" class="form-control" type="email" />
                            </div>
                            <div class="form-group">
                                <label for="loginInputPassword">Password:</label>
                                <input id="loginInputPassword" class="form-control" type="password" />
                            </div>
                            <div class="text-right">
                                <button type="submit" class="btn btn-primary">Login</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>

        </div>
        <div class="col-4"></div>
    </div>
</div>
<!-- FIN CONTAINER -->
<jsp:include page="/parts/footer.jsp" />
