/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ceep.service;

import com.ceep.dominio.*;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author PC
 */
public interface iCocheService {
    
     public List<Coches> listarCoches();
     public List<Coches> findAllCochesSinVender();
     
      public Coches encontrarCochePorId(Coches coches);
    
   
    public void registrarCoche(Coches coches);
    
   
    public void actualizarCoche(Coches coches);
    
  
    public void borrarCoche(Coches coches);
    
    public List<Coches> encontrarCochePorMarca(String marca);
    public List<Coches> encontrarCochePorModelo(String modelo);
    public List<Coches> encontrarCochePorAnio(int anio);
    public List<Coches> encontrarCochePorPrecio(Integer precio);
    public List<Coches> encontrarCochePorEstado(String estado);
    public List<Coches> encontrarCochePorAll(String marca, String modelo, int anio, Integer precioMax, String estado);
    
    
}
