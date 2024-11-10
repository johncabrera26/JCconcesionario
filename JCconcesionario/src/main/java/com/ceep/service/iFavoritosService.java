/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ceep.service;

import com.ceep.dominio.*;
import java.util.List;

/**
 *
 * @author PC
 */
public interface iFavoritosService {
    public List<Favoritos> listarFavoritos();
    
       public Favoritos encontrarFavoritosPorId(Favoritos favoritos);
    
    // Función que me devuelve una persona en base a su email
    public Favoritos encontrarFavoritosPorEmail(Favoritos favoritos);
    
    // Método que me registra una persona
    public void registrarFavoritos(Favoritos favoritos);
    
    // Método que me actualiza una persona
    public void actualizarFavoritos(Favoritos favoritos);
    
    // Método que me borra una persona
    public void borrarFavoritos(Favoritos favoritos);
}
