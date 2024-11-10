/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ceep.data;

import com.ceep.dominio.CochescompradosByJc;
import java.util.List;

/**
 *
 * @author PC
 */
public interface iCochesCompradosDao {
    
    
    public List<CochescompradosByJc> findAllCochesComprados();
     
      public CochescompradosByJc findCocheCompradoById(CochescompradosByJc cochescompradosByJc);
  
      
    public void insertarCochesComprados(CochescompradosByJc cochescompradosByJc);
    
    
    public void actualizarCochesComprados(CochescompradosByJc cochescompradosByJc);
    
    
    public void borrarCochesComprados(CochescompradosByJc cochescompradosByJc);
}
