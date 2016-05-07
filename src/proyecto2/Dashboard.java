/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dulce
 */
public class Dashboard {

    JMenuBar menu = new JMenuBar();
    //JMenu inicio = new JMenu("Inicio");
    JFrame ventana = new JFrame();
    JButton abrir = new JButton("Abrir");
    ButtonHandler handler = new ButtonHandler();

    public Dashboard() {

        ventana.setBounds(10, 10, 500, 600);
        ventana.setLayout(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        abrir.setBounds(20, 20, 90, 30);
        abrir.setVisible(true);
       // menu.add(inicio);
       // menu.setVisible(true);
       // inicio.addActionListener(handler);
        abrir.addActionListener(handler);
      //  ventana.setJMenuBar(menu);
        ventana.add(abrir);
        ventana.setVisible(true);

    }

    private class ButtonHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == abrir) {
               cargarCSV cargar = new cargarCSV();
               cargar.abrirCSV();
            }

        }

    }

}
