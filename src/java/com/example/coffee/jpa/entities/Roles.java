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
@Table (name = "ROLES")
public class Roles implements Serializable{
    
    @Id
    @Column (name ="id_roles")
    private int idRoles;
    
    @Column (name = "nombre_rol")
    @Size (max = 45)
    private String nombreRoles;
    
    @OneToMany (mappedBy = "roles")
    private List<Usuarios> usuarios;

    public Roles() {
    }

    public Roles(int idRoles) {
        this.idRoles = idRoles;
    }

    public int getIdRoles() {
        return idRoles;
    }

    public void setIdRoles(int idRoles) {
        this.idRoles = idRoles;
    }

    public String getNombreRoles() {
        return nombreRoles;
    }

    public void setNombreRoles(String nombreRoles) {
        this.nombreRoles = nombreRoles;
    }

    public List<Usuarios> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuarios> usuarios) {
        this.usuarios = usuarios;
    }
    
    
    
    
    
    
    
    
}
