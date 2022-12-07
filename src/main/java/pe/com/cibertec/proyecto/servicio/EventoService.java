/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.cibertec.proyecto.servicio;

import java.util.List;
import org.springframework.stereotype.Service;
import pe.com.cibertec.proyecto.domain.Evento;

/**
 *
 * @author Asus
 */
@Service
public interface EventoService {

    public abstract List<Evento> listarEvento();

    public abstract void guardar(Evento evento);

    public abstract void eliminar(Evento evento);

    public abstract Evento econtrarEvento(Evento evento);

    public List<Evento> listarPorDisponibilidad();

    public List<Evento> listarPorNombre(String nombre);

    public List<Evento> listarSoloPorNombre(String nombre);

}
