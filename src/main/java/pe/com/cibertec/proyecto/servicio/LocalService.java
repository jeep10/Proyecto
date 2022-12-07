/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.cibertec.proyecto.servicio;

import java.util.List;
import org.springframework.stereotype.Service;
import pe.com.cibertec.proyecto.domain.Local;

/**
 *
 * @author Asus
 */
@Service
public interface LocalService {

    public abstract List<Local> listaLocal();

    public abstract void guardar(Local local);

    public abstract void eliminar(Local local);

    public abstract Local econtrarLocal(Local local);

    public abstract List<Local> ecnontrarPorNombre(String nombre);

}
