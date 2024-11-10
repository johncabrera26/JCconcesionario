<%-- 
    Document   : funcionesAdmin
    Created on : 15-ene-2024, 10:34:15
    Author     : Alumno Mañana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
          <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
  <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css" />
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
        
        
                /* Agrega estilos según tus preferencias */
        body {
            text-align: center;
        }

        #botones-container {
            margin-top: 5%;
        }

        button {
            padding: 10px;
            margin: 5px;
            background-color: #4285f4;
            color: #ffffff;
            border: none;
            cursor: pointer;
            text-decoration: none;
            display: inline-block;
        }

        button:hover {
            background-color: #3c76e3;
        }

        li {
            list-style-type: none;
        }
        #botones-container{
            margin-left: 37%;
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
            <p>Bienvenido, Admin!</p>
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
        
  <div class="container mt-4">
        <h3 class="text-center">Funciones Administrador</h3>
        <div id="botones-container" class="d-grid gap-2">
            <button class="btn btn-primary" style="width: 40%"><a href="usuarios" class="text-white text-decoration-none">CRUD usuarios</a></button>
            <button class="btn btn-warning"  style="width: 40%"><a href="coches" class="text-white text-decoration-none">CRUD coches</a></button>
            <button class="btn btn-secondary"  style="width: 40%"><a href="cochesvendidos" class="text-white text-decoration-none">CRUD cochesVendidos</a></button>
            <button class="btn btn-dark"  style="width: 40%"><a href="cochescomprados" class="text-white text-decoration-none">CRUD de cochesComprados</a></button>
<!--            <button class="btn btn-primary"><a href="comentarios" class="text-white text-decoration-none">Ir al listado de Comentarios</a></button>
            <button class="btn btn-primary"><a href="favoritos" class="text-white text-decoration-none">Ir al listado de favoritos</a></button>-->
        </div>

        <button class="btn btn-secondary mt-3"><a href="index.jsp" class="text-white text-decoration-none" name="volver">Volver</a></button>
    </div>

        
        
    </body>
</html>
