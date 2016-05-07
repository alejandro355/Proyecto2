/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Dulce
 */

public class Tabla extends JFrame{
    
    JFrame hoja = new JFrame("Excel");
    JMenuBar menu = new JMenuBar();
    JMenu inicio =new JMenu("Inicio");
    JMenu formulas =new JMenu("Fórmulas");
    JMenu operaciones =new JMenu("Operaciones");
    JMenuItem edicion, formato, negrita, cursiva, 
            subrayada, color, general, numero, porcentaje, 
            texto, sCondicion, fCelda, fTransponer, 
            fDesviacion, promedio, cCondicion, suma,
            resta, multiplicacion, division;
    JButton bCopiar, bPegar, bNegrita, bCursiva, bSubrayado;
    ImageIcon iCopiar = new ImageIcon ("copiar.png");
    ImageIcon iPegar = new ImageIcon ("pegar.png");
    ImageIcon iNegrita = new ImageIcon ("negrita.png");
    ImageIcon iCursiva = new ImageIcon ("cursiva.png");
    ImageIcon iSubrayado = new ImageIcon ("subrayado.png");
    
   
    JTable tabla;
   JScrollPane panel;
   
  int a ,b;
    
   public Tabla(){
 

  
   
   // Tabla
       
   Object [] columnas =  { "","A", "B" , "C", "D", "E", "F", "G", "H", "I","J"};
  
   Object [][] filas= {{"1", "", "", "","", "", "","", "", "",""},
       {"2", "", "", "","", "", "","", "", "",""},
   {"3", "", "", "","", "", "","", "", "",""},
   {"4", "", "", "","", "", "","", "", "",""},
   {"5", "", "", "","", "", "","", "", "",""},
   {"6", "", "", "","", "", "","", "", "",""},
   {"7", "", "", "","", "", "","", "", "",""},
   {"8", "", "", "","", "", "","", "", "",""},
   {"9", "", "", "","", "", "","", "", "",""},
   {"10", "", "", "","", "", "","", "", "",""},
   {"11", "", "", "","", "", "","", "", "",""},
   {"12", "", "", "","", "", "","", "", "",""},
   {"13", "", "", "","", "", "","", "", "",""},
   {"14", "", "", "","", "", "","", "", "",""},
   {"15", "", "", "","", "", "","", "", "",""},
   {"16", "", "", "","", "", "","", "", "",""},
   {"17", "", "", "","", "", "","", "", "",""},
   {"18", "", "", "","", "", "","", "", "",""},
   {"19", "", "", "","", "", "","", "", "",""},
   {"20", "", "", "","", "", "","", "", "",""},
   {"21", "", "", "","", "", "","", "", "",""},
   {"22", "", "", "","", "", "","", "", "",""},
   {"23", "", "", "","", "", "","", "", "",""},
   {"24", "", "", "","", "", "","", "", "",""},
   {"25", "", "", "","", "", "","", "", "",""},
   {"26", "", "", "","", "", "","", "", "",""},
   {"27", "", "", "","", "", "","", "", "",""},
   {"28", "", "", "","", "", "","", "", "",""},
   {"29", "", "", "","", "", "","", "", "",""},
   {"30", "", "", "","", "", "","", "", "",""},
   {"31", "", "", "","", "", "","", "", "",""},
   {"32", "", "", "","", "", "","", "", "",""},
   {"33", "", "", "","", "", "","", "", "",""},
   {"34", "", "", "","", "", "","", "", "",""},
   {"35", "", "", "","", "", "","", "", "",""}};
   
   
   DefaultTableModel tablon = new DefaultTableModel(filas, columnas);
   tabla = new JTable(tablon);
   panel = new JScrollPane(tabla);
   panel.setBounds(0, 60, 900, 500);
   
   
   // ActionPerformed
  
   
   
   
   
   
   // Hoja    
   FlowLayout a = new FlowLayout();
   hoja.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   hoja.setSize(914, 620);
   hoja.add(panel);
   hoja.setLayout(null);
   hoja.setVisible(true);
   
   }
}




/*
public class Tabla extends JFrame{
     DefaultTableModel model = new DefaultTableModel(new Object[][] {
      { "some", "text" }, { "any", "text" }, { "even", "more" },
      { "text", "strings" }, { "and", "other" }, { "text", "values" } },
      new Object[] { "Column 1", "Column 2" });

  public Tabla() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JTable table = new JTable(model);
    getContentPane().add(new JScrollPane(table), BorderLayout.CENTER);
   
  }
}
*/