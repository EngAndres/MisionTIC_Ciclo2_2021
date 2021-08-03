/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollections;
import java.util.ArrayList;


/**
 *
 * @author casierrav
 */
public class ArrayListEjemplo {
    public static void main(String[] args)
    {
        // tamaño del ArrayList
        int n = 5;
  
        // Creación de un ArrayList de tipo entero y de tamaño inicial n
        ArrayList<Integer> lista_arreglo = new ArrayList<Integer>(n);
  
        // Se pueden agregar elementos a la lista hasta el límite
        for (int i = 0; i <= n+1; i++)
            lista_arreglo.add(i);
  
        // Imprimir elementos del ArrayList
        System.out.println("Lista 1:" + lista_arreglo);
        // Quitar elemento en el índice 3
        lista_arreglo.remove(3);
        // Imprime ArrayList luego de borrar
        System.out.println("Lista 2:" + lista_arreglo);
  
        // Se imprime elemento por elemento en un ciclo
        for (int i = 0; i < lista_arreglo.size(); i++)
            System.out.print(lista_arreglo.get(i) + " ");
    }
}
