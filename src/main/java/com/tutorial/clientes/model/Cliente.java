package com.tutorial.clientes.model;

import jakarta.persistence.*;

/**
 *
 * @author USUARIO
 */
@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @Column(name = "idcliente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;

    private String apellidos;

    private Long numIdentificacion;

    private String direccion;

    private Long telefono;

    private String email;

    public Cliente() {
    }

    public Cliente(Integer id, String nombre, String apellidos, Long numIdentificacion, String direccion, Long telefono, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numIdentificacion = numIdentificacion;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Long getNumIdentificacion() {
        return numIdentificacion;
    }

    public void setNumIdentificacion(Long numIdentificacion) {
        this.numIdentificacion = numIdentificacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
