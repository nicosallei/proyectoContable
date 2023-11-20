package com.sallei.proyectoContable.repository;

import com.sallei.proyectoContable.modelo.LibroDiario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ILibroDiarioRepository extends JpaRepository<LibroDiario, Long>{
    
}
