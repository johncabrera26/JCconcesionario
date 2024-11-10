/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ceep.data;

import com.ceep.dominio.CochescompradosByJc;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author PC
 */
@Stateless
public class CochesCompradosDao implements iCochesCompradosDao{
@PersistenceContext(unitName = "ConcesionarioPU")
    EntityManager em;

    @Override
    public List<CochescompradosByJc> findAllCochesComprados() {
       return em.createNamedQuery("CochescompradosByJc.findAll").getResultList();
    }


    @Override
    public void insertarCochesComprados(CochescompradosByJc cochescompradosByJc) {
        em.persist(cochescompradosByJc);
    }

    @Override
    public void actualizarCochesComprados(CochescompradosByJc cochescompradosByJc) {
        em.merge(cochescompradosByJc);
    }

    @Override
    public void borrarCochesComprados(CochescompradosByJc cochescompradosByJc) {
        em.remove(em.merge(cochescompradosByJc));
    }

    @Override
    public CochescompradosByJc findCocheCompradoById(CochescompradosByJc cochescompradosByJc) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
