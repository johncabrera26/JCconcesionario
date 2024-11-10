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
public interface iComentariosService {
    public List<Comentarios> listarComentarios();
    
      public Comentarios encontrarComentariosPorId(Comentarios comentarios);
    
   
    
    
    public void registrarComentarios(Comentarios comentarios);
    
    
    public void actualizarComentarios(Comentarios comentarios);
    
   
    public void borrarComentarios(Comentarios comentarios);
    
}
