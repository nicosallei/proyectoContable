/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sallei.proyectoContable.service;

import com.sallei.proyectoContable.modelo.LibroDiario;
import com.sallei.proyectoContable.repository.ILibroDiarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LibroDiarioService implements ILibroDiarioService{

    @Autowired
    private ILibroDiarioRepository jpaDiario;
    
    
    @Override
    public List<LibroDiario> getLibroDiario() {
    List<LibroDiario> listaLibDiario = jpaDiario.findAll();
        return listaLibDiario;       
    }

    @Override
    public void saveLibroDiario(LibroDiario libDiario) {
        jpaDiario.save(libDiario);
    }

    @Override
    public void deleteLibroDiario(Long id) {
        jpaDiario.deleteById(id);
    }

    @Override
    public LibroDiario findLibroDiario(Long id) {
     LibroDiario libDiario = jpaDiario.findById(id).orElse(null);
        return libDiario;   
    }

    @Override
    public void editLibroDiario(LibroDiario libDiario) {
        this.saveLibroDiario(libDiario);
    }
    
}
