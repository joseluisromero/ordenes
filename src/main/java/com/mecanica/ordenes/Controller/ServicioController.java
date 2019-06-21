package com.mecanica.ordenes.Controller;

import com.mecanica.ordenes.entidades.Servicio;
import com.mecanica.ordenes.interfaces.IServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ServicioController {
    @Autowired
    IServicio iServicio;

    @GetMapping("/servicio")
    public List<Servicio> getAllUsers() {
        return iServicio.listar();
    }
    @RequestMapping(value="/crear", method= RequestMethod.POST)
    public void crearServicio(@RequestBody Servicio servicio){

         iServicio.crearAndActualizar(servicio);
    }

    @RequestMapping(value="/actualizar", method= RequestMethod.POST)
    public void actualizarServicio(@RequestBody Servicio servicio){

        iServicio.crearAndActualizar(servicio);
    }

}
