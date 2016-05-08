/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Alejandro
 */
public class listaS {
    
    private Nodo inicio;
    
    public listaS(){
    
       
        
    }
    
     public boolean isEmpty() {
        if (inicio == null) {
            return true;
        }
        return false;
    }
    
     void agregar(/*datos*/){
        
         //Nodo nuevo = new Nodo();
         
        if(isEmpty()){
            setInicio(nuevo);            
        }
        else {
        Nodo tmp = getInicio();
            setInicio(nuevo);
            inicio.setSiguiente(tmp);
        }
    }
     
     void remover(){
     Nodo tmp = getInicio();
     Nodo anterior = null;
     if(tmp == null){
             System.out.println("Lista Vacia");
     }
     else{
         while (tmp!=null){
         //agregar elementos
             tmp=tmp.getSiguiente();
         }
     }
     }

    /**
     * @return the inicio
     */
    public Nodo getInicio() {
        return inicio;
    }

    /**
     * @param inicio the inicio to set
     */
    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }
     
}
