/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.coffee.jpa.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author AuraY
 */

@Entity
@Table(name = "USUARIOS")
public class Usuarios implements Serializable {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column (name = "id_usuarios")
    private int idUsuarios;
       
    private String nombres;
    
    private String apellidos;
    
    private String telefono;
   
    private String direccion;
    
    private String password;
   
    @ManyToOne 
    @JoinColumn(name = "id_roles")
    private Roles roles;
    
    @ManyToOne
    @JoinColumns (
            {
                @JoinColumn(name ="id_corregimientos", referencedColumnName = "id_corregimientos"),
                @JoinColumn(name ="id_ciudades", referencedColumnName = "id_ciudades") 
            })
    
    private String nitEmpresa;
   
    private String nombreEmpresa;
    
    private String telefonoEmpresa;
    
    private String direccionEmpresa;
            
    private String passwordEmpresa;
    
    private String nitProveedor;
    
    private String nombreProveedor;
    
    private String telefonoProveedor;
    
    private String direccionProveedor;
    
    private String passwordProveedor;

    public int getIdUsuarios() {
        return idUsuarios;
    }

    public void setIdUsuarios(int idUsuarios) {
        this.idUsuarios = idUsuarios;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    public String getNitEmpresa() {
        return nitEmpresa;
    }

    public void setNitEmpresa(String nitEmpresa) {
        this.nitEmpresa = nitEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(String telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public String getPasswordEmpresa() {
        return passwordEmpresa;
    }

    public void setPasswordEmpresa(String passwordEmpresa) {
        this.passwordEmpresa = passwordEmpresa;
    }

    public String getNitProveedor() {
        return nitProveedor;
    }

    public void setNitProveedor(String nitProveedor) {
        this.nitProveedor = nitProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getTelefonoProveedor() {
        return telefonoProveedor;
    }

    public void setTelefonoProveedor(String telefonoProveedor) {
        this.telefonoProveedor = telefonoProveedor;
    }

    public String getDireccionProveedor() {
        return direccionProveedor;
    }

    public void setDireccionProveedor(String direccionProveedor) {
        this.direccionProveedor = direccionProveedor;
    }

    public String getPasswordProveedor() {
        return passwordProveedor;
    }

    public void setPasswordProveedor(String passwordProveedor) {
        this.passwordProveedor = passwordProveedor;
    }
    
        
}
