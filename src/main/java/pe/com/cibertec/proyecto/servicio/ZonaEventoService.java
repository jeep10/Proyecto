/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.cibertec.proyecto.servicio;

import java.util.List;
import org.springframework.stereotype.Service;
import pe.com.cibertec.proyecto.domain.ZonaEvento;

/**
 *
 * @author Asus
 */
@Service
public interface ZonaEventoService {

    public abstract List<ZonaEvento> listazona();

    public abstract void guardar(ZonaEvento zonaEvento);

    public abstract void eliminar(ZonaEvento zonaEvento);

    public abstract ZonaEvento econtrarZona(ZonaEvento zonaEvento);

    public abstract String traerAforo(int id);

    public List<ZonaEvento> listarSoloPorNombreZona(String zona);

    public List<ZonaEvento> encontrarPorEvento(int id_evento);

    public ZonaEvento encontrarPorIdeventoYZona(int id_evento, String zona);

}
