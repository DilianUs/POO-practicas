package Sueldo;

/**
 *
 * @author joeli
 */
public abstract class Empleado {
    private String primerNombre;
    private String apellidoPaterno;
    private int nss;

    public Empleado(String primerNombre, String apellidoPaterno, int nss) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.nss = nss;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }
    
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
    
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setNss(int nss) {
        this.nss = nss;
    }
    
    public int getNss() {
        return nss;
    }
    
    public abstract double sueldo();
    
    public String getSueldo(){
        return String.valueOf(sueldo());
    }

    @Override
    public String toString() {
        return "Nombre: " + getPrimerNombre() + " " + getApellidoPaterno() + " " + "NSS: " + getNss() + "\n";
    }

}
