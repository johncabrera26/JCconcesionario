/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.ceep.web;

import com.ceep.dominio.Coches;
import com.ceep.dominio.Usuarios;
import com.ceep.service.iCocheService;
import com.ceep.service.iUsuarioService;
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
@WebServlet(name = "EliminarCocheService", urlPatterns = {"/EliminarCocheService"})
public class EliminarCocheService extends HttpServlet {
    
    @Inject
    iCocheService cocheService;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       try {
            // Obtén el usuarioId de los parámetros de la solicitud
            int cocheId = Integer.parseInt(request.getParameter("cocheId"));
            Coches cocheEliminar = new Coches();
            cocheEliminar.setCocheId(cocheId);
            cocheService.borrarCoche(cocheEliminar);

            // Redirige al usuario a la página adecuada después de la eliminación
            response.sendRedirect("coches");
        } catch (Exception ex) {
            // Manejar la excepción adecuadamente, por ejemplo, imprimir la información de la excepción
            ex.printStackTrace();

            // También puedes redirigir a una página de error o mostrar un mensaje de error al usuario
            response.sendRedirect("error.jsp");
        }
    }
}

//    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
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
