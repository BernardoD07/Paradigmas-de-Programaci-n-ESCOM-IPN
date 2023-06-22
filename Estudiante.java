
package persona;

public class Estudiante implements Persona{

    // atributos
    int ID;
    String nombre;
    String CURP; 
    String domicilio; 
    
    // constructor
    
    public Estudiante(int ID, String nombre, String CURP, String domicilio){
        this.ID = ID;
        this.nombre = nombre;
        this.CURP = CURP;
        this.domicilio = domicilio;
    }
    
    // métodos de la interface Persona 

    @Override
    public int getID() {
        return this.ID;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public String getCURP() {
        return this.CURP;
    }

    @Override
    public String getDomicilio() {
        return this.domicilio;
    }
    
    @Override
    public void imprimirDatos(){
        System.out.println ("ID: "+this.ID+"\nNombre: "+this.nombre+"\n CURP: "+this.CURP+"\n Domicilio: "+this.domicilio);
    }
}
