
package calculadora;
/**
 * @author delgadobernardo
 */
public class Calculadora {
    

    private int x;
    private float f;
    private double d;
    
    //a.
    public Calculadora(){
        
        x = 30;
        f = 3.14f;
        d = 3.14159265358979323846264338327950288419716939937510582097494;
    }
    /*
        En la primera version del constructor se inicializan 
        con valores a los atributos de la clase
    */
    
    //b. 
    public Calculadora(int xy, float fy, double dy){
        this.x = xy;
        this.f = fy;
        this.d = dy;
    }
    /*
        En la segunda version del constructor se asigna el valor a los atributos
        de acuerdo a los argumentos enviados
    */
    
    //c.
    public int sumaInt(int x2){
        return x + x2;
    }
    
    public float sumaFloat(float f2){
        return  f + f2;
    }
    
    public double sumaDouble(double d2){
        return  d + d2;
    }
    
    public int restaInt(int x2){
        return x - x2;
    }
    public float restaFloat(float f2){
        return f - f2;
    }
    public double restaDouble(double d2){
        return d - d2;
    }
    /*
        Metodos de suma y resta para cada respectivo dato
    */
    
    //d. 
  
    int x3;
    
    @SuppressWarnings("empty-statement")
    public void multInt(int x3, int multiplicador){
         
        if (multiplicador - 1 == 0){
            System.out.println(" Resultado de la multiplicacion: " + x3);
        } else {
            
            x3 = sumaInt(x3);
            multInt(x3, multiplicador-1);
            
        }
    }
    
    
    public int divInt(int divisor){
        return x / divisor;
    }
    
    
    public void multFloat(float f3, int multiplicador){
         
        if (multiplicador - 1 == 0){
            System.out.println(" Resultado de la multiplicacion: " + f3);
        } else {
            
            f3 = sumaFloat(f3);
            multFloat(f3, multiplicador-1);
            
        }
       
    }
    
    public float divFloat(int divisor){
       return f / divisor;
    }
    
    public void  multDouble(double d3, int multiplicador){
         
        if (multiplicador - 1 == 0){
            System.out.println(" Resultado de la multiplicacion: " + d3);
        } else {
            
            d3 = sumaDouble(d3);
            multDouble(d3, multiplicador-1);
            
        } 
    }
    
    public double divDouble(int divisor){
        return d / divisor;
    }
    
    public int moduloInt(int numero){
        return x % numero; 
    }
    
    
    
}
