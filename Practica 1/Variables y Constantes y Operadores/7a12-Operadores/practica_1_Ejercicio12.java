/*Escribir un programa que permita ingresar dos números enteros,
incremente el primero y decremente el segundo, para luego
mostrar por pantalla en ambos casos, el valor original y el
modificado. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class practica_1_Ejercicio12 {
    public static void main(String[] args) {
        int numero1, numero2;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Ingrese primer número entero");
            numero1 = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese segundo número entero");
            numero2 = Integer.valueOf(entrada.readLine());
            System.out.println('\0');
            System.out.println("Valor original primer número:");
            System.err.println(numero1);
            System.out.println("Incrementado:");
            numero_incremento(numero1);
            System.out.println('\0');
            System.out.println("Valor original segundo número:");
            System.out.println(numero2);
            System.out.println("Decrementado:");
            numero_decremento(numero2);

        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public static void numero_incremento(int numero1) {
        numero1++;
        System.out.println(numero1);
    }

    public static void numero_decremento(int numero2) {
        numero2--;
        System.out.println(numero2);
    }
}
