/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ceep.web;

import com.ceep.dominio.Coches;
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
@WebServlet(name = "CocheServlet",urlPatterns = {"/coches"})
public class CocheServlet extends HttpServlet{
     @Inject
    
    iCocheService cochesService;
      @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException,IOException{
    List<Coches> coches=cochesService.listarCoches();
     System.out.println("coches" +coches);
     
     request.setAttribute("coches", coches);
     
     request.getRequestDispatcher("listarCoches.jsp").forward(request, response);
      
            
    
    }
}
