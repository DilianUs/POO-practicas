/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Aplicacion.IniciaAplicacion;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juan.ucan
 */
public class TablaModeloAnimal {
    //public ArrayList<Animal> listaAnimales = new ArrayList<Animal>();
    
    public void eliminarAnimal(int indice){
        IniciaAplicacion.listaAnimales.remove(indice);
    }
    
    public void incializaTabla(JTable tabla ){
        Vector<String> titulos = new Vector<String>();
        Vector<   Vector<Object>   > datos =new Vector<  Vector<Object>  >();
        
        titulos.add("Nombre");
        titulos.add("Edad");
        //titulos.add("Longitud");
        
        for(int i=0; i<IniciaAplicacion.listaAnimales.size(); i++){
            Vector<Object> filas = new Vector<Object>();
            
            if(IniciaAplicacion.listaAnimales.get(i) instanceof Aguila){
                filas.add( IniciaAplicacion.listaAnimales.get(i).getNombre() );
                filas.add( IniciaAplicacion.listaAnimales.get(i).getEdad() );   
                datos.add(filas);
            }
        }
        
        DefaultTableModel modelo = new DefaultTableModel(datos, titulos);
        tabla.setModel(modelo);
        
    }
    
}
