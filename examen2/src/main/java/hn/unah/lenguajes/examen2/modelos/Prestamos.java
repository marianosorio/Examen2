package hn.unah.lenguajes.examen2.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "prestamos")
@Data
public class Prestamos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigoprestamo")
    private long codigoPrestamo;

    @Column(name = "monto") 
    private double monto;

    @Column(name = "cuota")
    private double cuota;

    @Column(name = "plazo")
    private int plazo;

    @Column(name = "interes")
    private double interes;

    private String dni;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "dni", referencedColumnName = "dni")
    private Cliente cliente;

   // @OneToMany(mappedBy = "", cascade = CascadeType.ALL)
  //private Cuotas cuotas;



    
}
