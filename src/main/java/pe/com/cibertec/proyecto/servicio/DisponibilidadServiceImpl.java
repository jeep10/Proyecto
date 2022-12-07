/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.cibertec.proyecto.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.cibertec.proyecto.dao.DisponibilidadDao;
import pe.com.cibertec.proyecto.domain.Disponibilidad;

/**
 *
 * @author Asus
 */
@Service
public class DisponibilidadServiceImpl implements DisponibilidadService {

    @Autowired
    private DisponibilidadDao Dao;

    @Override
    public List<Disponibilidad> listaDisponibilidad() {
        return Dao.findAll();
    }

}
