/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ceep.data;

import com.ceep.dominio.Coches;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author PC
 */
public interface iCocheDao {
     public List<Coches> findAllCoches();
     public List<Coches> findAllCochesSinVender();
     
       public Coches findCocheById(Coches coches);
       
       public List<Coches> findByMarca(String marca);
       public List<Coches> findByModelo(String modelo);
       public List<Coches> findByAnio(int anio );
       public List<Coches> findByPrecio(Integer precio);
       public List<Coches> findByEstado(String estado);
       public List<Coches> filtrarCoches(String marca,String modelo,int anio,Integer precioMax,String estado);
               
       
    // Método que me añade un objeto de persona a la base de datos
    public void insertarCoche(Coches coches);
    
    // Método que nos permite actualizar una persona
    public void actualizarCoche(Coches coches);
    
    // Método que me elimina un objeto de persona
    public void borrarCoche(Coches coches);
    
}
