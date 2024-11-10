<%-- 
    Document   : CochesVendidos
    Created on : 11-nov-2023, 2:43:47
    Author     : PC
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado coches Vendidos</title>
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
          
        <h1>Listado coches Vendidos</h1>
        <table class="table table-bordered " style="margin-top: 5%;">
        <thead>
            <tr>
                <th>Venta_id</th>
                <th>Coche_id</th>
                <th>Comprador_id</th>
                <th>Precio_venta</th>
                <th>fecha_venta</th> <!-- Agrega una nueva columna para las acciones -->
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${cochesVendidos}" var="cocheVendido">
                <tr>
                    <td>${cocheVendido.ventaId}</td>
                    <td>${cocheVendido.cocheId}</td>
                    <td>${cocheVendido.compradorId}</td>
                    <td>${cocheVendido.precioVenta}</td>
                    <td>${cocheVendido.fechaVenta}</td>
                    <!-- Agrega un botón de editar en cada fila -->
                    <td>
                        <form action="editarCliente.jsp" method="post" style="margin-right: 5px; display: inline;">
                            <input type="hidden" name="usuarioId" value="${usuario.usuarioId}">
                            <input type="hidden" name="nombre" value="${usuario.nombre}">
                            <input type="hidden" name="apellido" value="${usuario.apellido}">
                            <input type="hidden" name="correo" value="${usuario.correo}">
                            <input type="hidden" name="direccion" value="${usuario.direccion}">
                            <input type="hidden" name="contrasena" value="${usuario.contrasena}">
                            
                            <button type="submit" class="btn btn-warning">Editar</button>
                        </form>
                        <form action="EliminarClienteServlet" method="post" style="margin-right: 5px; display: inline;">
                            <input type="hidden"id="usuarioId" name="usuarioId" value="${usuario.usuarioId}">
                           <button type="submit" class="btn btn-danger">eliminar</button>
                        </form>   
                        <!-- Puedes agregar más botones de acción aquí según tus necesidades -->
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
        
    </body>
</html>
