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
public abstract class Animal{
    private String nombre;
    private double edad;   
    
    //Constructor
    public Animal(String nombre, double edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    //Métodos get
    public String getNombre() {
        return nombre;
    }

    public double getEdad() {
        return edad;
    }
    
    //Métodos set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }
    
    //Método abstracto mover
    public abstract String mover();
    
    //Método toString
    @Override
    public String toString() {
        return "nombre=" + getNombre() + ", edad=" + getEdad();
    }    
    
}
