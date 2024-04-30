/*Pedir por consola el ingreso de números enteros. Cuando se
ingrese un 0 se debe terminar el programa informando el
promedio de los números ingresados, cuál fue el mayor número y
cuál fue el menor número. */

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class practica_2_ejercicio15 {
    public static void main(String[] args) {
        int numero = 1, numMayor = 1, numMenor = 1;
        
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        while (numero != 0) {
            try {
                System.out.println("Ingrese números enteros");
                numero = Integer.valueOf(entrada.readLine());

                if (numero == 0) {
                    promedio();
                }
            } catch (Exception exc) {
                System.out.println("Error");
            }
        }
    }
    public static double promedio() {
        int numero = 1, cantidad = 0, suma = 0;
        double promedio = 0.0;

        for (cantidad = 0; cantidad <= numero ; cantidad++) {
            if (numero > 0) {
                cantidad++;
                suma = (numero + numero);
                promedio = suma / cantidad;
            }
        }
        return promedio;
    }
}
