/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollections;

/**
 *
 * @author casierrav
 */
import java.util.LinkedList;
  
public class LinkedListEjemplo {
  
    public static void main(String args[])
    {
        // LinkedList de cadenas de caracteres
        LinkedList<String> lista_enlazada 
                            = new LinkedList<String>();
  
        // mecanismos para agregar elementos
        lista_enlazada.add("A");
        lista_enlazada.add("B");
        lista_enlazada.addLast("C");
        lista_enlazada.addFirst("D");
        lista_enlazada.add(2, "E");
        System.out.println("Lista 1: " + lista_enlazada);
        
        // modificación de un elemento
        lista_enlazada.set(1, "a"); 
        System.out.println("Lista 2: " + lista_enlazada);
        
        // impresión utilizando ciclos
        for (int i = 0; i < lista_enlazada.size(); i++)  
            System.out.print(lista_enlazada.get(i) + " "); 
        System.out.println();
        
        // mecanismos para eliminar elementos
        lista_enlazada.remove("B");
        lista_enlazada.remove(3);
        lista_enlazada.removeFirst();
        lista_enlazada.removeLast();
        System.out.println("Lista final: " + lista_enlazada);
    }
}
