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
public class Profesor extends Persona {
    private String titulo;
    private String[] materias;
    private String area;
    
   public Profesor(String nombre, String apellidos, int edad, String titulo, 
                    String[] materias, String area) {
       super(nombre, apellidos, edad);
       this.titulo = titulo;
       this.materias = materias;
       this.area = area;
   }

    @Override
    public void toPrint() {
        String temp = "";
        for(String materia:materias) {
            temp += materia + ", ";
        }
        
        System.out.println("Información de Docente\n" +
                            " Nombres: " + this.getNombre() + "\n" + 
                            " Apellidos: " + this.getApellidos() + "\n" +
                            " Edad: " + this.getEdad() + "\n" + 
                            " Título: " + this.titulo + "\n" + 
                            " Materias: " + temp + "\n" + 
                            " Area: " + this.area);
    }
}