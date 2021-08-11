/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBasics;

/**
 *
 * @author casierrav
 */
import java.util.Scanner;
public class Main {

    public static int suma(int n) {
        int s = 0;
        for(int i = 1; i <= n; i++) {
            s = s + i; // s += i;
        }
        /*
        int i = 0;
        while(i <= n) {
            s += i;
            i += 1;
        }*/
            
        return s;
    }
    
    public static void string_break(){
        String[] frutas =
        new String[]{"Tomate de árbol", "Maracuyá", "Guayaba"};
        for(String f:frutas) { // para cada elemento f en la lista
            if (f.equals("Maracuyá")){
                break;
            }
            System.out.println(f);
        }
        String a = "";
        String concat = a.concat("ads");
    }
    
    
    public static void dividir_cadena(){
        String s = "Juan 30 1.68";
        String[] line = s.split(" ");
        String nombre = line[0];
        int edad = Integer.parseInt(line[1]);
        double estatura = Double.parseDouble(line[2]);
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("estatura: " + estatura + "m");
        System.out.println(nombre.charAt(0));
    }
    
    public static void multiples_metodos(){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] line = s.split("&");
        String nombre = line[0];
        int edad = Integer.parseInt(line[1]);
        double estatura = Double.parseDouble(line[2]);
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("estatura: " + estatura + "m");
    }
    
    public static void contener_cadena(){
        String a = "hola Jorge";
        String b = "hola";
        System.out.println(a.length());
        char h_var = a.charAt(2);
        System.out.println(h_var);
        System.out.println(a.contains(b));
    }
    
    public static void leer_cadena() {
        // Declarar el objeto e inicializa
        Scanner sc = new Scanner(System.in);
        // lee una cadena
        String miCadena = sc.nextLine();
        // Imprime la cadena leı́da
        System.out.println("Resultado: " + miCadena);
    }
    
    public static int[] lee_arreglo_enteros(Scanner sc, int n) {
        int[] x = new int[n];
        for( int i=0; i<n; i++ ){
            System.out.println("Componente "+i+"-ésima?");
            x[i] = sc.nextInt();
        }
        return x;
    }
    
    public static double suma_arreglo_reales(double[] A){
        double s = 0;
        for( int i=0; i<A.length; i++){
            s += A[i];
        }
        return s;
    }
    
    
    public static double suma_arreglo_reales_2(double[] A){
        double s = 0;
        for( double x:A ){
            s += x;
        }
        return s;
    }
    
    
    public static int[][] cuadrados_matriz(int[][] X){
        int[][] Y = new int[X.length][X[0].length];
        for(int i=0; i<X.length; i++){
            for(int j=0; j<X[i].length; j++){
                Y[i][j] = X[i][j]*X[i][j];
            }
        }
        return Y;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el valor de n: ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.print("La suma de los primeros " + n + " números naturales es: ");
        System.out.println(suma(n) + "\n"); 
        
        /*
        String[] frutas = new String[]{"Tomate de árbol", "Maracuyá", "Guayaba"};
        for(String f:frutas) { // para cada elemento f en la lista
            if(f.equals("Maracuyá")) {
                break;
            }
            System.out.println(f);
        }
        
        int[] arreglo = lee_arreglo_enteros(sc, 5);
        for(int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        
        double[] numeros = {2.5,4.5,3.2};
        double resultado = suma_arreglo_reales_2(numeros);*/
    }
}