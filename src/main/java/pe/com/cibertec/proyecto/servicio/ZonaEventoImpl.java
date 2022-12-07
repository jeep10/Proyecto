/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.cibertec.proyecto.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.com.cibertec.proyecto.dao.ZonaEventoDao;
import pe.com.cibertec.proyecto.domain.ZonaEvento;

/**
 *
 * @author Asus
 */
@Service
public class ZonaEventoImpl implements ZonaEventoService {

    @Autowired
    private ZonaEventoDao Dao;

    @Override
    @Transactional(readOnly = true)
    public List<ZonaEvento> listazona() {
        return Dao.findAll();
    }

    @Override
    @Transactional
    public void guardar(ZonaEvento zonaEvento) {
        Dao.save(zonaEvento);
    }

    @Override
    @Transactional
    public void eliminar(ZonaEvento zonaEvento) {
        Dao.delete(zonaEvento);
    }

    @Override
    @Transactional(readOnly = true)
    public ZonaEvento econtrarZona(ZonaEvento zonaEvento) {
        return Dao.findById(zonaEvento.getId_zona()).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public String traerAforo(int id) {
        return Dao.traerAforo(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<ZonaEvento> listarSoloPorNombreZona(String zona) {
        if (zona != null) {
            return Dao.findAll(zona);
        }

        return Dao.findAll();

    }

    @Override
    @Transactional(readOnly = true)
    public List<ZonaEvento> encontrarPorEvento(int id_evento) {
        return Dao.findAllById_evento(id_evento);
    }

    @Override
    public ZonaEvento encontrarPorIdeventoYZona(int id_evento, String zona) {
        return Dao.findbyIdeventoZona(id_evento, zona);
    }

}
