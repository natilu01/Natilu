
package Almacen;

import com.sun.org.apache.xml.internal.utils.SerializableLocatorImpl;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author 729-Producciones
 */
public class Cls_Cliente implements Serializable {

    private String nombre;
    private String cedula;
    private String telefono;
    private ArrayList<Cls_Producto> listaCompras;
    
    public Cls_Cliente() {
    }

    public Cls_Cliente(String nombre, String cedula, String telefono, ArrayList<Cls_Producto> listaCompras) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.listaCompras = listaCompras;
    }
    
    
    
    @Override
    public String toString() {
        return nombre;
    }
    
    
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public ArrayList<Cls_Producto> getListaCompras() {
        return listaCompras;
    }

    public void setListaCompras(ArrayList<Cls_Producto> listaCompras) {
        this.listaCompras = listaCompras;
    }
    
    
    
    
}
