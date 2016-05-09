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
public class ListaEnlazada<T> {

    Nodo inicio;

    public ListaEnlazada() {

        inicio = null;

    }

    public boolean agregar(T objeto) {
        Nodo nuevo;

        nuevo = new Nodo(objeto);

        if (esVacia()) {
            inicio = nuevo;
            return true;
        } else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
            return true;

        }

    }

    public boolean esVacia() {

        if (inicio == null) {
            return true;
        } else {
            return false;
        }

    }

    public T obtenerIndice(int indice) {

        if (esVacia() || indice < 0) {
            return null;
        } else {
            Nodo actual = inicio;
            int i = 0;

            for (i = 0; indice > i && actual.getSiguiente() != null; i++) {

                actual = actual.getSiguiente();

            }

            return (T) actual.getObjeto();

        }

    }

    public boolean eliminar(int indice) {
        if (esVacia()) {
            return false;

        } else {
            
            if (indice == 0) {
                inicio = inicio.getSiguiente();
                
            }else{
                indice--;
                Nodo actual = inicio;
                int i = 0, contador=0;

                for (i = 0; indice > i && actual.getSiguiente() != null; i++) {
                    contador++;
                    actual = actual.getSiguiente();

                }
                
               
                actual.setSiguiente(actual.getSiguiente().getSiguiente());
              
                
                
            }
            
            return true;
            
                

        }
        
        
    }

}
