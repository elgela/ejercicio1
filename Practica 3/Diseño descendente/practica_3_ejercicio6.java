/*Escribir un programa que mientras el usuario cargue desde
teclado un carácter letra minúscula, llame a un método que
imprime por pantalla la tabla de multiplicar del 9. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class practica_3_ejercicio6 {
    public static void main(String[] args) {
        /*
         * usuario carga letra minúscula
         * llamar método que imprime tabla del 9
         */
        char letra = 'a';
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingrese letra minúscula");
            letra = entrada.readLine().charAt(0);

            if (letra >= 'a') {
                tablaDel9();
            }
        } catch (Exception exc) {
            System.out.println("Error");
        }
    }

    public static int tablaDel9() {
        final int MAX = 10;
        int numero = 9;
        int multiplicador;
        for (multiplicador = 1; multiplicador <= MAX; multiplicador++) {
            System.out.println(numero + " * " + multiplicador + " = " + (numero * multiplicador));
        }
        return multiplicador;
    }
}
