
/*
Delgado Acosta Luis Bernardo 
Grupo: 3BV2
Ejercicio de laboratorio 4
*/
package ejemploarreglos;

public class EjercicioMatrices {
    double[][] matriz;
    
    //constructor de la clase, dandole dimensiones a la matriz
    public EjercicioMatrices(final int n, final int m){
        this.matriz = new double[n][m];
    }
    
    public void llenarMatriz(){
        //llenamos la matriz de nxm con valores random
        for (int i=0; i<this.matriz.length;i++) {
            for(int j=0; j<this.matriz[0].length; j++){
                this.matriz[i][j] = Math.random();
            }
        }
    }
    
   //imprimir el contenido de la matriz
    
    public void imprimirMatriz(){
        
        for(final double[] fila: this.matriz){
            for(final double elemento: fila){
                System.out.println("["+elemento+"] ");
            }
            System.out.println(" ");
        }
    }   
    
    // e. Obtener el elemento maximo
    
    public double maxMatriz(){
        
        double max = this.matriz[0][0];
        int filas = this.matriz.length;
        int columnas = this.matriz[0].length;
        
        for (int i=0; i<filas; i++){
            for(int j=0; i<columnas;i++){
                if (this.matriz[i][j] > max){
                    max = this.matriz[i][j];
                }
            }
        }
        return max;
    }
    
    //f. obtener el elemento minimo
    public double minMatriz(){
        
        double min = this.matriz[0][0];
        int filas = this.matriz.length;
        int columnas = this.matriz[0].length;
        
        for (int i=0; i<filas; i++){
            for(int j=0; i<columnas;i++){
                if (this.matriz[i][j] < min){
                    min = this.matriz[i][j];
                }
            }
        }
        return min;
    }
    
    public double[][] getMatriz(){
        return this.matriz;
    }
    
    public double[][] sumarMatriz(double[][] matriz){
        //se extrae la dimension de las filas y columnas de this.arreglo
        int filas = this.matriz.length; 
        int columnas = this.matriz[0].length;
        //se inicializa la matriz de dimension filas x columnas
        double[][] suma = new double[filas][columnas];
        
        for (int i=0; i<filas; i++){
            for(int j=0; i<columnas;i++){
                //sumamos los elementos correspondientes de cada indice
                suma[i][j] = (this.matriz[i][j] + matriz[i][j]);
            }
        }
        return suma;
    }
    
    public double[][] restarMatriz(double[][] matriz){
        //se extrae la dimension de las filas y columnas de this.arreglo
        int filas = this.matriz.length; 
        int columnas = this.matriz[0].length;
        //se inicializa la matriz de dimension filas x columnas
        double[][] resta = new double[filas][columnas];
        
        for (int i=0; i<filas; i++){
            for(int j=0; i<columnas;i++){
                //sumamos los elementos correspondientes de cada indice
                resta[i][j] = (this.matriz[i][j] - matriz[i][j]);
            }
        }
        return resta;
    }
    
    public double[][] multiMatriz(double[][] matriz){
        //se extrae la dimension de las filas y columnas de this.arreglo
        int filas = this.matriz.length; 
        int columnas = this.matriz[0].length;
        //se inicializa la matriz de dimension filas x columnas
        double[][] multi = new double[filas][columnas];
        
        for (int i=0; i<filas; i++){
            for(int j=0; i<columnas;i++){
                //sumamos los elementos correspondientes de cada indice
                multi[i][j] = (this.matriz[i][j] * matriz[i][j]);
            }
        }
        return multi;
    }
    
    
    
    
    
    
    
    
    
    
    
}
