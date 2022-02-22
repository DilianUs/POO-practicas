package Aplicacion;

import Modelo.Departamento;
import Modelo.Empleado;
import Modelo.Fecha;
import Modelo.FormatoEmpleado;
import Modelo.Hora;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author braul
 */
public class RecursosHumanos {
    public static void main(String[] args) {
      //Creamos el scanner y un arraylist para los datos de los empleados  
      Scanner entrada = new Scanner(System.in);
      ArrayList listaEmpleado = new ArrayList();
       
      //Este es un arreglo tipo string para las claves de departamento
      String Dptos [][] = {{"CO","Compras"},{"AL","Almacen"},{"FI","Finanzas"},{"RH","Recursos Humanos"}};  
      //variables para capturar el dpto y su clave
      String claveDptEnt;
      //se usa null para no apuntar a otro objeto
      String nombreDptEnt = null; 
      // usamos un booleano para la verificacion de la fecha 
      boolean validar = false;
      //La variable x nos servira para el menu y el contador para siclos que hagamos dentro del siclo principal
      int x;
      int contador = 0;
      
      //Utilizamos un do-while para que el programa se ejecute al menos 1 vez
      System.out.println("Ingrese el año actual");
      int anioActual = entrada.nextInt();
      
      do{
         //diseño del programa    
         System.out.println("***********************************************");
         System.out.println("** Bienvenido al Sistema de Recursos humanos **");
         System.out.println("***********************************************");
         System.out.println("Presione enter para comenzar");
         entrada.nextLine();
         //captura de datos personales
         System.out.println("*********************************************");
         System.out.println("Clave del empleado: ");
         String clave = entrada.nextLine();
      
         System.out.println("Nombre del empleado: ");
         String Nombre = entrada.nextLine();
      
         System.out.println("Apellido Paterno: ");
         String apellidoP = entrada.nextLine();
      
         System.out.println("Apellido Materno: ");
         String apellidoM = entrada.nextLine();
      
         //se crea un nuevo objeto de tipo empleado usando los datos recolectados
         Empleado datos = new Empleado(clave, Nombre, apellidoP, apellidoM);    
      
         System.out.println("*********************************************");
         //ahora en un procesos similar se captura la fecha de nacimiento del empleado
         System.out.println("Fecha de Nacimiento");
      
         System.out.println("Dia(dd): ");
         int dia = entrada.nextInt();

         System.out.println("Mes(mm): ");
         int mes = entrada.nextInt();

         System.out.println("Año(aaaa): ");
         int anio = entrada.nextInt();
         //En este caso lo unico que agregamos a diferencia del anterios es el metodo validar que creamos en la clase de fecha el cual nos devuelve un booleano      
         Fecha fechaNacimiento = new Fecha(dia, mes, anio);
         validar = fechaNacimiento.validarFecha();
         
         if(anio<1920 || anio >anioActual){
            System.out.println("La fecha es muy antigua o futura para registrar. Vuelva a ingresarla");
            System.out.println("Dia(dd): ");
            dia = entrada.nextInt();
            fechaNacimiento.setDia(dia);
      
            System.out.println("Mes(mm): ");
            mes = entrada.nextInt();
            fechaNacimiento.setMes(mes);
      
            System.out.println("Año(aaaa): ");
            anio = entrada.nextInt();
            fechaNacimiento.setAnio(anio);
            validar = fechaNacimiento.validarFecha();
         }
         
         //utilizando ese metodo hacemos un siclo para que en caso de haber ingresado mal la fecha se pueda volver a ingresar, establecer y verificar
         while(validar == false){
         System.out.println("La fecha es incorrecta o se cometio un error al ingresarla. Vuelva a intentarlo");
      
         System.out.println("Dia(dd): ");
         dia = entrada.nextInt();
         fechaNacimiento.setDia(dia);
      
         System.out.println("Mes(mm): ");
         mes = entrada.nextInt();
         fechaNacimiento.setMes(mes);
      
         System.out.println("Año(aaaa): ");
         anio = entrada.nextInt();
         fechaNacimiento.setAnio(anio);
      
         validar = fechaNacimiento.validarFecha();
        }
      
         //En la fecha de ingreso es el mismo procesos solo que el objeto nuevo y las variables tendran otro nombre
        System.out.println("*********************************************");
        System.out.println("Fecha de Ingreso");
        System.out.println("Dia(dd): ");
        int dia2 = entrada.nextInt();

        System.out.println("Mes(mm): ");
        int mes2 = entrada.nextInt();

        System.out.println("Año(aaaa): ");
        int anio2 = entrada.nextInt();

        Fecha fechaIngreso = new Fecha(dia2, mes2, anio2);
        validar = fechaIngreso.validarFecha();
        
        if(anio<1920 || anio >anioActual){
           System.out.println("Fecha la fecha de muy antigua o futura para registrarla. Vuelva a ingresarla");
          System.out.println("Dia(dd): ");
          dia2 = entrada.nextInt();
          fechaIngreso.setDia(dia2);
       
          System.out.println("Mes(mm): ");
          mes2 = entrada.nextInt();
          fechaIngreso.setMes(mes2);
       
          System.out.println("Año(aaaa): ");
          anio2 = entrada.nextInt();
          fechaIngreso.setAnio(anio2);
          validar = fechaIngreso.validarFecha();
        }
            
        while(validar == false){
          System.out.println("Fecha incorrecta. Vuelva a ingresarla");
          System.out.println("Dia(dd): ");
          dia2 = entrada.nextInt();
          fechaIngreso.setDia(dia2);
       
          System.out.println("Mes(mm): ");
          mes2 = entrada.nextInt();
          fechaIngreso.setMes(mes2);
       
          System.out.println("Año(aaaa): ");
          anio2 = entrada.nextInt();
          fechaIngreso.setAnio(anio2);
       
           validar = fechaIngreso.validarFecha();
        }
      
         System.out.println("*********************************************");
      
         //ahora sigue la captura del departamento y su clave
      
         System.out.println("Departamento");
         System.out.println("Clave (Dos caracteres, en mayusculas;CO,AL,FI,RH): ");
         entrada.nextLine();
         claveDptEnt = entrada.nextLine();
      
         do{
           for(int i=0; i<4; i++){
             if(Dptos[i][0].equals(claveDptEnt)){
                 nombreDptEnt = Dptos[i][1];
                 contador ++;                      
             }        
          }
          if(contador == 0){
             System.out.println("Departamento no encontrado. Ingrese la clave nuevamente");
             System.out.println("Clave (Dos caracteres, en mayusculas;CO,AL,FI,RH): ");
             claveDptEnt = entrada.nextLine();         
          }
                    
         }while(contador == 0);
      
             Departamento dpto = new Departamento(claveDptEnt, nombreDptEnt);
      
            //ahora iniciamos la seccion del horario de lunes a viernes
           System.out.println("Horario de trabajo de lunes a viernes. (formato 24 hrs) (separe las horas y minutos con :)");
            System.out.println("Hora de entrada: ");
            String horaEntrada  = entrada.nextLine();
            String[] tiempo = horaEntrada.split(":");
            String part1 = tiempo[0];
            int hora = Integer.parseInt(part1);
            String part2 = tiempo[1];
            int minutos = Integer.parseInt(part2);
            if (hora<0 || hora>24 || minutos>59 || minutos<0){
                int aux = 0;
                do{
                    System.out.print("Hora incorrecta. Introduzca la hora nuevamente");
                    System.out.println("Hora de entrada: ");
                    horaEntrada  = entrada.nextLine();
                    tiempo = horaEntrada.split(":");
                    part1 = tiempo[0];
                    hora = Integer.parseInt(part1);
                    part2 = tiempo[1];
                    minutos = Integer.parseInt(part2);
                    if (hora<0 || hora>24 || minutos>59 || minutos<0){
                        aux++;
                    }
                    else{
                        aux = 0;
                    }
                }while(aux != 0);
            }
            
            System.out.println("Hora de Salida: ");
            String horaSalida  = entrada.nextLine();
            tiempo = horaSalida.split(":");
            part1 = tiempo[0];
            hora = Integer.parseInt(part1);
            part2 = tiempo[1];
            minutos = Integer.parseInt(part2);
             if (hora<0 || hora>24 || minutos>59 || minutos<0){
                int aux = 0;
                do{
                    System.out.print("Hora incorrecta. Introduzca la hora nuevamente\n");
                    System.out.println("Hora de Salida: ");
                    horaSalida  = entrada.nextLine();
                    tiempo = horaSalida.split(":");
                    part1 = tiempo[0];
                    hora = Integer.parseInt(part1);
                    part2 = tiempo[1];
                    minutos = Integer.parseInt(part2);
                    if (hora<0 || hora>24 || minutos>59 || minutos<0){
                        aux++;
                    }
                    else{
                        aux = 0;
                    }
                }while(aux != 0);
             }
            
            Hora horario = new Hora(horaEntrada, horaSalida, " ", " ", " ", " ");
            
            System.out.println("Trabaja sabados ? (1)Si (0)No");
            int op1 = entrada.nextInt();
            if(op1 == 1){
                entrada.nextLine();
                System.out.println("Hora de entrada: ");
                String horaEntradaS = entrada.nextLine();
                tiempo = horaEntradaS.split(":");
                part1 = tiempo[0];
                hora = Integer.parseInt(part1);
                part2 = tiempo[1];
                minutos = Integer.parseInt(part2);
                if (hora<0 || hora>24 || minutos>59 || minutos<0){
                int aux = 0;
                do{
                    System.out.print("Hora incorrecta. Introduzca la hora nuevamente");
                    System.out.println("Hora de Salida: ");
                    horaEntradaS  = entrada.nextLine();
                    tiempo = horaEntradaS.split(":");
                    part1 = tiempo[0];
                    hora = Integer.parseInt(part1);
                    part2 = tiempo[1];
                    minutos = Integer.parseInt(part2);
                    if (hora<0 || hora>24 || minutos>59 || minutos<0){
                        aux++;
                    }
                    else{
                        aux = 0;
                    }
                }while(aux != 0);
             }
               
                System.out.println("Hora de Salida: ");
                String horaSalidaS  = entrada.nextLine();
                tiempo = horaSalidaS.split(":");
                part1 = tiempo[0];
                hora = Integer.parseInt(part1);
                part2 = tiempo[1];
                minutos = Integer.parseInt(part2);
                if (hora<0 || hora>24 || minutos>59 || minutos<0){
                int aux = 0;
                do{
                    System.out.print("Hora incorrecta. Introduzca la hora nuevamente");
                    System.out.println("Hora de Salida: ");
                    horaSalidaS  = entrada.nextLine();
                    tiempo = horaSalidaS.split(":");
                    part1 = tiempo[0];
                    hora = Integer.parseInt(part1);
                    part2 = tiempo[1];
                    minutos = Integer.parseInt(part2);
                    if (hora<0 || hora>24 || minutos>59 || minutos<0){
                        aux++;
                    }
                    else{
                        aux = 0;
                    }
                }while(aux != 0);
             }
                
                horario.setHoraEntradaS(horaEntradaS);
                horario.setHoraSalidaS(horaSalidaS);
            }
            
            System.out.println("Trabaja domingos ? (1)Si (0)No");
            int op2 = entrada.nextInt();
            if(op2 == 1){
                entrada.nextLine();
                System.out.println("Hora de entrada: ");
                String horaEntradaD  = entrada.nextLine();
                tiempo = horaEntradaD.split(":");
                part1 = tiempo[0];
                hora = Integer.parseInt(part1);
                part2 = tiempo[1];
                minutos = Integer.parseInt(part2);
                if (hora<0 || hora>24 || minutos>59 || minutos<0){
                int aux = 0;
                do{
                    System.out.print("Hora incorrecta. Introduzca la hora nuevamente");
                    System.out.println("Hora de Salida: ");
                    horaEntradaD  = entrada.nextLine();
                    tiempo = horaEntradaD.split(":");
                    part1 = tiempo[0];
                    hora = Integer.parseInt(part1);
                    part2 = tiempo[1];
                    minutos = Integer.parseInt(part2);
                    if (hora<0 || hora>24 || minutos>59 || minutos<0){
                        aux++;
                    }
                    else{
                        aux = 0;
                    }
                }while(aux == 0);
             }
                
                System.out.println("Hora de Salida: ");
                String horaSalidaD  = entrada.nextLine();
                tiempo = horaSalidaD.split(":");
                part1 = tiempo[0];
                hora = Integer.parseInt(part1);
                part2 = tiempo[1];
                minutos = Integer.parseInt(part2);
                if (hora<0 || hora>24 || minutos>59 || minutos<0){
                int aux = 0;
                do{
                    System.out.print("Hora incorrecta. Introduzca la hora nuevamente");
                    System.out.println("Hora de Salida: ");
                    horaSalidaD  = entrada.nextLine();
                    tiempo = horaSalidaD.split(":");
                    part1 = tiempo[0];
                    hora = Integer.parseInt(part1);
                    part2 = tiempo[1];
                    minutos = Integer.parseInt(part2);
                    if (hora<0 || hora>24 || minutos>59 || minutos<0){
                        aux++;
                    }
                    else{
                        aux = 0;
                    }
                }while(aux == 0);
             }
                
                horario.setHoraEntradaD(horaEntradaD);
                horario.setHoraSalidaD(horaSalidaD);
            }        
      
            FormatoEmpleado unEmpleado = new FormatoEmpleado(datos, fechaNacimiento, fechaIngreso,dpto, horario);
            listaEmpleado.add(unEmpleado);
      
      
      
          System.out.println("*********************************************");
      
          System.out.println("Desea capturar los datos de otro empleado? Si(1) No(0) ");
          x = entrada.nextInt();
      
      }while(x != 0);
      
       for(int i=0; i<listaEmpleado.size();i++){
            System.out.println("Empleado No. "+ (i+1) );
            System.out.println(listaEmpleado.get(i));
            System.out.println("*********************************************");
       } 
       
    }
    
}
