package figuras;

/**
 *
 * @author Oswaldo
 */
public class Rectangulo extends ClaseFigura implements InterfazMetodos {
    private double lado1;
    private double lado2;
    
    public Rectangulo(String nombre, double lado1, double lado2) {
        super(nombre);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double obtenerArea() {
        double area;
        area= lado1*lado2;  //Base x Altura
        return area;
    }

    @Override
    public double obtenerPerimetro() {
        double perimetro;
        perimetro= lado1+lado1+lado2+lado2;
        return perimetro;
    }
    
}
