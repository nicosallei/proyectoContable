package com.sallei.proyectoContable.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class LibroDiario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nroLibroDiario;
    private String dia;
     private String mes;
      private String anio;
     

   

    public LibroDiario() {
    }

    public LibroDiario(Long nroLibroDiario, String dia, String mes, String anio) {
        this.nroLibroDiario = nroLibroDiario;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }


    
      
}
