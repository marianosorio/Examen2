package hn.unah.lenguajes.examen2.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.examen2.modelos.Cliente;
import hn.unah.lenguajes.examen2.servicios.ClienteServicio;

@RestController
@RequestMapping("/api/clientes")
public class ClienteControlador {

    @Autowired
    public ClienteServicio clienteServicio;

    @PostMapping("/crear/nuevo")
    public Cliente crearCliente (@RequestBody Cliente nvocliente){
        return this.clienteServicio.crearcliente(nvocliente);
    }


    
}
