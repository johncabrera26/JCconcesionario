<%-- 
    Document   : VerCochesCompra
    Created on : 12-feb-2024, 11:31:20
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
   <!-- Scripts -->
  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    
    </head>
    <style>
        #administrador{
    width: 30px;
}
#logout{
    width: 20px;
}
  .card-container {
    max-width: 600px; /* Ajusta el ancho máximo según tu preferencia */
    margin: 20px auto;
    margin-top: 10%;
}

.custom-card {
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
    border-radius: 10px;
    padding: 20px;
    width: 80%; /* Ajusta el ancho de la card según sea necesario */
    margin: auto; /* Centra la card */
}

.details-container {
    display: flex;
    margin-top: 20px; /* Ajusta la separación entre la imagen y el texto */
}

.img-container {
    flex: 1;
}

.text-container {
    flex: 1;
    margin-left: 20px; /* Ajusta el margen entre la imagen y el texto según sea necesario */
}

.imagen {
    width: 100%; /* Ajusta el tamaño de la imagen según sea necesario */
    max-height: 300px; /* Ajusta la altura máxima de la imagen según sea necesario */
    object-fit: cover;
}

.btn-container {
    margin-top: 20px; /* Ajusta la separación entre el texto y el botón según sea necesario */
}
h2{
    text-align: center;
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
                    <a class="nav-link" href="LogoutServlet"><img src="img/59399.png" id="logout" alt="Cerrar Sesión"></a>
                </li>
            </ul>
        </div>
    </div>
</nav>
        
<div class="card-container">
    <div class="card custom-card">
        <h2 class="card-title"> ${param.marca} ${param.modelo}</h2>

        <div class="details-container">
            <div class="img-container">
                <img style="width: 100%;margin-right: 10px"  src="${param.fotoUrl}" class="imagen" alt="Imagen del coche ${param.marca} ${param.modelo}">
            </div>

            <div class="text-container">
                <p class="card-text-label">Marca: ${param.marca}</p>
                <p class="card-text-label">Modelo: ${param.modelo}</p>
                <p class="card-text-label">Año de Fabricación: ${param.anio_fabricacion}</p>
                <p class="card-text-label">Precio: ${param.precio}</p>
                <p class="card-text-label">Descripción: ${param.descripcion}</p>
                <p class="card-text-label">Estado: ${param.estado}</p>
            </div>
        </div>

        <div class="btn-container">
            <form action="ComprarServlet" method="post">
                <!-- Agregar campos de entrada ocultos para los valores -->
                <input type="hidden" name="cocheId" value="${param.cocheId}">
                <input type="hidden" name="precio" value="${param.precio}">
                <!-- Agregar más campos según sea necesario -->

                <button type="submit" class="btn btn-primary">Comprar</button>
            </form>
        </div>
    </div>
</div>

        
        
        
        
        
      </body>    
</html>
