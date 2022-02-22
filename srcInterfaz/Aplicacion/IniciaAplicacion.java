/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion;

import Modelo.Animal;
import Vista.FrmInicio;
import java.util.ArrayList;

/**
 *
 * @author juan.ucan
 */
public class IniciaAplicacion {
     public static ArrayList<Animal> listaAnimales = new ArrayList<Animal>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new FrmInicio().setVisible(true);
        
    }
    
}
