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
public class Estudiante extends Persona {
    private String codigo;
    private String carrera;
    private String semestre;
    
    public Estudiante(String nombre, String apellidos, int edad, String codigo,
                        String carrera, String semestre) {
        super(nombre, apellidos, edad);
        this.codigo = codigo;
        this.carrera = carrera;
        this.semestre = semestre;
    }

    @Override
    public void toPrint() {
        System.out.println("Información de Estudiante\n" +
                            " Nombres: " + this.getNombre() + "\n" + 
                            " Apellidos: " + this.getApellidos() + "\n" +
                            " Edad: " + this.getEdad() + "\n" + 
                            " Código: " + this.codigo + "\n" + 
                            " Carrera: " + this.carrera + "\n" + 
                            " Semestre: " + this.semestre);
    }
}