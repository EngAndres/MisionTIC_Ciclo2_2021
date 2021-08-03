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
import java.util.Map;
import java.util.TreeMap;

public class TreeMapEjemplo {
    public static void main(String args[]) {
        // Creación del TreeMap
        TreeMap<Integer, String> mapa
                = new TreeMap<Integer, String>();
  
        // Agregar elementos
        mapa.put(3, "MisionTIC");
        mapa.put(2, "estudiantes");
        mapa.put(1, "hola");
  
        for (Map.Entry pareja : mapa.entrySet()) {
            int clave = (int)pareja.getKey();
            String valor = (String)pareja.getValue();
            System.out.println(clave + " : " + valor);
        }
    }
}
