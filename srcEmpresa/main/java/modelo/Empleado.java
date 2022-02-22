package modelo;

/**
 *
 * @author braul
 */
public abstract class Empleado {
    private String primerNombre;
    private String primerApellido;
    private int numeroSeguroSocial;

    public Empleado(String primerNombre, String primerApellido, int numeroSeguroSocial) {
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    //setter

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public void setNumeroSeguroSocial(int numeroSeguroSocial) {
        this.numeroSeguroSocial = numeroSeguroSocial;
    }
    
    
    //getter
    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public int getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }
    
    public abstract float sueldo();
    
     public String getSueldo(){
        return String.valueOf(sueldo());
    }
     
    @Override
    public String toString() {
        return "Nombre: " + getPrimerNombre() + " " + getPrimerApellido() + " " + "NSS: " + getNumeroSeguroSocial() + "\n";
    }
    
   
}
