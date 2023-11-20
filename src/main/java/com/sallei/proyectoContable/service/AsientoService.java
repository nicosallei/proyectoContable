package com.sallei.proyectoContable.service;

import com.sallei.proyectoContable.modelo.Asiento;
import com.sallei.proyectoContable.repository.IAsientoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AsientoService implements IAsientoService{

    @Autowired
    private IAsientoRepository jpaAsiento;
    
    
    @Override
    public List<Asiento> getAsiento() {
    
         List<Asiento> listaAsientos = jpaAsiento.findAll();
        return listaAsientos;    
    }

    @Override
    public void saveAsiento(Asiento asiento) {
        jpaAsiento.save(asiento);
    }

    @Override
    public void deleteAsiento(Long id) {
       jpaAsiento.deleteById(id);
    }

    @Override
    public Asiento findAsiento(Long id) {
    
         Asiento asiento = jpaAsiento.findById(id).orElse(null);
        return asiento;
    }

    @Override
    public void editAsiento(Asiento asiento) {
        this.saveAsiento(asiento);
    }
    
}
