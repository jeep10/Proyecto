/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.cibertec.proyecto.servicio;

import java.util.List;
import org.springframework.stereotype.Service;
import pe.com.cibertec.proyecto.domain.Disponibilidad;

/**
 *
 * @author Asus
 */
@Service
public interface DisponibilidadService {

    public abstract List<Disponibilidad> listaDisponibilidad();

}
