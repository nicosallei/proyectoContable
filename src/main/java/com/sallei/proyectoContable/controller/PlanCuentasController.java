package com.sallei.proyectoContable.controller;


import com.sallei.proyectoContable.modelo.PlanCuentas;
import com.sallei.proyectoContable.service.IPlanCuentasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



    
@RestController
@RequestMapping("/planCuentas")
public class PlanCuentasController {

@Autowired
private IPlanCuentasService cuentaServ;

@GetMapping ("/traer")
    public List<PlanCuentas> getCuenta() {
        
        return cuentaServ.getCuenta();
    }
    
    @PostMapping ("/crear")
    public String savePersona (@RequestBody PlanCuentas cuenta) {
        cuentaServ.saveCuenta(cuenta);
        
        return "La cuenta fue creada correctamente";
    }
    
    @DeleteMapping ("/borrar/{id}")
    public String deleteCuenta(@PathVariable Long id) {
        cuentaServ.deleteCuenta(id);
        return "La Cuenta fue eliminada correctamente";
    }

    @PutMapping ("/editar")
    public PlanCuentas editCuenta(@RequestBody PlanCuentas cuenta) {
        cuentaServ.editCuenta(cuenta);
        
        return cuentaServ.findCuenta(cuenta.getNroCuenta());
    }
    
}
