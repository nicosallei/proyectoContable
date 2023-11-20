package com.sallei.proyectoContable.service;

import com.sallei.proyectoContable.modelo.LibroDiario;
import java.util.List;


public interface ILibroDiarioService {
    
    public List<LibroDiario> getLibroDiario();

    //alta
    public void saveLibroDiario(LibroDiario libDiario);

    //baja
    public void deleteLibroDiario(Long id);

    //lectura de un solo objeto
    public LibroDiario findLibroDiario(Long id);
    
      public void editLibroDiario(LibroDiario libDiario);
    
    
}
