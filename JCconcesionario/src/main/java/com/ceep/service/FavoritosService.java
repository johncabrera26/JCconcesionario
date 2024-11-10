/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ceep.service;

import com.ceep.data.*;
import com.ceep.dominio.Favoritos;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author PC
 */
@Stateless
public class FavoritosService implements iFavoritosService{

     @Inject
    private iFavoritosDao favoritosDao;
    @Override
    public List<Favoritos> listarFavoritos() {
        return favoritosDao.findAllFavoritos();
    }

    @Override
    public Favoritos encontrarFavoritosPorId(Favoritos favoritos) {
         return favoritosDao.findFavoritosById(favoritos);
    }

    @Override
    public Favoritos encontrarFavoritosPorEmail(Favoritos favoritos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void registrarFavoritos(Favoritos favoritos) {
       favoritosDao.insertarFavoritos(favoritos);
    }

    @Override
    public void actualizarFavoritos(Favoritos favoritos) {
        favoritosDao.actualizarFavoritos(favoritos);
    }

    @Override
    public void borrarFavoritos(Favoritos favoritos) {
    
        favoritosDao.borrarFavoritos(favoritos);
    }
    
}
