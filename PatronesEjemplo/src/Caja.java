/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronesejemplos;

/**
 *
 * @author casierrav
 */
public class Caja {
    
    public Caja(){}
    
    
    public String decorar(Object n) {
        String s = n.toString();
        String linea = "*";
        for( int i=0; i<s.length(); i++) {
            linea += "*";
        }
        linea += "*";
        return linea + "\n*" + s + "*\n" + linea;
    }
    
    
    /*
    public String decorar(int n) {
        String s = "" + n;
        String linea = "*";
        for( int i=0; i<s.length(); i++) {
            linea += "*";
        }
        linea += "*";
        return linea + "\n*" + s + "*\n" + linea;
    }
    
    public String decorar(double n) {
        String s = "" + n;
        String linea = "*";
        for( int i=0; i<s.length(); i++) {
            linea += "*";
        }
        linea += "*";
        return linea + "\n*" + s + "*\n" + linea;
    }
    
    public String decorar(String n) {
        String s = "" + n;
        String linea = "*";
        for( int i=0; i<s.length(); i++) {
            linea += "*";
        }
        linea += "*";
        return linea + "\n*" + s + "*\n" + linea;
    }*/
}
