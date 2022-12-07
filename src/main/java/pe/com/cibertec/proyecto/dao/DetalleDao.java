/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.cibertec.proyecto.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.com.cibertec.proyecto.domain.CompraDetalle;
import pe.com.cibertec.proyecto.domain.Detalle;

/**
 *
 * @author Asus
 */
@Repository
public interface DetalleDao extends JpaRepository<Detalle, CompraDetalle> {

    @Query("SELECT d FROM Detalle d WHERE d.detalleCompra.compra.usuario.nombres LIKE %?1% OR d.detalleCompra.compra.evento.nombre LIKE %?1%")
    public List<Detalle> findAll(String nombre);

    @Query("SELECT d FROM Detalle d WHERE d.detalleCompra.compra.usuario.id_usuario = ?1")
    public List<Detalle> findAllPorUsuario(long id);

    @Query("SELECT d FROM Detalle d WHERE d.detalleCompra.compra.usuario.id_usuario = ?1 AND d.detalleCompra.compra.evento.nombre LIKE %?2%")
    public List<Detalle> findAllParaUsuario(long id, String nombre);

    @Query("SELECT SUM(d.cantidad) FROM Detalle d WHERE d.detalleCompra.compra.usuario.id_usuario = ?1 AND d.detalleCompra.compra.evento.nombre LIKE %?2%")
    public String verificarCompra(long id, String nombre);

    @Query("SELECT SUM(d.cantidad) FROM Detalle d  WHERE d.detalleCompra.zonaEvento.id_zona LIKE ?1 ")
    public String traerCantidadEntradasVendidas(int id);

    @Query("SELECT d FROM Detalle d  WHERE d.detalleCompra.compra.id_compra LIKE ?1 ")
    public List<Detalle> findByIdCompra(int id);

}
