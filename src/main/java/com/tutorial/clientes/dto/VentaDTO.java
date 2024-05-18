
package com.tutorial.clientes.dto;

import java.util.Date;

/**
 *
 * @author USUARIO
 */
public class VentaDTO {
    private int idventa;
    private Date fechaVenta;
    private String nombreCliente;
    private String apellidosCliente;
    private String tipoVenta;
    private String usuario;
    private double totalVenta;
    private int cantidadVendida;
    private double precio;
    private double total;

    public VentaDTO(int idventa, Date fechaVenta, String nombreCliente, String apellidosCliente, String tipoVenta, String usuario, double totalVenta, int cantidadVendida, double precio, double total) {
        this.idventa = idventa;
        this.fechaVenta = fechaVenta;
        this.nombreCliente = nombreCliente;
        this.apellidosCliente = apellidosCliente;
        this.tipoVenta = tipoVenta;
        this.usuario = usuario;
        this.totalVenta = totalVenta;
        this.cantidadVendida = cantidadVendida;
        this.precio = precio;
        this.total = total;
    }

    public int getIdventa() {
        return idventa;
    }

    public void setIdventa(int idventa) {
        this.idventa = idventa;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
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

    public String getTipoVenta() {
        return tipoVenta;
    }

    public void setTipoVenta(String tipoVenta) {
        this.tipoVenta = tipoVenta;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public double getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(double totalVenta) {
        this.totalVenta = totalVenta;
    }

    public int getCantidadVendida() {
        return cantidadVendida;
    }

    public void setCantidadVendida(int cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    
}
