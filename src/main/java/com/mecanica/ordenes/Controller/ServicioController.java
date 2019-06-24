package com.mecanica.ordenes.Controller;

import com.mecanica.ordenes.entidades.Servicio;
import com.mecanica.ordenes.interfaces.IServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping(value = "/servicio")
public class ServicioController {
    @Autowired
    IServicio iServicio;

    @RequestMapping(value = "/listar",method = RequestMethod.GET ,produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Servicio> listarServicios() {
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

    @GetMapping(value="/buscar/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Servicio buscarServicio(@PathVariable ("id") Integer id){
        System.out.println("campo a buscar"+id);
        Servicio serv=new Servicio();
        serv=iServicio.buscarServicioId(id);
        System.out.println("serviciobuscado "+serv.getSrvNombre());
        return iServicio.buscarServicioId(id);
    }


    @RequestMapping(value="/eliminar/{id}", method= RequestMethod.DELETE)
    public void eliminarServicio(@PathVariable Integer id){
        Servicio serv=new Servicio();
        serv=iServicio.buscarServicioId(id);
        iServicio.eliminarServicio(serv);
    }


}
