/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.cibertec.proyecto.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.com.cibertec.proyecto.dao.DetalleDao;
import pe.com.cibertec.proyecto.domain.Detalle;

/**
 *
 * @author Asus
 */
@Service
public class DetalleServiceImpl implements DetalleService {

    @Autowired
    private DetalleDao Dao;

    @Override
    @Transactional(readOnly = true)
    public List<Detalle> listaDetalle() {
        return Dao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Detalle detalle) {
        Dao.save(detalle);
    }

    @Override
    @Transactional
    public void eliminar(Detalle detalle) {
        Dao.delete(detalle);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Detalle> listaDetallePorNombre(String nombre) {
        if (nombre != null) {
            return Dao.findAll(nombre);
        }

        return Dao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Detalle> listaDetalleParaUsuario(long id, String nombre) {
        if (nombre != null) {

            return Dao.findAllParaUsuario(id, nombre);
        }
        return Dao.findAllPorUsuario(id);
    }

    @Override
    @Transactional(readOnly = true)
    public String verificar(long id, String nombre) {
        return Dao.verificarCompra(id, nombre);
    }

    @Override
    @Transactional(readOnly = true)
    public String traerEntradasVendidas(int id) {
        return Dao.traerCantidadEntradasVendidas(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Detalle> encontrarPoridCompra(int id) {
        return Dao.findByIdCompra(id);
    }

}
