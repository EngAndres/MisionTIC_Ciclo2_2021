package javacollections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author casierrav
 */
import java.util.Vector;
  
public class VectorEjemplo {
  
    public static void main(String[] args)
    {
        // Vector para almacenar cualquier tipo
        Vector vector = new Vector();
  
        // agregar elementos de distinto tipo
        vector.add(1);
        vector.add(true);
        vector.add("Mision");
        vector.add("TIC");
        vector.add(2);
        System.out.println("Vector 1: " + vector);
  
        // modificar el valor de uno de los elementos
        vector.set(0, 2021);
        System.out.println("Vector 2: " + vector);
        
        // eliminar elemento en el índice 4
        vector.remove(4);
        System.out.println("Vector 3: " + vector);
  
        // impresión de elementos con ciclo por elemento
        for(Object elemento : vector)
            System.out.print(elemento + " ; ");
    }
}