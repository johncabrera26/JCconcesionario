<%-- 
    Document   : registrarse
    Created on : 02-ene-2024, 20:56:07
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registro de Usuario</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
   <!-- Scripts -->
  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    <style>
     #administrador{
    width: 30px;
}
#logout{
    width: 20px;
}
 .container1 {
    padding: 20px;
    border: 1px solid #ddd;
    border-radius: 10px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    background-color: #f8f9fa;
    width: 30%;
    margin-left: 35%;
    margin-top: 8%;
        
  }
    </style>
</head>
<body>
    
    <!-- Navbar -->
 <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container">
        <a class="navbar-brand" href="#">
             
            <img src="img/JCconcesionario-logos_white.png" alt="Logo" width="200">
        </a>
        
        <a class="navbar-brand" href="#" style="margin-left: 40px ; margin-top: 10px" >
           <% 
                String nombreUsu = (String) session.getAttribute("nombreUsuario");
                if (nombreUsu == null) {
            %>
                <p>¡Bienvenido!</p>
            <%
                } else {
            %>
                <p>Bienvenido, <%= nombreUsu %>!</p>
            <%
                }
            %>
        </a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse justify-content-end" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="index.jsp">Inicio</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="CatalogoCochesServlet">Comprar</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="vender.jsp">Vender</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="loguearse.jsp">Iniciar Sesión</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="registrarse.jsp">Registrarse</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="loguearAdmin.jsp" ><img src="img/Administrator_icon-icons.com_55969 (1).png"id="administrador" alt=""></i></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="LogoutServlet"><img src="img/59399.png" id="logout" alt=""></a>
                </li>
            </ul>
        </div>
    </div>
</nav>
    
    
    
    
    
    
    
    
  <div class="container1 mt-4">
  <form action="registroServlet" method="post">
    <h2 class="mb-3">Registro de Usuario</h2>

    <div class="mb-3">
      <label for="nombre" class="form-label">Nombre:</label>
      <input type="text" name="nombre" class="form-control" required>
    </div>

    <div class="mb-3">
      <label for="apellido" class="form-label">Apellido:</label>
      <input type="text" name="apellido" class="form-control" required>
    </div>

    <div class="mb-3">
      <label for="correo" class="form-label">Correo:</label>
      <input type="email" name="correo" class="form-control" required>
    </div>

    <div class="mb-3">
      <label for="contrasena" class="form-label">Contraseña:</label>
      <input type="password" name="contrasena" class="form-control" required>
    </div>

    <div class="mb-3">
      <label for="direccion" class="form-label">Dirección:</label>
      <input type="text" name="direccion" class="form-control" required>
    </div>

    <button type="submit" class="btn btn-primary">Registrar</button>
  </form>
</div>

    
 
</body>
</html>
