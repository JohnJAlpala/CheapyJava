<%-- 
    Document   : crear-listas
    Created on : 22/05/2018, 10:17:19 AM
    Author     : richard
--%>

<%@page import="models.Mensaje"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/parts/header.jsp" />
<div class="container">
    <div class="row">
        <div class="col-2"></div>
        <div class="col-8">      
            <div class="card center-item">
                <div class="card-header">
                    <%=Mensaje.getMensajes().get("Registration")%>
                </div>
                <div class="card-body">
                    <form action="${pageContext.request.contextPath}/lista" method="POST">
                        <div class="form-group">
                            <label for="listNombre"><%=Mensaje.getMensajes().get("list")%></label>
                            <input type="text" class="form-control" id="listNombre" placeholder="Nombre" name="listNombre" required/>
                        </div>
                        <div class="form-group">
                            <label for="listDescripcion"><%=Mensaje.getMensajes().get("list")%></label>
                            <input type="text" class="form-control" id="listDescripcion" placeholder="Descripción" name="listDescripcion" required/>
                        </div>
                        <div class="form-group">
                            <label for="selector">Publicidad</label>
                            <select id="selector" class="form-control" name="listPublica">
                                <option value="publico">Publico</option>
                                <option value="privado">Privado</option>
                            </select>
                        </div>
                        <div class="row table-padding">
                            <label for="table"> Canciones: </label>
                            <table class="table">
                                <thead class="thead-dark">
                                    <tr>
                                        <th scope="col"><%=Mensaje.getMensajes().get("Song")%></th>
                                        <th scope="col"><%=Mensaje.getMensajes().get("Artist")%></th>
                                        <th scope="col"><%=Mensaje.getMensajes().get("Album")%></th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach items="${listaReproduccionCreacion}" var="cancion" varStatus="loop">
                                    <tr>
                                        <td> ${cancion.getNombre()} </td>
                                        <td> ${cancion.getArtista().getNombre()}</td>
                                        <td> ${cancion.getAlbum().getNombre()}</td>
                                    </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                        </div>
                        <button class="btn btn-success" type="submit" name="accion" value="crear">Crear Lista</button>
                    </form>
                </div>
            </div>
        </div>
        <div class="col-2"></div>
    </div>
</div>
<jsp:include page="/parts/footer.jsp" />