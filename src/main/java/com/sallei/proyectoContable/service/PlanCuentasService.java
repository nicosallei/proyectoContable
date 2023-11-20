
package com.sallei.proyectoContable.service;

import com.sallei.proyectoContable.modelo.PlanCuentas;
import com.sallei.proyectoContable.repository.IPlanCuentasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlanCuentasService implements IPlanCuentasService {

    @Autowired
    private IPlanCuentasRepository jpaCuenta;
    
    
    @Override
    public List<PlanCuentas> getCuenta() {
     List<PlanCuentas> listaCuentas = jpaCuenta.findAll();
        return listaCuentas;      
    }

    @Override
    public void saveCuenta(PlanCuentas cuenta) {
        jpaCuenta.save(cuenta);
    }

    @Override
    public void deleteCuenta(Long id) {
        jpaCuenta.deleteById(id);
    }

    @Override
    public PlanCuentas findCuenta(Long id) {
        PlanCuentas cuenta = jpaCuenta.findById(id).orElse(null);
        return cuenta;
    }

    @Override
    public void editCuenta(PlanCuentas cuenta) {
        this.saveCuenta(cuenta);
    }
    
    
    
    
    
}
