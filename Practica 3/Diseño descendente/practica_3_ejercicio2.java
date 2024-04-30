/*Escribir un diseño de programa que mientras que el usuario
ingrese un carácter dígito o carácter letra minúscula, imprima
dicho carácter, y si es carácter letra minúscula, imprima si es vocal
o consonante. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class practica_3_ejercicio2 {
    public static void main(String[] args) {
        /*
         * mientras ingrese dígito o letra minúscula
         * imprimir carácter
         * si es letra minúscula
         * si es vocal o consonante
         */
        char letra = ingresoCaracter();
        
        if (letra >= '1' && letra <= '9') {
            System.out.println("Es carácter dígito: " + letra);
        } else if (letra >= 'a' && letra <= 'z') {
            switch (letra) {
                case 'a': case 'e': case 'i': case 'o': case 'u':
                    System.out.println("Es carácter letra minúscula vocal: " + letra);
                    break;
            
                default: System.out.println("Es carácter letra minúscula consonante: " + letra);
                    break;
            }
        }
    }

    public static char ingresoCaracter() {
        char caracter = ' ';
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese carácter");
            caracter = entrada.readLine().charAt(0);
        } catch (Exception exc) {
            System.out.println("Error");
        }
        return caracter;
    }
}
