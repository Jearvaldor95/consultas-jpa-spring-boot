package com.tutorial.clientes.controller;

import com.tutorial.clientes.model.Venta;
import com.tutorial.clientes.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

/**
 *
 * @author USUARIO
 */
@Controller
@RequestMapping("/venta")
public class VentaController {

    @Autowired
    private VentaService ventaService;

    @GetMapping("")
    public ResponseEntity<List<Venta>> getVentasDesc(){
        return new ResponseEntity<>(ventaService.getVentasDesc(), HttpStatus.OK);
    }

    @GetMapping("/total")
    public ResponseEntity<Double> getTotalVenta(){
        return new ResponseEntity<>(ventaService.totalVenta(), HttpStatus.OK);
    }

    @GetMapping("/{fecha1}/{fecha2}")
    public ResponseEntity<List<Venta>> getVentasBetween(@PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") Date fecha1, @PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") Date fecha2){
        return new ResponseEntity<>(ventaService.getVentasBeween(fecha1, fecha2), HttpStatus.OK);
    }

    @GetMapping("/total-menor/{total}")
    public ResponseEntity<List<Venta>> getVentasMenorTotal(@PathVariable Double total){
        return new ResponseEntity<>(ventaService.getVentasMenoresTotal(total), HttpStatus.OK);
    }

    @GetMapping("/total-menor/igual/{total}")
    public ResponseEntity<List<Venta>> getVentasMenorIgualTotal(@PathVariable Double total){
        return new ResponseEntity<>(ventaService.getVentasMenoresIgualesTotal(total), HttpStatus.OK);
    }

    @GetMapping("/total-mayor/{total}")
    public ResponseEntity<List<Venta>> getVentasMayorTotal(@PathVariable Double total){
        return new ResponseEntity<>(ventaService.getVentasMayorTotal(total), HttpStatus.OK);
    }

    @GetMapping("/total-mayor/igual/{total}")
    public ResponseEntity<List<Venta>> getVentasMayorIgualTotal(@PathVariable Double total){
        return new ResponseEntity<>(ventaService.getVentasMayorIgualTotal(total), HttpStatus.OK);
    }

    @GetMapping("/antes/fecha/{fecha}")
    public ResponseEntity<List<Venta>> getVentasBefore(@PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") Date fecha){
        return new ResponseEntity<>(ventaService.getVentasBefore(fecha), HttpStatus.OK);
    }

    @GetMapping("/despues/fecha/{fecha}")
    public ResponseEntity<List<Venta>> getVentasAfter(@PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") Date fecha){
        return new ResponseEntity<>(ventaService.getVentasAfter(fecha), HttpStatus.OK);
    }

    @GetMapping("/tipo/fecha/{tipo}")
    public ResponseEntity<List<Venta>> getVentasTipoVentaOrderByFechaVentaDesc(@PathVariable String tipo){
        return new ResponseEntity<>(ventaService.getVentasTipoVentaOrderByFechaVentaDesc(tipo), HttpStatus.OK);
    }

    @GetMapping("/tipo/{tipo}")
    public ResponseEntity<List<Venta>> getVentasTipoVenta(@PathVariable String tipo){
        return new ResponseEntity<>(ventaService.getVentasTipoVenta(tipo), HttpStatus.OK);
    }

    @GetMapping("/hoy")
    public ResponseEntity<List<Venta>> getVentasHoy(){
        return new ResponseEntity<>(ventaService.getVentasHoy(), HttpStatus.OK);
    }

    @GetMapping("/total/hoy")
    public ResponseEntity<Double> getTotalVentasHoy(){
        return new ResponseEntity<>(ventaService.getTotalVentasHoy(), HttpStatus.OK);
    }

    @GetMapping("/promedio/hoy")
    public ResponseEntity<Double> getPromedioVentasHoy(){
        return new ResponseEntity<>(ventaService.getPromedioVentasHoy(), HttpStatus.OK);
    }
}
