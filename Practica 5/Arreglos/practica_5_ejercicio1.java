/*Cargar un arreglo de tamaño 15, pidiendo el ingreso por teclado
de valores entre 1 y 12. Luego mostrar cómo quedó cargado. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class practica_5_ejercicio1 {
    final static int MAX = 15;

    public static void main(String[] args) {
        int[] enteros = new int[MAX];
        cargar_arreglo(enteros);
        mostrar_arreglo(enteros);
    }

    public static void cargar_arreglo(int[] arr) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            for (int pos = 0; pos < MAX; pos++) {
                System.out.println("Ingrese valores entre 1 y 12");
                arr[pos] = Integer.valueOf(entrada.readLine());
                
                System.out.println(arr[pos]);
            }
        } catch (Exception exc) {
            System.out.println("Error");
        }
    }
    public static void mostrar_arreglo(int[] arrenteros) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.println("arrenteros[" + pos + "] -> " + arrenteros[pos]);
        }
    }
}
// public class Clase_5_Ejemplo_1 {
// final static int MAX = 5;

// public static void main(String[] args) {
// int[] enteros = new int[MAX];
// cargarArreglo(enteros);
// mostrarArreglo(enteros);
// }

// public static void cargarArreglo(int[] arrenteros){
// BufferedReader entrada = new BufferedReader(new
// InputStreamReader(System.in));

// try{
// for (int pos = 0; pos < MAX; pos++){
// System.out.println ("Ingrese el entero de la posición " + pos + ": ");

// arrenteros[pos] = Integer.valueOf(entrada.readLine());

// }
// } catch(Exception exc){
// System.out.println(exc);

// }
// }

// public static void mostrarArreglo(int[] arrenteros) {
// for (int pos = 0; pos < MAX; pos++) {
// System.out.println("arrenteros[" + pos + "] -> " + arrenteros[pos]);
// }
// }
// }// fin del class