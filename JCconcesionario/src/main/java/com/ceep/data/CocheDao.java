/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ceep.data;

import com.ceep.dominio.Coches;
import java.math.BigDecimal;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author PC
 */
@Stateless
public class CocheDao implements iCocheDao{
     @PersistenceContext(unitName = "ConcesionarioPU")
    EntityManager em;

    @Override
    public List<Coches> findAllCoches() {
        return em.createNamedQuery("Coches.findAllCoches").getResultList();
    }

    @Override
    public Coches findCocheById(Coches coches) {
        return em.find(Coches.class, coches.getCocheId());
    }

    @Override
    public void insertarCoche(Coches coches) {
        em.persist(coches);
    }

    @Override
    public void actualizarCoche(Coches coches) {
        em.merge(coches);
    }

    @Override
    public void borrarCoche(Coches coches) {
        em.remove(em.merge(coches));
    }
@Override
public List<Coches> findByMarca(String marca) {
    TypedQuery<Coches> query = em.createQuery("SELECT c FROM Coches c WHERE c.marca = :marca", Coches.class);
    query.setParameter("marca", marca);
    return query.getResultList();
}

@Override
public List<Coches> findByModelo(String modelo) {
    TypedQuery<Coches> query = em.createQuery("SELECT c FROM Coches c WHERE c.modelo = :modelo", Coches.class);
    query.setParameter("modelo", modelo);
    return query.getResultList();
}

@Override
public List<Coches> findByAnio(int anio) {
    TypedQuery<Coches> query = em.createQuery("SELECT c FROM Coches c WHERE c.anioFabricacion = :anio", Coches.class);
    query.setParameter("anio", anio);
    return query.getResultList();
}

@Override
public List<Coches> findByPrecio(Integer precio) {
    TypedQuery<Coches> query = em.createQuery("SELECT c FROM Coches c WHERE c.precio = :precio", Coches.class);
    query.setParameter("precio", precio);
    return query.getResultList();
}

@Override
public List<Coches> findByEstado(String estado) {
    TypedQuery<Coches> query = em.createQuery("SELECT c FROM Coches c WHERE c.estado = :estado", Coches.class);
    query.setParameter("estado", estado);
    return query.getResultList();
}

    @Override
    public List<Coches> filtrarCoches(String marca, String modelo, int anio, Integer precioMax, String estado) {
      Query query = em.createQuery("SELECT c FROM Coches c WHERE c.modelo = :modelo AND c.marca = :marca AND c.anioFabricacion = :anio AND c.precio <= :precioMaximo AND c.estado = :estado");

        query.setParameter("modelo", modelo);
        query.setParameter("marca", marca);
        query.setParameter("anio", anio);
        query.setParameter("precioMaximo", precioMax);
        query.setParameter("estado", estado);

        try {
            return (List<Coches>) query.getResultList();
        } catch (NoResultException e) {
            return null;
        }
    }

    @Override
  public List<Coches> findAllCochesSinVender() {
        // Cambia la consulta para excluir los coches vendidos
        TypedQuery<Coches> query = em.createQuery("SELECT c FROM Coches c WHERE c.vendido = false", Coches.class);
        return query.getResultList();
    }
    
}
