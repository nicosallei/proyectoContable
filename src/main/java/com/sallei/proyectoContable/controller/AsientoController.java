package com.sallei.proyectoContable.controller;

import com.sallei.proyectoContable.modelo.Asiento;
import com.sallei.proyectoContable.service.IAsientoService;
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
@RequestMapping("/Asiento")
public class AsientoController {
    
    @Autowired
private IAsientoService asientoServ;

@GetMapping ("/traer")
    public List<Asiento> getAsiento() {
        
        return asientoServ.getAsiento();
    }
    
    @PostMapping ("/crear")
    public String saveAsiento (@RequestBody Asiento asiento) {
        asientoServ.saveAsiento(asiento);
        
        return "El  asiento fue creado correctamente";
    }
    
    @DeleteMapping ("/borrar/{id}")
    public String deleteAsiento(@PathVariable Long id) {
        asientoServ.deleteAsiento(id);
        return "El asiento fue eliminado correctamente";
    }

    @PutMapping ("/editar")
    public Asiento editAsiento(@RequestBody Asiento asiento) {
        asientoServ.editAsiento(asiento);
        
        return asientoServ.findAsiento(asiento.getId());
    }
    
    
}
