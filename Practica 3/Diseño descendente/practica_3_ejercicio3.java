/*Escribir un diseño de programa que mientras que el usuario
ingrese un número natural, pida ingresar otro número cualquiera y
lo imprima. */

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class practica_3_ejercicio3 {
    public static void main(String[] args) {
        int numero = 1;

        while (numero != 0) {
            try {
                BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Ingrese número natural");
                numero = Integer.valueOf(entrada.readLine());
                numeroCualquiera(1);
                } catch (Exception exc) {
                System.out.println("Error");
            }

        }
    }

    public static int numeroCualquiera(int numero) {
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese otro número cualquiera");
            numero = Integer.valueOf(entrada.readLine());
        } catch (Exception exc) {
            System.out.println("Error");
        }
        System.out.println("El segundo número fué: " + numero);
        return numero;
    }
}
