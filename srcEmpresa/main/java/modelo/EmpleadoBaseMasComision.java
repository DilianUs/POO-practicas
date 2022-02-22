
package modelo;

public class EmpleadoBaseMasComision extends EmpleadoPorComision {
     private float salarioBase;

    public EmpleadoBaseMasComision(float salarioBase, float ventasBrutas, int tarifaComision, String primerNombre, String primerApellido, int numeroSeguroSocial) {
        super(ventasBrutas, tarifaComision, primerNombre, primerApellido, numeroSeguroSocial);
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    @Override
    public float sueldo(){
        return (float) (super.sueldo() + getSalarioBase());
    }

    @Override
    public String toString() {
        return super.toString() + "Salario base: " + getSalarioBase();
    }
}
