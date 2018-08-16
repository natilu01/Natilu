
package Almacen;

import java.io.Serializable;

/**
 * @author 729-Producciones
 */
public class Cls_Producto implements Serializable{
    
    private String nombre;
    private double precio;
    private String marca;
    private String tipo;
    
    public Cls_Producto() {
    }

    public Cls_Producto(String nombre, double precio, String marca, String tipo) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    
    
    
    
    
}
