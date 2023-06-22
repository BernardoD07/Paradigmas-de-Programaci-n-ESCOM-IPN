
package persona;
import java.util.Scanner;

public class PersonaMain {
    
    public static void main(String[] args){
        
        // definimos el objeto como la interface persona pero, sin asignarlo a un objeto tipo clase
        Persona persona = null;
        Scanner scanner = new Scanner(System.in);
        int i=1;
        
        while (true) {
            
            System.out.println("Como desea ingresar ?:");
            System.out.println("1. Estudiante");
            System.out.println("2. Docente");
            System.out.println("3. PAAE");
            System.out.println("0. SALIR:");
            
            int opcion = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (opcion){
                case 1 -> {
                    // creamos el objeto tipo estudiante
                    System.out.println("Ingresa los datos :");
                    System.out.println("ID :");
                    int ID = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nombre: ");
                    String nombre = scanner.nextLine();
                    scanner.nextLine(); 
                    System.out.println("CURP : ");
                    String CURP = scanner.nextLine();
                    scanner.nextLine(); 
                    System.out.println("Domicilio: ");
                    String domicilio = scanner.nextLine();
                    scanner.nextLine(); 
                    persona = new Estudiante(ID, nombre, CURP, domicilio);
                }
                case 2 -> {
                    //creamosel objeto tipo Docente
                    System.out.println("Ingresa los datos :");
                    System.out.println("ID :");
                    int ID = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nombre: ");
                    String nombre = scanner.nextLine();
                    scanner.nextLine(); 
                    System.out.println("CURP : ");
                    String CURP = scanner.nextLine();
                    scanner.nextLine(); 
                    System.out.println("Domicilio: ");
                    String domicilio = scanner.nextLine();
                    scanner.nextLine(); 
                    System.out.println("Materia: ");
                    String materia = scanner.nextLine();
                    scanner.nextLine(); 
                    persona = new Docente(ID, nombre, CURP, domicilio, materia);
                    
                }
                case 3 -> {
                    // creamos el objeto tipo PAAE
                    System.out.println("Ingresa los datos :");
                    System.out.println("ID :");
                    int ID = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nombre: ");
                    String nombre = scanner.nextLine();
                    scanner.nextLine(); 
                    System.out.println("CURP : ");
                    String CURP = scanner.nextLine();
                    scanner.nextLine(); 
                    System.out.println("Domicilio: ");
                    String domicilio = scanner.nextLine();
                    scanner.nextLine(); 
                    persona = new PAAE(ID, nombre, CURP, domicilio);
                }
                case 0 -> System.exit(0);
                default -> System.out.println ("Ingrese un valor valido...");
            }
           
            
            System.out.println ("\n Datos guardados ");
            persona.imprimirDatos();
        } 
        
    }
    
}
