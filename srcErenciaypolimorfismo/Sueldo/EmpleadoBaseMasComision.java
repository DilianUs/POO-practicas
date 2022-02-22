package Sueldo;

/**
 *
 * @author joeli
 */
public class EmpleadoBaseMasComision extends EmpleadoPorComision{
    private double salarioBase;

    public EmpleadoBaseMasComision(double salarioBase, double ventasBrutas, int tarifaComision, String primerNombre, String apellidoPaterno, int nss) {
        super(ventasBrutas, tarifaComision, primerNombre, apellidoPaterno, nss);
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    @Override
    public double sueldo(){
        return super.sueldo() + getSalarioBase();
    }

    @Override
    public String toString() {
        return super.toString() + "Salario base: " + getSalarioBase();
    }
    
}
