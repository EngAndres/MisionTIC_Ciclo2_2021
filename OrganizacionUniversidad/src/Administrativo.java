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
public class Administrativo extends Persona {
    private String cargo;
    private String dependencia;
    
    public Administrativo(String nombre, String apellidos, int edad, String cargo, String dependencia) {
        super(nombre, apellidos, edad);
        this.cargo = cargo;
        this.dependencia = dependencia;
    }

    @Override
    public void toPrint() {
        System.out.println("Información de Administrativo\n" +
                            " Nombres: " + this.getNombre() + "\n" + 
                            " Apellidos: " + this.getApellidos() + "\n" +
                            " Edad: " + this.getEdad() + "\n"  +
                            " Cargo" + this.cargo + "\n" + 
                            " Dependencia: " + this.dependencia );
    }
}
