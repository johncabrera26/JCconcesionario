/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ceep.data;

import com.ceep.dominio.Administrador;
import com.ceep.dominio.Usuarios;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Alumno Mañana
 */
@Stateless
public class AdministradorDao implements iAdministradorDao{
    
     @PersistenceContext(unitName = "ConcesionarioPU")
    EntityManager em;


    @Override
    public Administrador IniciarSesion(Administrador administrador) {
        
        Query query = em.createQuery("SELECT a FROM Administrador a WHERE a.correo = :correo AND a.contrasena = :contrasena");
        query.setParameter("correo", administrador.getCorreo());
        query.setParameter("contrasena", administrador.getContrasena());

        try {
            return (Administrador) query.getSingleResult();
        } catch (NoResultException e) {
            
            return null; 
        }
    }
    
}
