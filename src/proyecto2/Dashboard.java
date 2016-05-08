/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.awt.Image;
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
    JPanel pPie, pBarra, pLinea, pReporte, pPreview;
    JButton bPie, bBarra, bLinea, a;
    JLabel lMetrica = new JLabel("METRICA");
    JLabel lModelo = new JLabel("MODELO");
    JComboBox cModelo = new JComboBox();
    JComboBox cMetrica = new JComboBox();
    ImageIcon iPie = new ImageIcon("pie.png");
    ImageIcon iBarra = new ImageIcon("barra.png");
    ImageIcon iLinea = new ImageIcon("linea.jpg");
    ButtonHandler handler = new ButtonHandler();

    public Dashboard() {

        ventana.setBounds(10, 10, 600, 650);
        ventana.setLayout(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Abrir
        abrir.setBounds(20, 20, 90, 30);
        abrir.setVisible(true);
        abrir.addActionListener(handler);

         // Iconos
        Image img = iPie.getImage();
        Image newimg = img.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
        iPie = new ImageIcon(newimg);

        Image img1 = iBarra.getImage();
        Image newimg1 = img1.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
        iBarra = new ImageIcon(newimg1);

        Image img2 = iLinea.getImage();
        Image newimg2 = img2.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
        iLinea = new ImageIcon(newimg2);

        //Paneles
        pPie = new JPanel();
        pPie.setBounds(20, 70, 100, 100);
        pPie.setLayout(null);
        pPie.setVisible(true);

        pBarra = new JPanel();
        pBarra.setBounds(150, 70, 100, 100);
        pBarra.setLayout(null);
        pBarra.setVisible(true);

        pLinea = new JPanel();
        pLinea.setBounds(280, 70, 100, 100);
        pLinea.setLayout(null);
        pLinea.setVisible(true);

        pReporte = new JPanel();
        pReporte.setBounds(20, 280, 240, 300);
        pReporte.setLayout(null);
        pReporte.setVisible(true);
        
        pPreview = new JPanel();
        pPreview.setBounds(300, 280, 240, 300);
        pPreview.setLayout(null);
        pPreview.setVisible(true);
        
        //Botones
        bPie = new JButton();
        bPie.setBounds(0, 0, 100, 100);
        bPie.setIcon(iPie);
        bPie.setVisible(true);

        bBarra = new JButton();
        bBarra.setBounds(0, 0, 100, 100);
        bBarra.setIcon(iBarra);
        bBarra.setVisible(true);

        bLinea = new JButton();
        bLinea.setBounds(0, 0, 100, 100);
        bLinea.setIcon(iLinea);
        bLinea.setVisible(true);
        
        a = new JButton();
        a.setBounds(0, 0, 240, 300);
        a.setVisible(true);

        //Panel Add
        pPie.add(bPie);
        pBarra.add(bBarra);
        pLinea.add(bLinea);
        //pReporte.add(a);
        pPreview.add(a);
         //Label
        lMetrica.setBounds(20, 200, 160, 25);
        lMetrica.setVisible(true);
        
        lModelo.setBounds(300, 200, 160, 25);
        lModelo.setVisible(true);

         //Combo
        cModelo.setBounds(20, 235, 160, 25);
        cModelo.setVisible(true);
        
        cMetrica.setBounds(300, 235, 160, 25);
        cMetrica.setVisible(true);

        //Ventana
        ventana.add(abrir);
        ventana.add(pPie);
        ventana.add(pBarra);
        ventana.add(pLinea);
        ventana.add(lMetrica);
        ventana.add(lModelo);
        ventana.add(cModelo);
        ventana.add(cMetrica);
        ventana.add(pReporte);
        ventana.add(pPreview);
        ventana.setVisible(true);

    }

    private class ButtonHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == abrir) {
                nVentana n = new nVentana();
                n.abrir();

            }

        }

    }

}
// menu.add(inicio);
// menu.setVisible(true);
// inicio.addActionListener(handler);
       
      //  ventana.setJMenuBar(menu);
