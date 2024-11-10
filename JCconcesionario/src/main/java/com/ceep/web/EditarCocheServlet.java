/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.ceep.web;

import com.ceep.dominio.Coches;
import com.ceep.service.iCocheService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author PC
 */
@WebServlet("/EditarCocheServlet")
public class EditarCocheServlet extends HttpServlet {
    @Inject
    private iCocheService cocheService; // Ajusta el nombre según tu implementación real

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            // Obtener los parámetros del formulario
            String cocheIdString = request.getParameter("cocheId");
            int cocheId = (cocheIdString != null && !cocheIdString.isEmpty()) ? Integer.parseInt(cocheIdString) : 0;
            String marca = request.getParameter("marca");
            String modelo = request.getParameter("modelo");
            String anioFabricacionString = request.getParameter("anioFabricacion");
            int anioFabricacion = (anioFabricacionString != null && !anioFabricacionString.isEmpty()) ? Integer.parseInt(anioFabricacionString) : 0;

            String precioString = request.getParameter("precio");
            int precio = (precioString != null && !precioString.isEmpty()) ? Integer.parseInt(precioString) : 0;
            String descripcion = request.getParameter("descripcion");
            String estado = request.getParameter("estado");
            String fotoUrl= request.getParameter("fotoUrl");

            // Crear un objeto Coche con los datos obtenidos
            Coches cocheEditado = new Coches();
            cocheEditado.setCocheId(cocheId);
            cocheEditado.setMarca(marca);
            cocheEditado.setModelo(modelo);
            cocheEditado.setAnioFabricacion(anioFabricacion);
            cocheEditado.setPrecio(precio);
            cocheEditado.setDescripcion(descripcion);
            cocheEditado.setEstado(estado);
            cocheEditado.setFotoUrl(fotoUrl);

            // Llamar al servicio para actualizar el coche
            cocheService.actualizarCoche(cocheEditado);

            // Redirigir a la página de éxito o a la lista de coches
            response.sendRedirect("coches"); // Ajusta según tu aplicación
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
