package Modelo;

import Modelo.Fecha;
import Modelo.Empleado;
import Modelo.Departamento;

/**
 *
 * @author braul
 */

//esta es un clase para unificar las otras clases en un solo formato
public class FormatoEmpleado{
    private Empleado nombre;
    private Fecha fechaNacimiento;
    private Fecha fechaIngreso;
    private Departamento departamento;
    private Hora horario;
    
    //Constructor
    
    public FormatoEmpleado(Empleado nombre,Fecha fechaNacimiento, Fecha fechaIngreso, Departamento departament, Hora horario  ){
    
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
        this.departamento = departamento;
        this.horario = horario;
 
    }

    public FormatoEmpleado(Empleado datos, Fecha fechaNacimiento, Fecha fechaIngreso, Departamento dpto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //metodo obtener (getter)

    public Empleado getNombre() {
        return nombre;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Fecha getFechaIngreso() {
        return fechaIngreso;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public Hora getHorario() {
        return horario;
    }
    
    //Metodo establecer (setter)

    public void setNombre(Empleado nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setFechaIngreso(Fecha fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public void setHorario(Hora horario) {
        this.horario = horario;
    }
    
    @Override
    public String toString() {
        return getNombre() + " Fecha de: Nacimiento: " + getFechaNacimiento() + " Ingreso: " + getFechaIngreso() + " " + getDepartamento() + "\n" + getHorario();
    }
    
}
