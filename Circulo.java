
package figura;


public class Circulo extends Figura {
    //declaramos los lados como privados, para que solo se utilicen en la misma clase
    private double radio;
    //constructor
   public Circulo(double radio){
       this.radio = radio;
   } 
    
    //utilizamos los metodos Math para calcular la raiz y la potencia
    @Override
    protected double perimetro() {
        return (2 * (Math.PI) * this.radio);
    }

    @Override
    protected double area() {
        return (Math.PI * Math.pow(this.radio, 2));
    }
    
}
