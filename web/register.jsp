<%-- 
    Document   : register
    Created on : 6/05/2018, 01:47:45 PM
    Author     : richard
--%>

<jsp:include page="/parts/navbar.jsp"/>
<div class="container">
    <div class="row">
        <div class="col-3"></div>
        <div class="col-6">      
            <div class="card center-item">
                <div class="card-header">
                    Registration
                </div>
                <div class="card-body">
                    <form action="${pageContext.request.contextPath}/register" method="POST">
                        <div class="form-group">
                            <label for="usernameRegister">Username:</label>
                            <input type="text" class="form-control" id="usernameRegister" placeholder="User name" name="usernameRegister" required/>
                        </div>
                        <div class="form-group">
                            <label for="emailRegister">Email:</label>
                            <input type="email" class="form-control" id="emailRegister" placeholder="example@gmail.com" name="emailRegister" required/>
                        </div>
                        <div class="form-group">
                            <label for="passwordRegister">Password:</label>
                            <input type="password" class="form-control" id="passwordRegister" placeholder="Password" name="passwordRegister" required/>
                        </div>
                        <div class="text-right">
                            <button type="submit" class="btn btn-primary"> Registrar </button>
                        </div> 
                    </form>
                   <p>¿Ya tienes una cuenta? <a href="login.jsp">Iniciar sesión</a></p>
                </div>
            </div>
        </div>
        <div class="col-3"></div>
    </div>
</div>
<jsp:include page="/parts/footer.jsp" />