/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alejandro
 */
public class Nodo {
    
    private Nodo siguiente;
    private Nodo anterior;
    
    public Nodo(Nodo siguiente, Nodo anterior){
    this.siguiente=siguiente;
    this.anterior=anterior;
    }

      public Nodo(Nodo siguiente){
    this.siguiente=siguiente;
    }
    
    /**
     * @return the siguiente
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the anterior
     */
    public Nodo getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
    
}
