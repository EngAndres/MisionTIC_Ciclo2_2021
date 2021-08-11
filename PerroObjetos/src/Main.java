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
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Perro perrito1 = new Perro("Tobby", 5, "cafes");
        System.out.println(perrito1.nombre);
        perrito1.ladrar();
        Perro perrito2 = new Perro("Firulais", 2, "verdes");
        System.out.println(perrito2.nombre);
        perrito2.saludar();
        perrito1.quienEsMayor(perrito2);
    }
}