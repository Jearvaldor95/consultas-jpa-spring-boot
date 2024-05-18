
package com.tutorial.clientes.repository;

import com.tutorial.clientes.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 *
 * @author USUARIO
 */
@Repository
public interface VentaRepository extends JpaRepository<Venta, Integer>{

    // listar ventas ordenadas de forma descendente por el id
    List<Venta> findByOrderByIdDesc();
    @Query(value = "SELECT * FROM venta ORDER BY idventa DESC", nativeQuery = true)
    List<Venta> getVentasNative();
    @Query("SELECT v FROM Venta v ORDER BY v.id DESC")
    List<Venta> getVentasJPQL();

    // consulta total de ventas
    @Query(value = "SELECT SUM(total_venta) FROM venta", nativeQuery = true)
    Double TotalVentaNative();
    @Query("SELECT SUM(v.totalVenta) FROM Venta v")
    Double totalVentaJPQL();

    // listar todas las ventas entre dos fechas
    List<Venta> findByFechaVentaBetween(Date fecha1, Date fecha2);
    @Query(value = "SELECT * FROM venta WHERE fecha_venta BETWEEN :fecha1 AND :fecha2", nativeQuery = true)
    List<Venta> ventasEntreFechasNative(Date fecha1, Date fecha2);
    @Query("SELECT v FROM Venta v WHERE v.fechaVenta BETWEEN :fecha1 AND :fecha2")
    List<Venta> ventasEntreFechasJPQL(Date fecha1, Date fecha2);

    // listar ventas menores que el total
    List<Venta> findByTotalVentaLessThan(Double total);
    @Query(value = "SELECT * FROM venta WHERE total_venta < :total", nativeQuery = true)
    List<Venta> ventasMenoresNative(Double total);
    @Query("SELECT v FROM Venta v WHERE v.totalVenta < :total")
    List<Venta> ventasMenoresJPQL(Double total);

    // listar ventas menor igual al total
    List<Venta> findByTotalVentaLessThanEqual(Double total);
    @Query(value = "SELECT * FROM venta WHERE total_venta <= :total", nativeQuery = true)
    List<Venta> ventasMenoresIgualNative(Double total);
    @Query("SELECT v FROM Venta v WHERE v.totalVenta <= :total")
    List<Venta> ventasMenoresIgualJPQL(Double total);

    // listar ventas mayor que el total
    List<Venta> findByTotalVentaGreaterThan(Double total);
    @Query(value = "SELECT * FROM venta WHERE total_venta > :total", nativeQuery = true)
    List<Venta> ventasMayorNative(Double total);
    @Query("SELECT v FROM Venta v WHERE v.totalVenta > :total")
    List<Venta> ventasMayorJPQL(Double total);

    // listar ventas mayor igual que
    List<Venta> findByTotalVentaGreaterThanEqual(Double total);
    @Query(value = "SELECT * FROM venta WHERE total_venta >= :total", nativeQuery = true)
    List<Venta> ventasMayorIgualNative(Double total);
    @Query("SELECT v FROM Venta v WHERE v.totalVenta <= :total")
    List<Venta> ventasMayorIgualJPQL(Double total);

    // listar ventas que se encuentren despues de la fecha
    List<Venta> findByFechaVentaAfter(Date fecha);
    @Query(value = "SELECT * FROM venta WHERE fecha_venta > :fecha", nativeQuery = true)
    List<Venta> ventasMayorFechaNative(Date fecha);
    @Query("SELECT v FROM Venta v WHERE v.fechaVenta > :fecha")
    List<Venta> ventasMayorFechaJPQL(Date fecha);

    // listar las ventas que se encuentren antes de la fecha
    List<Venta> findByFechaVentaBefore(Date fecha);
    @Query(value = "SELECT * FROM venta  WHERE fecha_venta < :fecha", nativeQuery = true)
    List<Venta> ventasMenorFechaNative(Date fecha);
    @Query("SELECT v FROM Venta v WHERE v.fechaVenta < :fecha")
    List<Venta> ventasMenorFechaJPQL(Date fecha);

    // listar ventas por el tipo de venta ordenadas de forma descendente por la fecha de venta
    List<Venta> findByTipoVentaOrderByFechaVentaDesc(String tipo);
    @Query(value = "SELECT * FROM venta WHERE tipo_venta =:tipo ORDER BY fecha_venta DESC", nativeQuery = true)
    List<Venta> ventasByTipoVentaOrderByFechaNative(String tipo);
    @Query("SELECT v FROM Venta v WHERE v.tipoVenta =:tipo ORDER BY v.fechaVenta DESC")
    List<Venta> ventasByTipoVentaOrderByFechaJPQL(String tipo);

    // listar ventas por el tipo de venta
    List<Venta> findByTipoVenta(String tipo);

    // listar las ventas en la fecha actual
    @Query(value = "SELECT * FROM venta WHERE DATE(fecha_venta) = CURRENT_DATE()", nativeQuery = true)
    List<Venta> ventasHoy();

    // calcular el total de venta de la fecha actual
    @Query(value = "SELECT SUM(total_venta) FROM venta WHERE DATE(fecha_venta) = CURRENT_DATE()", nativeQuery = true)
    Double totalVentasHoy();

    // calcular el promedio de ventas en la fecha actual
    @Query(value = "SELECT AVG(total_venta) FROM venta WHERE DATE(fecha_venta) = CURRENT_DATE()", nativeQuery = true)
    Double promedioVentasHoy();

}
