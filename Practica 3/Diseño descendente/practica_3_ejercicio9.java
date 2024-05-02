/*Escribir un programa que mientras el usuario ingrese un número
entero entre 1 y 10, pida ingresar un carácter, y por cada carácter
ingresado imprima:

a. “letra minúscula” si el carácter es una letra del abecedario en
minúscula;
b. “letra mayúscula” si el carácter es una letra del abecedario
en mayúscula;
c. “dígito” si el carácter corresponde a un número;
d. “otro” para los restantes casos de caracteres. */

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class practica_3_ejercicio9 {
    public static void main(String[] args) {
        int numero = 1;
        // final int MIN = 1;
        // final int MAX = 10;
        char caracter = 'a';

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        while (numero != '0') {
            try {
                System.out.println("Ingrese un número entero entre 1 y 10");
                numero = Integer.valueOf(entrada.readLine());

                if ((numero >= 1) && (numero <= 10)) {
                    System.out.println("Ingrese un carácter");
                    caracter = entrada.readLine().charAt(0);
                    letraMinuscula(caracter);
                    letraMayuscula(caracter);
                    digito(numero);
                } else {
                    System.out.println("Otro");
                }
            } catch (Exception exc) {
                System.out.println("Error");
            }
        }
    }

    public static char letraMinuscula(char caracter) {
        if ((caracter >= 'a') && (caracter <= 'z')) {
            System.out.println("Letra minúscula");
        }
        return caracter;
    }

    public static char letraMayuscula(char caracter) {
        if ((caracter >= 'A') && (caracter <= 'Z')) {
            System.out.println("Letra mayúscula");
        }
        return caracter;
    }

    public static int digito(int numero) {
        if (numero >= 1) {
            System.out.println("Dígito");
        }
        return numero;
    }
}
