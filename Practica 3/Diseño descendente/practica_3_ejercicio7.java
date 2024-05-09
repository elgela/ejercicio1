/*Escribir un programa que mientras el usuario cargue desde
teclado un número entero distinto de 0, imprima por pantalla la
suma que se obtiene de invocar un método que calcula la
sumatoria de los primeros 200 números naturales (son números
enteros entre 1 y 200). */

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class practica_3_ejercicio7 {
    public static void main(String[] args) {
        /*mientras usuario carga numero distinto de 0
         * hacer metodo que sume los primeros 200 enteros
         * imprimir por pantalla al invocarlo
         */
        int numero = 1;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        while (numero != 0) {
            try {
                System.out.println("Ingrese número");
                numero = Integer.valueOf(entrada.readLine());
                if (numero != 0) {
                    suma();
                }
            } catch (Exception exc) {
                System.out.println("Error");
            }
        }
    }

    public static int suma() {
        int suma = 0, num = 0;
        final int MAX = 200;
        for (num = 0; num <= MAX; num++) {
            suma = suma + num;
        }
        System.out.println("La sumatoria de los primeros 200 números naturales es: " + suma);
        return suma;
    }
}