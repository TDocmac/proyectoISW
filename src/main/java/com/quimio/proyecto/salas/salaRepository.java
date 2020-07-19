package com.quimio.proyecto.salas;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface salaRepository extends CrudRepository<sala, Long> {
    
}