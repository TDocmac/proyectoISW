package com.quimio.proyecto.sillones;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface sillonRepository extends CrudRepository<sillon, Long>  {

    public List<sillon> findByEstado(String estado);
}