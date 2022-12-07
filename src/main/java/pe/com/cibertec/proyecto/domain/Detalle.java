/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.cibertec.proyecto.domain;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 *
 * @author Asus
 */
@Entity
@Data
@Table(name = "detalle")
public class Detalle implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private CompraDetalle detalleCompra;

    @NotNull
    private double precio;

    @NotNull
    private int cantidad;

}
