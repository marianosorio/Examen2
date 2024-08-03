package hn.unah.lenguajes.examen2.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.examen2.modelos.Cliente;
import hn.unah.lenguajes.examen2.modelos.Prestamos;
import hn.unah.lenguajes.examen2.servicios.PrestamosServicios;

@RestController
@RequestMapping("/api/prestamos")
public class PrestamosControlador {

    @Autowired
    public PrestamosServicios prestamosServicios;

    @PostMapping("/crear/nuevo")
     public Prestamos crearCliente (@RequestBody Prestamos nvoPrestamos){
        return this.prestamosServicios.crearprestamo(nvoPrestamos);
    }

    
}
