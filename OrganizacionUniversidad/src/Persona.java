/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrganizacionUniversidad;

/**
 *
 * @author casierrav
 */
public abstract class Persona {
    private String nombre;
    private String apellidos;
    private int edad;

    //Constructor
    public Persona (String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        // valide permisos
        return apellidos;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        if(edad > 0)
            this.edad = edad;
        else
            System.out.println("Edad inválida.");
    }
    
    
    public abstract void toPrint();
}