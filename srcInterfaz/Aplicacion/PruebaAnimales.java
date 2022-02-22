/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion;

import Modelo.*;
import java.util.ArrayList;

/**
 *
 * @author juan.ucan
 */
public class PruebaAnimales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Animal> listaAnimales = new ArrayList<Animal>();
        
        listaAnimales.add(new Serpiente("Snaky", 1, 1.80));
        listaAnimales.add(new Conejo("Roger Rabit", 20));
        listaAnimales.add(new Aguila("Aguilucho", 15));
        listaAnimales.add(new Conejo("Bugs", 16));       
 
        
        //Ahora viene el procesamiento de forma general        
        for(int i=0; i<listaAnimales.size(); i++){
            if (listaAnimales.get(i) instanceof Serpiente){
                Serpiente unaSerpiente = (Serpiente) listaAnimales.get(i);
                unaSerpiente.setLongitud( 2* unaSerpiente.getLongitud());
            }
            System.out.println(listaAnimales.get(i) + listaAnimales.get(i).mover());
        }
        
    }
    
}
