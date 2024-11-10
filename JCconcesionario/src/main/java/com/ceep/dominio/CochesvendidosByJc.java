/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ceep.dominio;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Alumno Mañana
 */
@Entity
@Table(name = "cochesvendidos_by_jc")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CochesvendidosByJc.findAll", query = "SELECT c FROM CochesvendidosByJc c"),
    @NamedQuery(name = "CochesvendidosByJc.findByVentaId", query = "SELECT c FROM CochesvendidosByJc c WHERE c.ventaId = :ventaId"),
    @NamedQuery(name = "CochesvendidosByJc.findByPrecioVenta", query = "SELECT c FROM CochesvendidosByJc c WHERE c.precioVenta = :precioVenta"),
    @NamedQuery(name = "CochesvendidosByJc.findByFechaVenta", query = "SELECT c FROM CochesvendidosByJc c WHERE c.fechaVenta = :fechaVenta")})
public class CochesvendidosByJc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "venta_id")
    private Integer ventaId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precio_venta")
    private int precioVenta;
    @Column(name = "fecha_venta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaVenta;
    @JoinColumn(name = "coche_id", referencedColumnName = "coche_id")
    @ManyToOne
    private Coches cocheId;
    @JoinColumn(name = "comprador_id", referencedColumnName = "usuario_id")
    @ManyToOne
    private Usuarios compradorId;

    public CochesvendidosByJc() {
    }

    public CochesvendidosByJc(Integer ventaId) {
        this.ventaId = ventaId;
    }

    public Integer getVentaId() {
        return ventaId;
    }

    public void setVentaId(Integer ventaId) {
        this.ventaId = ventaId;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public Coches getCocheId() {
        return cocheId;
    }

    public void setCocheId(Coches cocheId) {
        this.cocheId = cocheId;
    }

    public Usuarios getCompradorId() {
        return compradorId;
    }

    public void setCompradorId(Usuarios compradorId) {
        this.compradorId = compradorId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ventaId != null ? ventaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CochesvendidosByJc)) {
            return false;
        }
        CochesvendidosByJc other = (CochesvendidosByJc) object;
        if ((this.ventaId == null && other.ventaId != null) || (this.ventaId != null && !this.ventaId.equals(other.ventaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ceep.dominio.CochesvendidosByJc[ ventaId=" + ventaId + " ]";
    }
    
}
