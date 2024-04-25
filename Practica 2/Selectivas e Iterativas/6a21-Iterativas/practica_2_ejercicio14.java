/*Pedir por consola el ingreso de 10 números enteros positivos.
Contar cuántas veces se ingresaron números pares y mostrarlo
por pantalla. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class practica_2_ejercicio14 {
    public static void main(String[] args) {
        int numero = 1, cantPar = 0;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        while (numero > 0) {
            try {
                System.out.println("Ingrese 10 números enteros positivos");
                numero = Integer.valueOf(entrada.readLine());

                    if (numero %2 == 0) {
                        cantPar++;
                    }
                    // cantidad++;

            } catch (Exception e) {
                System.out.println("Error");
            }
        }
        System.out.println("Se ingresaron " + cantPar + " pares");
    }
}
