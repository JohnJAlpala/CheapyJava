<%-- 
    Document   : artista
    Created on : 15/05/2018, 09:47:51 PM
    Author     : richard
--%>

<%@page import="models.Mensaje"%>
<jsp:include page="/parts/header.jsp" />
<div class="container">
       <div class="row">
        <div class="col-3"></div>
        <div class="col-6">      
            <div class="card center-item">
                <div class="card-header">
                    <%=Mensaje.getMensajes().get("CreateArtist")%>
                </div>
                <div class="card-body">
                    <form action="${pageContext.request.contextPath}/artista" method="POST">
                        <div class="form-group">
                            <label for="nameArtist"><%=Mensaje.getMensajes().get("Name")%></label>
                            <input type="text" class="form-control" id="nameArtist" placeholder="Artista" name="nameArtist" required/>
                        </div>
                        <div class="form-group">
                            <label for="descriptionArtist"><%=Mensaje.getMensajes().get("ArtistDescription")%></label>
                            <textarea class="form-control" id="descriptionArtist" name="descriptionArtist" placeholder="Descripcion"></textarea>
                        </div>
                        <div class="form-group">
                            <label for="generoArtist"><%=Mensaje.getMensajes().get("MusicalGenre")%></label>
                            <input type="text" class="form-control" id="generoArtist" name="generoArtist" placeholder="Genero"/>
                        </div>
                        <div class="text-right">
                            <button type="submit" class="btn btn-primary"> <%=Mensaje.getMensajes().get("Create")%> </button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <div class="col-3"></div>
    </div>
</div>
<jsp:include page="/parts/footer.jsp" />
