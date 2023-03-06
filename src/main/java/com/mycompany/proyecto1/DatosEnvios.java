/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1;

/**
 *
 * @author josse
 */
public class DatosEnvios {
    private String correocliente;
    private String codigopaq;
    private String numfactura;
    private String tiposervicio;
    private String destinatario;
    private String origen;
    private String destino;
    private String NIT;
    private String tipopago;
    private long tamanopaq;
    private long numpaquetes;
    private String fechaenvio;
    private double totalpago;
    private long contador=0;
    
    public String getCorreoCliente() {
        return correocliente;
    }
    public void setCorreoCliente(String correocliente) {                                                                                   
        this.correocliente = correocliente;
    }
    
    public String getCodigoPaq() {
        return codigopaq;
    }
    public void setCodigoPaq(String codigopaq) {                                                                                   
        this.codigopaq = codigopaq;
    }
    
    public String getNumFactura() {
        return numfactura;
    }
    public void setNumFactura(String numfactura) {                                                                                   
        this.numfactura = numfactura;
    }
    
    public String getTipoServicio() {
        return tiposervicio;
    }
    public void setTipoServicio(String tiposervicio) {                                                                                   
        this.tiposervicio = tiposervicio;
    }
    
    public String getDestinatario() {
        return destinatario;
    }
    public void setDestinatario(String destinatario) {                                                                                   
        this.destinatario = destinatario;
    }
    
    public String getOrigen() {
        return origen;
    }
    public void setOrigen(String origen) {                                                                                   
        this.origen = origen;
    }
    
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {                                                                                   
        this.destino = destino;
    }
    
    public String getNIT() {
        return NIT;
    }
    public void setNIT(String NIT) {                                                                                   
        this.NIT = NIT;
    }
    
    public String getTipoPago() {
        return tipopago;
    }
    public void setTipoPago(String tipopago) {                                                                                   
        this.tipopago = tipopago;
    }
    
    public long getTamanoPaquete() {
        return tamanopaq;
    }
    public void setTamanoPaquete(long tamanopaq) {                                                                                   
        this.tamanopaq = tamanopaq;
    }
    
    public long getNumPaquetes() {
        return numpaquetes;
    }
    public void setNumPaquetes(long numpaquetes) {                                                                                   
        this.numpaquetes = numpaquetes;
    }
    
    public String getFechaEnvio() {
        return fechaenvio;
    }
    public void setFechaEnvio(String fechaenvio) {                                                                                   
        this.fechaenvio = fechaenvio;
    }
    
    public double getTotalPago() {
        return totalpago;
    }
    public void setTotalPago(double totalpago) {                                                                                   
        this.totalpago = totalpago;
    }
    
    public long getContador() {
        return contador;
    }
    public void setContador(long contador) {                                                                                   
        this.contador = contador;
    }
}
