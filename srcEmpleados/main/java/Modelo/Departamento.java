package Modelo;

/**
 *
 * @author braul
 */
public class Departamento {
   private String claveDpto;
   private String departamento;
   
   //Constructor

   public Departamento(String claveDpto, String departamento){
      this.claveDpto = claveDpto;
      this.departamento = departamento;
   } 
   
   //Metodo obtener (getter)

    public String getClaveDpto() {
        return claveDpto;
    }

    public String getDepartamento() {
        return departamento;
    }
   //Metodo establecer(settter)

    public void setClaveDpto(String claveDpto) {
        this.claveDpto = claveDpto;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    @Override
    public String toString() {
        return " Departamento:" + getDepartamento();
    }

}
