package com.quimio.proyecto.sillones;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class sillon {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String estado;

   
    private String sala;

    private Long paciente;

    public Long getId()
    {
        return id;
    }

    public String getEstado()
    {
        return estado;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public void setEstado(String estado)
    {
        this.estado = estado;
    }

    public Long getPaciente() {
        return paciente;
    }

    public void setPaciente(Long paciente) {
        this.paciente = paciente;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }




}