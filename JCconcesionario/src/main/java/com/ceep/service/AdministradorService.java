/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ceep.service;

import com.ceep.data.iAdministradorDao;
import com.ceep.dominio.Administrador;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Alumno Mañana
 */
@Stateless
public class AdministradorService implements iAdministradorService{
    @Inject
    private iAdministradorDao administradorDao;
    @Override
    public Administrador IniciarSesion(Administrador administrador) {
       
        return administradorDao.IniciarSesion(administrador);
    }
    
}
