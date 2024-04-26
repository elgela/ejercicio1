/*Pedir por consola el ingreso de números enteros. Cuando se
ingrese un 0 se debe terminar el programa informando el
promedio de los números ingresados, cuál fue el mayor número y
cuál fue el menor número. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class practica_2_ejercicio15 {
    public static void main(String[] args) {
        int numero = 0, suma = 0, cantidad = 0, numeroMayor = 0, numeroMenor = 0;
        double promedio = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        if (numero != 0) {
            numero = suma = cantidad;
            numero += numeroMenor;
            numero += numeroMayor;
            suma += numero;
            promedio = (suma / cantidad);

        }
        while (numero > 0) {
            try {
                System.out.println("Ingrese un número");
                numero = Integer.valueOf(entrada.readLine());
                
                if (numero == 0) {
                    promedioNumeros(promedio);
                }
                
                System.out.println("Ingrese un número");
                numero = Integer.valueOf(entrada.readLine());
            } catch (Exception exc) {
                System.out.println("Error");
            }
        }
    }

    public static void promedioNumeros(int numero, int suma, int cantidad, int numeroMayor, int numeroMenor) {
        double promedio = 0;
        if (numero > numeroMayor) {
            numeroMayor = numero;
            suma = numero;
            cantidad++;
        }
        if (numero < numeroMenor) {
            numeroMenor = numero;
            numero = suma;
            cantidad++;
        }
        promedio = (suma / cantidad);
    }
}
