
package Almacen;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author 729-Producciones
 */
public class Cls_Controlador {
    
    //Para crear archivo .dat
    public void crearFichero(String nombreFichero) {
        ObjectOutputStream oos;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(nombreFichero));
            oos.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    //Para escribir el fichero .dat
    public void escribirFichero(String nombreFichero, ArrayList<Object> elementos) {

        try {
            ObjectOutputStream oos;
            oos = new ObjectOutputStream(new FileOutputStream(nombreFichero));
            for (int i = 0; i < elementos.size(); i++) {
                Object elemento = new Object();
                elemento = elementos.get(i);
                oos.writeObject(elemento);
            }
            oos.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }

    //Para extraer informacion del fichero y cargarlo en el ArrayList
    public ArrayList<Object> extraerFichero(String nombreFichero) {

        ArrayList<Object> elementos = new ArrayList<>();
        try {
            ObjectInputStream ois;
            ois = new ObjectInputStream(new FileInputStream(nombreFichero));
            Object aux = ois.readObject();
            while (aux != null) {
                elementos.add(aux);//Añado datos ArrayList
                aux = ois.readObject();
            }//Fin While
            ois.close();

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (EOFException e1) {
            //JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } finally {
        }//Fin Try / Catch

        return elementos;

    }//Fin Metodo extraerFichero }

    //**************************************************

    
}
