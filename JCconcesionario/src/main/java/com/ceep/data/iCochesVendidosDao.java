/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ceep.data;

import com.ceep.dominio.CochesvendidosByJc;
import java.util.List;

/**
 *
 * @author PC
 */
public interface iCochesVendidosDao {
    
     public List<CochesvendidosByJc> findAllCochesVendidos();
     
      public CochesvendidosByJc findCochesVendidos_by_jcById(CochesvendidosByJc cochesvendidosByJc);
    
    public void insertarCochesVendidos_by_jc(CochesvendidosByJc cochesvendidosByJc);
    
    
    public void actualizarCochesVendidos_by_jc(CochesvendidosByJc cochesvendidosByJc);
    
  
    public void borrarCochesVendidos_by_jc(CochesvendidosByJc cochesvendidosByJc);
    
}
