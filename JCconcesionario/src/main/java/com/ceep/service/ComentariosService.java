/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ceep.service;

import com.ceep.data.*;
import com.ceep.dominio.Comentarios;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author PC
 */
@Stateless
public class ComentariosService implements iComentariosService{

    @Inject
    private iComentariosDao comentarioDao;
    @Override
    public List<Comentarios> listarComentarios() {
        return comentarioDao.findAllComentarios();
    }

    @Override
    public Comentarios encontrarComentariosPorId(Comentarios comentarios) {
       return comentarioDao.findComentariosById(comentarios);
    }

    @Override
    public void registrarComentarios(Comentarios comentarios) {
        comentarioDao.insertarComentarios(comentarios);
    }

    @Override
    public void actualizarComentarios(Comentarios comentarios) {
    
        comentarioDao.actualizarComentarios(comentarios);
    }

    @Override
    public void borrarComentarios(Comentarios comentarios) {
    
        comentarioDao.borrarComentarios(comentarios);
    }
    
}
