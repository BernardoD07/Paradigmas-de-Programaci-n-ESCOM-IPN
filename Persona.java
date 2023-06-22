
package persona;

// se crea la interface con public y la palabra resevada "interface"
// las interfaces solo se definen los metodos, no se implementan, además de no tener un
// constructor como se puede tener las clases abstractas
public interface Persona {
    
   
   public int getID();
   public String getNombre();
   public String getCURP();
   public String getDomicilio();
   public void imprimirDatos();
    
}
