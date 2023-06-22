
package figura;



public class Triangulo extends Figura {
    //declaramos los lados como privados, para que solo se utilicen en la misma clase
    private double lado1, lado2, lado3; //Necesatamos los 3 lados de un triangulo
    
    //constructor
    public Triangulo(double lado1, double lado2, double lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    
    //implementamos los metodos abstactos de Figura
    //con la ayuda de Override para que no marque un error
    @Override
   
    protected double perimetro() {
        
        double perimetro=0;
        perimetro = this.lado1 + this.lado2 + this.lado3;
        
        return perimetro;
    }

    @Override
    protected double area() {
        
        double semip = (this.lado1 + this.lado2 + this.lado3)/2;
        double area=0;
        //utilizacion de la formula de HERON
        area = Math.sqrt(semip * (semip - this.lado1) * (semip - this.lado2 ) * (semip - this.lado3));
        
        return area;
    }
     
    
}
