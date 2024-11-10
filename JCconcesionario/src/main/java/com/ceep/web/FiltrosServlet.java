/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.ceep.web;

import com.ceep.dominio.Coches;
import com.ceep.service.iCocheService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.faces.convert.BigDecimalConverter;
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
@WebServlet(name = "FiltrosServlet", urlPatterns = {"/FiltrosServlet"})
public class FiltrosServlet extends HttpServlet {

    @Inject
    private iCocheService CocheService;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
        String modelo = request.getParameter("modelo");
        String marca = request.getParameter("marca");
        int año = 0;
        int precioMaximo = 0;
        String estado = request.getParameter("estado");

        // Manejar las conversiones con try-catch para evitar excepciones no deseadas
        try {
            if (request.getParameter("anio") != null && !request.getParameter("anio").isEmpty()) {
                año = Integer.parseInt(request.getParameter("anio"));
            }

            if (request.getParameter("precio") != null && !request.getParameter("precio").isEmpty()) {
                precioMaximo =Integer.parseInt(request.getParameter("precio"));
            }

            // Filtrar coches según los parámetros proporcionados
            List<Coches> cochesFiltrados = new ArrayList<>(); // Inicializar la lista

            if (!modelo.isEmpty() && !marca.isEmpty() && año != 0 && precioMaximo != 0.0 && !estado.isEmpty()) {
                // Filtrar por todos los criterios
                cochesFiltrados = CocheService.encontrarCochePorAll(marca, modelo, año, precioMaximo, estado);
            } else if (!marca.isEmpty()) {
                // Filtrar solo por marca
                cochesFiltrados = CocheService.encontrarCochePorMarca(marca);
            } else if (!modelo.isEmpty()) {
                // Filtrar solo por modelo
                cochesFiltrados = CocheService.encontrarCochePorModelo(modelo);
            } else if (año != 0) {
                // Filtrar solo por año
                cochesFiltrados = CocheService.encontrarCochePorAnio(año);
            } else if (precioMaximo != 0) {
                // Filtrar solo por precio máximo
                cochesFiltrados = CocheService.encontrarCochePorPrecio(precioMaximo);
            } else if (!estado.isEmpty()) {
                // Filtrar solo por estado
                cochesFiltrados = CocheService.encontrarCochePorEstado(estado);
            }

            // Puedes almacenar la lista de coches en el alcance de la solicitud o de sesión según tus necesidades
            request.setAttribute("cochesFiltrados", cochesFiltrados);

            // Redirigir a una página de resultados o mostrar la información directamente en el servlet
            request.getRequestDispatcher("/mostrarCoches.jsp").forward(request, response);

        } catch (NumberFormatException e) {
            // Manejo de error si hay un problema al convertir a int o double
            e.printStackTrace();
            // Aquí podrías redirigir a una página de error o realizar alguna otra acción
        } catch (Exception e) {
            // Manejo de otras excepciones
            e.printStackTrace();
            // Aquí podrías redirigir a una página de error o realizar alguna otra acción
        }
    }
}



//     <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
//    /**
//     * Handles the HTTP <code>GET</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
//    /**
//     * Handles the HTTP <code>POST</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
//    /**
//     * Returns a short description of the servlet.
//     *
//     * @return a String containing servlet description
//     */
//    @Override
//    public String getServletInfo() {
//        return "Short description";
//    }// </editor-fold>
//
//}
