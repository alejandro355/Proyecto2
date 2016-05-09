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
public class Pila {
    private Nodo cabeza;
    
    public Pila(){
    cabeza = null;
    
    }

     public void push(Object objeto) {
        Nodo nuevo = new Nodo(objeto);
        if (isEmpty()) {
            setCabeza(nuevo);
        } else {
            Nodo actual = this.getCabeza();
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
    }
    
     public Nodo pop() {
        Nodo retorno = this.getCabeza();
        this.setCabeza(retorno.getSiguiente());
        return retorno;
    }
     
      public void visualizar() {
        Nodo actual;
        for (actual = this.getCabeza(); actual != null; actual = actual.getSiguiente()) {
            System.out.println("Dato: " + actual.getObjeto());
            System.out.println("");
        }
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
