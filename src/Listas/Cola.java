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
public class Cola {
    
    
    ublic void push(T objeto) {
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
}
