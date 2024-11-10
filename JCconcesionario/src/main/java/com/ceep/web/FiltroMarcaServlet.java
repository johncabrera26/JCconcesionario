/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.ceep.web;

import com.ceep.dominio.Coches;
import com.ceep.service.iCocheService;
import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "FiltroMarcaServlet", urlPatterns = { "/FiltroMarcaServlet" })
public class FiltroMarcaServlet extends HttpServlet {

    @Inject
    private iCocheService cocheService;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String nombreMarca = request.getParameter("marca");

            // Validar si el nombre de la marca no es nulo o vacío antes de realizar la filtración
            if (nombreMarca != null && !nombreMarca.isEmpty()) {
                // Filtrar coches por marca
                List<Coches> cochesFiltrados = cocheService.encontrarCochePorMarca(nombreMarca);

                // Almacenar la lista de coches en el alcance de la solicitud o de sesión según sea necesario
                request.setAttribute("cochesFiltrados", cochesFiltrados);

                // Redirigir a una página de resultados o mostrar la información directamente en el servlet
                request.getRequestDispatcher("/mostrarCoches.jsp").forward(request, response);
            } else {
                // Manejar el caso en que no se proporciona un nombre de marca válido
                // Puedes redirigir a una página de error o realizar alguna otra acción
            }
        } catch (Exception e) {
            // Manejar otras excepciones si es necesario
            e.printStackTrace();
            // Puedes redirigir a una página de error o realizar alguna otra acción
        }
    }
}
