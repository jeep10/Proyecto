/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.cibertec.proyecto.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.com.cibertec.proyecto.domain.Evento;

/**
 *
 * @author Asus
 */
@Repository
public interface EventoDao extends JpaRepository<Evento, Integer> {

    @Query("SELECT e FROM Evento e WHERE e.disponibilidad.id_disponibilidad = 1 AND e.estado.id_estado !=4 AND e.estado.id_estado !=3")
//    @Query("SELECT e FROM Evento e WHERE p.id_disponibilidad LIKE %?1%")
    public List<Evento> findAllDis();

    @Query("SELECT e FROM Evento e WHERE e.nombre LIKE %?1% AND e.disponibilidad.id_disponibilidad = 1 AND e.estado.id_estado !=4")
    public List<Evento> findAllPorNombre(String nombre);

    @Query("SELECT e FROM Evento e WHERE e.nombre LIKE %?1% "
            + " OR e.estado.nomestado LIKE %?1% "
            + " OR e.disponibilidad.nomdis LIKE %?1%")
    public List<Evento> findAll(String nombre);

}
