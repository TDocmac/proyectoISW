package com.quimio.proyecto.sillones;

import com.quimio.proyecto.salas.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class sillon {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String estado;

    @ManyToOne
    @JoinColumn(name ="sala_id")
    private sala sala;

    private Long paciente;

    public Long getId()
    {
        return id;
    }

    public String getEstado()
    {
        return estado;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public void setEstado(final String estado) {
        this.estado = estado;
    }

    public Long getPaciente() {
        return paciente;
    }

    public void setPaciente(final Long paciente) {
        this.paciente = paciente;
    }

    public sala getSala() {
        return sala;
    }

    public void setSala(final sala sala) {
        this.sala = sala;
    }




}