/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.cibertec.proyecto.servicio;

import java.io.IOException;
import java.net.MalformedURLException;
import org.springframework.core.io.Resource;

import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Asus
 */
public interface FileService {

    public Resource load(String filename) throws MalformedURLException;

    public String copy(MultipartFile file) throws IOException;

    public boolean delete(String filename);

}
