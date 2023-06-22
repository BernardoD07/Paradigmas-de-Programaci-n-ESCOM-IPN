
package figura;


abstract class Figura {
    //declaramos el modificador de acceso en protegido
    //para que puedan acceder la clase base y derivadas de la clase base
    //solo necesitamos dos metodos (abstractos) para todas las figuras
   protected abstract double perimetro();
   protected abstract double area(); 
    
    
}
