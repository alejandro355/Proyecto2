/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import Listas.Pila;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 *
 * @author Dulce
 */
public class Proyecto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          try{
  
  JFrame.setDefaultLookAndFeelDecorated(true);
  JDialog.setDefaultLookAndFeelDecorated(true);



  UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
//UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
  //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
  //UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
}
catch (Exception e)
 {
  e.printStackTrace();
 }
        
        String nombre = ("Daniel1");
        String nombre2= ("Alejandro2");
        String nombre3 = ("Herrera3");
        
        Pila pila = new Pila();
        pila.push(nombre);
        pila.push(nombre2);
        pila.push(nombre3);
        
       System.out.println(pila.pop()); 
       
        Dashboard dash = new Dashboard();
    }
    
}
