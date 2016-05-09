/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

/**
 *
 * @author Alejandro
 */
public class Pila <T> {
    private Nodo cabeza;
    
    public Pila(){
    cabeza = null;
    
    }

     public void push(T objeto) {
        Nodo nuevo = new Nodo(objeto);
        if (isEmpty()) {
            setCabeza(nuevo);
        } else {
            nuevo.setSiguiente(cabeza);
            setCabeza(nuevo);
            
        }
    }
     
     
     public T pop() {
        Nodo retorno = this.getCabeza();
        this.setCabeza(retorno.getSiguiente());
        return (T) retorno;
    }
     
     
     
    public boolean isEmpty() {
        if (getCabeza() == null) {
            return true;
        }
        return false;
    }

    /**
     * @return the cabeza
     */
    public Nodo getCabeza() {
        return cabeza;
    }

    /**
     * @param cabeza the cabeza to set
     */
    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }
   
    
    
}
