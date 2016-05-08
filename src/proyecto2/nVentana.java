package proyecto2;


import java.awt.Checkbox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import proyecto2.CSVTable;
import proyecto2.Dashboard;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alejandro
 */
public class nVentana {
    JFrame nuevo1 = new JFrame();
    JLabel nombre;
    JComboBox combo;
    JButton guardar, cancelar;
    CSVTable a = new CSVTable();
    ButtonHandler handler = new ButtonHandler();
    Checkbox cPie,cBarra,cLinea;
    
    public nVentana(){
    


    }
    
    
    public void abrir() {
        nuevo1 = new JFrame();
        //nuevo1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        nuevo1.setSize(700, 520);
        nuevo1.setTitle("Nueva Ventana");
        nuevo1.setLayout(null);
        nombre = new JLabel("Nombre");
        combo = new JComboBox();

        cPie = new Checkbox("Pie", false);
cBarra = new Checkbox("Barra", false);
cLinea = new Checkbox("Línea", false);
    

cPie.setBounds(20, 50, 50, 30);
cBarra.setBounds(20, 80, 50, 30);
cLinea.setBounds(20, 110, 50, 30);

cPie.setVisible(true);
cBarra.setVisible(true);
cLinea.setVisible(true);


        combo.setMaximumRowCount(100);

        guardar = new JButton("Guardar");
        cancelar = new JButton("Cancelar");

        nombre.setBounds(20, 20, 60, 30);
        combo.setBounds(200, 20, 160, 25);

        guardar.setBounds(20, 425, 160, 30);
        cancelar.setBounds(240, 425, 160, 30);

        nombre.setVisible(true);
        combo.setVisible(true);

        guardar.setVisible(true);
        cancelar.setVisible(true);

        guardar.addActionListener(handler);
        cancelar.addActionListener(handler);

        nuevo1.add(combo);
        nuevo1.add(nombre);
        nuevo1.add(cPie);
        nuevo1.add(cBarra);
        nuevo1.add(cLinea);

        nuevo1.add(guardar);
        nuevo1.add(cancelar);
        nuevo1.setVisible(true);
    }
    
    
    private class ButtonHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == a) {
                CSVTable csv = new CSVTable();
                
            }

        }

    }
}
