package com.quimio.proyecto.salas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class sala {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nombre;
    private int capacidad;


    public long getId()
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

    public void setId(long id)
    {
        this.id = id;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setCapacidad(int capacidad){
        this.capacidad = capacidad;
    }


}