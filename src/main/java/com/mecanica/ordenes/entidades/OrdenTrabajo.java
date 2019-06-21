/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mecanica.ordenes.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author José Romero <manabis.rum@gmail.com>
 */
@Entity
@Table(name = "orden_trabajo")
@NamedQueries({
    @NamedQuery(name = "OrdenTrabajo.findAll", query = "SELECT o FROM OrdenTrabajo o")})
public class OrdenTrabajo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ord_id")
    private Integer ordId;
    @Size(max = 255)
    @Column(name = "ord_orservacion")
    private String ordOrservacion;
    @Size(max = 255)
    @Column(name = "ord_recomendacion")
    private String ordRecomendacion;
    @Column(name = "ord_fecha")
    @Temporal(TemporalType.DATE)
    private Date ordFecha;
    @Column(name = "ord_hora_ingreso")
    @Temporal(TemporalType.TIME)
    private Date ordHoraIngreso;
    @Column(name = "ord_hora_aprox_entrega")
    @Temporal(TemporalType.TIME)
    private Date ordHoraAproxEntrega;
    @Column(name = "ord_estado")
    private Short ordEstado;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ord_km_vehiculo")
    private BigDecimal ordKmVehiculo;
    @Column(name = "ord_radio")
    private Boolean ordRadio;
    @Column(name = "ord_encendedor")
    private Boolean ordEncendedor;
    @Column(name = "ord_control_alarma")
    private Boolean ordControlAlarma;
    @Column(name = "ord_antena")
    private Boolean ordAntena;
    @Column(name = "ord_tuerca_seguridad")
    private Boolean ordTuercaSeguridad;
    @Column(name = "ord_tapa_gasolina")
    private Boolean ordTapaGasolina;
    @Column(name = "ord_llanta_rep")
    private Boolean ordLlantaRep;
    @Column(name = "ord_gata")
    private Boolean ordGata;
    @Column(name = "ord_llave_rueda")
    private Boolean ordLlaveRueda;
    @Column(name = "ord_nivel_combustible")
    private BigDecimal ordNivelCombustible;
    @JoinColumn(name = "usu_id", referencedColumnName = "usu_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Usuario usuId;
    @JoinColumn(name = "vehi_id", referencedColumnName = "vehi_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Vehiculo vehiId;
    @JoinColumn(name = "ven_rep_id", referencedColumnName = "ven_rep_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private VentaRepuesto venRepId;
    @JoinColumn(name = "ven_srv_id", referencedColumnName = "ven_srv_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private VentaServicio venSrvId;
    @OneToMany(mappedBy = "ordId", fetch = FetchType.EAGER)
    private List<FotoVehiculo> fotoVehiculoList;

    public OrdenTrabajo() {
    }

    public OrdenTrabajo(Integer ordId) {
        this.ordId = ordId;
    }

    public Integer getOrdId() {
        return ordId;
    }

    public void setOrdId(Integer ordId) {
        this.ordId = ordId;
    }

    public String getOrdOrservacion() {
        return ordOrservacion;
    }

    public void setOrdOrservacion(String ordOrservacion) {
        this.ordOrservacion = ordOrservacion;
    }

    public String getOrdRecomendacion() {
        return ordRecomendacion;
    }

    public void setOrdRecomendacion(String ordRecomendacion) {
        this.ordRecomendacion = ordRecomendacion;
    }

    public Date getOrdFecha() {
        return ordFecha;
    }

    public void setOrdFecha(Date ordFecha) {
        this.ordFecha = ordFecha;
    }

    public Date getOrdHoraIngreso() {
        return ordHoraIngreso;
    }

    public void setOrdHoraIngreso(Date ordHoraIngreso) {
        this.ordHoraIngreso = ordHoraIngreso;
    }

    public Date getOrdHoraAproxEntrega() {
        return ordHoraAproxEntrega;
    }

    public void setOrdHoraAproxEntrega(Date ordHoraAproxEntrega) {
        this.ordHoraAproxEntrega = ordHoraAproxEntrega;
    }

    public Short getOrdEstado() {
        return ordEstado;
    }

    public void setOrdEstado(Short ordEstado) {
        this.ordEstado = ordEstado;
    }

    public BigDecimal getOrdKmVehiculo() {
        return ordKmVehiculo;
    }

    public void setOrdKmVehiculo(BigDecimal ordKmVehiculo) {
        this.ordKmVehiculo = ordKmVehiculo;
    }

    public Boolean getOrdRadio() {
        return ordRadio;
    }

    public void setOrdRadio(Boolean ordRadio) {
        this.ordRadio = ordRadio;
    }

    public Boolean getOrdEncendedor() {
        return ordEncendedor;
    }

    public void setOrdEncendedor(Boolean ordEncendedor) {
        this.ordEncendedor = ordEncendedor;
    }

    public Boolean getOrdControlAlarma() {
        return ordControlAlarma;
    }

    public void setOrdControlAlarma(Boolean ordControlAlarma) {
        this.ordControlAlarma = ordControlAlarma;
    }

    public Boolean getOrdAntena() {
        return ordAntena;
    }

    public void setOrdAntena(Boolean ordAntena) {
        this.ordAntena = ordAntena;
    }

    public Boolean getOrdTuercaSeguridad() {
        return ordTuercaSeguridad;
    }

    public void setOrdTuercaSeguridad(Boolean ordTuercaSeguridad) {
        this.ordTuercaSeguridad = ordTuercaSeguridad;
    }

    public Boolean getOrdTapaGasolina() {
        return ordTapaGasolina;
    }

    public void setOrdTapaGasolina(Boolean ordTapaGasolina) {
        this.ordTapaGasolina = ordTapaGasolina;
    }

    public Boolean getOrdLlantaRep() {
        return ordLlantaRep;
    }

    public void setOrdLlantaRep(Boolean ordLlantaRep) {
        this.ordLlantaRep = ordLlantaRep;
    }

    public Boolean getOrdGata() {
        return ordGata;
    }

    public void setOrdGata(Boolean ordGata) {
        this.ordGata = ordGata;
    }

    public Boolean getOrdLlaveRueda() {
        return ordLlaveRueda;
    }

    public void setOrdLlaveRueda(Boolean ordLlaveRueda) {
        this.ordLlaveRueda = ordLlaveRueda;
    }

    public BigDecimal getOrdNivelCombustible() {
        return ordNivelCombustible;
    }

    public void setOrdNivelCombustible(BigDecimal ordNivelCombustible) {
        this.ordNivelCombustible = ordNivelCombustible;
    }

    public Usuario getUsuId() {
        return usuId;
    }

    public void setUsuId(Usuario usuId) {
        this.usuId = usuId;
    }

    public Vehiculo getVehiId() {
        return vehiId;
    }

    public void setVehiId(Vehiculo vehiId) {
        this.vehiId = vehiId;
    }

    public VentaRepuesto getVenRepId() {
        return venRepId;
    }

    public void setVenRepId(VentaRepuesto venRepId) {
        this.venRepId = venRepId;
    }

    public VentaServicio getVenSrvId() {
        return venSrvId;
    }

    public void setVenSrvId(VentaServicio venSrvId) {
        this.venSrvId = venSrvId;
    }

    public List<FotoVehiculo> getFotoVehiculoList() {
        return fotoVehiculoList;
    }

    public void setFotoVehiculoList(List<FotoVehiculo> fotoVehiculoList) {
        this.fotoVehiculoList = fotoVehiculoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ordId != null ? ordId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrdenTrabajo)) {
            return false;
        }
        OrdenTrabajo other = (OrdenTrabajo) object;
        if ((this.ordId == null && other.ordId != null) || (this.ordId != null && !this.ordId.equals(other.ordId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mecanica.entidad.OrdenTrabajo[ ordId=" + ordId + " ]";
    }
    
}
