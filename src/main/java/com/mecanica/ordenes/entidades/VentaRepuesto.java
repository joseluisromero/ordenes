/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mecanica.ordenes.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author José Romero <manabis.rum@gmail.com>
 */
@Entity
@Table(name = "venta_repuesto")
@NamedQueries({
    @NamedQuery(name = "VentaRepuesto.findAll", query = "SELECT v FROM VentaRepuesto v")})
public class VentaRepuesto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ven_rep_id")
    private Integer venRepId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ven_rep_total")
    private BigDecimal venRepTotal;
    @OneToMany(mappedBy = "venRepId", fetch = FetchType.EAGER)
    private List<OrdenTrabajo> ordenTrabajoList;
    @JoinColumn(name = "det_rep_id", referencedColumnName = "det_rep_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private DetalleRepuesto detRepId;

    public VentaRepuesto() {
    }

    public VentaRepuesto(Integer venRepId) {
        this.venRepId = venRepId;
    }

    public Integer getVenRepId() {
        return venRepId;
    }

    public void setVenRepId(Integer venRepId) {
        this.venRepId = venRepId;
    }

    public BigDecimal getVenRepTotal() {
        return venRepTotal;
    }

    public void setVenRepTotal(BigDecimal venRepTotal) {
        this.venRepTotal = venRepTotal;
    }

    public List<OrdenTrabajo> getOrdenTrabajoList() {
        return ordenTrabajoList;
    }

    public void setOrdenTrabajoList(List<OrdenTrabajo> ordenTrabajoList) {
        this.ordenTrabajoList = ordenTrabajoList;
    }

    public DetalleRepuesto getDetRepId() {
        return detRepId;
    }

    public void setDetRepId(DetalleRepuesto detRepId) {
        this.detRepId = detRepId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (venRepId != null ? venRepId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VentaRepuesto)) {
            return false;
        }
        VentaRepuesto other = (VentaRepuesto) object;
        if ((this.venRepId == null && other.venRepId != null) || (this.venRepId != null && !this.venRepId.equals(other.venRepId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mecanica.entidad.VentaRepuesto[ venRepId=" + venRepId + " ]";
    }
    
}
