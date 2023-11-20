package com.sallei.proyectoContable.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Asiento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date fecha;
    
    private double haber;
    private double debe;
    
     @ManyToOne
    @JoinColumn(name = "nro_libroDiario")
    private LibroDiario libroDiario;
   
    @ManyToOne
    @JoinColumn(name = "nro_cuenta")
    private PlanCuentas planCuentas;
     
     
   //private List<Transaccion> listaTransaccion;

    public Asiento() {
    }

    public Asiento(Long id, Date fecha, double haber, double debe, LibroDiario libroDiario, PlanCuentas planCuentas) {
        this.id = id;
        this.fecha = fecha;
        this.haber = haber;
        this.debe = debe;
        this.libroDiario = libroDiario;
        this.planCuentas = planCuentas;
    }

   

  
   
     
     
}
