/*Pedir por consola 15 caracteres. Imprimir la mayor cantidad de
'a' seguidas que se ingresaron. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class practica_2_ejercicio16 {
    public static void main(String[] args) {
        char caracter = 'b';
        int cantidadA = 0, cantCaracter = 0, cantidad = 1;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        while (caracter != '0') {
            try {
                System.out.println("Ingrese 15 caracteres / 0 para terminar");
                System.out.println("Caracter " + cantidad++);
                caracter = entrada.readLine().charAt(0);
                for (cantCaracter = 1; cantCaracter <= 15; cantCaracter++) {
                    if ((caracter >= 'a') && (caracter <= 'z')) {
                        switch (caracter) {
                            case 'a':
                                cantidadA++;
                                break;
                            }
                            System.out.println("Caracter " + cantidad++);
                            caracter = entrada.readLine().charAt(0);
                    }
                }
            } catch (Exception exc) {
                System.out.println("Error");
            }
        }
        System.out.println("El caracter 'a' se ha ingresado " + cantidadA + " veces");
    }
}
