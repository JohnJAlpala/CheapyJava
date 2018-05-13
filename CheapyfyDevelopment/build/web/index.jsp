<%-- 
    Document   : index.jsp
    Created on : 5/05/2018, 03:55:41 PM
    Author     : richard
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="/parts/navbar.jsp" />
<div class="container">
    
    <!-- Start Table -->
    <div class="row table-padding">
        <table class="table">
            <thead class="thead-dark">
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Song</th>
                    <th scope="col">Artist</th>
                    <th scope="col">Album</th>
                    <th scope="col">Action</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <th scope="row">id</th>
                    <td> SONG 1 </td>
                    <td> ARTIST 1</td>
                    <td>ALBUM 1</td>
                    <td>
                        <form action="${pageContext.request.contextPath}/" method="POST">
                            <input type="hidden" name="delete" value="id"/>
                            <button class="btn btn-danger btn-rounded btn-sm my-0" type="submit">
                                <i class="fa fa-times"></i>
                            </button>
                        </form>                  
                    </td>
                </tr>
                
            </tbody>
        </table>
    </div>
    <!-- End Table -->
    <!-- Searchbar -->
    <div class="row">
        <div class="col-3"></div>
        <div class="col-6">
            <form action="${pageContext.request.contextPath}/" method="POST">
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
    <br>
    <h3 class="text-center"> Resultados: </h3>
    <div class="row table-padding">
        <table class="table">
            <thead class="thead-dark">
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Song</th>
                    <th scope="col">Artist</th>
                    <th scope="col">Album</th>
                    <th scope="col">Action</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <th scope="row">id</th>
                    <td> SONG 1 </td>
                    <td> ARTIST 1</td>
                    <td>ALBUM 1</td>
                    <td>
                        <form action="${pageContext.request.contextPath}/" method="POST">
                            <input type="hidden" name="delete" value="id"/>
                            <button class="btn btn-success btn-rounded btn-sm my-0" type="submit">
                                <i class="fa fa-check"></i>
                            </button>
                        </form>                  
                    </td>
                </tr>
                
            </tbody>
        </table>
    </div>
    <!-- End Table -->
</div>
<jsp:include page="/parts/footer.jsp"/>
 
