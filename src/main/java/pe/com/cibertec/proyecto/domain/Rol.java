/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.cibertec.proyecto.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

/**
 *
 * @author Asus
 */
@Entity
@Data
@Table(name = "rol")
public class Rol implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRol;

    @NotEmpty
    private String nombre;

    public Rol(int idRol, String nombre) {
        this.idRol = idRol;
        this.nombre = nombre;
    }

    public Rol(int idRol) {
        this.idRol = idRol;

    }

    public Rol() {
    }

    public Rol(String nombre) {
        this.nombre = nombre;
    }

}
