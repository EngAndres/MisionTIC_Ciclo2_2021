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
public class CajaHerencia {
    protected Object obj;
    
    public CajaHerencia(Object obj){
        this.obj = obj;
    }
    
    public Object getObject() {
        return this.obj;
    }
    
    
    public String decorar(){
        String s = obj.toString();
        String linea = "*";
        for( int i=0; i<s.length(); i++) 
            linea += "*";
        linea += "*";
        return linea + "\n*" + s + "*\n" + linea;
    }
}