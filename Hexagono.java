
package figura;

public class Hexagono extends Figura {

    private double lado;
    private static final int lados = 6;
    
    public Hexagono(double lado){
        this.lado = lado;
    }
    
    @Override
    protected double perimetro() {
        return (this.lado * lados);
        
    }
    
    @Override
    protected double area() {
        double area, apotema, anguloEnRadianes, perimetro = (this.lado * lados);
        int angulo;
        
        angulo = 360 / (2*lados);
        anguloEnRadianes = Math.toRadians(angulo);
        
        apotema = this.lado / (2 * Math.tan(anguloEnRadianes));
        area = perimetro * apotema /2;
        return area;
    }
    
}
