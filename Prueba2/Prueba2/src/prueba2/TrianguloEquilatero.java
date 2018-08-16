package prueba2;

/**
 *
 * @author Usuario
 */
public class TrianguloEquilatero extends Triangulo{
    
    public TrianguloEquilatero(double ladoA, double ladoB, double ladoC) {
        super(ladoA, ladoB, ladoC);
    }
    
    @Override
    public double area(){
        return ((Math.sqrt(3)*ladoA)/2)*(Math.pow(ladoA,2));
    } 
    
    @Override
    public double perimetro(){
        return 3*ladoA;
    }
    
    @Override
    public double altura(){
        return (Math.sqrt(3)*ladoA)/2;
    }
    
}
