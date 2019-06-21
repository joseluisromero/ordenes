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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author José Romero <manabis.rum@gmail.com>
 */
@Entity
@Table(name = "repuesto")
@NamedQueries({
    @NamedQuery(name = "Repuesto.findAll", query = "SELECT r FROM Repuesto r")})
public class Repuesto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "rep_id")
    private Integer repId;
    @Size(max = 50)
    @Column(name = "rep_nombre")
    private String repNombre;
    @Size(max = 50)
    @Column(name = "rep_codigo")
    private String repCodigo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "rep_costo")
    private BigDecimal repCosto;
    @Column(name = "rep_precio")
    private BigDecimal repPrecio;
    @Column(name = "rep_estado")
    private Short repEstado;
    @OneToMany(mappedBy = "repId", fetch = FetchType.EAGER)
    private List<DetalleRepuesto> detalleRepuestoList;

    public Repuesto() {
    }

    public Repuesto(Integer repId) {
        this.repId = repId;
    }

    public Integer getRepId() {
        return repId;
    }

    public void setRepId(Integer repId) {
        this.repId = repId;
    }

    public String getRepNombre() {
        return repNombre;
    }

    public void setRepNombre(String repNombre) {
        this.repNombre = repNombre;
    }

    public String getRepCodigo() {
        return repCodigo;
    }

    public void setRepCodigo(String repCodigo) {
        this.repCodigo = repCodigo;
    }

    public BigDecimal getRepCosto() {
        return repCosto;
    }

    public void setRepCosto(BigDecimal repCosto) {
        this.repCosto = repCosto;
    }

    public BigDecimal getRepPrecio() {
        return repPrecio;
    }

    public void setRepPrecio(BigDecimal repPrecio) {
        this.repPrecio = repPrecio;
    }

    public Short getRepEstado() {
        return repEstado;
    }

    public void setRepEstado(Short repEstado) {
        this.repEstado = repEstado;
    }

    public List<DetalleRepuesto> getDetalleRepuestoList() {
        return detalleRepuestoList;
    }

    public void setDetalleRepuestoList(List<DetalleRepuesto> detalleRepuestoList) {
        this.detalleRepuestoList = detalleRepuestoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (repId != null ? repId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Repuesto)) {
            return false;
        }
        Repuesto other = (Repuesto) object;
        if ((this.repId == null && other.repId != null) || (this.repId != null && !this.repId.equals(other.repId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mecanica.entidad.Repuesto[ repId=" + repId + " ]";
    }
    
}
