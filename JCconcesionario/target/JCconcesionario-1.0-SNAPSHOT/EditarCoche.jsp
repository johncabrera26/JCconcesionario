<%-- 
    Document   : EditarCoche
    Created on : 09-feb-2024, 18:19:03
    Author     : PC
--%>

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
        <h1 class="text-center">Editar Coche</h1>
        <form action="EditarCocheServlet" method="post">
            <!-- Assuming "usuarios" is a list, iterate through it -->
           
                <!-- Incluir un campo oculto para identificar al coche que se está editando -->
                <input type="hidden" id="cocheId" name="cocheId" value="${param.cocheId}">

                <div class="mb-3">
                    <label for="marca" class="form-label">Marca</label>
                    <input type="text" class="form-control" id="marca" name="marca" value="${param.marca}">
                </div>
                
                <div class="mb-3">
                    <label for="modelo" class="form-label">Modelo</label>
                    <input type="text" class="form-control" id="modelo" name="modelo" value="${param.modelo}" >
                </div>
                <div class="mb-3">
                    <label for="fotoUrl" class="form-label">fotoUrl</label>
                    <input type="text" class="form-control" id="fotoUrl" name="fotoUrl" value="${param.fotoUrl}" >
                </div>
                
                
                <div class="mb-3">
                    <label for="anio" class="form-label">Anio</label>
                    <input type="number" class="form-control" id="anioFabricacion" name="anioFabricacion" value="${param.anioFabricacion}" >
                </div>
                <div class="mb-3">
                    <label for="precio" class="form-label">Precio</label>
                    <input type="number" class="form-control" id="precio" name="precio" value="${param.precio}" >
                    <!-- Puedes optar por dejar este campo en blanco para no cambiar la contraseña o permitir la edición -->
                </div>
                <div class="mb-3">
                    <label for="descripcion" class="form-label">Descripcion</label>
                    <textarea class="form-control" id="descripcion" name="descripcion" rows="3">${param.descripcion}</textarea>
                </div>
                <div class="mb-3">
                    <label for="estado" class="form-label">Estado</label>
                    <input type="text" class="form-control" id="estado" name="estado" value="${param.estado}" >
                    
                </div>
                <button type="submit" class="btn btn-primary">Guardar Cambios</button>
        </form>
          
         
    </div>
</body>
</html>
