package com.quimio.proyecto.personal;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface personalRepository extends CrudRepository<personal, Long> {
    
}