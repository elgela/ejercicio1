/*Buscar un elemento en un arreglo de caracteres ya cargado de
tamaño 10 y mostrar la/s posición/es del elemento, en caso de no
estar indicarlo también. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class practica_5_ejercicio4 {
    final static int MAX = 10;
    public static void main(String[] args) {
        char[] caracteres = { 'A', 'C', 'A', 'D', 'C', 'F', 'D', 'C', 'D', 'C' };
        int[] enteros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int numero = obtenerNumero();
        int pos = obtener_posicion_elemento(enteros, numero);
        if (pos < MAX) {
            System.out.println("Caracter " + caracteres[pos] + " está en posición " + pos);
        } else {
            System.out.println("No existe " + numero);
        }
    }

    public static int obtener_posicion_elemento(int[] arr, int numero) {
        int posicion = 0;
        while ((posicion < MAX) && (arr[posicion] != numero)) {
            posicion++;
        }
        return numero;
    }

    public static int obtenerNumero() {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int numero = 0;
        try {
            System.out.println("Ingrese un numero entero :");
            numero = Integer.valueOf(entrada.readLine());

        } catch (Exception exc) {
            System.out.println(exc);
        }
        return numero;
    }
}

/*no hace lo que pide */