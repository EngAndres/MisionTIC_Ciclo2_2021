package DirectorioRecursivo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;
import java.util.ArrayList;


/**
 *
 * @author casierrav
 */
public class DirectoriosRecursivos {
    public String nombre;
    List<DirectoriosRecursivos> subdirs;
    List<String> archivos;
    
    DirectoriosRecursivos(String nombre) {
        this.nombre = nombre;
        this.subdirs = new ArrayList<DirectoriosRecursivos>();
        this.archivos = new ArrayList<String>();
    }
    
    public String espacios(int nivel ){
        String s = "";
        for( int i=0 ; i<nivel; i++ ){ 
            s += ' '; 
        }
        return s;
    }

    private String toString(int nivel) {
        String s = espacios(nivel) + nombre + "\n";
        for( DirectoriosRecursivos d : subdirs )
            s += d.toString(nivel+1) + "\n";
        
        for( String a : archivos )
            s += espacios(nivel+1) + a + "\n";
        
        return s;
    }
    
    public String toString(){ 
        return this.toString(0); 
    }

    public static void main(String[] args) {
        DirectoriosRecursivos root = new DirectoriosRecursivos("root");
        // Primer nivel
        root.subdirs.add(new DirectoriosRecursivos("bin"));
        root.subdirs.add(new DirectoriosRecursivos("home"));
        root.subdirs.add(new DirectoriosRecursivos("lib"));
        // Segundo nivel
        root.subdirs.get(1).subdirs.add(new DirectoriosRecursivos("will"));
        System.out.println(root);
    }
}
