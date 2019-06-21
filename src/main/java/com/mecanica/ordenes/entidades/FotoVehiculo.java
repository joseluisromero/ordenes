/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mecanica.ordenes.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author José Romero <manabis.rum@gmail.com>
 */
@Entity
@Table(name = "foto_vehiculo")
@NamedQueries({
    @NamedQuery(name = "FotoVehiculo.findAll", query = "SELECT f FROM FotoVehiculo f")})
public class FotoVehiculo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "foto_id")
    private String fotoId;
    @Size(max = 255)
    @Column(name = "foto_url")
    private String fotoUrl;
    @Size(max = 50)
    @Column(name = "foto_tipo")
    private String fotoTipo;
    @JoinColumn(name = "ord_id", referencedColumnName = "ord_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private OrdenTrabajo ordId;

    public FotoVehiculo() {
    }

    public FotoVehiculo(String fotoId) {
        this.fotoId = fotoId;
    }

    public String getFotoId() {
        return fotoId;
    }

    public void setFotoId(String fotoId) {
        this.fotoId = fotoId;
    }

    public String getFotoUrl() {
        return fotoUrl;
    }

    public void setFotoUrl(String fotoUrl) {
        this.fotoUrl = fotoUrl;
    }

    public String getFotoTipo() {
        return fotoTipo;
    }

    public void setFotoTipo(String fotoTipo) {
        this.fotoTipo = fotoTipo;
    }

    public OrdenTrabajo getOrdId() {
        return ordId;
    }

    public void setOrdId(OrdenTrabajo ordId) {
        this.ordId = ordId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fotoId != null ? fotoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FotoVehiculo)) {
            return false;
        }
        FotoVehiculo other = (FotoVehiculo) object;
        if ((this.fotoId == null && other.fotoId != null) || (this.fotoId != null && !this.fotoId.equals(other.fotoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mecanica.entidad.FotoVehiculo[ fotoId=" + fotoId + " ]";
    }
    
}
