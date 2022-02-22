/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


import java.util.ArrayList;


/**
 *
 * @author braul
 */
public class Guardado {
   
   ArrayList listaValores[] = new ArrayList[10];

   public int lugararreglo;
   public int valorGuardado;

    public Guardado(int lugararreglo, int valorGuardado) {
        this.lugararreglo = lugararreglo;
        this.valorGuardado = valorGuardado;
    }

    public Guardado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    public ArrayList[] getListaValores() {
        return listaValores;
    }

    public int getLugararreglo() {
        return lugararreglo;
    }

    public int getValorGuardado() {
        return valorGuardado;
    }

    public void setListaValores(ArrayList[] listaValores) {
        this.listaValores = listaValores;
    }

    public void setLugararreglo(int lugararreglo) {
        this.lugararreglo = lugararreglo;
    }

    public void setValorGuardado(int valorGuardado) {
        this.valorGuardado = valorGuardado;
    }

    public void llenarArreglo(int lugararreglo,int valorGuardado,ArrayList[] listaValores ){
    
        listaValores[lugararreglo] = valorGuardado;
        
    }

    public void llenarArreglo(int posicion, int valor, ArrayList datos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
   
}
