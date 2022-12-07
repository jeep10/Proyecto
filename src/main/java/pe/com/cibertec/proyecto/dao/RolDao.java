/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.cibertec.proyecto.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.com.cibertec.proyecto.domain.Rol;

/**
 *
 * @author Asus
 */
public interface RolDao extends JpaRepository<Rol, Integer> {

}
