/*Escribir un diseño de programa que mientras que el usuario
ingrese un número distinto de 0, pida ingresar otro número y lo
imprima. */

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class practica_3_ejercicio1 {
    public static void main(String[] args) {
        /* Usuario ingresa número
         * mientras sea distinto de 0
         * pide ingresar otro
         * imprime ese otro número
         */
        int numero = primerNumero();

        if (numero != 0) {
            segundoNumero();
        }
    }

    public static int primerNumero() {
        int numero1 = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingrese un número");
            numero1 = Integer.valueOf(entrada.readLine());
        } catch (Exception exc) {
            System.out.println("Error");
        }
        return numero1;
    }

    public static int segundoNumero() {
        int numero2 = 1;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingrese otro número");
            numero2 = Integer.valueOf(entrada.readLine());
        } catch (Exception exc) {
            System.out.println("Error");
        }
        System.out.println("El número es: " + numero2);
        return numero2;
    }
}
