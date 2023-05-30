
/*
Delgado Acosta Luis Bernardo 
Grupo: 3BV2
Ejercicio de laboratorio 4
*/

package ejemploarreglos;
import java.util.Scanner;


public class EjemploArreglos {
    public final int constante = 5;
    public static void main(String[] args) {
       
        
        final Arreglos arre = new Arreglos(5);
        arre.imprimirArreglo();
        arre.llenarArreglo();
        System.out.println("");
        arre.imprimirArreglo();
        final double[] array = arre.devolverArreglo();
        System.out.println("");
        
        for (final double x : array){
            System.out.println(x);
        }
        
        final double[][] array2 = {new double[3],new double[5]};
        
        /*
        Implementacion de los metodos solicitados de Arreglos
        */
        
       double max, min, suma, productoPunto, media;
       
       System.out.println("Max elemento:" + (max = arre.maxElemento()) );
       System.out.println("Min elemento :" +(min = arre.minElemento()) );
       
       System.out.println("suma de elementos :" + (suma = arre.sumarElementos()) );
       
       
       //creamos otro objeto de arreglo con la misma dimension
       
       final Arreglos arre2 = new Arreglos(5);
       
       arre2.llenarArreglo();
       //declaramos un arreglo para la suma de arreglos
       
       //producto punto
       System.out.println("producto punto: "+ (productoPunto = arre.productoPunto(arre2.devolverArreglo())) );
       
       double[] arregloSuma = new double[5];
       
       arregloSuma = arre.sumarArreglos(arre2.devolverArreglo());
       
       System.out.println("arreglo Suma : ");
       
       for(double x: arregloSuma){
           System.out.println(x +", " );
       }
       
       
       /*
       Implementacion de Ejercicios matrices
       */
       
       Scanner scanner = new Scanner(System.in);
       System.out.println("Ingrese los valores para la dimension de la matriz");
       System.out.println("filas :");
       int f = scanner.nextInt();
      
      System.out.println("columnas :");
      int c = scanner.nextInt();
      
     
       EjercicioMatrices matriz = new EjercicioMatrices(f,c);
       matriz.llenarMatriz();
       
       matriz.imprimirMatriz();
       
       System.out.println("Max :" + (max = matriz.maxMatriz()));
       System.out.println("Min :" + (min = matriz.minMatriz()));
       
       // creamos un segundo objeto matriz 
       
      EjercicioMatrices matriz2 = new EjercicioMatrices(f,c);
      matriz2.llenarMatriz();
      
      double[][] matrizAux = new double[f][c];
      double[][] matrizAux2 = new double[f][c];
      double[][] matrizAux3 = new double[f][c];
      
      matrizAux = matriz.sumarMatriz(matriz2.getMatriz());//sumar matrices
      matrizAux2 = matriz.restarMatriz(matriz2.getMatriz());//restar matrices
      matrizAux3 = matriz.multiMatriz(matriz2.getMatriz());//multiplicar matrices
        
    }
    
}
