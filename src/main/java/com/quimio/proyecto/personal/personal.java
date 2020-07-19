package com.quimio.proyecto.personal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class personal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombre;
    private String RUT;
    private int edad;
    private String fechaDeNacimiento;
    private String direccion;
    private String telefono;
    private String especialidad;
    private String turnos;
    private int pass;
    private String cargo;

    public Long getId()
    {
        return id;
    }

    public String getNombre()
    {
        return nombre;
    }

    public String getRUT(){
        return RUT;
    }

    public int getEdad()
    {
        return edad;
    }
    public String getFechaDeNacimiento()
    {
        return fechaDeNacimiento;
    }

    public String getDireccion(){
        return direccion;
    }

    public String getTelefono(){
        return telefono;
    }

    public String getEspecialidad(){
        return especialidad;
    }

    public String getTurnos(){
        return turnos;
    }

    public int getPass(){
        return pass;
    }

    public String getCargo(){
        return cargo;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setRUT(String string)
    {
        this.RUT= string;
    } 

    public void setEdad(int edad)
    {
        this.edad = edad;
    }
    
    public void setFechaDeNacimiento(String fecha)
    {
        this.fechaDeNacimiento = fecha;
    }    

    public void setDireccion(String string)
    {
        this.direccion= string;
    } 

    public void setTelefono(String string)
    {
        this.telefono= string;
    } 

    public void setEspecialidad(String string)
    {
        this.especialidad= string;
    } 

    public void setTurnos(String string)
    {
        this.turnos= string;
    } 

    public void setPass(int pass){
        this.pass=pass;
    }
    
    public void setCargo(String string)
    {
        this.cargo= string;
    } 

}