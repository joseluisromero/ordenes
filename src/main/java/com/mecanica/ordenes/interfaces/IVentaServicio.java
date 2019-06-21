package com.mecanica.ordenes.interfaces;

import com.mecanica.ordenes.entidades.Servicio;
import com.mecanica.ordenes.entidades.VentaServicio;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface IVentaServicio {

    public List<VentaServicio> listarTodos();
    

}
