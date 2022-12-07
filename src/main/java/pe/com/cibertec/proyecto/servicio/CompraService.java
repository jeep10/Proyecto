/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.cibertec.proyecto.servicio;

import java.util.List;
import org.springframework.stereotype.Service;
import pe.com.cibertec.proyecto.domain.Compra;

/**
 *
 * @author Asus
 */
@Service
public interface CompraService {

    public abstract List<Compra> listarCompra();

    public abstract void guardar(Compra compra);

    public abstract void eliminar(Compra compra);

    public abstract Compra econtrarCompra(Compra compra);

    public List<Compra> listarPorId(int id_usuario);

    public abstract Compra listarUltimo();

    public abstract Compra econtrarCompra(int id_compra);

}
