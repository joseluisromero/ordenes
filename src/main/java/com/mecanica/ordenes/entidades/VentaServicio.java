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
@Table(name = "venta_servicio")
@NamedQueries({
    @NamedQuery(name = "VentaServicio.findAll", query = "SELECT v FROM VentaServicio v")})
public class VentaServicio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ven_srv_id")
    private Integer venSrvId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ven_srv_total")
    private BigDecimal venSrvTotal;
    @OneToMany(mappedBy = "venSrvId", fetch = FetchType.EAGER)
    private List<OrdenTrabajo> ordenTrabajoList;
    @JoinColumn(name = "det_srv_id", referencedColumnName = "det_srv_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private DetalleServicio detSrvId;

    public VentaServicio() {
    }

    public VentaServicio(Integer venSrvId) {
        this.venSrvId = venSrvId;
    }

    public Integer getVenSrvId() {
        return venSrvId;
    }

    public void setVenSrvId(Integer venSrvId) {
        this.venSrvId = venSrvId;
    }

    public BigDecimal getVenSrvTotal() {
        return venSrvTotal;
    }

    public void setVenSrvTotal(BigDecimal venSrvTotal) {
        this.venSrvTotal = venSrvTotal;
    }

    public List<OrdenTrabajo> getOrdenTrabajoList() {
        return ordenTrabajoList;
    }

    public void setOrdenTrabajoList(List<OrdenTrabajo> ordenTrabajoList) {
        this.ordenTrabajoList = ordenTrabajoList;
    }

    public DetalleServicio getDetSrvId() {
        return detSrvId;
    }

    public void setDetSrvId(DetalleServicio detSrvId) {
        this.detSrvId = detSrvId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (venSrvId != null ? venSrvId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VentaServicio)) {
            return false;
        }
        VentaServicio other = (VentaServicio) object;
        if ((this.venSrvId == null && other.venSrvId != null) || (this.venSrvId != null && !this.venSrvId.equals(other.venSrvId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mecanica.entidad.VentaServicio[ venSrvId=" + venSrvId + " ]";
    }
    
}
