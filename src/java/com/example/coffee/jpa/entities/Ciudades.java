/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.coffee.jpa.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author AuraY
 */
@Entity
@Table (name = "CIUDADES")
@IdClass(value = CiudadesPK.class)
public class Ciudades implements Serializable{
    
    @Id
    @Column(name = "id_ciudades")
    private int idCiudades;
    
    @Id
    @ManyToOne
    @JoinColumn(name = "id_departamentos")
    private Departamentos idDepartamentos;
    
    @Column(name = "nombre_ciudad")
    private String nombreCiudad;
    
    @OneToMany(mappedBy = "ciudades")
    private List<Usuarios> Usuarios;

    public Ciudades() {
    }

    public Ciudades(int idCiudades) {
        this.idCiudades = idCiudades;
    }

    public int getIdCiudades() {
        return idCiudades;
    }

    public void setIdCiudades(int idCiudades) {
        this.idCiudades = idCiudades;
    }

    public Departamentos getIdDepartamentos() {
        return idDepartamentos;
    }

    public void setIdDepartamentos(Departamentos idDepartamentos) {
        this.idDepartamentos = idDepartamentos;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public List<Usuarios> getUsuarios() {
        return Usuarios;
    }

    public void setUsuarios(List<Usuarios> usuarios) {
        this.Usuarios = usuarios;
    }
    
    
    
    
    
    
    
    
    
    
    
}
