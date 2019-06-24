package com.mecanica.ordenes;

import com.mecanica.ordenes.entidades.Servicio;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@SpringBootApplication
public class OrdenesApplication {
    private static RestTemplate restTemplate = new RestTemplate();
    private static final String baseURL = "http://localhost:9999/servicio/";
    public static void main(String[] args) {

        SpringApplication.run(OrdenesApplication.class, args);
        System.out.printf("Corriendo Servidor.....");
        Servicio accountDetail = restTemplate.getForObject(baseURL+"buscar/1", Servicio.class);
        System.out.println("Servicio encontrado por Id : " +accountDetail.toString());
        System.out.println("Servicio encontrado por Id : " +accountDetail.getSrvNombre());

        List<Servicio> listaServicio = restTemplate.getForObject(baseURL+"listar", List.class);
        System.out.println("Total de Servicio: ");
        for(Object acct : listaServicio){
            System.out.println(""+acct);
        }


    }

}
