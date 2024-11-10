<%-- 
    Document   : listarCoches.jsp
    Created on : 11-nov-2023, 2:36:44
    Author     : PC
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado coches</title>
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
          
        <h1>Listado coches</h1>
        <div class="container">
    
       <div class="contenedor1" style="margin-bottom:1%; display: flex; ">
        <form action="InsertarCoche.jsp" method="post" style="margin-right: 10px; margin-left: 10px;">
            <button type="submit" class="btn btn-primary">Insertar</button>
        </form>
    </div>
    <div class="row">
        <c:forEach items="${coches}" var="coche">
            <div class="col-md-4 mb-4">
                <div class="card" value="" style="width: 95%">
                    <img  style="width: 100%"src="${coche.fotoUrl}" class="card-img-top" alt="Imagen del coche ${coche.marca} ${coche.modelo}">
                    <div class="card-body">
                        <h5 class="card-title">${coche.marca} ${coche.modelo}</h5>
                        <!-- Puedes agregar más información del coche aquí -->
                        
                        
                        <p class="card-text" ">Año: ${coche.anioFabricacion}</p>
                        <p class="card-text">Precio: ${coche.precio}€</p>
                        <p class="card-text">Descripcion: ${coche.descripcion}</p>
                        <p class="card-text">Estado: ${coche.estado}</p>
                        
                        <!-- Agrega más detalles según sea necesario -->
                        <form action="EditarCoche.jsp" method="post" style="margin-right: 5px; display: inline;">
                            <input type="hidden" name="cocheId" value="${coche.cocheId}">
                            <input type="hidden" name="fotoUrl" value="${coche.fotoUrl}">
                            
                            <input type="hidden" name="marca" value="${coche.marca}">
                            <input type="hidden" name="modelo" value="${coche.modelo}">
                            <input type="hidden" name="anioFabricacion" value="${coche.anioFabricacion}">
                            <input type="hidden" name="precio" value="${coche.precio}">
                            <input type="hidden" name="descripcion" value="${coche.descripcion}">
                            <input type="hidden" name="estado" value="${coche.estado}">
                            
                            <button type="submit" class="btn btn-warning">Editar</button>
                        </form>
                         <form action="EliminarCocheService" method="post" style="margin-right: 5px; display: inline;">
                            <input type="hidden"id="cocheId" name="cocheId" value="${coche.cocheId}">
                           <button type="submit" class="btn btn-danger">eliminar</button>
                        </form>     
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</div>
    </body>
</html>
