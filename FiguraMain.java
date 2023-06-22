
package figura;
import java.util.Scanner;

public class FiguraMain {

    public static void main(String[] args){
    
        //declaramos una variable para Scanner
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            
            System.out.println (" Seleccione una figura :");
            System.out.println (" 1. Triangulo :");
            System.out.println (" 2. Circulo :");
            System.out.println (" 3. Rectangulo :");
            System.out.println (" 4. Hexagono:");
            System.out.println (" 0. SALIR");
            
            int opcion = scanner.nextInt();
            scanner.nextLine(); //Limpiar el salto de linea
            
            // declaramos el objeto como si perteneciera a la clase abstracta Figura
            
            Figura figura=null;
            
            switch(opcion) {
                case 1 -> {
                    System.out.println("Ingrese el lado 1:");
                    double lado1 = scanner.nextDouble();
                    System.out.println("Ingrese el lado 2:");
                    double lado2 = scanner.nextDouble();
                    System.out.println("Ingrese el lado 3:");
                    double lado3 = scanner.nextDouble();
                    
                    //creamos el objeto figura como un objeto de la clase Triangulo
                    
                    figura = new Triangulo(lado1, lado2, lado3);
                }
                    
                case 2 -> {
                    System.out.println("Ingrese el radio del circulo: ");
                    double radio = scanner.nextDouble();
                    // creamos el objeto figura como un objeto de la clase Circulo
                    figura = new Circulo(radio);
                }
                    
                case 3 -> {
                    System.out.println("Ingrese el ancho del rectangulo: ");
                    double ancho = scanner.nextDouble();
                    System.out.println("Ingrese el largo del rectangulo: ");
                    double largo = scanner.nextDouble();
                    
                    // creamos el objeto figura como un objeto de la clase Rectangulo
                    figura = new Rectangulo(ancho, largo);
                }
                    
                case 4 -> {
                    System.out.println("Ingrese el lado del hexagono: ");
                    double ladoh = scanner.nextDouble();
                    
                    // creamos el objeto figura como un objeto de la clase Hexagono 
                    figura = new Hexagono(ladoh);
                }
                case 0 -> //salir del programa
                    System.exit(0);
                default -> {
                    System.out.println("Ingrese una opcion valida");
                    continue;
                }
            
            }
            
            //mostramos los resultados 
            System.out.println("Perimetro :"+figura.perimetro());
            System.out.println("Area: "+figura.area());
        }   
    }
    
}
