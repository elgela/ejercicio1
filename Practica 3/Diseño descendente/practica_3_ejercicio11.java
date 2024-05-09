/*Escribir un método que retorne el mayor de dos números. Usar
ese método para calcular el máximo de una serie de números
ingresados por el usuario (20 números en total). */

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*if de dos numeros
 * cual es mayor
 retornar*/
public class practica_3_ejercicio11 {
    // definir constante 20 numeros ingresados
    public static int num1 = 0, num2 = 0;

    public static int mayorDeDosNumeros() {
        if (num1 > num2) {
            return num1;
        } else
            return num2;
    }

    /*
     * pedir entrada de numeros al usuario (20)
     * metodo for
     * variable MAX
     */
    public static void main(String[] args) {
        int numMax = 0, numero = 1, cantidad = 0;
        final int MAX = 20;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        while (numero != 0) {
            try {
                System.out.println("Ingrese 20 números enteros");
                numero = Integer.valueOf(entrada.readLine());
                for (numero = 0; numero < MAX; numero++) {
                    mayorDeDosNumeros();
                }
            } catch (Exception exc) {
                System.out.println("Error");
            }
        }
    }
}