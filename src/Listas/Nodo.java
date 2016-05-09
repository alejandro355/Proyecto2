/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

/**
 *
 * @author danielherrerahernandez
 */
public  class Nodo  {
    
    private  Object objeto;
    
    private Nodo siguiente;
    
   
    
    public Nodo(Object objeto){
        this.objeto= objeto;
        
    }

    
    public  Object getObjeto() {
        return this.objeto;
    }
    
    public void setSiguiente(Nodo siguiente){
        this.siguiente= siguiente;
        
    }
    
    public Nodo getSiguiente(){
        return siguiente;
        
    }
    
    
    
}
