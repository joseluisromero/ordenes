package com.mecanica.ordenes.repositorios;

import com.mecanica.ordenes.entidades.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public interface ServicioRepositorio extends JpaRepository<Servicio,Integer> {
    //public List<Servicio> findByListaServicio(Short estdo);
}
