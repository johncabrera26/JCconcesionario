/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.ceep.web;

import com.ceep.dominio.CochescompradosByJc;
import com.ceep.service.iCochesCompradosService;
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
@WebServlet(name = "VenderServlet", urlPatterns = {"/vender"})
public class VenderServlet extends HttpServlet {

    @Inject
    private iCochesCompradosService cochesCompradosService; // Inyecta tu servicio de coches comprados

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            // Obtener los parámetros del formulario (ajusta los nombres según tu formulario)
            String matricula = request.getParameter("coche_id");
            String marca = request.getParameter("marca");
            String modelo = request.getParameter("modelo");
            int anioFabricacion = Integer.parseInt(request.getParameter("anio_fabricacion"));
            double tasacion = Double.parseDouble(request.getParameter("tasacion"));

            // Crea un nuevo objeto CochescompradosByJc con la información de la venta
//            CochescompradosByJc cocheComprado = new CochescompradosByJc();
//            cocheComprado.setMatricula(matricula);
//            cocheComprado.setMarca(marca);
//            cocheComprado.setModelo(modelo);
//            cocheComprado.setAnioFabricacion(anioFabricacion);
//            cocheComprado.setPrecio(tasacion);

            // Guarda el coche comprado en la base de datos
          //  cochesCompradosService.registrarCochesComprados(cocheComprado);

            // Redirige a una página de confirmación o a donde desees
            response.sendRedirect("confirmacion.jsp"); // Cambia "confirmacion.jsp" por tu página de confirmación

        } catch (NumberFormatException e) {
            // Manejar error si la conversión de año de fabricación a entero falla
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Formato de año de fabricación inválido");
        }
    }
}
