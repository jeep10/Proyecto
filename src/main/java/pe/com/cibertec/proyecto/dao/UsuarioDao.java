/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.cibertec.proyecto.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.com.cibertec.proyecto.domain.Usuario;

/**
 *
 * @author Asus
 */
@Repository
public interface UsuarioDao extends JpaRepository<Usuario, Long> {

    Usuario findByUsername(String username);

    @Query("SELECT u FROM Usuario u WHERE u.username LIKE %?1%")
    public Usuario findAll(String username);

    @Query("SELECT u FROM Usuario u WHERE u.nombres LIKE %?1% "
            + " OR u.apellidos LIKE %?1% "
            + " OR u.username LIKE %?1% "
            + " OR u.dni LIKE %?1%")
    public List<Usuario> findAllUsers(String username);

}
