/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author braul
 */
public class EmpleadoAsalariado extends Empleado{
    private float salarioSemanal;

    //constructor
    public EmpleadoAsalariado(String primerNombre, String primerApellido, int numeroSeguroSocial,float salarioSemanal){
    
        super(primerNombre,primerApellido,numeroSeguroSocial);
        this.salarioSemanal = salarioSemanal;
    }

    public float getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(float salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }
    
    
    @Override
    public float sueldo() {
        return salarioSemanal;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
