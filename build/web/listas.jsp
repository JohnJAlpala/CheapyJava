<%-- 
    Document   : listas
    Created on : 6/05/2018, 04:00:17 PM
    Author     : richard
--%>

<jsp:include page="/parts/navbar.jsp" />

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
                <tr>
                    <th scope="row">Lista1</th>
                    <td> Esta es una lista de reproduccion </td>
                    <td> Privada</td>
                    <td>Yo quien más</td>
                    <td>
                        <form action="${pageContext.request.contextPath}/listas" method="POST">
                            <input type="hidden" name="delete" value="Lista1"/>
                            <button class="btn btn-primary btn-sm my-0" type="submit">
                                Ver más
                            </button>
                        </form>                  
                    </td>
                </tr>
                
            </tbody>
        </table>
    </div>
    <!-- End Table -->
</div>

<jsp:include page="/parts/footer.jsp" />
