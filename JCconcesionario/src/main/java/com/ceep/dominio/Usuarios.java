/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ceep.dominio;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Alumno Mañana
 */
@Entity
@Table(name = "usuarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuarios.findAllUsuarios", query = "SELECT u FROM Usuarios u"),
    @NamedQuery(name = "Usuarios.findByUsuarioId", query = "SELECT u FROM Usuarios u WHERE u.usuarioId = :usuarioId"),
    @NamedQuery(name = "Usuarios.findByNombre", query = "SELECT u FROM Usuarios u WHERE u.nombre = :nombre"),
    @NamedQuery(name = "Usuarios.findByApellido", query = "SELECT u FROM Usuarios u WHERE u.apellido = :apellido"),
    @NamedQuery(name = "Usuarios.findByCorreo", query = "SELECT u FROM Usuarios u WHERE u.correo = :correo"),
    @NamedQuery(name = "Usuarios.findByContrasena", query = "SELECT u FROM Usuarios u WHERE u.contrasena = :contrasena"),
    @NamedQuery(name = "Usuarios.findByDireccion", query = "SELECT u FROM Usuarios u WHERE u.direccion = :direccion")})
    
    
public class Usuarios implements Serializable {

    @Size(max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 50)
    @Column(name = "apellido")
    private String apellido;
    @Size(max = 100)
    @Column(name = "correo")
    private String correo;
    @Size(max = 255)
    @Column(name = "contrasena")
    private String contrasena;
    @Size(max = 255)
    @Column(name = "direccion")
    private String direccion;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "usuario_id")
    private Integer usuarioId;
    @OneToMany(mappedBy = "vendedorId")
    private List<CochescompradosByJc> cochescompradosByJcList;
    @OneToMany(mappedBy = "usuarioId")
    private List<Favoritos> favoritosList;
    @OneToMany(mappedBy = "usuarioId")
    private List<Comentarios> comentariosList;
    @OneToMany(mappedBy = "compradorId")
    private List<CochesvendidosByJc> cochesvendidosByJcList;

    public Usuarios() {
    }
      public Usuarios(String correo, String contrasena) {
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public Usuarios(String nombre, String apellido, String correo, String contrasena, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasena = contrasena;
        this.direccion = direccion;
    }

    public Usuarios(Integer usuarioId, String nombre, String apellido, String correo, String contrasena, String direccion) {
        this.usuarioId = usuarioId;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasena = contrasena;
        this.direccion = direccion;
    }
      

    public Usuarios(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }


    @XmlTransient
    public List<CochescompradosByJc> getCochescompradosByJcList() {
        return cochescompradosByJcList;
    }

    public void setCochescompradosByJcList(List<CochescompradosByJc> cochescompradosByJcList) {
        this.cochescompradosByJcList = cochescompradosByJcList;
    }

    @XmlTransient
    public List<Favoritos> getFavoritosList() {
        return favoritosList;
    }

    public void setFavoritosList(List<Favoritos> favoritosList) {
        this.favoritosList = favoritosList;
    }

    @XmlTransient
    public List<Comentarios> getComentariosList() {
        return comentariosList;
    }

    public void setComentariosList(List<Comentarios> comentariosList) {
        this.comentariosList = comentariosList;
    }

    @XmlTransient
    public List<CochesvendidosByJc> getCochesvendidosByJcList() {
        return cochesvendidosByJcList;
    }

    public void setCochesvendidosByJcList(List<CochesvendidosByJc> cochesvendidosByJcList) {
        this.cochesvendidosByJcList = cochesvendidosByJcList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usuarioId != null ? usuarioId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuarios)) {
            return false;
        }
        Usuarios other = (Usuarios) object;
        if ((this.usuarioId == null && other.usuarioId != null) || (this.usuarioId != null && !this.usuarioId.equals(other.usuarioId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ceep.dominio.Usuarios[ usuarioId=" + usuarioId + " ]";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
