/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.ceep.web;

import com.ceep.data.UsuarioDao;
import com.ceep.dominio.Usuarios;
import com.ceep.service.iUsuarioService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Alumno Mañana
 */
@WebServlet(name = "Login", urlPatterns = {"/login"})
public class Login extends HttpServlet {
    @Inject
    private iUsuarioService UsuarioService;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    try{
        String correo = request.getParameter("correo");
        String contrasena = request.getParameter("contrasena");

        Usuarios usuario = new Usuarios();
        usuario.setCorreo(correo);
        usuario.setContrasena(contrasena);

        Usuarios usuarioLogueado = UsuarioService.IniciarSesion(usuario);

        if (usuarioLogueado != null) {
            // El usuario se ha autenticado con éxito

      HttpSession session = request.getSession();
           session.setAttribute("usuarioLogueado", usuarioLogueado);
           session.setAttribute("nombreUsuario", usuarioLogueado.getNombre());
           session.setAttribute("UsuarioId",usuarioLogueado.getUsuarioId());
           

            // Redirigir a Index
            response.sendRedirect("index.jsp");
        } else {
                 HttpSession sesion = request.getSession();
             sesion.setAttribute("error", "Credenciales incorrectas");
            request.getRequestDispatcher("loguearse.jsp").forward(request, response);
        }
    }catch (IOException | ServletException e) {
        
      
}
    }
}
//  }
//
////    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
////    /**
////     * Handles the HTTP <code>GET</code> method.
////     *
////     * @param request servlet request
////     * @param response servlet response
////     * @throws ServletException if a servlet-specific error occurs
////     * @throws IOException if an I/O error occurs
////     */
////    @Override
////    protected void doGet(HttpServletRequest request, HttpServletResponse response)
////            throws ServletException, IOException {
////        processRequest(request, response);
////    }
////}
//
////    /**
////     * Handles the HTTP <code>POST</code> method.
////     *
////     * @param request servlet request
////     * @param response servlet response
////     * @throws ServletException if a servlet-specific error occurs
////     * @throws IOException if an I/O error occurs
////     */
////    @Override
////    protected void doPost(HttpServletRequest request, HttpServletResponse response)
////            throws ServletException, IOException {
////        processRequest(request, response);
////    }
////
////    /**
////     * Returns a short description of the servlet.
////     *
////     * @return a String containing servlet description
////     */
////    @Override
////    public String getServletInfo() {
////        return "Short description";
////    }// </editor-fold>
////
////}
