package com.mecanica.ordenes.servicios;

import com.mecanica.ordenes.entidades.Servicio;
import com.mecanica.ordenes.entidades.VentaServicio;
import com.mecanica.ordenes.interfaces.IVentaServicio;
import com.mecanica.ordenes.repositorios.VentaServicioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public  class VentaServicioImpl implements IVentaServicio {

    @Autowired
    private  VentaServicioRepositorio ventaServicioRepositorio;

    @Override
    public List<VentaServicio> listarTodos() {
        return ventaServicioRepositorio.findAll();
    }


}
