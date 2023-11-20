/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sallei.proyectoContable.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class PlanCuentas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nroCuenta;
    @Enumerated(EnumType.STRING)
    private Rubro rubro;
    private String descripcion;
    


    public PlanCuentas() {
    }

    public PlanCuentas(Long nroCuenta, Rubro rubro, String descripcion) {
        this.nroCuenta = nroCuenta;
        this.rubro = rubro;
        this.descripcion = descripcion;
    }




}

