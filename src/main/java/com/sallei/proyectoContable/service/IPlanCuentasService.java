
package com.sallei.proyectoContable.service;

import com.sallei.proyectoContable.modelo.PlanCuentas;
import java.util.List;


public interface IPlanCuentasService {
    
    public List<PlanCuentas> getCuenta();

    //alta
    public void saveCuenta(PlanCuentas cuenta);

    //baja
    public void deleteCuenta(Long id);

    //lectura de un solo objeto
    public PlanCuentas findCuenta(Long id);
    
      public void editCuenta(PlanCuentas cuenta);
    
}
