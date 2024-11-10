/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ceep.service;

import com.ceep.dominio.Usuarios;
import java.util.List;
import javax.transaction.Transactional;

/**
 *
 * @author PC
 */
public interface iUsuarioService {
    public List<Usuarios> listarUsuarios();
    
    public Usuarios encontrarUsuarioPorId(int usuarios);
    
      public void registrarUsuario(Usuarios usuarios);
    
    // Método que me actualiza una persona
    public void actualizarUsuario(Usuarios usuarios);
    
 
    // Método que me borra una persona
    public void borrarUsuario(Usuarios usuarios);
    
    public Usuarios IniciarSesion(Usuarios usuario);
        
    
    
    
  
    
}
