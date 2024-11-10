/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ceep.service;

import com.ceep.data.*;
import com.ceep.dominio.CochescompradosByJc;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author PC
 */
@Stateless
public class CochesCompradosService implements iCochesCompradosService{

    @Inject
    private iCochesCompradosDao cochescompradosDao;
    @Override
    public List<CochescompradosByJc> listarCochesComprados() {
    
        return cochescompradosDao.findAllCochesComprados();
    }

    @Override
    public CochescompradosByJc encontrarCochesCompradosPorId(CochescompradosByJc cochescompradosByJc) {
        return cochescompradosDao.findCocheCompradoById(cochescompradosByJc);
    }

    @Override
    public void registrarCochesComprados(CochescompradosByJc cochescompradosByJc) {
        cochescompradosDao.insertarCochesComprados(cochescompradosByJc);
    }

    @Override
    public void actualizarCochesComprados(CochescompradosByJc cochescompradosByJc) {
        cochescompradosDao.actualizarCochesComprados(cochescompradosByJc);
    }

    @Override
    public void borrarCochesComprados(CochescompradosByJc cochescompradosByJc) {
        cochescompradosDao.borrarCochesComprados(cochescompradosByJc);
    }
    
}
