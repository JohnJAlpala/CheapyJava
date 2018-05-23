<%-- 
    Document   : lista
    Created on : 6/05/2018, 03:54:00 PM
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
                    <th scope="col">Nombre</th>
                    <th scope="col">Album</th>
                    <th scope="col">Artista</th>
                    <th scope="col">Genero</th>
                </tr>
            </thead>
            <tbody>
                
                <c:forEach items="${list.getCancion()}" var="cancion" varStatus="loop">
                    <tr>
                        <th scope="row">${cancion.getNombre()}</th>
                        <td> ${cancion.getAlbum().getNombre()} </td>
                        <td> ${cancion.getArtista().getNombre()}</td>
                        <td>${cancion.getGenero()}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
    <!-- End Table -->
    <jsp:include page="/parts/comentarios.jsp" />
</div>

<jsp:include page="/parts/footer.jsp" />

