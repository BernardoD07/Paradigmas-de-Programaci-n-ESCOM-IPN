
package persona;

public class Docente implements Persona{
    // atributos
    int ID;
    String nombre;
    String CURP; 
    String domicilio; 
    String materia;
    
    
    // métodos de la interface Persona
    public Docente (int ID, String nombre, String CURP, String domicilio, String materia){
        
        this.ID = ID;
        this.nombre = nombre;
        this.CURP = CURP;
        this.domicilio = domicilio;
        this.materia = materia;
    }
    

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
        System.out.println ("ID: "+this.ID+"\nNombre: "+this.nombre+"\n CURP: "+this.CURP+"\n Domicilio: "+this.domicilio + "Materia :"+this.materia);
    }
}
