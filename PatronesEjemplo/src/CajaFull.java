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
public class CajaFull<T> {
    private T obj;
    
    public CajaFull(T obj){
        this.obj = obj;
    }
    
    public T getObjeto(){
        return this.obj;    
    }
    
    public String decorar( ) {
        String s = obj.toString() ;
        String linea = "*";
        for( int i=0; i<s.length(); i++) {
            linea += "*";
        }
        linea += "*";
        return linea + "\n*" + s + "*\n" + linea;
    }
    
}