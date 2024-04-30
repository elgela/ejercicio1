/*Escribir un diseño de programa que mientras que el usuario
ingrese un número distinto de 0, pida ingresar otros dos números
e imprima el resultado de la multiplicación entre los dos últimos
números ingresados. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class practica_3_ejercicio4 {
    public static void main(String[] args) {
        int numero = 0;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingrese un número");
            numero = Integer.valueOf(entrada.readLine());

            if (numero != 0) {
                multiplicación();
            }

        } catch (Exception exc) {
            System.out.println("Error");
        }
    }

    public static int multiplicación() {
        int numero1 = 0, numero2 = 0, resultado = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingrese número 1");
            numero1 = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese número 2");
            numero2 = Integer.valueOf(entrada.readLine());

            resultado = (numero1 * numero2);
            
        } catch (Exception exc) {
            System.out.println("Error");
        }
        System.out.println(numero1 + " * " + numero2 + " = " + resultado);
        return resultado;
    }
}
