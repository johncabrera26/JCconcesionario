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
public interface iCochesCompradosService {
     public List<CochescompradosByJc> listarCochesComprados();
     
      public CochescompradosByJc encontrarCochesCompradosPorId(CochescompradosByJc cochescompradosByJc);
    
   
    
    // Método que me registra una persona
    public void registrarCochesComprados(CochescompradosByJc cochescompradosByJc);
    
    // Método que me actualiza una persona
    public void actualizarCochesComprados(CochescompradosByJc cochescompradosByJc);
    
    // Método que me borra una persona
    public void borrarCochesComprados(CochescompradosByJc cochescompradosByJc);
}
