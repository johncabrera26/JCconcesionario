<%-- 
    Document   : insertarCliente
    Created on : 30-ene-2024, 13:38:38
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insertar Cliente</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
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
</head>
<body>
    <div class="container">
        <h1 class="text-center">Insertar Cliente</h1>
        <form action="RegistrarUsuarioServlet" method="post">
            <div class="mb-3">
                <label for="nombre" class="form-label">Nombre:</label>
                <input type="text" class="form-control" id="nombre" name="nombre" required>
            </div>
            <div class="mb-3">
                <label for="apellido" class="form-label">Apellido:</label>
                <input type="text" class="form-control" id="apellido" name="apellido" required>
            </div>
            <div class="mb-3">
                <label for="correo" class="form-label">Correo:</label>
                <input type="email" class="form-control" id="correo" name="correo" required>
            </div>
            <div class="mb-3">
                <label for="contrasena" class="form-label">Contraseña:</label>
                <input type="password" class="form-control" id="contrasena" name="contrasena" required>
            </div>
            <div class="mb-3">
                <label for="direccion" class="form-label">Dirección:</label>
                <textarea class="form-control" id="direccion" name="direccion" rows="3" required></textarea>
            </div>
            <button type="submit" class="btn btn-primary">Insertar</button>
        </form>
    </div>
</body>
</html>


