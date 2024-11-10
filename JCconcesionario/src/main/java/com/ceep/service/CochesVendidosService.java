/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ceep.service;

import com.ceep.data.*;
import com.ceep.dominio.CochesvendidosByJc;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author PC
 */
@Stateless
public class CochesVendidosService  implements iCochesVendidosService{

     @Inject
    private iCochesVendidosDao cochesvendidosDao;
    @Override
    public List<CochesvendidosByJc> listarCochesVendidos() {
    
        return cochesvendidosDao.findAllCochesVendidos();
    }

    @Override
    public CochesvendidosByJc encontrarCochesVendidos_by_jcPorId(CochesvendidosByJc cochesvendidosByJc) {
        return cochesvendidosDao.findCochesVendidos_by_jcById(cochesvendidosByJc);
    }

    @Override
    public void registrarCochesVendidos_by_jc(CochesvendidosByJc cochesvendidosByJc) {
        cochesvendidosDao.actualizarCochesVendidos_by_jc(cochesvendidosByJc);
    }

    @Override
    public void actualizarCochesVendidos_by_jc(CochesvendidosByJc cochesvendidosByJc) {
        cochesvendidosDao.actualizarCochesVendidos_by_jc(cochesvendidosByJc);
    }

    @Override
    public void borrarCochesVendidos_by_jc(CochesvendidosByJc cochesvendidosByJc) {
        cochesvendidosDao.borrarCochesVendidos_by_jc(cochesvendidosByJc);
    }
    
}
