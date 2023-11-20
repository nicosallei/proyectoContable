/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sallei.proyectoContable.service;

import com.sallei.proyectoContable.modelo.Asiento;
import java.util.List;

/**
 *
 * @author nicos
 */
public interface IAsientoService {
    
    public List<Asiento> getAsiento();

    //alta
    public void saveAsiento(Asiento asiento);

    //baja
    public void deleteAsiento(Long id);

    //lectura de un solo objeto
    public Asiento findAsiento(Long id);
    
      public void editAsiento(Asiento asiento);
    
    
}
