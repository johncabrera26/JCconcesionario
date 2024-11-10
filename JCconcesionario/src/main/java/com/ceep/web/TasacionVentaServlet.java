/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.ceep.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author PC
 */
@WebServlet(name = "TasacionVentaServlet", urlPatterns = {"/TasacionVentaServlet"})
public class TasacionVentaServlet extends HttpServlet {

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
    try {
        // Obtener los parámetros del formulario
        String matriculaString = request.getParameter("coche_id");
        int matricula = (matriculaString != null && !matriculaString.isEmpty()) ? Integer.parseInt(matriculaString) : 0;
        String marca = request.getParameter("marca");
        String modelo = request.getParameter("modelo");
        String anioFabricacionString = request.getParameter("anio_fabricacion");
        int anioFabricacion = (anioFabricacionString != null && !anioFabricacionString.isEmpty()) ? Integer.parseInt(anioFabricacionString) : 0;

        // Lógica para calcular la tasación (aquí puedes implementar tu propia lógica)
        double tasacion = calcularTasacion(matricula, marca, modelo, anioFabricacion);

        // Guardar la tasación en el objeto request para mostrarla en la página TasacionVenta.jsp
        request.setAttribute("tasacion", tasacion);
        request.setAttribute("coche_id", matricula);
        request.setAttribute("marca", marca);
        request.setAttribute("modelo", modelo);
        request.setAttribute("anio_fabricacion", anioFabricacion);

        // Redirigir a TasacionVenta.jsp
        RequestDispatcher dispatcher = request.getRequestDispatcher("TasacionVenta.jsp");
        dispatcher.forward(request, response);
    } catch (NumberFormatException e) {
        // Manejar error si la conversión de año de fabricación a entero falla
        response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Formato de año de fabricación inválido");
    }
}

  private double calcularTasacion(int matricula, String marca, String modelo, int anioFabricacion) {
    double tasacionBase = 10000.00; // Valor base

    // Ajustes adicionales basados en la marca
    if (marca.equalsIgnoreCase("Toyota")) {
        tasacionBase += 2000.00; // Ajuste para la marca Toyota
    } else if (marca.equalsIgnoreCase("Honda")) {
        tasacionBase += 1800.00; // Ajuste para la marca Honda
    } else if (marca.equalsIgnoreCase("Chevrolet")) {
        tasacionBase += 1500.00; // Ajuste para la marca Chevrolet
    } else if (marca.equalsIgnoreCase("Volkswagen")) {
        tasacionBase += 1700.00; // Ajuste para la marca Volkswagen
    } else if (marca.equalsIgnoreCase("Ford")) {
        tasacionBase += 1600.00; // Ajuste para la marca Ford
    } else if (marca.equalsIgnoreCase("Nissan")) {
        tasacionBase += 1900.00; // Ajuste para la marca Nissan
    } else if (marca.equalsIgnoreCase("BMW")) {
        tasacionBase += 2500.00; // Ajuste para la marca BMW
    } else if (marca.equalsIgnoreCase("Mercedes")) {
        tasacionBase += 2800.00; // Ajuste para la marca Mercedes
    } else if (marca.equalsIgnoreCase("Audi")) {
        tasacionBase += 2600.00; // Ajuste para la marca Audi
    }

    // Ajuste adicional basado en el modelo
    if (modelo.equalsIgnoreCase("Civic")) {
        tasacionBase += 1200.00; // Ajuste para el modelo Civic
    } else if (modelo.equalsIgnoreCase("Silverado")) {
        tasacionBase += 2200.00; // Ajuste para el modelo Silverado
    } else if (modelo.equalsIgnoreCase("Golf")) {
        tasacionBase += 1400.00; // Ajuste para el modelo Golf
    } else if (modelo.equalsIgnoreCase("Corolla")) {
        tasacionBase += 1800.00; // Ajuste para el modelo Corolla
    } else if (modelo.equalsIgnoreCase("Mustang")) {
        tasacionBase += 2500.00; // Ajuste para el modelo Mustang
    } else if (modelo.equalsIgnoreCase("Cruze")) {
        tasacionBase += 1600.00; // Ajuste para el modelo Cruze
    } else if (modelo.equalsIgnoreCase("Altima")) {
        tasacionBase += 2000.00; // Ajuste para el modelo Altima
    } else if (modelo.equalsIgnoreCase("X5")) {
        tasacionBase += 3000.00; // Ajuste para el modelo X5
    } else if (modelo.equalsIgnoreCase("Benz")) {
        tasacionBase += 3200.00; // Ajuste para el modelo Benz
    } else if (modelo.equalsIgnoreCase("Camaro")) {
        tasacionBase += 2800.00; // Ajuste para el modelo Camaro
    } else if (modelo.equalsIgnoreCase("Juke")) {
        tasacionBase += 1700.00; // Ajuste para el modelo Juke
    } else if (modelo.equalsIgnoreCase("R8")) {
        tasacionBase += 3500.00; // Ajuste para el modelo R8
    }

    // Ajuste adicional basado en el año de fabricación
    if (anioFabricacion < 2010) {
        tasacionBase -= 1000.00; // Ajuste para vehículos más antiguos
    } else if (anioFabricacion > 2020) {
        tasacionBase += 1000.00; // Ajuste para vehículos más recientes
    }

    return tasacionBase;
}

}
