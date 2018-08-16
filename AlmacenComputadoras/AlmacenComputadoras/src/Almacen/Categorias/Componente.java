
package Almacen.Categorias;

import Almacen.Cls_Producto;
import java.io.Serializable;

/**
 * @author 729-Producciones
 */
//TIPO: RAM, disco duro, fuente de poder, etc
public class Componente extends Cls_Producto implements Serializable{
    
    private int capacidad;//Gb
    private int velocidad;//MHz
    
    public Componente() {
    }

    public Componente(String nombre, double precio, String marca, String tipo, int capacidad, int velocidad) {
        super(nombre, precio, marca, tipo);
        this.capacidad = capacidad;
        this.velocidad = velocidad;
    }
    
    

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    
    
    
    
    
}
