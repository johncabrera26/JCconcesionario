/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ceep.data;

import com.ceep.dominio.Usuarios;
import java.util.List;

/**
 *
 * @author PC
 */
public interface iUsuarioDao {
    
    public List<Usuarios> findAllUsuarios();
    
     public Usuarios findUsuarioById(int usuario);
     
       public void insertarUsuario(Usuarios usuario);
    
    // Método que nos permite actualizar una persona
    public void actualizarUsuario(Usuarios usuario);
    
    // Método que me elimina un objeto de persona
    public void borrarUsuario(Usuarios usuario);
    
    public Usuarios IniciarSesion(Usuarios usuario);
}
