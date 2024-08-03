package hn.unah.lenguajes.examen2.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.examen2.servicios.CuotaServicios;

@RestController
@RequestMapping("/api/cuotas")
public class CuotasControlador {
    
    @Autowired
    public CuotaServicios cuotaServicios;

    @GetMapping("/calcular/cuota")
    public double calcularCuota(@RequestParam double CuotaPrincipal,
                                @RequestParam double CuotaAnual,
                                @RequestParam int anios) {
         return CuotaServicios.calcularCuota(CuotaPrincipal,CuotaAnual, anios);

    }
   
    
}
