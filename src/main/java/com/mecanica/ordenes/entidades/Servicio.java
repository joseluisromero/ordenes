/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mecanica.ordenes.entidades;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author José Romero <manabis.rum@gmail.com>
 */
@Entity
@Table(name = "servicio")
@XmlRootElement
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Servicio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "srv_id")
    private Integer srvId;
    @Size(max = 50)
    @Column(name = "srv_nombre")
    private String srvNombre;
    @Size(max = 50)
    @Column(name = "srv_codigo")
    private String srvCodigo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "srv_costo")
    private BigDecimal srvCosto;
    @Column(name = "srv_precio")
    private BigDecimal srvPrecio;
    @Column(name = "srv_estado")
    private Short srvEstado;
    @OneToMany(mappedBy = "srvId", fetch = FetchType.LAZY)
    private List<DetalleServicio> detalleServicioList;

    public Servicio() {
    }

    public Servicio(Integer srvId) {
        this.srvId = srvId;
    }

    public Integer getSrvId() {
        return srvId;
    }

    public void setSrvId(Integer srvId) {
        this.srvId = srvId;
    }

    public String getSrvNombre() {
        return srvNombre;
    }

    public void setSrvNombre(String srvNombre) {
        this.srvNombre = srvNombre;
    }

    public String getSrvCodigo() {
        return srvCodigo;
    }

    public void setSrvCodigo(String srvCodigo) {
        this.srvCodigo = srvCodigo;
    }

    public BigDecimal getSrvCosto() {
        return srvCosto;
    }

    public void setSrvCosto(BigDecimal srvCosto) {
        this.srvCosto = srvCosto;
    }

    public BigDecimal getSrvPrecio() {
        return srvPrecio;
    }

    public void setSrvPrecio(BigDecimal srvPrecio) {
        this.srvPrecio = srvPrecio;
    }

    public Short getSrvEstado() {
        return srvEstado;
    }

    public void setSrvEstado(Short srvEstado) {
        this.srvEstado = srvEstado;
    }

//    public List<DetalleServicio> getDetalleServicioList() {
//        return detalleServicioList;
//    }
//
//    public void setDetalleServicioList(List<DetalleServicio> detalleServicioList) {
//        this.detalleServicioList = detalleServicioList;
//    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (srvId != null ? srvId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Servicio)) {
            return false;
        }
        Servicio other = (Servicio) object;
        if ((this.srvId == null && other.srvId != null) || (this.srvId != null && !this.srvId.equals(other.srvId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mecanica.entidad.Servicio[ srvId=" + srvId + " ]";
    }
    
}
