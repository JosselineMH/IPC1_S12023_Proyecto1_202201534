/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto1;

/**
 *
 * @author josse
 */
public class PROYECTO1 {

    public static void main(String[] args) {
        LoginFrame login = new LoginFrame();
        login.setVisible(true);
        regiones();
       
       
       
        
    }
    
    public static void regiones(){
       Regiones addreg1 = new Regiones();
       Regiones addreg2 = new Regiones();
       Regiones addreg3 = new Regiones();
       Regiones addreg4 = new Regiones();
       Regiones addreg5 = new Regiones();
       Regiones addreg6 = new Regiones();
       
       addreg1.setCodigoR("(M) Metropolitana");
       addreg1.setPrecioEst(25.00);
       addreg1.setPrecioEsp(35.00);
       
       addreg2.setCodigoR("(NT) Norte");
       addreg2.setPrecioEst(45.55);
       addreg2.setPrecioEsp(68.50);
       
       addreg3.setCodigoR("(NO) Nororiente");
       addreg3.setPrecioEst(35.48);
       addreg3.setPrecioEsp(58.68);
       
       addreg4.setCodigoR("(SO) Suroriente");
       addreg4.setPrecioEst(32.48);
       addreg4.setPrecioEsp(38.68);
       
       addreg5.setCodigoR("(NOC) Noroccidente");
       addreg5.setPrecioEst(29.00);
       addreg5.setPrecioEsp(34.00);
       
       addreg6.setCodigoR("(SOC) Suroccidente");
       addreg6.setPrecioEst(40.00);
       addreg6.setPrecioEsp(44.50);
       
       AppState.listaregiones.add(addreg1);
       AppState.listaregiones.add(addreg2);
       AppState.listaregiones.add(addreg3);
       AppState.listaregiones.add(addreg4);
       AppState.listaregiones.add(addreg5);
       AppState.listaregiones.add(addreg6);
       
        for(int i = 0; i< AppState.listaregiones.size(); i++){ 
                    System.out.println(AppState.listaregiones.get(i).getCodigoR()+"-"+AppState.listaregiones.get(i).getPrecioEst()+"-"+AppState.listaregiones.get(i).getPrecioEsp());   
        }
    }
}
