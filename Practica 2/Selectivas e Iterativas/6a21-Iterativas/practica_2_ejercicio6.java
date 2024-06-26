/*Escribir un programa que mientras el usuario ingrese un número
entero menor que 100 y mayor a 1, muestre por pantalla si el
número es múltiplo de 2 y múltiplo de 3 simultáneamente. (¿Los
valores mencionados en el enunciado deberían ser constantes?.
De a poco habría que definirlos como constantes). */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class practica_2_ejercicio6 {
    public static void main(String[] args) {
        int numero = 1;
        final int MAX = 100;
        final int MIN = 1;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        while ((numero <= MAX) && (numero >= MIN)) {
            try {
                System.out.println("Ingrese número menor que 100 y mayor que 1");
                numero = Integer.valueOf(entrada.readLine());
                if ((numero %2 == 0) && (numero %3 == 0)) {
                    System.out.println(numero + " es múltiplo de 2 y de 3");
                    System.out.println('\0');
                }
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
    }
}
