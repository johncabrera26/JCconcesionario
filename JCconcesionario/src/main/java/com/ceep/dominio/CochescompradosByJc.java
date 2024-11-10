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
 * @author PC
 */
@Entity
@Table(name = "cochescomprados_by_jc")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CochescompradosByJc.findAll", query = "SELECT c FROM CochescompradosByJc c"),
    @NamedQuery(name = "CochescompradosByJc.findByCompraId", query = "SELECT c FROM CochescompradosByJc c WHERE c.compraId = :compraId"),
    @NamedQuery(name = "CochescompradosByJc.findByPrecioCompra", query = "SELECT c FROM CochescompradosByJc c WHERE c.precioCompra = :precioCompra"),
    @NamedQuery(name = "CochescompradosByJc.findByFechaCompra", query = "SELECT c FROM CochescompradosByJc c WHERE c.fechaCompra = :fechaCompra")})
public class CochescompradosByJc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "compra_id")
    private Integer compraId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precio_compra")
    private BigDecimal precioCompra;
    @Column(name = "fecha_compra")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCompra;
    @JoinColumn(name = "coche_id", referencedColumnName = "coche_id")
    @ManyToOne
    private Coches cocheId;
    @JoinColumn(name = "vendedor_id", referencedColumnName = "usuario_id")
    @ManyToOne
    private Usuarios vendedorId;

    public CochescompradosByJc() {
    }

    public CochescompradosByJc(Integer compraId) {
        this.compraId = compraId;
    }

    public Integer getCompraId() {
        return compraId;
    }

    public void setCompraId(Integer compraId) {
        this.compraId = compraId;
    }

    public BigDecimal getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(BigDecimal precioCompra) {
        this.precioCompra = precioCompra;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Coches getCocheId() {
        return cocheId;
    }

    public void setCocheId(Coches cocheId) {
        this.cocheId = cocheId;
    }

    public Usuarios getVendedorId() {
        return vendedorId;
    }

    public void setVendedorId(Usuarios vendedorId) {
        this.vendedorId = vendedorId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (compraId != null ? compraId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CochescompradosByJc)) {
            return false;
        }
        CochescompradosByJc other = (CochescompradosByJc) object;
        if ((this.compraId == null && other.compraId != null) || (this.compraId != null && !this.compraId.equals(other.compraId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ceep.dominio.CochescompradosByJc[ compraId=" + compraId + " ]";
    }
    
}
