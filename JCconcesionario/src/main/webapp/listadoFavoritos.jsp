<%-- 
    Document   : listadoFavoritos
    Created on : 11-nov-2023, 2:44:45
    Author     : PC
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado Favoritos</title>
    </head>
    <body>
        <h1>Listado Favoritos</h1>
        <ul>
            <c:forEach items="${favoritos}" var="favorito">
                <li>${favorito.favoritoId}</li>
            </c:forEach>
            
        </ul>
    </body>
</html>
