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
public class EmpleadoPorComision extends Empleado{
     private double ventasBrutas;
    private int tarifaComision;

    public EmpleadoPorComision(double ventasBrutas, int tarifaComision, String primerNombre, String primerApellido, int numeroSeguroSocial) {
        super(primerNombre,primerApellido,numeroSeguroSocial);
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    }

    

    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public int getTarifaComision() {
        return tarifaComision;
    }

    public void setVentasBrutas(double ventasBrutas) {
        this.ventasBrutas = ventasBrutas;
    }

    public void setTarifaComision(int tarifaComision) {
        this.tarifaComision = tarifaComision;
    }

     @Override
    public float sueldo() {
        return (float) (getTarifaComision() * getVentasBrutas());
    }

    @Override
    public String toString() {
        return super.toString() + "Ventas brutas: " + getVentasBrutas() + " Tarifa de comision: " + getTarifaComision();
    }
    
}
