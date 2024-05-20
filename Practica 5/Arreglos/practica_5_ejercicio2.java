package Arreglos;
/*Hacer un programa que dado un arreglo ya cargado con 10
enteros, calcule el promedio y lo muestre por la consola. */

// import java.util.Random;

public class practica_5_ejercicio2 {
    final static int MAX = 10;
    // final static int VALORMAX = 10;
    // final static int VALORMIN = 1;
    public static void main(String[] args) {
        int[] arrenteros = {5, 9, 12, 58, 63, 4, 23, 17, 20, 64};
        double promedio;
        // diez_enteros(arrenteros);
        promedio = arr_promedio(arrenteros);
        System.out.println('\0');
        System.out.println("El promedio es " + promedio);
    }
    // public static void diez_enteros(int[] arr) {
    //     Random r = new Random();
    //     for (int pos = 0; pos < MAX; pos++) {
    //         arr[pos] = (r.nextInt(VALORMAX-VALORMIN + 1) + VALORMIN);
    //     }
    // }
    public static double arr_promedio(int[] arr) {
        int suma = 0;
        try {
            for (int pos = 0; pos < MAX; pos++) {
                suma += arr[pos];
            }
            
        } catch (Exception exc) {
            System.out.println("Error");
        }
        // System.out.println("El promedio es: " + ((double)suma/MAX));
        return ((double)suma/MAX);
    }
}
