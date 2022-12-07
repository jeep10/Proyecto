/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.cibertec.proyecto.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.com.cibertec.proyecto.domain.Disponibilidad;

/**
 *
 * @author Asus
 */
@Repository
public interface DisponibilidadDao extends JpaRepository<Disponibilidad, Integer> {

}
