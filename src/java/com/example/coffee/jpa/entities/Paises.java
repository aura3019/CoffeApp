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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author AuraY
 */

@Entity
@Table(name = "PAISES")
public class Paises implements Serializable{
    
    @Id
    @Column (name ="id_pais")
    private int idPais;
    
    @Column(name = "nombre_pais")
    @Size(max=45)
    private String nombrePais;
    
    @OneToMany (mappedBy = "idPais")
    private List<Departamentos> departamentos;

    public Paises() {
    }

    public Paises(int idPais) {
        this.idPais = idPais;
    }

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public List<Departamentos> getDepartamento() {
        return departamentos;
    }

    public void setDepartamento(List<Departamentos> departamento) {
        this.departamentos = departamento;
    }
    
    
    
    
    
}

