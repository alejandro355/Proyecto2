/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import Clases.Persona;
import ListaEnlazada.ListaEnlazada;

/**
 *
 * @author danielherrerahernandez
 */
public class Parametricas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ListaEnlazada <Persona> personas = new ListaEnlazada();
        personas.agregar(new Persona("Pedro"));
        personas.agregar(new Persona("Juan"));
        personas.agregar(new Persona("Martin"));
        personas.agregar(new Persona("Juliana"));
        personas.agregar(new Persona("Aura"));
        
        
        
        //System.out.println( personas.obtenerIndice(5).nombre);
      
        if(personas.eliminar(4)){
            System.out.println( personas.obtenerIndice(5).nombre);
        }
        
    }
    
}
