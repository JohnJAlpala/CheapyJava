<%-- 
    Document   : index.jsp
    Created on : 5/05/2018, 03:55:41 PM
    Author     : richard
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="models.Mensaje"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="/parts/header.jsp" />

    

<div class="container">
    
    <!-- Start Table -->
    <c:if test="${listaReproduccionCreacion != null && listaReproduccionCreacion.size() > 0}">
    <div class="row table-padding">
        <table class="table">
            <thead class="thead-dark">
                <tr>
                    <th scope="col">#</th>
                    <th scope="col"><%=Mensaje.getMensajes().get("Song")%></th>
                    <th scope="col"><%=Mensaje.getMensajes().get("Artist")%></th>
                    <th scope="col"><%=Mensaje.getMensajes().get("Album")%></th>
                    <th scope="col">Action</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${listaReproduccionCreacion}" var="cancion" varStatus="loop">
                <tr>
                    <th scope="row">id</th>
                    <td> ${cancion.getNombre()} </td>
                    <td> ${cancion.getArtista().getNombre()}</td>
                    <td> ${cancion.getAlbum().getNombre()}</td>
                    <td>
                        <form action="${pageContext.request.contextPath}/Index" method="POST">
                            <input type="hidden" name="delete" value="${loop.index}"/>
                            <button class="btn btn-danger btn-rounded btn-sm my-0" type="submit">
                                <i class="fa fa-times"></i>
                            </button>
                        </form>                  
                    </td>
                </tr>
                </c:forEach>
                
            </tbody>
        </table>
    </div>
    <form method="POST" action="${pageContext.request.contextPath}/lista">
        <input name="accion" value="insertar" type="hidden" />
        <button type="submit" class="btn btn-success">Crear Playlist</button>   
    </form>
    </c:if>
    <!-- End Table -->
    <!-- Searchbar -->
    <div class="row">
        <div class="col-3"></div>
        <div class="col-6">
            <form action="${pageContext.request.contextPath}/Index" method="POST">
                <div class="input-group center-item">
                    <input type="text" class="form-control" id="txtSearch" name="txtSearch" placeholder="Busqueda"/>
                    <div class="input-group-append">
                        <button class="btn btn-outline-secondary" type="submit" id="searchButton" onclick="app.search()">
                            <i class="fas fa-search"></i>
                        </button>
                    </div>
                </div>
            </form>
            
        </div>
    </div>
    <!-- End Searchbar -->
    
    <!-- Start Table -->
    <c:if test="${solucion != null}">
    <br>
    <h3 class="text-center"><%=Mensaje.getMensajes().get("SearchResult")%></h3>
    <div class="row table-padding">
        <table class="table">
            <thead class="thead-dark">
                <tr>
                    <th scope="col">#</th>
                    <th scope="col"><%=Mensaje.getMensajes().get("Song")%></th>
                    <th scope="col"><%=Mensaje.getMensajes().get("Artist")%></th>
                    <th scope="col"><%=Mensaje.getMensajes().get("Album")%></th>
                    <th scope="col">Action</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${solucion}" var="cancion" varStatus="loop">
                     <tr>
                         <th scope="row"></th>
                         <td> ${cancion.getNombre()} </td>
                         <td> ${cancion.getArtista().getNombre()}</td>
                         <td> ${cancion.getAlbum().getNombre()}</td>
                         <td>
                             <form action="${pageContext.request.contextPath}/Index" method="POST">
                                 <input type="hidden" name="add" value="${loop.index}"/>
                                 <button class="btn btn-success btn-rounded btn-sm my-0" type="submit">
                                     <i class="fa fa-check"></i>
                                 </button>
                             </form>                  
                         </td>
                     </tr>
                 </c:forEach>                 
            </tbody>
        </table>
    </div>
    </c:if>
    <!-- End Table -->
</div>
<jsp:include page="/parts/footer.jsp"/>
 
