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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author AuraY
 */

@Entity
@Table (name = "DEPARTAMENTOS")
public class Departamentos implements Serializable{
    
    @Id
    @Column (name = "id_departamentos")
    private int idDepartamentos;
    
    @Column (name = "nombre_departamentos")
    private String nombreDepartamentos;
    
    @ManyToOne
    @JoinColumn(name = "PAISES_id_pais")
    private Paises paises_id_pais;
    
    @OneToMany (mappedBy = "idDepartamentos")
    private List<Ciudades> ciudades;

    public Departamentos() {
    }

    public Departamentos(int idDepartamentos) {
        this.idDepartamentos = idDepartamentos;
    }
}
