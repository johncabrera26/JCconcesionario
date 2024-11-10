/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ceep.data;

import com.ceep.dominio.Usuarios;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author PC
 */
@Stateless
public class UsuarioDao implements iUsuarioDao{
    
    @PersistenceContext(unitName = "ConcesionarioPU")
    EntityManager em;

    @Override
    public List<Usuarios> findAllUsuarios() {
      
        return em.createNamedQuery("Usuarios.findAllUsuarios").getResultList();
    }

    @Override
    public Usuarios findUsuarioById(int usuario) {
        return em.find(Usuarios.class,usuario);
    }

    @Override
    public void insertarUsuario(Usuarios usuario) {
        em.persist(usuario);
    }

    @Override
    public void actualizarUsuario(Usuarios usuario) {
        
        em.merge(usuario);
    }

    @Override
    public void borrarUsuario(Usuarios usuario) {
        
        em.remove(em.merge(usuario));
    }

    @Override
    public Usuarios IniciarSesion(Usuarios usuario) {
      
     Query query = em.createQuery("SELECT u FROM Usuarios u WHERE u.correo = :correo AND u.contrasena = :contrasena");
        query.setParameter("correo", usuario.getCorreo());
        query.setParameter("contrasena", usuario.getContrasena());

        try {
            return (Usuarios) query.getSingleResult();
        } catch (NoResultException e) {
            
            return null; 
        }
    }

}
