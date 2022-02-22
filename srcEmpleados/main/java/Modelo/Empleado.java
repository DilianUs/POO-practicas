package Modelo;

/**
 *
 * @author braul
 */
public class Empleado {
    private String claveEmpleado;
    private String nombreEmpleado;
    private String apellidoPaterno;
    private String apellidoMaterno;
    
    //contructor
    public Empleado(String claveEmpleado, String nombreEmpleado, String apellidoPaterno, String apellidoMaterno){
     this.claveEmpleado = claveEmpleado;
     this.nombreEmpleado = nombreEmpleado;
     this.apellidoPaterno = apellidoPaterno;
     this.apellidoMaterno = apellidoMaterno;
    }

     //Metodo de obtener(getter)
  
    public String getClaveEmpleado() {
        return claveEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }


    public String getApellidoPaterno() {
        return apellidoPaterno;
    }


    public String getApellidoMaterno() {
        return apellidoMaterno;
    }


    //Metodo de establecer(setter)
    public void setClaveEmpleado(String claveEmpleado) {
        this.claveEmpleado = claveEmpleado;
    }
    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }
    
    @Override
    public String toString() {
        return getClaveEmpleado() + " " + getNombreEmpleado() + " " + getApellidoPaterno() + " " + getApellidoMaterno();
    }
      
}
