/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ceep.data;

import com.ceep.dominio.Favoritos;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author PC
 */
@Stateless
public class FavoritosDao implements iFavoritosDao{
@PersistenceContext(unitName = "ConcesionarioPU")
    EntityManager em;
    @Override
    public List<Favoritos> findAllFavoritos() {
        return em.createNamedQuery("Favoritos.findAll").getResultList();
    }

    @Override
    public Favoritos findFavoritosById(Favoritos favoritos) {
     return em.find(Favoritos.class,favoritos.getFavoritoId());
    }

    @Override
    public void insertarFavoritos(Favoritos favoritos) {
        em.persist(favoritos);
    }

    @Override
    public void actualizarFavoritos(Favoritos favoritos) {
        em.merge(favoritos);
    }

    @Override
    public void borrarFavoritos(Favoritos favoritos) {
        em.remove(em.merge(favoritos));
    }
    
}
