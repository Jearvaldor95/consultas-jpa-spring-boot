
package com.tutorial.clientes.dto;

/**
 *
 * @author USUARIO
 */
public class ClienteDTO {
    private int idCliente;
    private String nombreCliente;
    private String apellidosCliente;
    private Long identificacionCliente;
    private String direccionCliente;
    private Long telefonoCliente;
    private String emailCliente;

    public ClienteDTO(int idCliente, String nombreCliente, String apellidosCliente, Long identificacionCliente, String direccionCliente, Long telefonoCliente, String emailCliente) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.apellidosCliente = apellidosCliente;
        this.identificacionCliente = identificacionCliente;
        this.direccionCliente = direccionCliente;
        this.telefonoCliente = telefonoCliente;
        this.emailCliente = emailCliente;
    }

    public ClienteDTO() {
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidosCliente() {
        return apellidosCliente;
    }

    public void setApellidosCliente(String apellidosCliente) {
        this.apellidosCliente = apellidosCliente;
    }

    public Long getIdentificacionCliente() {
        return identificacionCliente;
    }

    public void setIdentificacionCliente(Long identificacionCliente) {
        this.identificacionCliente = identificacionCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public Long getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(Long telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }
}
