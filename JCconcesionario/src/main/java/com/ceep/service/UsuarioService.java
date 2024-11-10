/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ceep.service;

import com.ceep.data.iUsuarioDao;
import com.ceep.dominio.Usuarios;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author PC
 */
@Stateless
public class UsuarioService implements iUsuarioService{
    @Inject
    private iUsuarioDao usuarioDao;


    @Override
    public List<Usuarios> listarUsuarios() {
        
        return usuarioDao.findAllUsuarios();
    }

    @Override
    public Usuarios encontrarUsuarioPorId(int usuarios) {
        return usuarioDao.findUsuarioById(usuarios);
    }

    @Override
    public void registrarUsuario(Usuarios usuarios) {
        usuarioDao.insertarUsuario(usuarios);
    }

    @Override
    public void actualizarUsuario(Usuarios usuarios) {
        usuarioDao.actualizarUsuario(usuarios);
    }

    @Override
    public void borrarUsuario(Usuarios usuarios) {
        usuarioDao.borrarUsuario(usuarios);
    }

    @Override
    public Usuarios IniciarSesion(Usuarios usuario) {
       return usuarioDao.IniciarSesion(usuario);
    }


    
}
