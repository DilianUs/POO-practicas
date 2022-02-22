package Sueldo;

/**
 *
 * @author joeli
 */
public class EmpleadoPorHoras extends Empleado{
    private int sueldoHora;
    private int numeroHoras;

    public EmpleadoPorHoras(int sueldoHora, int numeroHoras, String primerNombre, String apellidoPaterno, int nss) {
        super(primerNombre, apellidoPaterno, nss);
        this.sueldoHora = sueldoHora;
        this.numeroHoras = numeroHoras;
    }

    public int getSueldoHora() {
        return sueldoHora;
    }

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public void setSueldoHora(int sueldoHora) {
        this.sueldoHora = sueldoHora;
    }

    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    @Override
    public double sueldo() {
        double sueldohora = getSueldoHora();
        double numerohora = getNumeroHoras();
        
        if(numerohora<=40){
            return sueldohora*numerohora;
        }
        else{
            return 40*sueldohora + (numerohora-40)*sueldohora*1.5;
        }
        
    }

    @Override
    public String toString() {
        return super.toString() + "Sueldo por hora: " + getSueldoHora() + " Numero de horas: " + getNumeroHoras() + "\n";
    }
    
    
}
