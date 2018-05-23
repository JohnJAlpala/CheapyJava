<%-- 
    Document   : listas
    Created on : 6/05/2018, 04:00:17 PM
    Author     : richard
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/parts/header.jsp" />

<div class="container">
    <div class="row">
        <!-- Start Table -->
        <table class="table center-item">
            <thead class="thead-dark">
                <tr>
                    <th scope="col">nombre</th>
                    <th scope="col">Descripcion</th>
                    <th scope="col">Naturaleza</th>
                    <th scope="col">Creador</th>
                    <th scope="col">Ver más</th>
                </tr>
            </thead>
            <tbody>
¡                <c:forEach items="${playlist}" var="list" varStatus="loop">
                    <c:if test="${list.getCreador().equals(usuario)}">
                    <th scope="row">${list.getNombre()}</th>
                        <td> ${list.getDescripcion()} </td>
                        <td> ${list.getPublica()}</td>
                        <td>${list.getCreador().getUsername()}</td>
                        <td>
                            <form action="${pageContext.request.contextPath}/lista" method="POST">
                                <input type="hidden" name="more" value="${loop.index}"/>
                                <button class="btn btn-primary btn-sm my-0" name="accion" value="more" type="submit">
                                    Ver más
                                </button>
                            </form>                  
                        </td>
                    </c:if>
                </c:forEach>             
                
            </tbody>
        </table>
    </div>
    <!-- End Table -->
</div>

<jsp:include page="/parts/footer.jsp" />
