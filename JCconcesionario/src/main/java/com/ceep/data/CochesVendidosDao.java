/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ceep.data;

import com.ceep.dominio.CochesvendidosByJc;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author PC
 */
@Stateless
public class CochesVendidosDao implements iCochesVendidosDao{

     @PersistenceContext(unitName = "ConcesionarioPU")
    EntityManager em;
    @Override
    public List<CochesvendidosByJc> findAllCochesVendidos() {
        return em.createNamedQuery("CochesvendidosByJc.findAll").getResultList();
    }

    @Override
    public CochesvendidosByJc findCochesVendidos_by_jcById(CochesvendidosByJc cochesvendidosByJc) {
        return em.find(CochesvendidosByJc.class, cochesvendidosByJc.getCocheId());
    }

    @Override
    public void insertarCochesVendidos_by_jc(CochesvendidosByJc cochesvendidosByJc) {
        em.persist(cochesvendidosByJc);
    }

    @Override
    public void actualizarCochesVendidos_by_jc(CochesvendidosByJc cochesvendidosByJc) {
        em.merge(cochesvendidosByJc);
    }

    @Override
    public void borrarCochesVendidos_by_jc(CochesvendidosByJc cochesvendidosByJc) {
        em.remove(em.merge(cochesvendidosByJc));
    }
    
}
