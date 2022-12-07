/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.cibertec.proyecto.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.cibertec.proyecto.dao.EstadoDao;
import pe.com.cibertec.proyecto.domain.Estado;

/**
 *
 * @author Asus
 */
@Service
public class EstadoServiceImpl implements EstadoService {

    @Autowired
    private EstadoDao Dao;

    @Override
    public List<Estado> listaEstado() {
        return Dao.findAll();
    }

}
