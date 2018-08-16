package prueba2;

/**
 *
 * @author Usuario
 */
public class Triangulo {
    double ladoA;
    double ladoB;
    double ladoC;

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }
    
    
    public boolean validar(){
        if(this.ladoA + this.ladoB > this.ladoC && this.ladoB + this.ladoC > this.ladoA && this.ladoA + this.ladoC > this.ladoB){
            return true;
        }else{
            return false;
        }   
    }
    
    public double area(){
        return 0.0;
    }
    
    public double perimetro(){
        return 0.0;
    }
    public double altura(){
        return 0.0;
    }
    
}
