/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ceep.web;

import com.ceep.dominio.Usuarios;
import com.ceep.service.iUsuarioService;
import java.io.IOException;
import java.util.List;
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
@WebServlet(name = "UsuarioServlet",urlPatterns = {"/usuarios"})
public class UsuarioServlet extends HttpServlet{
    @Inject
    
    iUsuarioService usuarioService;
    
    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException,IOException{
    List<Usuarios> usuarios=usuarioService.listarUsuarios();
        System.out.println("usuarios" +usuarios);
        
        request.setAttribute("usuarios", usuarios);
        
        request.getRequestDispatcher("listadoUsuarios.jsp").forward(request, response);
    
    
    }
    
}
