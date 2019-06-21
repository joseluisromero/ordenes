package com.mecanica.ordenes.servicios;

import com.mecanica.ordenes.entidades.Servicio;
import com.mecanica.ordenes.interfaces.IServicio;
import com.mecanica.ordenes.repositorios.ServicioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioImpl implements IServicio {
    @Autowired
    ServicioRepositorio servicioRepositorio;
    @Override
    public List<Servicio> listar() {
        return servicioRepositorio.findAll();
    }

    @Override
    public void crearAndActualizar(Servicio servicio) {
        servicioRepositorio.save(servicio);
    }
}
