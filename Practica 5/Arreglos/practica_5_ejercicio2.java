/*Hacer un programa que dado un arreglo ya cargado con 10
enteros, calcule el promedio y lo muestre por la consola. */

// import java.util.Random;

public class practica_5_ejercicio2 {
    final static int MAX = 10;
    // final static int VALORMAX = 10;
    // final static int VALORMIN = 1;
    public static void main(String[] args) {
        int[] arrenteros = {5, 9, 12, 58, 63, 4, 23, 17, 20, 64};
        double promedio = 0.0;
        // diez_enteros(arrenteros);
        promedio = arr_promedio(arrenteros);
        System.out.println('\0');
        System.out.println("El promedio es " + promedio);
    }

    public static double arr_promedio(int[] arr) {
        int suma = 0;
        try {
            for (int pos = 0; pos < MAX; pos++) {
                suma += arr[pos];
            }
            
        } catch (Exception exc) {
            System.out.println("Error");
        }
        return ((double)suma/MAX);
    }
}
