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
public interface iCochesVendidosService {
    
     public List<CochesvendidosByJc> listarCochesVendidos();
     
      public CochesvendidosByJc encontrarCochesVendidos_by_jcPorId(CochesvendidosByJc cochesvendidosByJc);
    
   
    
    
    public void registrarCochesVendidos_by_jc(CochesvendidosByJc cochesvendidosByJc);
    
    
    public void actualizarCochesVendidos_by_jc(CochesvendidosByJc cochesvendidosByJc);
    
    
    public void borrarCochesVendidos_by_jc(CochesvendidosByJc cochesvendidosByJc);
    
}
