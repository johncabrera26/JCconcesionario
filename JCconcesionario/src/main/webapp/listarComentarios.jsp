<%-- 
    Document   : listarComentarios
    Created on : 11-nov-2023, 2:44:20
    Author     : PC
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar Comentorios</title>
    </head>
    <body>
        <h1>listar comentarios</h1>
         <u>
            <c:forEach  items="${comentarios}" var="comentarios">
                <li> ${comentarios.contenido}</li>
            </c:forEach>
            
        </u>
        
    </body>
</html>
