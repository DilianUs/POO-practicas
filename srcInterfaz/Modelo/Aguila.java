/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author juan.ucan
 */
public class Aguila extends Animal{
    

    //Constructor
    public Aguila(String nombre, double edad) {
        super(nombre, edad);
    }
    
    //Codificación del método abstracto
    public String mover(){
        return ", se mueve volando";
    }
    
        
}
