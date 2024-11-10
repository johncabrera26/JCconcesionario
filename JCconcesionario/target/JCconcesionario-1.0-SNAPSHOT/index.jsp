<%-- 
    Document   : index
    Created on : 03-ene-2024, 13:05:07
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Tu Sitio</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
  <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css" />
   <!-- Scripts -->
  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<style>
    
    
    /* Establece la imagen como fondo de la columna */
    .col1 {
        background: url('img/Hyundai.jpeg') no-repeat center center fixed;
        background-size: cover; /* Ajusta el tamaño de la imagen para cubrir completamente la columna */
        height: 70vh; /* Mismo valor que la altura de la imagen para mantener la proporción */
    }
    /* Ajusta el margen superior de las columnas internas */
    .col1 .row .col {
        margin-top: 20%; /* Ajusta el valor según sea necesario */
    }
    /* Estilo al pasar el ratón */
.btn-dark:hover,
.btn-secondary:hover {
  background-color: transparent;
  color: #fff; /* Cambia el color del texto al ser transparente */
  border-color: #fff; /* Cambia el color del borde al ser transparente */
}
.btn-dark,
.btn-secondary {
  font-size: 1.2rem; /* Ajusta el tamaño del texto del botón */
  padding: 10px 60px; /* Ajusta el padding para aumentar el tamaño del botón */
  
}
#administrador{
    width: 30px;
}
#logout{
    width: 20px;
}

.filtrar-coches-form {
    max-width: 400px;
    margin: auto;
}

.filtrar-coches-form label {
    display: block;
    margin-bottom: 8px;
}

.filtrar-coches-form input,
.filtrar-coches-form select {
    width: 100%;
    padding: 8px;
    margin-bottom: 16px;
    box-sizing: border-box;
}

.filtrar-coches-form button {
    background-color: #007bff;
    color: #fff;
    padding: 10px 20px;
    border: none;
    cursor: pointer;
}

.filtrar-coches-form button:hover {
    background-color: #0056b3;
}
         .card {
            border: 1px solid #ccc;
            border-radius: 8px;
            padding: 5px;
            text-align: center;
            margin-bottom: 10px;
            width:10%; 
                
        }

        /* Estilos para los botones dentro de las tarjetas */
        .card button {
            border: none;
            padding: 0;
            background: none;
            cursor: pointer;
        }

        /* Estilos para las imágenes dentro de los botones */
        .card img {
            max-width: 50%;
            height: auto;
        }
       .card-container {
        display: flex;
        justify-content: center;
    }

    .card {
        margin: 0 1%; /* Ajusta el margen según tus necesidades */
    }
.card {
    transition: transform 0.4s, border-color 0.4s, box-shadow 0.4s;
    border: 1px solid #ccc;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); /* Ajusta según tus necesidades */
}

.card:hover {
    transform: scale(1.20);
    border-color: #007bff;
    box-shadow: 0 8px 16px rgba(0, 0, 0, 0.2); /* Nueva sombra al pasar el ratón, ajusta según tus necesidades */
}
    h3{
        text-align: center;
        margin-bottom: 3%;
    }
    h2{
        margin-top: 2%;
        text-align: center;
    }
    .footer-logos {
            margin-top: 20px;
        }

        .footer-logos img {
            width: 30px;/* Ajusta el tamaño según tus necesidades */
            margin-right: 10px;
        }
        .footer-logos .facebook{
            width: 40px;
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

<div class="container-expand-lg">
  <div class="row">
    <div class="col1">
        <div class="row">
            <div class="col d-flex justify-content-end ">
                <a href="CatalogoCochesServlet"><button type="button" class="btn btn-secondary">Comprar</button></a>
            </div>
            <div class="col-1">

            </div>
            <div class="col" >
                <a href="vender.jsp"><button type="button" class="btn btn-dark">Vender</button></a>
            </div>

        </div>
    </div>
  </div>
    <div class="container-expand-lg bg-secondary mb-5">
  <div class="row  bg-secondary">
    <div class="col ">
        <h2>Descubre sobre nosotros!</h2>
      <p>"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. 
          Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."</p>
    </div>
      
  </div>
      </div>  
    
    
     
        <div class="row  align-items-center">
             <h3>Elige la marca que prefieras!!!</h3>
            <div class="col">
                <div class="card-container">
    <form action="FiltroMarcaServlet" method="post" class="card" value="Toyota" name="marca">
        <button type="submit" id="marca" name="marca" value="Toyota">
            <img src="img/Marca_Toyota.png" alt="Toyota">
        </button>
    </form>

    <form action="FiltroMarcaServlet" method="post" class="card" value="Volkswagen" name="marca">
        <button type="submit" id="marca" name="marca" value="Volkswagen">
            <img src="imgCoches/Marca_volkswagen2.jpg" alt="Volkswagen" class="w-20">
        </button>
    </form>

    <form action="FiltroMarcaServlet" method="post" class="card" value="BMW" name="marca">
        <button type="submit" id="marca" name="marca" value="BMW">
            <img src="img/Marca_bmw.png" alt="BMW">
        </button>
    </form>

    <form action="FiltroMarcaServlet" method="post" class="card" value="Chevrolet" name="marca">
        <button type="submit" id="marca" name="marca" value="Chevrolet">
            <img src="img/Marca_chevrolet.jpg" alt="Chevrolet">
        </button>
    </form>
</div>
                </div>
            </div>
        
           
            <div class="row  align-items-center ">
               
            <div class="col">
                <div class="card-container mt-3">
    <form action="FiltroMarcaServlet" method="post" class="card" value="Ford" name="marca">
        <button type="submit" id="marca" name="marca" value="Ford">
            <img src="img/Marca_ford.png" alt="Ford">
        </button>
    </form>

    <form action="FiltroMarcaServlet" method="post" class="card" value="Nissan" name="marca">
        <button type="submit" id="marca" name="marca" value="Nissan">
            <img src="imgCoches/Marca_nissan.png  " alt="Nissan" class="w-30px">
        </button>
    </form>

    <form action="FiltroMarcaServlet" method="post" class="card" value="Honda" name="marca">
        <button type="submit" id="marca" name="marca" value="Honda">
            <img src="img/Marca_Honda.png" alt="Honda">
        </button>
    </form>
            
                    </div>
        </div>
    
</div>
    
    <div class="row align-items-center mt-5 ">
        <div class="col bg-secondary">
              <div class="container1" style= margin-top: 5;>
            <h2>Busca tu coche ideal!</h2>

          <form action="FiltrosServlet" method="post" class="filtrar-coches-form">
                <div class="mb-3">
                    <label for="marca" class="form-label">Marca:</label>
                    <input type="text" id="marca" name="marca" class="form-control">
                </div>

                <div class="mb-3">
                    <label for="modelo" class="form-label">Modelo:</label>
                    <input type="text" id="modelo" name="modelo" class="form-control">
                </div>

                <div class="mb-3">
                    <label for="anio" class="form-label">Año:</label>
                    <input type="text" id="anio" name="anio" class="form-control">
                </div>

                <div class="mb-3">
                    <label for="precio" class="form-label">Precio:</label>
                    <input type="text" id="precio" name="precio" class="form-control">
                </div>

                <div class="mb-3">
                    <label for="estado" class="form-label">Estado:</label>
                    <select id="estado" name="estado" class="form-select">
                        <option value="nuevo"></option>
                        <option value="nuevo">Nuevo</option>
                        <option value="usado">Usado</option>
                    </select>
                </div>

                <button type="submit" class="btn btn-primary mb-5">Filtrar</button>
            </form>

        </div>           
        </div>    
    </div>
    
    <div class="row">
        <div class="col">
            <!-- Footer -->
            <footer class="bg-dark text-white text-center py-3">
                <p>&copy; 2024 Tu Sitio. Todos los derechos reservados.</p>

                <!-- Párrafo con lorem ipsum -->
                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin vel justo nec urna ultrices ultrices.
                </p>
                

                <!-- Logos de redes sociales -->
                <div class="footer-logos">
                    <!-- Reemplaza las rutas con las ubicaciones reales de tus imágenes -->
                    <img src="imgCoches/logo_facebook.png" alt="Facebook"  class="facebook">
                    <img src="imgCoches/logo_instagram.png" alt="Instagram">
                    <img src="imgCoches/logo_tiktok.png" alt="TikTok">
                </div>
            </footer>          
        </div>       
    </div>
</div>
</body>
</html>


