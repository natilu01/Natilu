
package Almacen.Categorias;

import Almacen.Cls_Producto;
import java.io.Serializable;

/**
 * @author 729-Producciones
 */
//Tipo: (mochila, cobertor, parlante, etc) 
public class Accesorio extends Cls_Producto implements Serializable{
    
    private String color;
    
    public Accesorio() {
    }

    public Accesorio(String nombre, double precio, String marca, String tipo, String color) {
        super(nombre, precio, marca, tipo);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
    
    
    
}
