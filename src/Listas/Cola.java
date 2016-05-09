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
public class Cola <T>{
    private Nodo cabeza;
    
    
    public boolean isEmpty() {
        if (getCabeza() == null) {
            return true;
        }
        return false;
    }
    
    public void push(T objeto) {
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

    public T pop() {
        
        Nodo retorno = this.getCabeza();
        
        if(retorno==null){
        return null;
        }
        
        this.setCabeza(retorno.getSiguiente());
        return (T) retorno.getObjeto();
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
