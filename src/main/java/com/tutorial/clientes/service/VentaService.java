
package com.tutorial.clientes.service;

import com.tutorial.clientes.model.Venta;

import java.util.Date;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public interface VentaService {

    public List<Venta> getVentasDesc();

    public  Double totalVenta();

    public List<Venta> getVentasBeween(Date fecha1, Date fecha2);

    public List<Venta> getVentasMenoresTotal(Double total);

    public List<Venta> getVentasMenoresIgualesTotal(Double total);

    public List<Venta> getVentasMayorTotal(Double total);

    public List<Venta> getVentasMayorIgualTotal(Double total);

    public List<Venta> getVentasAfter(Date fecha);

    List<Venta> getVentasBefore(Date fecha);

    public List<Venta> getVentasTipoVentaOrderByFechaVentaDesc(String tipo);

    public List<Venta> getVentasTipoVenta(String tipo);

    public List<Venta> getVentasHoy();

    public Double getTotalVentasHoy();

    public Double getPromedioVentasHoy();
    
}
