<%-- 
    Document   : lista
    Created on : 6/05/2018, 03:54:00 PM
    Author     : richard
--%>

<jsp:include page="/parts/navbar.jsp" />

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
                <tr>
                    <th scope="row">Cancion1</th>
                    <td> Album1 </td>
                    <td> Artista1</td>
                    <td>Genero1</td>
                </tr>
            </tbody>
        </table>
    </div>
    <!-- End Table -->
</div>

<jsp:include page="/parts/footer.jsp" />

