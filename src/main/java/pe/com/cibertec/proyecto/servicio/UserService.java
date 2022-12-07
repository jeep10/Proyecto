/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.cibertec.proyecto.servicio;

import java.util.List;
import org.springframework.stereotype.Service;
import pe.com.cibertec.proyecto.domain.Usuario;

/**
 *
 * @author Asus
 */
@Service
public interface UserService {

    public Usuario save(Usuario usuario);

    public abstract List<Usuario> listarUser();

    public abstract void eliminar(Usuario evento);

    public abstract Usuario econtrarUser(Usuario evento);

    public Usuario encontrarPornombredeusuario(String username);

    public List<Usuario> encontrarPornombredeusuarioTodos(String username);

}
