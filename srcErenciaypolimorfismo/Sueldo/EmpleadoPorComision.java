package Sueldo;

/**
 *
 * @author joeli
 */
public class EmpleadoPorComision extends Empleado {
    private double ventasBrutas;
    private int tarifaComision;

    public EmpleadoPorComision(double ventasBrutas, int tarifaComision, String primerNombre, String apellidoPaterno, int nss) {
        super(primerNombre, apellidoPaterno, nss);
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
    public double sueldo() {
        return getTarifaComision() * getVentasBrutas();
    }

    @Override
    public String toString() {
        return super.toString() + "Ventas brutas: " + getVentasBrutas() + " Tarifa de comision: " + getTarifaComision();
    }
    
    
}
