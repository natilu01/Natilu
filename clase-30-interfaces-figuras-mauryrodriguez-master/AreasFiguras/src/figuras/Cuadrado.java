
package figuras;

/**
 *
 * @author Oswaldo
 */
public class Cuadrado extends ClaseFigura implements InterfazMetodos{
    private double lado1;
    
    public Cuadrado(String nombre, double lado) {
        super(nombre);
        this.lado1 = lado;
    }

    @Override
    public double obtenerArea() {
        double area;
        area= lado1*lado1;
        return area;
    }

    @Override
    public double obtenerPerimetro() {
        double perimetro;
        perimetro= lado1*4;
        return perimetro;
    }
    
}
