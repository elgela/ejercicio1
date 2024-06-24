/*Con el mismo arreglo del ejercicio anterior informe por pantalla
cuantos elementos del mismo están por encima del promedio
calculado. */
import java.util.Random;
public class practica_5_ejercicio3 {
    final static int MAX = 10;
    final static int VALORMAX = 10;
    final static int VALORMIN = 1;

    public static void main(String[] args) {
        int[] arrenteros = new int[MAX];
        double promedio;
        int cant;
        diez_enteros(arrenteros);
        promedio = arr_promedio(arrenteros);
        System.out.println('\0');
        System.out.println("El promedio es " + promedio);
        cant = encima_promedio(arrenteros);
        System.out.println("Cantidad por encima del promedio: " + cant);
    }

    public static void diez_enteros(int[] arr) {
        Random r = new Random();
        for (int pos = 0; pos < MAX; pos++) {
            arr[pos] = (r.nextInt(VALORMAX-VALORMIN + 1));
        }
    }
    public static double arr_promedio(int[] arr) {
        int suma = 0;
        for (int pos = 0; pos < MAX; pos++) {
            suma += arr[pos];
        }
        return ((double)suma/MAX);
    }

    public static int encima_promedio(int[] arr) {
        int cant = 0;
        for (int pos = 0; pos < MAX; pos++) {
            if (pos > arr_promedio(arr)) {
                cant++;
            }
        }
        return cant;
    }
}
