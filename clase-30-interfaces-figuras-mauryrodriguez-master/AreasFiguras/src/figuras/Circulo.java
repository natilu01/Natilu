package figuras;

/**
 *
 * @author Oswaldo
 */
public class Circulo extends ClaseFigura implements InterfazMetodos {
     private double radio;
    
    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public double obtenerArea() {
        double area;
        area= (radio*radio)*pi ;  //Base x Altura
        return area;
    }

    @Override
    public double obtenerPerimetro() {
        double perimetro;
        perimetro= (2*radio)*pi;
        return perimetro;
    }
    
}
