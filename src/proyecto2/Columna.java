/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import Listas.ListaEnlazada;

/**
 *
 * @author Alejandro
 */
public class Columna {

    private String titulo;

    private ListaEnlazada<String> datos;

    public Columna() {

        datos = new ListaEnlazada();

    }

    public Columna(String titulo) {
        this.titulo = titulo;
        datos= new ListaEnlazada();

    }

    public void agregarDato(String dato) {
        this.datos.agregar(dato);

    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the datos
     */
    /**
     * @param datos the datos to set
     */
    /**
     * @return the dato
     */
    public ListaEnlazada<String> getDato() {
        return datos;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(ListaEnlazada<String> dato) {
        this.datos = dato;
    }

    /**
     * @return the columnas
     */
}
