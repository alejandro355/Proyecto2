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
import Listas.ListaEnlazada;
import java.awt.BorderLayout;
import java.io.*;
 import java.net.URL;
 import java.util.Scanner;
 import javax.swing.*;
 import javax.swing.table.DefaultTableCellRenderer;
 import javax.swing.table.DefaultTableModel;

 public class CSVTable extends JFrame {
    JTable table;
    DefaultTableModel model;
    JButton closeButton, webButton;
    
    ListaEnlazada<Columna> columna;
    
    
    
  /**
   * Takes data from a CSV file and places it into a table for display.
   * @param source - a reference to the file where the CSV data is located.
   */
  public CSVTable(String title, String source) {
    super(title);
    columna = new ListaEnlazada();
    table = new JTable();
    JScrollPane scroll = new JScrollPane(table);
   String[] colNames = { "LastName", "FirstName", "Email Address", "Dept."};
    
    
    
    model = new DefaultTableModel(colNames, 0);
    InputStream is;
    try {
        if(source.indexOf("http")==0) {
            URL facultyURL = new URL(source);
            is = facultyURL.openStream();
        }
        else { //local file?
            File f = new File(source);
            is = new FileInputStream(f);
        }
        insertData(is);
        //table.getColumnModel().getColumn(0).setCellRenderer(new CustomCellRenderer());
    }
    catch(IOException ioe) {
        JOptionPane.showMessageDialog(this, ioe, "Error reading data", JOptionPane.ERROR_MESSAGE);
    }

    JPanel buttonPanel = new JPanel();
    

    JPanel notesPanel = new JPanel();
    BoxLayout layout = new BoxLayout(notesPanel, BoxLayout.Y_AXIS);
    notesPanel.setLayout(layout);
    getContentPane().add(notesPanel, BorderLayout.NORTH);
    getContentPane().add(scroll, BorderLayout.CENTER);
    getContentPane().add(buttonPanel, BorderLayout.SOUTH);
    pack();
    
    
    
    
}

/**
 * Places the data from the specified stream into this table for display.  The data from the file must be in CSV format
 * @param is - an input stream which could be from a file or a network connection or URL.
 */
  
  /*
void insertData(InputStream is) {
    Scanner scan = new Scanner(is);
    String[] array;
    while (scan.hasNextLine()) {
        String line = scan.nextLine();
        if(line.indexOf(",")>-1)
            array = line.split(",");
        else
            array = line.split("\t");
        Object[] data = new Object[array.length];
        for (int i = 0; i < array.length; i++)
            
            data[i] = array[i];
        model.addRow(data);
    }
    table.setModel(model);
} */

  
void insertData(InputStream is) {
    Scanner scan = new Scanner(is);
    String[] array;
    int contador=0;


    Object[] data;
    Columna actual= null;

    while (scan.hasNextLine()) {
        String line = scan.nextLine();
        line= line.trim();


        array = line.split(",");
  

        if(contador==0){
        	


        	for (int i = 0; i < array.length; i++){
        		

        		columna.agregar(new Columna(array[i]));
        	}

        	model = new DefaultTableModel(array,0);




        }else{
        	data= new Object[array.length];

        	for(int i=0; i< array.length; i++){
        		data[i] = array[i];
        		actual= columna.obtenerIndice(i);
        		actual.agregarDato(array[i]);


        	}

        	model.addRow(data);




        }
    contador++;}
    table.setModel(model);
} 

  
public static void main(String args[]) {
    CSVTable frame = new CSVTable("Tabla","C:\\Users\\Douglas\\Desktop\\IPC1\\archivos_prueba\\estudiantes.csv");
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}}

