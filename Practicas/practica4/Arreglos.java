
/*
Delgado Acosta Luis Bernardo 
Grupo: 3BV2
Ejercicio de laboratorio 4
*/

package ejemploarreglos;
import java.util.Arrays;

public class Arreglos {
    
    double[] arreglo;
    public final int constante = 5;
    
    public Arreglos(final int n){
        this.arreglo = new double[n];
    }
    
    public void llenarArreglo(){
        for(int i=0; i< this.arreglo.length; ++i){
            this.arreglo[i] = Math.random();
            
        }
    }
    
    public void imprimirArreglo(){
        for (final double x: this.arreglo){
            System.out.println(x);
        }
    }
    
    public double[] devolverArreglo(){
        return this.arreglo;
    }
    //a. obtener el elemento maximo
    public double maxElemento(){
        double x = this.arreglo[0];
        
        for(int i=0; i< this.arreglo.length; ++i){
            //si el elemento es mayor que el mayElemento guardado
            //se remplazara y ahora el mayElemento = elemento
            if ( this.arreglo[i] > x){
                x = this.arreglo[i];
            }
            
        }
        return x;
    }
    //b. obtener el elemento minimo
    public double minElemento(){
        double y = this.arreglo[0];
        
        for(int i=0; i< this.arreglo.length; ++i){
            //si el elemento es menor que el minElemento guardado
            //se remplazara y ahora el minElemento = elemento
            if ( this.arreglo[i] < y){
                y = this.arreglo[i];
            }
            
        }
        return y;
    }
    // c. sumar todos los elementos de un arreglo
    public double sumarElementos(){
        
        double resultado=0;
        //con un for mejorado sumamos todos los elementos del arreglo
        for(double  x:this.arreglo){
            resultado = resultado + x;
        }
        //devolvemos el resultado
        return resultado;
    }
    //d. sumarArreglos
    public double[] sumarArreglos(double[] arreglo){
        //inicializamos el tercer arreglo, que contendra el resultado
        // de la suma del valor de cada indice de los arreglos
        double[] resultado = new double[5];
        
        for(int i=0; i<this.arreglo.length; ++i){
            
            resultado[i] = this.arreglo[i] + arreglo[i];
            
        }
        
        //retornamos el arreglo completo
        return resultado;
    }
    
    //e. producto punto
    
    public double productoPunto(double[] arreglo){
        double resultado=0;
        /*
        multiplicamos el valor del mismo indice del arreglo atributo 
        y el arreglo recibido, despues lo sumamos con la multiplicacion
        del siguiente indice, asi hasta terminar los indices
        */
        for(int i=0; i<this.arreglo.length; i++){
            resultado = resultado + (this.arreglo[i] * arreglo[i]);
        }
        
        return resultado;
    }
    //f. ordenar el arreglo
    public void ordenarArreglo(){ 
        //se ordena el arreglo utilizando el metodo de array.sort
        Arrays.sort(this.arreglo);
    }
    
    //g. media del arreglo
    public double mediaArreglo(){
        double media = 0;
        
        for(double  x:this.arreglo){
            media = media + x;
        }
       
        return (media / this.arreglo.length);
    }
            
    
    
    
    
}
