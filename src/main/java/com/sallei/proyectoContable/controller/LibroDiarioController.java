package com.sallei.proyectoContable.controller;

import com.sallei.proyectoContable.modelo.LibroDiario;
import com.sallei.proyectoContable.service.ILibroDiarioService;
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
@RequestMapping("/libroDiario")
public class LibroDiarioController {
    
    @Autowired
private ILibroDiarioService diarioServ;

@GetMapping ("/traer")
    public List<LibroDiario> getLibroDiario() {
        
        return diarioServ.getLibroDiario();
    }
    
    @PostMapping ("/crear")
    public String savePersona (@RequestBody LibroDiario libDiario) {
        diarioServ.saveLibroDiario(libDiario);
        
        return "Libro diario fue creada correctamente";
    }
    
    @DeleteMapping ("/borrar/{id}")
    public String deleteCuenta(@PathVariable Long id) {
        diarioServ.deleteLibroDiario(id);
        return "Libro diario fue eliminada correctamente";
    }

    @PutMapping ("/editar")
    public LibroDiario editLibroDiario(@RequestBody LibroDiario libDiario) {
        diarioServ.editLibroDiario(libDiario);
        
        return diarioServ.findLibroDiario(libDiario.getNroLibroDiario());
    }
    
}
