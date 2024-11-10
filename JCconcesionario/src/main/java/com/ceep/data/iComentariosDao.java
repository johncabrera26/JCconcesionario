/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ceep.data;

import com.ceep.dominio.*;
import java.util.List;

/**
 *
 * @author PC
 */
public interface iComentariosDao {
     public List<Comentarios> findAllComentarios();
     
        public Comentarios findComentariosById(Comentarios comentarios);
    // Método que me añade un objeto de persona a la base de datos
    public void insertarComentarios(Comentarios comentarios);
    
    // Método que nos permite actualizar una persona
    public void actualizarComentarios(Comentarios comentarios);
    
    // Método que me elimina un objeto de persona
    public void borrarComentarios(Comentarios comentarios);
    
}
