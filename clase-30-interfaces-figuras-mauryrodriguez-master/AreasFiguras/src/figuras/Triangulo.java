package figuras;

/**
 *
 * @author Oswaldo
 */
public class Triangulo extends ClaseFigura implements InterfazMetodos {
    private double lado1;
    private double lado2;
    private double lado3;
    private double base;
    private double altura;
    
    public Triangulo(String nombre, double lado1, double lado2,double lado3, double base, double altura) {
        super(nombre);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double obtenerArea() {
        double area;
        area= (base*altura)/2;
        return area;
    }

    @Override
    public double obtenerPerimetro() {
        double perimetro;
        perimetro= lado1+lado2+lado3;
        return perimetro;
    }
    
}
