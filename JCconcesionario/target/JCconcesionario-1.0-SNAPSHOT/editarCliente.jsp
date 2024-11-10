<%-- 
    Document   : editarCliente
    Created on : 30-ene-2024, 14:14:55
    Author     : PC
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
         body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        .container {
            width: 30%;
        }

        form {
            margin-top: 20px;
        }
    </style>
<body>
    <div class="container">
        <h1 class="text-center">Editar Cliente</h1>
        <form action="EditarClienteServlet" method="post">
            <!-- Assuming "usuarios" is a list, iterate through it -->
           
                <!-- Incluir un campo oculto para identificar al cliente que se está editando -->
                <input type="hidden" id="usuarioId" name="usuarioId" value=${param.usuarioId}>

                <div class="mb-3">
                    <label for="nombre" class="form-label">Nombre:</label>
                    <input type="text" class="form-control" id="nombre" name="nombre" value="${param.nombre}" >
                </div>
                <div class="mb-3">
                    <label for="apellido" class="form-label">Apellido:</label>
                    <input type="text" class="form-control" id="apellido" name="apellido" value="${param.apellido}" >
                </div>
                <div class="mb-3">
                    <label for="correo" class="form-label">Correo:</label>
                    <input type="email" class="form-control" id="correo" name="correo" value="${param.correo}" >
                </div>
                <div class="mb-3">
                    <label for="contrasena" class="form-label">Contraseña:</label>
                    <input type="text" class="form-control" id="contrasena" name="contrasena" value="${param.contrasena}" >
<!--                     Puedes optar por dejar este campo en blanco para no cambiar la contraseña o permitir la edición -->
                </div>
                <div class="mb-3">
                    <label for="direccion" class="form-label">Dirección:</label>
                    <textarea class="form-control" id="direccion" name="direccion" rows="3">${param.direccion}</textarea>
                </div>
                <button type="submit" class="btn btn-primary">Guardar Cambios</button>
          
        </form>
    </div>
</body>
</html>

