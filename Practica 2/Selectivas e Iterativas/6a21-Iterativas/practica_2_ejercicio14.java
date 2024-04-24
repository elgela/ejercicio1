/*Pedir por consola el ingreso de 10 números enteros positivos.
Contar cuántas veces se ingresaron números pares y mostrarlo
por pantalla. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class practica_2_ejercicio14 {
    public static void main(String[] args) {
        int numero = 1, numPar = 2;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        while (((numero != 0) && (numero >= 1))) {
            try {
                System.out.println("Ingrese 10 números positivos");
                numero = Integer.valueOf(entrada.readLine());
                for (numero = 1; numero <= 10; numero++) {
                    if (numero %2 == 0) {
                        numPar = numero;
                    }
                }
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
        System.out.println("Cantidad de pares: " + numPar);
    }
}
