/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Alejandro
 */
public class lCircular {
     private Nodo cabeza;
     private Nodo ultimo;

    /**
     * @return the cabeza
     */
     
      public lCircular() {
        cabeza = null;
        ultimo = null;
    }
     
       public boolean isEmpty() {
        if (cabeza == null) {
            return true;
        }
        return false;
    }
       
       
       public void insertar() {

       // Nodo nuevo = new Nodo();

        if (isEmpty()) {
            setCabeza(nuevo);
            setUltimo(nuevo);
        } else {

            Nodo aux = cabeza;
            cabeza = nuevo;
            aux.setAnterior(cabeza);
            ultimo.setSiguiente(cabeza);
            cabeza.setSiguiente(aux);
            cabeza.setAnterior(ultimo);

          
        }

        
    }
       
       public void eliminar(int index) {
        
        if (isEmpty())
                return;
        
        Nodo actual = cabeza;
        for (int i = 0; i < index; i++) {
            actual = actual.getSiguiente();
        }
        Nodo temp;
        if(actual== cabeza ){
            if ( actual.getSiguiente()==ultimo){//Si solo son 2 elementos
                ultimo.setAnterior(null);
                ultimo.setSiguiente(null);
                cabeza= ultimo;
            }else if (actual== ultimo){//Si solo es un elemento
                cabeza=null;
                ultimo= null;
                        
            }else{
                cabeza=actual.getSiguiente();
                ultimo.setSiguiente(cabeza);
                cabeza.setAnterior(ultimo);
                
                
            }
            actual=null;
            
        }else if (actual == ultimo){
            
            if(actual.getAnterior()== cabeza){
                 cabeza.setSiguiente(null);
                 cabeza.setAnterior(null);
                 ultimo= cabeza;
            }else{
                temp=   actual.getAnterior();
                temp.setSiguiente(cabeza);
                cabeza.setAnterior(temp);
                ultimo=temp;
                
            }
        }else{
            temp= actual.getAnterior();
            temp.setSiguiente(actual.getSiguiente());
            
            temp = actual.getSiguiente();
            temp.setAnterior(actual.getAnterior());
        }
    }
     
     
    public Nodo getCabeza() {
        return cabeza;
    }

    /**
     * @param cabeza the cabeza to set
     */
    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    /**
     * @return the ultimo
     */
    public Nodo getUltimo() {
        return ultimo;
    }

    /**
     * @param ultimo the ultimo to set
     */
    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }
}
