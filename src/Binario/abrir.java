/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binario;

import java.io.File;
import java.io.FileWriter;
import javax.swing.JFileChooser;

/**
 *
 * @author Alejandro
 */
public class abrir {
    private String rutaArchivo;
      File file ;
      
      
    public void abrir(){
    JFileChooser chooser = new JFileChooser();
chooser.setCurrentDirectory(new java.io.File("."));
chooser.setDialogTitle("choosertitle");
chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
chooser.setAcceptAllFileFilterUsed(false);

if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
  System.out.println("getSelectedFile() : " + chooser.getSelectedFile());
} else {
  System.out.println("No Selection ");
}}
    
    /*
    public void guardar(){
    JFileChooser chooser = new JFileChooser();
chooser.setCurrentDirectory(new java.io.File("."));
chooser.setDialogTitle("choosertitle");
chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
chooser.setAcceptAllFileFilterUsed(false);

if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
  System.out.println("getSelectedFile() : " + chooser.getSelectedFile());
} else {
  System.out.println("No Selection ");
}}
*/
    
    /*
    
    public void crear(String ruta,String texto){
        System.out.print(ruta+" "+texto);
       
         FileWriter fichero = null;
		try {

			fichero = new FileWriter(ruta+".dat");
 
			// Escribimos linea a linea en el fichero
			fichero.write("Nota: "+ "\r\n" + texto);
                        
			fichero.close();

		} catch (Exception ex) {
			System.out.println("Mensaje de la excepción: " + ex.getMessage());
		}
       }*/
    
    
    
    public void gArchivo() {

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(null);
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        

        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getCurrentDirectory();
           rutaArchivo = selectedFile.getPath();
          
           // char[] variable = new char[i];
            //i++;
            //System.out.print(variable);

            System.out.println(selectedFile.getName());
        }

    }
    }
    /**
     * @return the rutaArchivo
     */
   