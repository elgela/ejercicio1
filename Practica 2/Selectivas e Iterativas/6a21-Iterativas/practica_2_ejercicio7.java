/*Escribir un programa que mientras el usuario ingrese un caracter
distinto del carácter "*", muestre por pantalla si es carácter dígito, o
si es carácter vocal minúscula. */

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class practica_2_ejercicio7 {
    public static void main(String[] args) {
        char caracter = 'a';
        // int numero = 1;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        while (caracter != '*') {
            try {
                System.out.println("Ingrese un caracter:");
                caracter = entrada.readLine().charAt(0);

                if ((caracter == 'a') || (caracter == 'e') || (caracter == 'i') || (caracter == 'o') || (caracter == 'u')) {
                    System.out.println("Es carácter vocal minúscula");
                    System.out.println('\0');
                } else {
                    System.out.println("Es carácter dígito");
                    System.out.println('\0');
                }
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
    }
}