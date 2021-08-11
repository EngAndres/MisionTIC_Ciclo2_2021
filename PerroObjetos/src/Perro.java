/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PerroObjetos;

/**
 *
 * @author casierrav
 */
public class Perro {
    // Atributos
    public int edad;
    public String nombre;
    public String colorOjos;
    
    // Constructor
    public Perro(String nombre, int edad, String colorOjos) {
        this.nombre = nombre;
        this.edad   = edad;
        this.colorOjos = colorOjos;
    }
    
    // Métodos
    public void ladrar() {
        System.out.println("Guau guau");
    }
    
    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre);
    }
    
    public void quienEsMayor(Perro otroPerro) {
        if (this.edad > otroPerro.edad) {
            System.out.println("Soy mayor que "+otroPerro.nombre);
        } else if (this.edad == otroPerro.edad) {
            System.out.println("Tenemos la misma edad");
        } else {
            System.out.println(otroPerro.nombre+" es mayor que yo");
        }
    }
    
    public void saludarOtroPerro(Perro otroPerro) {
        System.out.println("Hola " + otroPerro.nombre 
                          + ", yo soy " + this.nombre);
    }
}
