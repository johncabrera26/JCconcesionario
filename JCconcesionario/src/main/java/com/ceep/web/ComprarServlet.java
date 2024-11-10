/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.ceep.web;

import com.ceep.dominio.Coches;
import com.ceep.dominio.CochesvendidosByJc;
import com.ceep.dominio.Usuarios;
import com.ceep.service.iCocheService;
import com.ceep.service.iCochesVendidosService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author PC
 */
@WebServlet(name = "ComprarServlet", urlPatterns = {"/ComprarServlet"})
public class ComprarServlet extends HttpServlet {

    @Inject
    private iCocheService cocheService;
    @Inject
    private iCochesVendidosService cochesVendidosService;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            // Obtener los parámetros del formulario
            String cocheIdString = request.getParameter("cocheId");
            int cocheId = (cocheIdString != null && !cocheIdString.isEmpty()) ? Integer.parseInt(cocheIdString) : 0;
            String precioString = request.getParameter("precio");
            int precio = (precioString != null && !precioString.isEmpty()) ? Integer.parseInt(precioString) : 0;

            Coches cocheToComprar = new Coches();
            cocheToComprar.setCocheId(cocheId);
            
            // Obtener el coche a comprar
            Coches cocheAComprar = cocheService.encontrarCochePorId(cocheToComprar);

            // Verificar si el coche está disponible
            if (cocheAComprar != null && !cocheAComprar.isVendido()) {
                // Crear un objeto CochesvendidosByJc con los datos obtenidos
                CochesvendidosByJc cocheVendido = new CochesvendidosByJc();
                cocheVendido.setPrecioVenta(precio);
                cocheVendido.setFechaVenta(new Date());
                cocheVendido.setCocheId(cocheAComprar);

                // Obtener el ID del usuario logeado de la sesión
                HttpSession session = request.getSession();
                int compradorId = (int) session.getAttribute("UsuarioId");

                // Crear una instancia de Usuarios con el ID
                Usuarios comprador = new Usuarios();
                comprador.setUsuarioId(compradorId);
                cocheVendido.setCompradorId(comprador);

                // Llamar al servicio para registrar la venta en CochesvendidosByJc
                cochesVendidosService.registrarCochesVendidos_by_jc(cocheVendido);

                // Cambiar el estado del coche a "vendido" en la tabla Coches
                cocheAComprar.setVendido(true);
                cocheService.actualizarCoche(cocheAComprar);

                // Redirigir a la página de éxito o a la lista de coches
                response.sendRedirect("CatalogoCochesServlet"); // Ajusta según tu aplicación
            } else {
                // El coche no está disponible
                response.sendRedirect("error.jsp?mensaje=El coche ya ha sido vendido");
            }
        } catch (NumberFormatException e) {
            // Manejar la excepción específica para la conversión de número
            e.printStackTrace();
            //response.sendRedirect("error.jsp?mensaje=Error al convertir número");
        } catch (Exception e) {
            // Manejar otras excepciones de manera general
            e.printStackTrace();
            //response.sendRedirect("error.jsp?mensaje=Error durante la compra");
        }
    }
}
