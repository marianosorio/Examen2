package hn.unah.lenguajes.examen2.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.examen2.modelos.Prestamos;
import hn.unah.lenguajes.examen2.repositorios.ClienteRepositorio;
import hn.unah.lenguajes.examen2.repositorios.PrestamosRepositorio;

@Service
public class PrestamosServicios {

    @Autowired
    public PrestamosRepositorio prestamosRepositorio;

    @Autowired 
    public ClienteRepositorio clienteRepositorio;

    public PrestamosServicios(ClienteRepositorio clienter, PrestamosRepositorio prestamor) {
        this.clienteRepositorio = clienter;
        this.prestamosRepositorio = prestamor;
         
    }

    public Prestamos crearprestamo(Prestamos nvoPrestamos){
        if (this.prestamosRepositorio.existsById(nvoPrestamos.getCodigoPrestamo())){
            return null;
        }
        return this.prestamosRepositorio.save(nvoPrestamos);

    }

    public Prestamos buscarporId(long codigoPrestamo){
        return this.prestamosRepositorio.findById(codigoPrestamo).get();
    }
    


}
