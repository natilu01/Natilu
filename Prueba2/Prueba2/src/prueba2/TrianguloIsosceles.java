
package prueba2;

/**
 *
 * @author Usuario
 */
public class TrianguloIsosceles extends Triangulo{
    
    public TrianguloIsosceles(double ladoA, double ladoB, double ladoC) {
        super(ladoA, ladoB, ladoC);
    }
    
    @Override
    public double area(){
        return (ladoB*Math.sqrt(Math.pow(ladoA, 2)-(Math.pow(ladoB,2)/4)))/2;
    }
    
    @Override
    public double perimetro(){
        return (2*ladoA) + ladoB;
    }
    
    @Override
    public double altura(){
        return Math.sqrt(Math.pow(ladoA, 2)-(Math.pow(ladoB,2)/4));
    }
    
}
