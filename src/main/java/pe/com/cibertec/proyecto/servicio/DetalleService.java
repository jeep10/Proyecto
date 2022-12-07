/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.cibertec.proyecto.servicio;

import java.util.List;
import org.springframework.stereotype.Service;
import pe.com.cibertec.proyecto.domain.Detalle;

/**
 *
 * @author Asus
 */
@Service
public interface DetalleService {

    public abstract List<Detalle> listaDetalle();

    public abstract void guardar(Detalle detalle);

    public abstract void eliminar(Detalle detalle);

    public abstract List<Detalle> listaDetallePorNombre(String nombre);

    public abstract List<Detalle> listaDetalleParaUsuario(long id, String nombre);

    public String verificar(long id, String nombre);

    public abstract String traerEntradasVendidas(int id);

    public abstract List<Detalle> encontrarPoridCompra(int id);

}
