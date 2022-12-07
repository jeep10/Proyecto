/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.cibertec.proyecto.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.com.cibertec.proyecto.domain.Local;

/**
 *
 * @author Asus
 */
@Repository
public interface LocalDao extends JpaRepository<Local, Integer> {

    @Query("SELECT l FROM Local l WHERE l.nombre LIKE %?1%")
    public List<Local> findAll(String nombre);
}
