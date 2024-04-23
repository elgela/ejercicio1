/*Escribir un programa que mientras que el usuario ingrese un
número entero entre 1 y 10 inclusive, lleve la suma de los
números ingresados. Finalmente, cuando sale del ciclo muestre
por pantalla el resultado de la suma. ¿En qué casos termina? */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class practica_2_ejercicio10 {
    public static void main(String[] args) {
        int numero, suma = 0;
        boolean esValido = true;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        while (esValido) {
                try {
                    System.out.println("Ingrese número entre 1 y 10 / 0 para terminar y sumar");
                    numero = Integer.valueOf(entrada.readLine());

                    if ((numero < 1) || (numero > 10)) {
                        esValido = false;
                    } else {
                        suma = suma + numero;
                    }
                } catch (Exception exc) {
                    System.out.println("Error");
                }
            }
            System.out.println("La suma de números es: " + suma);        
    }
}