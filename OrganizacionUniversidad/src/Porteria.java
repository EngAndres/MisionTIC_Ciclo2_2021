/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrganizacionUniversidad;

import java.util.Vector;

/**
 *
 * @author casierrav
 */
public class Porteria {

    public static Vector<Persona> listadoIngreso = new Vector<Persona>();
        
    public static void imprimirLista() {
        System.out.println("LISTA DE INGRESO");
        for(Persona persona:listadoIngreso){
            persona.toPrint();
        }
    }
    
    
    public static boolean buscarLista(String nombre, String apellidos) {
        boolean encontrado = false;
        
        for(Persona persona:listadoIngreso){
            if(persona.getNombre().equals(nombre) && persona.getApellidos().equals(apellidos)) {
                encontrado = true;
                break;
            }
        }
        
        return encontrado;
    }
    
    
    public static void main(String[] args) {
        listadoIngreso.add( new Estudiante("Pepita", "Perez", 20, "32415a", "Programación", "Primer") );
        
        String[] materias = {"Programación Python", "Programación Java"};
        Profesor profesor1 = new Profesor("Pepito", "Perigollaz", 40, "Ingeniero", materias, "Sistemas");
        listadoIngreso.add( profesor1 );
        
        listadoIngreso.add( new Estudiante("Nerón", "Navarrete", 35, "1a", "Inglés", "Cuarto") );
        listadoIngreso.add( new Administrativo("Maicol", "Escot", 42, "Decano", "Decanatura") );
        
        
        imprimirLista();
    }
}
