package com.mecanica.ordenes.Controller;

import com.mecanica.ordenes.entidades.Servicio;
import com.mecanica.ordenes.interfaces.IServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping(value = "/servicio")
public class ServicioController {
    @Autowired
    IServicio iServicio;

    @RequestMapping(value = "/listar",method = RequestMethod.GET )
    public List<Servicio> getAllUsers() {
        return iServicio.listar();
    }

    @RequestMapping(value="/crear", method= RequestMethod.POST)
    public void crearServicio(@RequestBody Servicio servicio){

         iServicio.crearAndActualizar(servicio);
    }

    @RequestMapping(value="/actualizar", method= RequestMethod.PUT)
    public void actualizarServicio(@RequestBody Servicio servicio){

        iServicio.crearAndActualizar(servicio);
    }

    @RequestMapping(value="/buscar", method= RequestMethod.GET)
    public Servicio buscarServicio(@RequestParam(name="id", required=false) Integer id){

        return iServicio.buscarServicioId(1);
    }

    @RequestMapping(value="/eliminar/{id}", method= RequestMethod.DELETE)
    public void eliminarServicio(@PathVariable Integer id){
        Servicio serv=new Servicio();
        serv=iServicio.buscarServicioId(id);
        iServicio.eliminarServicio(serv);
    }


}
