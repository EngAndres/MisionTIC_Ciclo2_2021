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
public class Pareja<K,V> {
    protected K clave;
    protected V valor;
    
    public Pareja(K clave, V valor){
        this.clave = clave;
        this.valor = valor;
    }

    public K getClave(){ 
        return this.clave; 
    }

    public V getValor(){ 
        return this.valor; 
    }

    public String toString(){
        return "(" + this.clave + "," + this.valor + ")";
    }
}
