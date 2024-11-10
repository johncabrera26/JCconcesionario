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
public interface iFavoritosDao {
     public List<Favoritos> findAllFavoritos();
     
      public Favoritos findFavoritosById(Favoritos favoritos);
   
    public void insertarFavoritos(Favoritos favoritos);
    
        public void actualizarFavoritos(Favoritos favoritos);
    
    
    public void borrarFavoritos(Favoritos favoritos);
}
