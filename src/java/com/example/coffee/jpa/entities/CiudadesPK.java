/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.coffee.jpa.entities;

import java.io.Serializable;

/**
 *
 * @author AuraY
 */
public class CiudadesPK implements Serializable{
    
    private int idCiudades;
    private int idDepartamentos;

    public CiudadesPK() {
    }

    public CiudadesPK(int idCiudades, int idDepartamentos) {
        this.idCiudades = idCiudades;
        this.idDepartamentos = idDepartamentos;
    }

    public int getIdCiudades() {
        return idCiudades;
    }

    public void setIdCiudades(int idCiudades) {
        this.idCiudades = idCiudades;
    }

    public int getIdDepartamentos() {
        return idDepartamentos;
    }

    public void setIdDepartamentos(int idDepartamentos) {
        this.idDepartamentos = idDepartamentos;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.idCiudades;
        hash = 97 * hash + this.idDepartamentos;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CiudadesPK other = (CiudadesPK) obj;
        if (this.idCiudades != other.idCiudades) {
            return false;
        }
        if (this.idDepartamentos != other.idDepartamentos) {
            return false;
        }
        return true;
    }

}
