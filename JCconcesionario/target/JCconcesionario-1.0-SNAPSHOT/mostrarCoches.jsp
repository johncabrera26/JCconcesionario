<%-- 
    Document   : mostrarCoches
    Created on : 24-ene-2024, 15:46:04
    Author     : PC
--%>

<%@page import="com.ceep.dominio.Coches"%>
<%@page import="java.util.List"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Mostrar Coches</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    
</head>

    <style>
        #administrador{
            width: 30px;
        }
        #logout{
            width: 20px;
        }
        
         /* Agregar estilos adicionales según sea necesario */
        .card-title {
            font-size: 18px;
            font-weight: bold;
            margin-bottom: 10px;
        }

        .card-text {
            font-size: 14px;
            margin-bottom: 5px;
        }
        .card {
           
            transition: transform 0.2s;
        }

        .card:hover {
            transform: scale(1.05);
        }

        .card-img-top {
            max-height: 200px; /* Ajustar el tamaño máximo de la imagen */
        }

        .card {
            margin-bottom: 20px; /* Ajustar la separación entre tarjetas */
        }

        .btn-primary {
            font-size: 14px;
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

    <%-- Obtener la lista de coches filtrados desde el alcance de la solicitud --%>
    <% List<Coches> cochesFiltrados = (List<Coches>) request.getAttribute("cochesFiltrados"); %>

    <%-- Verificar si hay coches para mostrar --%>
    <% if (cochesFiltrados != null && !cochesFiltrados.isEmpty()) { %>

<div class="container mt-5">
    
    <div class="row">
        <%-- Iterar sobre la lista de coches y mostrar la información en tarjetas Bootstrap --%>
        <% for (Coches coche : cochesFiltrados) { %>
            <div class="col-md-4 mb-4">
                <div class="card h-100">
                    <img src="<%= coche.getFotoUrl() %>" class="card-img-top" alt="Imagen del coche <%= coche.getMarca() %> <%= coche.getModelo() %>">
                    <div class="card-body">
                        <h5 class="card-title"><%= coche.getMarca() %> <%= coche.getModelo() %></h5>
                        <p class="card-text">Marca: <%= coche.getMarca() %></p>
                        <p class="card-text">Año: <%= coche.getAnioFabricacion() %></p>
                        <p class="card-text">Precio: <%= coche.getPrecio() %></p>
                        <p class="card-text">Estado: <%= coche.getEstado() %></p>
                        <!-- Agrega más detalles según sea necesario -->
                        <a href="#" class="btn btn-primary">Comprar</a>
                    </div>
                </div>
            </div>
        <% } %>
    </div>
</div>

    
    
    
    
    <% } else { %>

        <p>No se encontraron coches que coincidan con los criterios de búsqueda.</p>

    <% } %>
</body>
</html>
