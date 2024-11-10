/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ceep.service;

import com.ceep.data.*;
import com.ceep.dominio.Coches;
import java.math.BigDecimal;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author PC
 */
@Stateless
public class CocheService implements iCocheService{
     @Inject
    private iCocheDao cocheDao;

    @Override
    public List<Coches> listarCoches() {
        return cocheDao.findAllCoches();
    }

    @Override
    public Coches encontrarCochePorId(Coches coches) {
        return cocheDao.findCocheById(coches);
    }

    @Override
    public void registrarCoche(Coches coches) {
        cocheDao.insertarCoche(coches);
    }

    @Override
    public void actualizarCoche(Coches coches) {
        cocheDao.actualizarCoche(coches);
    }

    @Override
    public void borrarCoche(Coches coches) {
        cocheDao.borrarCoche(coches);
    }

    @Override
    public List<Coches> encontrarCochePorMarca(String marca) {
       
        return cocheDao.findByMarca(marca);
         
    }

    @Override
    public List<Coches> encontrarCochePorModelo(String modelo) {
        return cocheDao.findByModelo(modelo);
    }

    @Override
    public List<Coches> encontrarCochePorAnio(int anio) {
        return cocheDao.findByAnio(anio);
    }

    @Override
    public List<Coches> encontrarCochePorPrecio(Integer precio) {
        return cocheDao.findByPrecio(precio);
    }

    @Override
    public List<Coches> encontrarCochePorEstado(String estado) {
        return cocheDao.findByEstado(estado);
    }

    @Override
    public List<Coches> encontrarCochePorAll(String marca, String modelo, int anio, Integer precioMax, String estado) {
        return cocheDao.filtrarCoches(marca, modelo, anio, precioMax, estado);
    }

    @Override
    public List<Coches> findAllCochesSinVender() {
            return cocheDao.findAllCochesSinVender();
    }

  
    
}
