package hn.unah.lenguajes.examen2.modelos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "cuotas")
@Data
public class Cuotas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigocuota")
    private long codigoCuota;

    @Column(name = "interes")    
    private double interes;

    @Column(name = "capital")
    private double capital;

    @Column(name = "saldo")
    private double saldo;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "codigoPrestamo", referencedColumnName = "codigoPrestamo")
    private Prestamos prestamos1;

}
