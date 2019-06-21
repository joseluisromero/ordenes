package com.mecanica.ordenes.repositorios;

import com.mecanica.ordenes.entidades.VentaServicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentaServicioRepositorio extends JpaRepository<VentaServicio,Integer> {

}
