/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

/**
 *
 * @author Alejandro
 */
public class Columna {

    private String titulo;
    private String datos;

private ListaEnlazada<String> dato;

    public Columna() {

       ListaEnlazada<String> dato = new ListaEnlazada();
       
    }
public void agregarDato(String dato){

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
    public String getDatos() {
        return datos;
    }

    /**
     * @param datos the datos to set
     */
    public void setDatos(String datos) {
        this.datos = datos;
    }

    /**
     * @return the dato
     */
    public ListaEnlazada<String> getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(ListaEnlazada<String> dato) {
        this.dato = dato;
    }

    /**
     * @return the columnas
     */
    
}
