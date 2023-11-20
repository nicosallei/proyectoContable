package com.sallei.proyectoContable.repository;

import com.sallei.proyectoContable.modelo.PlanCuentas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IPlanCuentasRepository extends JpaRepository<PlanCuentas, Long>{    
}
