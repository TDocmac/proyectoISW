package com.quimio.proyecto.sillones;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface sillonRepository extends CrudRepository<sillon, Long>  {
    
}