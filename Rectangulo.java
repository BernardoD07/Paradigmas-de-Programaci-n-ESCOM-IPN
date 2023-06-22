
package figura;


public class Rectangulo extends Figura {

    private double ancho, largo;
    
    //constructor 
    public Rectangulo(double ancho, double largo){
        this.ancho = ancho;
        this.largo = largo;
    }
    
    @Override
    protected double perimetro() {
        return ((this.ancho * 2) + (this.largo *2));
    }

    @Override
    protected double area() {
       return (this.ancho * this.largo);
    }
    
    
}
