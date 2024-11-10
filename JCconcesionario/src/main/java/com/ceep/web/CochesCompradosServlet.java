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
@WebServlet(name = "CochesCompradosServlet",urlPatterns = {"/cochescomprados"})
public class CochesCompradosServlet extends HttpServlet{
    @Inject
    
    iCochesCompradosService cochescompradosService;
    
     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException,IOException{
    List<CochescompradosByJc> cochesComprados= cochescompradosService.listarCochesComprados();
    
    System.out.println("cochesComprados" +cochesComprados);
        
        request.setAttribute("cochesComprados", cochesComprados);
        
        request.getRequestDispatcher("CochesComprados.jsp").forward(request, response);
    }
    
}
