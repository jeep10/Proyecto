/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.cibertec.proyecto.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.cibertec.proyecto.dao.RolDao;
import pe.com.cibertec.proyecto.domain.Rol;

/**
 *
 * @author Asus
 */
@Service
public class RolServiceImpl implements RolService {

    @Autowired
    private RolDao RolDao;

    @Override
    public List<Rol> listaRol() {
        return RolDao.findAll();
    }

}
