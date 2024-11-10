/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ceep.dominio;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Alumno Mañana
 */
@Entity
@Table(name = "favoritos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Favoritos.findAll", query = "SELECT f FROM Favoritos f"),
    @NamedQuery(name = "Favoritos.findByFavoritoId", query = "SELECT f FROM Favoritos f WHERE f.favoritoId = :favoritoId")})
public class Favoritos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "favorito_id")
    private Integer favoritoId;
    @JoinColumn(name = "coche_id", referencedColumnName = "coche_id")
    @ManyToOne
    private Coches cocheId;
    @JoinColumn(name = "usuario_id", referencedColumnName = "usuario_id")
    @ManyToOne
    private Usuarios usuarioId;

    public Favoritos() {
    }

    public Favoritos(Integer favoritoId) {
        this.favoritoId = favoritoId;
    }

    public Integer getFavoritoId() {
        return favoritoId;
    }

    public void setFavoritoId(Integer favoritoId) {
        this.favoritoId = favoritoId;
    }

    public Coches getCocheId() {
        return cocheId;
    }

    public void setCocheId(Coches cocheId) {
        this.cocheId = cocheId;
    }

    public Usuarios getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Usuarios usuarioId) {
        this.usuarioId = usuarioId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (favoritoId != null ? favoritoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Favoritos)) {
            return false;
        }
        Favoritos other = (Favoritos) object;
        if ((this.favoritoId == null && other.favoritoId != null) || (this.favoritoId != null && !this.favoritoId.equals(other.favoritoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ceep.dominio.Favoritos[ favoritoId=" + favoritoId + " ]";
    }
    
}
