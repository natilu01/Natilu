
package prueba2;

/**
 *
 * @author Usuario
 */
public class TrianguloRectangulo extends Triangulo{
    
    public TrianguloRectangulo(double ladoA, double ladoB, double ladoC) {
        super(ladoA, ladoB, ladoC);
    }
    
    @Override
    public double area(){
        return ((ladoA * ladoB)/2);
    }
    
    @Override
    public double perimetro(){
        return ladoA + ladoB + ladoC;
    }
    
    @Override
    public double altura(){
        return ((ladoA * ladoB)/ladoC);
    }
    
}
