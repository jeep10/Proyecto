/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.cibertec.proyecto.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.com.cibertec.proyecto.dao.UsuarioDao;
import pe.com.cibertec.proyecto.domain.Rol;
import pe.com.cibertec.proyecto.domain.Usuario;
import pe.com.cibertec.proyecto.util.EncriptarPassword;

/**
 *
 * @author Asus
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsuarioDao dao;

    @Override
    @Transactional
    public Usuario save(Usuario usuario) {

        EncriptarPassword encriptar = new EncriptarPassword();

        Usuario user = new Usuario();
        user.setNombres(usuario.getNombres());
        user.setApellidos(usuario.getApellidos());
        user.setDni(usuario.getDni());
        user.setUsername(usuario.getUsername());
        String pass = encriptar.encriptarPassword(usuario.getPassword());
        user.setPassword(pass);

        Rol rol = new Rol();

        rol.setIdRol(2);
//        List<Rol> rol = new ArrayList<Rol>();
//        rol.add((Rol) Arrays.asList(new Rol("ROLE_USER")));
        user.setRol(rol);

//                new Usuario(usuario.getNombres(), usuario.getApellidos(), usuario.getUsername(), usuario.getDni(), usuario.getPassword(),
//                Arrays.asList(new Rol("ROLE_USER")));
        return dao.save(user);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Usuario> listarUser() {
        return dao.findAll();
    }

    @Override
    @Transactional
    public void eliminar(Usuario evento) {
        dao.delete(evento);
    }

    @Override
    @Transactional(readOnly = true)
    public Usuario econtrarUser(Usuario evento) {
        return dao.findById(evento.getId_usuario()).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public Usuario encontrarPornombredeusuario(String username) {

        return dao.findAll(username);

    }

    @Override
    @Transactional(readOnly = true)
    public List<Usuario> encontrarPornombredeusuarioTodos(String username) {

        if (username != null) {

            return dao.findAllUsers(username);
        }

        return dao.findAll();
    }

}
