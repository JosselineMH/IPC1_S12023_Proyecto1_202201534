/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1;

/**
 *
 * @author josse
 */
public class Sucursales {
    private String codigoregion;
    private String departamento;
    private String codigodepto;
    private String municipio;
    
    public String getCodigoReg() {
        return codigoregion;
    }

    public void setCodigoReg(String codigoregion) {                                                                                   
        this.codigoregion = codigoregion;
    }
    
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {                                                                                   
        this.departamento = departamento;
    }
    public String getCodigoDepto() {
        return codigodepto;
    }

    public void setCodigoDepto(String codigodepto) {                                                                                   
        this.codigodepto = codigodepto;
    }
    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {                                                                                   
        this.municipio = municipio;
    }
}
