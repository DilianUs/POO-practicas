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
public class Serpiente extends Animal{
    private double longitud;
    
    //Constructor
    public Serpiente(String nombre, double edad, double longitud) {
        super(nombre, edad);
        this.longitud = longitud;
    }
    
    //Métodos get y set
    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    
    //Codificación del método abstracto
    @Override
    public String mover() {
       return ", se mueve arrastrando";
    }
    
    //Método toString
    @Override
    public String toString() {
        return super.toString() + ",longitud=" + getLongitud();
    }
        
}
