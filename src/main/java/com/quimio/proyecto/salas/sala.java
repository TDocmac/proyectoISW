package com.quimio.proyecto.salas;
import com.quimio.proyecto.sillones.*;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class sala {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombre;
    private int capacidad;
    
    @OneToMany(mappedBy = "sala", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<sillon> sillones;


    public Long getId()
    {
        return id;
    }

    public String getNombre()
    {
        return nombre;
    }

    public int getCapacidad(){
        return capacidad;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public void setNombre(final String nombre) {
        this.nombre = nombre;
    }

    public void setCapacidad(final int capacidad) {
        this.capacidad = capacidad;
    }


}