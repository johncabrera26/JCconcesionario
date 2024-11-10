/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.ceep.web;

import com.ceep.dominio.Usuarios;
import com.ceep.service.iUsuarioService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author PC
 */
@WebServlet("/EditarClienteServlet")
public class EditarClienteServlet extends HttpServlet {
    @Inject
    private iUsuarioService usuarioService; // Ajusta el nombre según tu implementación real

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            // Obtener los parámetros del formulario
            int usuarioId = Integer.parseInt(request.getParameter("usuarioId"));
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            String correo = request.getParameter("correo");
            String contrasena = request.getParameter("contrasena");
            String direccion = request.getParameter("direccion");

            // Crear un objeto Usuarios con los datos obtenidos
            Usuarios usuarioEditado = new Usuarios();
            usuarioEditado.setUsuarioId(usuarioId);
            usuarioEditado.setNombre(nombre);
            usuarioEditado.setApellido(apellido);
            usuarioEditado.setCorreo(correo);
            usuarioEditado.setContrasena(contrasena); // Ajusta según tus necesidades de seguridad
            usuarioEditado.setDireccion(direccion);

            // Llamar al servicio para actualizar el usuario
            usuarioService.actualizarUsuario(usuarioEditado);

            // Redirigir a la página de éxito o a la lista de usuarios
            response.sendRedirect("usuarios"); // Ajusta según tu aplicación
        } catch (NumberFormatException e) {
            // Manejar la excepción específica para la conversión de número
            e.printStackTrace();
            //response.sendRedirect("error.jsp?mensaje=Error al convertir número");
        } catch (Exception e) {
            // Manejar otras excepciones de manera general
            e.printStackTrace();
            //response.sendRedirect("error.jsp?mensaje=Error durante la actualización");
        }
    }
}

