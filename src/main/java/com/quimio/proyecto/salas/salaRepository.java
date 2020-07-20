package com.quimio.proyecto.salas;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface salaRepository extends CrudRepository<sala, Long> {
    public List<sala> findByCapacidad(int capacidad);
}