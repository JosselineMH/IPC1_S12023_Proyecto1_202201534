/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1;

/**
 *
 * @author josse
 */
public class Facturacion {
    private String propietarioF;
    private String nombreF;
    private String direccionF;
    private String NITF;
    
    public String getPropietarioF() {
        return propietarioF;
    }

    public void setPropietarioF(String propietarioF) {                                                                                   
        this.propietarioF = propietarioF;
    }
    
    public String getNombreF() {
        return nombreF;
    }

    public void setNombreF(String nombreF) {                                                                                   
        this.nombreF = nombreF;
    }
    
    public String getDireccionF() {
        return direccionF;
    }

    public void setDireccionF(String direccionF) {                                                                                   
        this.direccionF = direccionF;
    }
    
     public String getNITF() {
        return NITF;
    }

    public void setNITF(String NITF) {                                                                                   
        this.NITF = NITF;
    }
}
