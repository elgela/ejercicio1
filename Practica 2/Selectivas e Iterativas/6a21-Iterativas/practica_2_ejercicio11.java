/*Escribir un programa que mientras el usuario ingrese un
caracter letra minúscula, acumule la cantidad de vocales que
ingresó. Finalmente muestre por pantalla dicha cantidad. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class practica_2_ejercicio11 {
    public static void main(String[] args) {
        char letra = 'a';
        int vocales = 0;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        while ((letra >='a') && (letra <= 'z') && (letra != 0)) {
            try {
                System.out.println("Ingrese letra minúscula / Número o mayúscula para terminar y contar la cantidad");
                letra = entrada.readLine().charAt(0);
                switch (letra) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        vocales++;
                        break;
                
                    // default:
                    //     break;
                }
            } catch (Exception exc) {
                System.out.println("Error");
            }
        }
        System.out.println("Cantidad de vocales: " + vocales);
    }
}