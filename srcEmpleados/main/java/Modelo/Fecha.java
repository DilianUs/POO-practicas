package Modelo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/**
 *
 * @author braul
 */
public class Fecha {
    private int dia;
    private int mes;
    private int anio;
    
    //constructor
    
    public Fecha(int dia, int mes, int anio){
    
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    //Metodo obtener(getter)

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }
    
    //Metodo establecer(setter)

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    //metodo para validar la fecha
    public boolean validarFecha(){
       boolean validar = false; 
       
       try {
       //establecemos el formato de la fecha en (dia/mes/anio)
    SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
    formatoFecha.setLenient(false);
      //comprobar la fecha
    formatoFecha.parse(this.dia + "/" + this.mes + "/" + this.anio);
    validar = true;
       }
       catch(ParseException e){
           validar = false;
           //esto en caso de que la fecha no sea correcta
       }
        return validar;
    }
    
    @Override
    public String toString() {
        return getDia() + " / " + getMes() + " / " + getAnio();
    }
    
}
