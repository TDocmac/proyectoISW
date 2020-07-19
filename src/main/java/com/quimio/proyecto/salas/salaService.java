package com.quimio.proyecto.salas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class salaService {
    
    @Autowired
    private salaRepository salaRepository;

    public sala saveOrUpdateSala(sala sala) {
        return salaRepository.save(sala);
    }

    public Iterable<sala> listAll() {
        return salaRepository.findAll();
    }

    public sala getSala(Long id) {
        return salaRepository.findById(id)
            .orElseThrow(() -> new salaNotFoundException(id));
    }

    public void deleteSala(Long id){
        salaRepository.deleteById(id);
    }
}