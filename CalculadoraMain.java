/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *  Ejercicio de Laboratorio 3.2
 * Paradigmas de programación
 * @author Delgado Acosta Luis Bernardo
 * Grupo. 3Bv2
 * 
 */
public class CalculadoraMain {
    
    public static void main(String [] args){
        
        Calculadora myObj1 = new Calculadora(5, 5.5f, 5.5555555);
        //Creamos un objeto y le mandamos valores para sus atributos
        
        // probando el método de suma, resta, multiplicación y división
        int resultadoInt = myObj1.sumaInt(2);
        float resultadoFloat2 = myObj1.restaFloat(2);
        myObj1.multDouble(5.55555, 3);
        
        System.out.println("Resultado de la sumaInt: " + resultadoInt);
        System.out.println("Resultado de la restaFloat: " + resultadoFloat2);
        myObj1.multDouble(5.55555, 3);
        int resultadoIntModulo = myObj1.moduloInt(3);
        System.out.println ("Modulo: " + resultadoIntModulo);
        
    }
    
}
