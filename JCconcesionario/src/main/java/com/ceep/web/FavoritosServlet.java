/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ceep.web;

import com.ceep.dominio.*;
import com.ceep.service.*;
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
@WebServlet(name = "FavoritosServlet",urlPatterns = {"/favoritos"})
public class FavoritosServlet extends HttpServlet {
   @Inject
    
    iFavoritosService favoritoService; 
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException,IOException{
    List<Favoritos> favoritos=favoritoService.listarFavoritos();
        System.out.println("favoritos" +favoritos);
        
        request.setAttribute("favoritos", favoritos);
        
        request.getRequestDispatcher("listadoFavoritos.jsp").forward(request, response);
    
    
    }
}
