/*Hacer un programa que dado un arreglo de caracteres de tamaño
MAX que se encuentra cargado, invierta el orden del contenido. */

public class practica_5_ejercicio5 {
    final static int MAX = 5;
    public static void main(String[] args) {
        char[] caracteres = { '1', ' ', 'g', 'o', 'r', 'P' };
        System.out.println('\0');
        orden_invertido(caracteres);

    }

    public static void orden_invertido(char[] arr) {
        for (char i = MAX; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
