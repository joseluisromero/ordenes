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
@Table(name = "detalle_repuesto")
@NamedQueries({
    @NamedQuery(name = "DetalleRepuesto.findAll", query = "SELECT d FROM DetalleRepuesto d")})
public class DetalleRepuesto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "det_rep_id")
    private Integer detRepId;
    @Column(name = "det_rep_cantidad")
    private Integer detRepCantidad;
    @Column(name = "det_rep_valor")
    private BigDecimal detRepValor;
    @OneToMany(mappedBy = "detRepId", fetch = FetchType.EAGER)
    private List<VentaRepuesto> ventaRepuestoList;
    @JoinColumn(name = "rep_id", referencedColumnName = "rep_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Repuesto repId;

    public DetalleRepuesto() {
    }

    public DetalleRepuesto(Integer detRepId) {
        this.detRepId = detRepId;
    }

    public Integer getDetRepId() {
        return detRepId;
    }

    public void setDetRepId(Integer detRepId) {
        this.detRepId = detRepId;
    }

    public Integer getDetRepCantidad() {
        return detRepCantidad;
    }

    public void setDetRepCantidad(Integer detRepCantidad) {
        this.detRepCantidad = detRepCantidad;
    }

    public BigDecimal getDetRepValor() {
        return detRepValor;
    }

    public void setDetRepValor(BigDecimal detRepValor) {
        this.detRepValor = detRepValor;
    }

    public List<VentaRepuesto> getVentaRepuestoList() {
        return ventaRepuestoList;
    }

    public void setVentaRepuestoList(List<VentaRepuesto> ventaRepuestoList) {
        this.ventaRepuestoList = ventaRepuestoList;
    }

    public Repuesto getRepId() {
        return repId;
    }

    public void setRepId(Repuesto repId) {
        this.repId = repId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detRepId != null ? detRepId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleRepuesto)) {
            return false;
        }
        DetalleRepuesto other = (DetalleRepuesto) object;
        if ((this.detRepId == null && other.detRepId != null) || (this.detRepId != null && !this.detRepId.equals(other.detRepId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mecanica.entidad.DetalleRepuesto[ detRepId=" + detRepId + " ]";
    }
    
}
