/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1;

import javax.swing.*;

/**
 *
 * @author josse
 */
public class Usuario {
    private String correo;
    private String nombre;
    private String apellido;
    private String contra;
    private long DPI;
    private String fecha;
    private String genero;
    private String nacionalidad;
    private String sobrenombre;
    private long telefono;
    private String rol;
    private ImageIcon foto;

    
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {                                                                                   
        this.correo = correo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {                                                                                   
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {                                                                                   
        this.apellido = apellido;
    }
    
    public String getContraseña() {
        return contra;
    }

    public void setContraseña(String contra) {                                                                                   
        this.contra = contra;
    }
    
    public long getDPI() {
        return DPI;
    }

    public void setDPI(long DPI) {                                                                                   
        this.DPI = DPI;
    }
    
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {                                                                                   
        this.fecha = fecha;
    }
    
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {                                                                                   
        this.genero = genero;
    }
    
    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {                                                                                   
        this.nacionalidad = nacionalidad;
    }
    
    public String getSobrenombre() {
        return sobrenombre;
    }

    public void setSobrenombre(String sobrenombre) {                                                                                   
        this.sobrenombre = sobrenombre;
    }
    
    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {                                                                                   
        this.telefono = telefono;
    }
    
    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {                                                                                   
        this.rol = rol;
    }
    
    public ImageIcon getFoto() {
        return foto;
    }

    public void setFoto(ImageIcon foto) {                                                                                   
        this.foto = foto;
    }
    /*
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();                                                                   
        sb.append("\nCorreo: ");
        sb.append(correo);
         /*
        sb.append("\nMarca: ");
        sb.append(marca);
        sb.append("\nModelo: ");
        sb.append(modelo);
        sb.append("\nKm: ");
        sb.append(Km);*

        return sb.toString();
    }  
    */

}
