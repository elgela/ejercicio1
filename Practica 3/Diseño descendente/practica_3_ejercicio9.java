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
    final static char minMayusculas = 'A', maxMayusculas = 'Z', minMinusculas = 'a', maxMinusculas = 'z', digitoMin = '0', digitoMax = '9';
    final static int MAX = 10;
    final static int MIN = 1;
    public static void main(String[] args) {
        int numero = obtenerNumero();
        char caracter;
        while (numero >= MIN && numero <= MAX) {
            caracter = obtenerCaracter();
            procesar(caracter);
            numero = obtenerNumero();
        }

    }

    public static int obtenerNumero() {
        int numero = 1;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingrese número entero");
            numero = Integer.valueOf(entrada.readLine());
            
        } catch (Exception exc) {
            System.out.println("Error");
        }

        return numero;
    }

    public static void procesar(char caracter) {
        if (caracter >= minMinusculas && caracter <= maxMinusculas) {
            System.out.println("Letra minúscula");
        } else if (caracter >= minMayusculas && caracter <= maxMayusculas) {
            System.out.println("Letra mayúscula");
        } else if (caracter >= digitoMin && caracter <= digitoMax) {
            System.out.println("Dígito");
        } else {
            System.out.println("Otro");
        }
    }

    public static char obtenerCaracter() {
        char caracter = ' ';
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese carácter");
            caracter = entrada.readLine().charAt(0);
            
        } catch (Exception e) {
            System.out.println("Error");
        }
        return caracter;
    }
}
