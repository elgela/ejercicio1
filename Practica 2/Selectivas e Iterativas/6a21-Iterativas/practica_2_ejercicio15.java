/*Pedir por consola el ingreso de números enteros. Cuando se
ingrese un 0 se debe terminar el programa informando el
promedio de los números ingresados, cuál fue el mayor número y
cuál fue el menor número. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class practica_2_ejercicio15 {
    public static void main(String[] args) {
        int numero = 0, suma = 0, cantidad = 0;
        double promedio = 0, numeroMayor = 0, numeroMenor = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        if (numero != 0 ) {
            numero += numeroMenor;
            numero += numeroMayor;
            suma += numero;
        }

        try {
            System.out.println("Ingrese un número");
            numero = Integer.valueOf(entrada.readLine());

            while (numero > 0) {
                
            }
        } catch (Exception exc) {
            System.out.println("Error");
        }

        }

        public static void promedioNumeros() {
            int numero = 0, suma = 0, cantidad = 0;
            double promedio, numeroMayor = 0, numeroMenor = 0;

            if (numero > numeroMayor) {
                numeroMayor = numero;
                cantidad++;
            }
            if (numero < numeroMenor) {
                numeroMenor = numero;
                cantidad++;
            }
            promedio = 
        }
    }
