/*Escribir un programa que mientras que el usuario ingrese un
caracter letra minúscula, pida ingresar un número entero. Si el
número ingresado está entre 1 y 5 inclusive deberá imprimir la
tabla de multiplicar de dicho número. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class practica_2_ejercicio13 {
    public static void main(String[] args) {
        char letra = 'a';
        int numero = 1, multiplicador = 1;
        final int MAX = 10;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        while (letra != '0') {
            try {
                System.out.println("Ingrese letra minúscula");
                letra = entrada.readLine().charAt(0);

                if ((letra >= 'a') && (letra <= 'z')) {
                    System.out.println("Ingrese número entero");
                    numero = Integer.valueOf(entrada.readLine());
                    if ((numero >= 1) && (numero <= 5)) {
                        for (multiplicador = 1; multiplicador <= MAX; multiplicador++) {
                            System.out.println(numero + " * " + multiplicador + " = " + (numero * multiplicador));
                        }
                    } else {
                        System.out.println("Número incorrecto. Error!");
                    }
                }
            } catch (Exception exc) {
                System.out.println("Error");
            }
        }
    }
}
