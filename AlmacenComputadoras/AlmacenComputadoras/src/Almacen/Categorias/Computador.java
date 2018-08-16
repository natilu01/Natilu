
package Almacen.Categorias;

import Almacen.Cls_Producto;
import java.io.Serializable;

/**
 * @author 729-Producciones
 */
//Tipo: (laptop, pc) 
public class Computador extends Cls_Producto implements Serializable{
    
    private int almacenamiento;//Gb
    private int ram;//Gb
    private String procesador;//ej: Intel, AMD 

    public Computador() {
    }

    public Computador(int almacenamiento, int ram, String procesador) {
        this.almacenamiento = almacenamiento;
        this.ram = ram;
        this.procesador = procesador;
    }

    public Computador(String nombre, double precio, String marca, String tipo, int almacenamiento, int ram, String procesador) {
        super(nombre, precio, marca, tipo);
        this.almacenamiento = almacenamiento;
        this.ram = ram;
        this.procesador = procesador;
    }

    
    
    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
    
    
    
    
    
}
