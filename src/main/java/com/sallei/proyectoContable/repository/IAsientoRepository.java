package com.sallei.proyectoContable.repository;

import com.sallei.proyectoContable.modelo.Asiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IAsientoRepository extends JpaRepository<Asiento, Long>{   
}
