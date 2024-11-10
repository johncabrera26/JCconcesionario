<%-- 
    Document   : vender
    Created on : 03-ene-2024, 19:13:44
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    // Verificar si el usuario ha iniciado sesión
    String nombreU = (String) session.getAttribute("nombreUsuario");
    if (nombreU == null) {
%>
        <p>Tienes que Iniciar Sesión</p>
<%
        // Si no ha iniciado sesión, redirigir a la página de inicio de sesión
        response.sendRedirect("loguearse.jsp");
        return; // Importante agregar un return para evitar que el resto del contenido de la página se procese
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    </head>
    
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
        
  }

    </style>
        
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
  <h2>Formulario de Venta de Coche</h2>

  <form action="TasacionVentaServlet" method="post">
    <div class="mb-3">
      <label for="coche_id" class="form-label">Matrícula del Coche:</label>
      <input type="text" id="coche_id" name="coche_id" class="form-control" required>
    </div>

    <div class="mb-3">
      <label for="marca" class="form-label">Marca:</label>
      <input type="text" id="marca" name="marca" class="form-control" required>
    </div>

    <div class="mb-3">
      <label for="modelo" class="form-label">Modelo:</label>
      <input type="text" id="modelo" name="modelo" class="form-control" required>
    </div>

    <div class="mb-3">
      <label for="anio_fabricacion" class="form-label">Año de Fabricación:</label>
      <input type="number" id="anio_fabricacion" name="anio_fabricacion" class="form-control" required>

    </div>
     <input type="hidden" name="tasacion" value="${tasacion}">
          
    <button type="submit" class="btn btn-primary">Tasar</button>
  </form>
</div>

       
    </body>
</html>
