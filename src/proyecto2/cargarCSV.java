/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import com.csvreader.CsvReader;

import java.awt.*;
import java.io.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dulce
 */
public class cargarCSV {
 private String notaRuta = "";
    public cargarCSV(){
     
        
        try {
         
      //Lista lista lista
         
        CsvReader usuarios_import = new CsvReader(notaRuta);
        usuarios_import.readHeaders();
         
        while (usuarios_import.readRecord())
        {
            String codigo = usuarios_import.get(0);
            String nombres = usuarios_import.get(1);
            String apellidos = usuarios_import.get("Apellidos");
            String correo = usuarios_import.get("Correo");
             
            //usuarios.add(new Usuario(codigo, nombres, apellidos, correo));    
        }
         
        usuarios_import.close();
         
        for(Usuario us : usuarios){
         
            System.out.println(us.getCodigo() + " : " + us.getNombres() + " "
            + us.getApellidos() + " - " + us.getCorreo());
        }
         
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
     public void abrirCSV() {

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(null);
        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        

        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            notaRuta=(selectedFile.getPath());
        
           // char[] variable = new char[i];
            //i++;
            //System.out.print(variable);

            System.out.println(selectedFile.getName());
        }

    }

    /**
     * @return the notaRuta
     */
    public String getNotaRuta() {
        return notaRuta;
    }

    /**
     * @param notaRuta the notaRuta to set
     */
    public void setNotaRuta(String notaRuta) {
        this.notaRuta = notaRuta;
    }
}