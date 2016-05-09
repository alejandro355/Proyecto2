/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binario;

/**
 *
 * @author Alejandro
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class bits {

    private String ruta_archivo = "C:\\Users\\Douglas\\Documents\\NetBeansProjects\\Proyecto2\\archivo.dat";

    public void escribir()
    {
        try {
            //Objeto a guardar en archivo *.DAT
            MiClase clase = new MiClase("Mi Objeto en DAT");
            //Se crea un Stream para guardar archivo
            ObjectOutputStream file = new ObjectOutputStream(new FileOutputStream( this.ruta_archivo ));
            //Se escribe el objeto en archivo
            file.writeObject(clase);
            //se cierra archivo
            file.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public void leer()
    {
        try {
            //Stream para leer archivo
            ObjectInputStream file = new ObjectInputStream(new FileInputStream( this.ruta_archivo ));
            //Se lee el objeto de archivo y este debe convertirse al tipo de clase que corresponde
            MiClase clase = (MiClase) file.readObject();
            //se cierra archivo
            file.close();
            //Se utilizan metodos de la clase asi como variables guardados en el objeto
            System.out.println("El objeto se llama:" +  clase.getNombreObjeto() );
            String res = String.valueOf(clase.Suma(234, 12)) ;
            System.out.println("La suma de 3 + 12 es igual a : " + res);
        } catch (ClassNotFoundException ex) {
             System.out.println(ex);
        } catch (IOException ex) {
             System.out.println(ex);
       }
    }

}