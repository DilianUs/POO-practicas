package Sueldo;

/**
 *
 * @author joeli
 */
public class EmpleadoAsalariado extends Empleado {
    private int salarioSemanal;

    public EmpleadoAsalariado(int salarioSemanal, String primerNombre, String apellidoPaterno, int nss) {
        super(primerNombre, apellidoPaterno, nss);
        this.salarioSemanal = salarioSemanal;
    }

   
    
    public int getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(int salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }

    @Override
    public double sueldo() {
        return salarioSemanal;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
}
