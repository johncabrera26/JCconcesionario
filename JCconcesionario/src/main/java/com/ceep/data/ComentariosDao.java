/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ceep.data;

import com.ceep.dominio.Comentarios;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author PC
 */
@Stateless
public class ComentariosDao implements iComentariosDao{

        @PersistenceContext(unitName = "ConcesionarioPU")
    EntityManager em;
    @Override
    public List<Comentarios> findAllComentarios() {
        return em.createNamedQuery("Comentarios.findAll").getResultList();
    }

    @Override
    public Comentarios findComentariosById(Comentarios comentarios) {
        return em.find(Comentarios.class, comentarios.getComentarioId());
    }

    @Override
    public void insertarComentarios(Comentarios comentarios) {
        em.persist(comentarios);
    }

    @Override
    public void actualizarComentarios(Comentarios comentarios) {
        em.merge(comentarios);
    }

    @Override
    public void borrarComentarios(Comentarios comentarios) {
        em.remove(em.merge(comentarios));
    }
    
}
