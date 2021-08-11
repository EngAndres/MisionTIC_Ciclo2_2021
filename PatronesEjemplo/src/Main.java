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
public class Main {
    public static void testCajas(){
        Caja caja = new Caja();
        System.out.println( caja.decorar(12) );
        System.out.println( caja.decorar(15.18) );
        System.out.println( caja.decorar("Aloha") );
        
        CajaHerencia caja_h = new CajaHerencia("Pedro Páramo");
        char c = ((String)caja_h.getObject()).charAt(2);
        System.out.println(c);
        
        CajaFull<String> caja_f = new CajaFull<String>("Pepita Perez");
        System.out.println( caja_f.decorar() );
        c = caja_f.getObjeto().charAt(3);
        System.out.println(c);
        
        CajaFull<Double> caja2 = new CajaFull<Double>(20.34);
        System.out.println( caja2.decorar() );
        double y = caja2.getObjeto()+ 20.0;
        System.out.println(y);
    }
    
    public static void testPareja(){
        Pareja<Integer,String> pareja = new Pareja<Integer,String>(20,"Pedro Páramo");
        System.out.println( pareja );
        Integer c = pareja.getClave() + 10;
        System.out.println( c );
        System.out.println(pareja.getValor().charAt(2));
    }
    
    
    public static void main(String[] args) {
    }
}
