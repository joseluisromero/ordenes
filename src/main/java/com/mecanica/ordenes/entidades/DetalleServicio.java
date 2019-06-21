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
@Table(name = "detalle_servicio")
@NamedQueries({
    @NamedQuery(name = "DetalleServicio.findAll", query = "SELECT d FROM DetalleServicio d")})
public class DetalleServicio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "det_srv_id")
    private Integer detSrvId;
    @Column(name = "det_srv_cantidad")
    private Integer detSrvCantidad;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "det_srv_valor")
    private BigDecimal detSrvValor;
    @OneToMany(mappedBy = "detSrvId", fetch = FetchType.EAGER)
    private List<VentaServicio> ventaServicioList;
    @JoinColumn(name = "srv_id", referencedColumnName = "srv_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Servicio srvId;

    public DetalleServicio() {
    }

    public DetalleServicio(Integer detSrvId) {
        this.detSrvId = detSrvId;
    }

    public Integer getDetSrvId() {
        return detSrvId;
    }

    public void setDetSrvId(Integer detSrvId) {
        this.detSrvId = detSrvId;
    }

    public Integer getDetSrvCantidad() {
        return detSrvCantidad;
    }

    public void setDetSrvCantidad(Integer detSrvCantidad) {
        this.detSrvCantidad = detSrvCantidad;
    }

    public BigDecimal getDetSrvValor() {
        return detSrvValor;
    }

    public void setDetSrvValor(BigDecimal detSrvValor) {
        this.detSrvValor = detSrvValor;
    }

    public List<VentaServicio> getVentaServicioList() {
        return ventaServicioList;
    }

    public void setVentaServicioList(List<VentaServicio> ventaServicioList) {
        this.ventaServicioList = ventaServicioList;
    }

    public Servicio getSrvId() {
        return srvId;
    }

    public void setSrvId(Servicio srvId) {
        this.srvId = srvId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detSrvId != null ? detSrvId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleServicio)) {
            return false;
        }
        DetalleServicio other = (DetalleServicio) object;
        if ((this.detSrvId == null && other.detSrvId != null) || (this.detSrvId != null && !this.detSrvId.equals(other.detSrvId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mecanica.entidad.DetalleServicio[ detSrvId=" + detSrvId + " ]";
    }
    
}
