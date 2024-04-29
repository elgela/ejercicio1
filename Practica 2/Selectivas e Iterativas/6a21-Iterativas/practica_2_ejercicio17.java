/*Escribir un programa que dado un valor ingresado por el
usuario menor que 10 y mayor a 1, muestre por pantalla una
cuenta regresiva de números desde dicho valor hasta el 0
inclusive. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class practica_2_ejercicio17 {
    public static void main(String[] args) {
        int valor = 0, regresiva = 0;
        final int MAX = 10;
        final int MIN = 1;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingrese un valor");
            valor = Integer.valueOf(entrada.readLine());

            if ((valor < MAX) && (valor > MIN)) {
                valor = regresiva;
                regresiva--;
            }
            System.err.println(regresiva);
        } catch (Exception exc) {
            System.out.println("Error");
        }
    }
}