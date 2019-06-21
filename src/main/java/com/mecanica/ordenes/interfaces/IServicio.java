package com.mecanica.ordenes.interfaces;

import com.mecanica.ordenes.entidades.Servicio;

import java.util.List;

public interface IServicio {
    public List<Servicio> listar();
    public void crearAndActualizar(Servicio servicio);
}
