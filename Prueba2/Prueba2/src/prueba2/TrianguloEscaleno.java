
package prueba2;

/**
 *
 * @author Usuario
 */
public class TrianguloEscaleno extends Triangulo{
    private double semiperimetro = (ladoA+ladoB+ladoC)/2;
    
    public TrianguloEscaleno(double ladoA, double ladoB, double ladoC) {
        super(ladoA, ladoB, ladoC);
    }
    
    @Override
    public double area(){
        return Math.sqrt(semiperimetro*(semiperimetro-ladoA)*(semiperimetro-ladoB)*(semiperimetro-ladoC));
    }
    
    @Override
    public double perimetro(){
        return ladoA + ladoB + ladoC;
    }
    
    @Override
    public double altura(){
        return (2/ladoA)*(area());
    }
    
}
