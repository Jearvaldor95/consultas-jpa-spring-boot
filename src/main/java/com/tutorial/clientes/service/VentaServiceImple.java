package com.tutorial.clientes.service;

import com.tutorial.clientes.model.Venta;
import com.tutorial.clientes.repository.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 *
 * @author USUARIO
 */
@Service
public class VentaServiceImple implements VentaService {

    @Autowired
    private VentaRepository ventaRepository;


    @Override
    public List<Venta> getVentasDesc() {
        return ventaRepository.findByOrderByIdDesc();
    }

    @Override
    public Double totalVenta() {
        return ventaRepository.totalVentaJPQL();
    }

    @Override
    public List<Venta> getVentasBeween(Date fecha1, Date fecha2) {
        return ventaRepository.findByFechaVentaBetween(fecha1, fecha2);
    }

    @Override
    public List<Venta> getVentasMenoresTotal(Double total) {
        return ventaRepository.findByTotalVentaLessThan(total);
    }

    @Override
    public List<Venta> getVentasMenoresIgualesTotal(Double total) {
        return ventaRepository.findByTotalVentaLessThanEqual(total);
    }

    @Override
    public List<Venta> getVentasMayorTotal(Double total) {
        return ventaRepository.findByTotalVentaGreaterThan(total);
    }

    @Override
    public List<Venta> getVentasMayorIgualTotal(Double total) {
        return ventaRepository.findByTotalVentaGreaterThanEqual(total);
    }

    @Override
    public List<Venta> getVentasAfter(Date fecha) {
        return ventaRepository.findByFechaVentaAfter(fecha);
    }

    @Override
    public List<Venta> getVentasBefore(Date fecha) {
        return ventaRepository.findByFechaVentaBefore(fecha);
    }

    @Override
    public List<Venta> getVentasTipoVentaOrderByFechaVentaDesc(String tipo) {
        return ventaRepository.findByTipoVentaOrderByFechaVentaDesc(tipo);
    }

    @Override
    public List<Venta> getVentasTipoVenta(String tipo) {
        return ventaRepository.findByTipoVenta(tipo);
    }

    @Override
    public List<Venta> getVentasHoy() {
        return ventaRepository.ventasHoy();
    }

    @Override
    public Double getTotalVentasHoy() {
        return ventaRepository.totalVentasHoy();
    }

    @Override
    public Double getPromedioVentasHoy() {
        return ventaRepository.promedioVentasHoy();
    }
}
