/*Hacer un programa que dado un arreglo de enteros de tamaño 10
que se encuentra cargado, obtenga la cantidad de números pares
que tiene y la imprima. */

// import java.util.Random;

public class practica_5_ejercicio6 {
    final static int MAX = 10;
    // final static int VALORMAX = 10;
    // final static int VALORMIN = 1;
    public static void main(String[] args) {
        int[] arrenteros = {1,2,3,4,5,6,7,8,9,10};
        // arreglo_enteros(arrenteros);
        cantidad_numeros_pares(arrenteros);
    }
    // public static void arreglo_enteros(int[] arrenteros) {
    //     Random r = new Random();
    //     for (int pos = 0; pos < MAX; pos++) {
    //         arrenteros[pos] = (r.nextInt(VALORMAX-VALORMIN + 1) + VALORMIN);
    //     }
    // }
    public static int cantidad_numeros_pares(int[] arrenteros) {
        int cant = 0;
        for (int pos = 0; pos < MAX-1; pos++) {
            if (arrenteros[pos] %2 == 0) {
                cant += arrenteros[pos];
            }
        }
        System.out.println('\0');
        System.out.println("Cantidad de pares: " + cant);
        return cant;
    }
}