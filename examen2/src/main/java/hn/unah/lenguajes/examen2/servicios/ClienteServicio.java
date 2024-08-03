package hn.unah.lenguajes.examen2.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import hn.unah.lenguajes.examen2.modelos.Cliente;
import hn.unah.lenguajes.examen2.modelos.Prestamos;
import hn.unah.lenguajes.examen2.repositorios.ClienteRepositorio;

@Service
public class ClienteServicio {

    @Autowired
    public ClienteRepositorio clienteRepositorio;

    public List <Cliente> obtenerTodos(){
        return this.clienteRepositorio.findAll();
    }

    public Cliente crearcliente(Cliente nvocliente){
        if(this.clienteRepositorio.existsById(nvocliente.getDni())){
            return null;
        }

        List<Prestamos> prestamos1= nvocliente.getPrestamos();
        if(prestamos1 != null){
            for(Prestamos prestamos:prestamos1){
               prestamos.setCliente(nvocliente); 
            }            
        }

        return this.clienteRepositorio.save(nvocliente);

    }

    
}
