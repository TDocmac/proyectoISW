package com.quimio.proyecto.personal;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface personalRepository extends CrudRepository<personal, Long> {
    public List<personal> findByCargo(String cargo);
}