/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.cibertec.proyecto.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.com.cibertec.proyecto.dao.LocalDao;
import pe.com.cibertec.proyecto.domain.Local;

/**
 *
 * @author Asus
 */
@Service
public class LocalServiceImpl implements LocalService {

    @Autowired
    private LocalDao Dao;

    @Override
    @Transactional(readOnly = true)
    public List<Local> listaLocal() {
        return Dao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Local local) {
        Dao.save(local);
    }

    @Override
    @Transactional
    public void eliminar(Local local) {
        Dao.delete(local);
    }

    @Override
    @Transactional(readOnly = true)
    public Local econtrarLocal(Local local) {
        return Dao.findById(local.getId_local()).orElse(null);
    }

    @Override
    public List<Local> ecnontrarPorNombre(String nombre) {
        if (nombre != null) {
            return Dao.findAll(nombre);
        }
        return Dao.findAll();
    }

}
