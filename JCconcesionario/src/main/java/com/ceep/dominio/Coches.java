/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ceep.dominio;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
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
@Table(name = "coches")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Coches.findAllCoches", query = "SELECT c FROM Coches c"),
    @NamedQuery(name = "Coches.findByCocheId", query = "SELECT c FROM Coches c WHERE c.cocheId = :cocheId"),
    @NamedQuery(name = "Coches.findByMarca", query = "SELECT c FROM Coches c WHERE c.marca = :marca"),
    @NamedQuery(name = "Coches.findByModelo", query = "SELECT c FROM Coches c WHERE c.modelo = :modelo"),
    @NamedQuery(name = "Coches.findByAnioFabricacion", query = "SELECT c FROM Coches c WHERE c.anioFabricacion = :anioFabricacion"),
    @NamedQuery(name = "Coches.findByPrecio", query = "SELECT c FROM Coches c WHERE c.precio = :precio"),
    @NamedQuery(name = "Coches.findByEstado", query = "SELECT c FROM Coches c WHERE c.estado = :estado")})
public class Coches implements Serializable {

    @Size(max = 50)
    @Column(name = "marca")
    private String marca;
    @Size(max = 50)
    @Column(name = "modelo")
    private String modelo;
    @Lob
    @Size(max = 65535)
    @Column(name = "descripcion")
    private String descripcion;
    @Size(max = 50)
    @Column(name = "estado")
    private String estado;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "coche_id")
    private Integer cocheId;
    @Column(name = "anio_fabricacion")
    private Integer anioFabricacion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precio")
    private Integer precio;
    
    @Column(name = "vendido", columnDefinition = "TINYINT(1) DEFAULT 0")
    private boolean vendido;
    
    @Column(name = "foto")
    private String fotoUrl;
    @OneToMany(mappedBy = "cocheId")
    private List<CochescompradosByJc> cochescompradosByJcList;
    @OneToMany(mappedBy = "cocheId")
    private List<Favoritos> favoritosList;
    @OneToMany(mappedBy = "cocheId")
    private List<Comentarios> comentariosList;
    @OneToMany(mappedBy = "cocheId")
    private List<CochesvendidosByJc> cochesvendidosByJcList;

    public Coches() {
        
    }
    
    public boolean isVendido() {
        return vendido;
    }

    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }
    
    

    public Coches(Integer cocheId, String marca, String modelo, Integer anioFabricacion, Integer precio, String descripcion, String estado, String fotoUrl) {
        this.cocheId = cocheId;
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.precio = precio;
        this.descripcion = descripcion;
        this.estado = estado;
        this.fotoUrl = fotoUrl;
    }

    public Coches(String marca, String modelo, Integer anioFabricacion, Integer precio, String descripcion, String estado, String fotoUrl) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.precio = precio;
        this.descripcion = descripcion;
        this.estado = estado;
        this.fotoUrl = fotoUrl;
    }

    public Coches(List<CochescompradosByJc> cochescompradosByJcList) {
        this.cochescompradosByJcList = cochescompradosByJcList;
    }
    
    
    

    public Coches(Integer cocheId) {
        this.cocheId = cocheId;
    }

    public Integer getCocheId() {
        return cocheId;
    }

    public void setCocheId(Integer cocheId) {
        this.cocheId = cocheId;
    }


    public Integer getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(Integer anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public Integer getPrecio() {
        return precio;
    }
    
    public String getFotoUrl() {
        return fotoUrl;
    }
    public byte[] getFoto() {
        return null;
    }
    

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }


    public void setFotoUrl(String fotoUrl) {
        this.fotoUrl = fotoUrl;
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
        hash += (cocheId != null ? cocheId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Coches)) {
            return false;
        }
        Coches other = (Coches) object;
        if ((this.cocheId == null && other.cocheId != null) || (this.cocheId != null && !this.cocheId.equals(other.cocheId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ceep.dominio.Coches[ cocheId=" + cocheId + " ]";
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
