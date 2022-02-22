package Sueldo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author joeli
 */
public class control {
   public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        ArrayList<Empleado> listaEmpleado = new ArrayList();
        
        int opcion;
        int tipo;
        int salario;
        
        System.out.println("Programa para ingresar el sueldo de los empleados\n");
        
        do{
            System.out.println("Tipo de empleado a ingresar\n");
            System.out.println("(1)Empleado asalariado \n(2)Empleado por horas \n(3)Empleado por comision \n(4)Empleado asalariado por comision");
            tipo = entrada.nextInt();
            if (tipo < 1 || tipo > 4){
                do{
                    System.out.println("Error!! Tipo de empleado inexistente\nIngrese nuevamente el empleado");
                    System.out.println("(1)Empleado asalariado \n(2)Empleado por horas \n(3)Empleado por comision \n(4)Empleado asalariado por comision");
                    tipo = entrada.nextInt();
                }while(tipo < 1 || tipo > 4);
            }
            //entrada.nextLine();
            System.out.println("Nombre de empleado: ");
            String nombre = entrada.next(); 
            
            System.out.println("Apellido paterno: ");
            String apellido = entrada.next();
            System.out.println("NSS: ");
            int nss = entrada.nextInt();
            //entrada.nextLine();
            switch(tipo){
                case 1:
                    System.out.println("Ingrese salario semanal: ");
                    salario = entrada.nextInt();
                    EmpleadoAsalariado empleadoA = new EmpleadoAsalariado(salario, nombre, apellido, nss);
                    listaEmpleado.add(empleadoA);
                break;
                case 2:
                    System.out.println("Ingrese el sueldo por hora: ");
                    salario = entrada.nextInt();
                    System.out.println("Ingrese horas trabajadas: ");
                    int horas = entrada.nextInt();
                    EmpleadoPorHoras empleadoPH = new EmpleadoPorHoras(salario, horas, nombre, apellido, nss);
                    listaEmpleado.add(empleadoPH);
                break;
                case 3:
                    System.out.println("Ingrese ventas brutas: ");
                    double ventas = entrada.nextDouble();
                    System.out.println("Ingrese tarifa por comision: ");
                    int tarifa = entrada.nextInt();
                    EmpleadoPorComision empleadoPC = new EmpleadoPorComision(ventas, tarifa, nombre, apellido, nss);
                    listaEmpleado.add(empleadoPC);
                break;
                case 4:
                    System.out.println("Ingrese ventas brutas: ");
                    ventas = entrada.nextDouble();
                    System.out.println("Ingrese tarifa por comision: ");
                    tarifa = entrada.nextInt();
                    System.out.println("Ingrese sueldo base: ");
                    double salario2 = entrada.nextInt();
                    salario2 = salario2*1.1;
                    EmpleadoBaseMasComision empleadoBMC = new EmpleadoBaseMasComision(salario2, ventas, tarifa, nombre, apellido, nss);
                    listaEmpleado.add(empleadoBMC);
                break;
            }
            
            
            System.out.println("Desea registrar otro empleado ?");
            System.out.println("(1)Si \n(0)No \n");
            opcion = entrada.nextInt();
            
        }while(opcion != 0);
        
        for(int i=0; i<listaEmpleado.size(); i++){
            if(listaEmpleado.get(i) instanceof EmpleadoBaseMasComision){
                ((EmpleadoBaseMasComision) listaEmpleado.get(i)).setSalarioBase(1.1*((EmpleadoBaseMasComision) listaEmpleado.get(i)).getSalarioBase());
                System.out.println(listaEmpleado.get(i) + "Sueldo total: " + listaEmpleado.get(i).sueldo());       
            }
            else
                System.out.println(listaEmpleado.get(i) + "Sueldo total: " + listaEmpleado.get(i).sueldo());       
        }     
   }
}