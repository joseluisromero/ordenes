/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mecanica.ordenes.entidades;

import java.io.Serializable;
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
@Table(name = "vehiculo")
@NamedQueries({
    @NamedQuery(name = "Vehiculo.findAll", query = "SELECT v FROM Vehiculo v")})
public class Vehiculo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "vehi_id")
    private Integer vehiId;
    @Size(max = 50)
    @Column(name = "vehi_modelo")
    private String vehiModelo;
    @Column(name = "vehi_anio")
    private Integer vehiAnio;
    @Size(max = 50)
    @Column(name = "vehi_color")
    private String vehiColor;
    @Size(max = 50)
    @Column(name = "vehi_placa")
    private String vehiPlaca;
    @Size(max = 50)
    @Column(name = "vehi_codigo")
    private String vehiCodigo;
    @Size(max = 50)
    @Column(name = "vehi_marca")
    private String vehiMarca;
    @OneToMany(mappedBy = "vehiId", fetch = FetchType.EAGER)
    private List<OrdenTrabajo> ordenTrabajoList;

    public Vehiculo() {
    }

    public Vehiculo(Integer vehiId) {
        this.vehiId = vehiId;
    }

    public Integer getVehiId() {
        return vehiId;
    }

    public void setVehiId(Integer vehiId) {
        this.vehiId = vehiId;
    }

    public String getVehiModelo() {
        return vehiModelo;
    }

    public void setVehiModelo(String vehiModelo) {
        this.vehiModelo = vehiModelo;
    }

    public Integer getVehiAnio() {
        return vehiAnio;
    }

    public void setVehiAnio(Integer vehiAnio) {
        this.vehiAnio = vehiAnio;
    }

    public String getVehiColor() {
        return vehiColor;
    }

    public void setVehiColor(String vehiColor) {
        this.vehiColor = vehiColor;
    }

    public String getVehiPlaca() {
        return vehiPlaca;
    }

    public void setVehiPlaca(String vehiPlaca) {
        this.vehiPlaca = vehiPlaca;
    }

    public String getVehiCodigo() {
        return vehiCodigo;
    }

    public void setVehiCodigo(String vehiCodigo) {
        this.vehiCodigo = vehiCodigo;
    }

    public String getVehiMarca() {
        return vehiMarca;
    }

    public void setVehiMarca(String vehiMarca) {
        this.vehiMarca = vehiMarca;
    }

    public List<OrdenTrabajo> getOrdenTrabajoList() {
        return ordenTrabajoList;
    }

    public void setOrdenTrabajoList(List<OrdenTrabajo> ordenTrabajoList) {
        this.ordenTrabajoList = ordenTrabajoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vehiId != null ? vehiId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vehiculo)) {
            return false;
        }
        Vehiculo other = (Vehiculo) object;
        if ((this.vehiId == null && other.vehiId != null) || (this.vehiId != null && !this.vehiId.equals(other.vehiId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mecanica.entidad.Vehiculo[ vehiId=" + vehiId + " ]";
    }
    
}
