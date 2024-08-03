package hn.unah.lenguajes.examen2.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.examen2.repositorios.CuotasRepositorio;
import hn.unah.lenguajes.examen2.repositorios.PrestamosRepositorio;
import hn.unah.lenguajes.examen2.modelos.*;

@Service
public class CuotaServicios {
    @Autowired
    public CuotasRepositorio cuotasRepositorio;

    @Autowired
    public PrestamosRepositorio prestamoRepositorio;

    public static double calcularCuota(double CuotaPrincipal, double CuotaAnual, int anios){
        double Cuotamensual = CuotaAnual / 12;
        int numeroPagos = anios * 12;
        
        return (CuotaPrincipal * Cuotamensual) / (1 - Math.pow (1 + Cuotamensual, -numeroPagos));

    }

    
}
