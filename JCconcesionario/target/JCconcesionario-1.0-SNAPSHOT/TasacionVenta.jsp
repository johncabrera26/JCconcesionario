<%-- 
    Document   : TasacionVentaServlet
    Created on : 11-feb-2024, 19:24:01
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
           .card-container {
            max-width: 400px; /* Ajusta el ancho máximo según tu preferencia */
            margin: 20px auto;
            margin-top: 10%;
        }

        .custom-card {
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); /* Sombras personalizadas */
            border-radius: 10px; /* Bordes redondeados */
            padding: 20px; /* Espaciado interno */
        }

        /* Estilos para los títulos */
        .card-title,
        .card-text-label {
            font-size: 18px; /* Tamaño de fuente para los títulos */
            color: #808080; /* Color gris para los títulos */
            margin-bottom: 5px; /* Margen inferior para separar los títulos del contenido */
        }

        /* Estilos para la tasación */
        .tasacion {
            font-size: 24px; /* Tamaño de fuente personalizado para la tasación */
            color: #ff5733; /* Color personalizado, puedes ajustar el código de color según tus preferencias */
            font-weight: bold; /* Negrita */
        }
        h2{
            text-align: center;
            margin-top: 10px;
            margin-bottom: 30px;
                
        }
        .btn-container{
           display: flex;
          
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
        <h2 class="card-title">Detalles del Coche</h2>
        <p class="card-text-label">Matrícula: ${coche_id}</p>
        <p class="card-text-label">Marca: ${marca}</p>
        <p class="card-text-label">Modelo: ${modelo}</p>
        <p class="card-text-label">Año de Fabricación: ${anio_fabricacion}</p>
        <p class="card-text tasacion">Tasación: ${tasacion}€</p>

        <div class="btn-container">
          <form method="post" onsubmit="return mostrarMensaje();">
    <button type="submit" class="btn btn-primary">Vender</button>
</form>

<script>
    function mostrarMensaje() {
        // Puedes agregar aquí lógica adicional si es necesario.
        alert('ENHORABUENA POR TU VENTA!!! <%String nombreUsuar = (String) session.getAttribute("nombreUsuario"); %>');
        window.location.href = 'index.jsp'; // Redirige a index.jsp
        return false; // Esto evitará que el formulario se envíe.
    }
</script>



            <form action="index.jsp">
                <button type="submit" class="btn btn-secondary">No quiero vender</button>
            </form>
        </div>
    </div>
</div>


    </body>
</body>
</html>
