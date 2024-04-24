/*Escribir un programa que mientras el usuario ingrese un
carácter letra minúscula, se quede con la menor y la mayor letra
ingresada. Finalmente muestre por pantalla dichas letras. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class practica_2_ejercicio12 {
    public static void main(String[] args) {
        char letra = '*';
        char mayor = 'a';
        char menor = 'z';

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingrese letra minúscula");
            letra = entrada.readLine().charAt(0);

            while ((letra >= 'a') && (letra <= 'z')) {
                if (letra > mayor) {
                    mayor = letra;
                } else if (letra < menor) {
                    menor = letra;
                }
            System.out.println("Ingrese otra letra minúscula / ingrese 0 para terminar");
            letra = entrada.readLine().charAt(0);
                
            }
            System.out.println("Letra mayor: " + mayor);
            System.out.println("Letra menor: " + menor);

        } catch (Exception exc) {
            System.out.println("Error");
        }
    }
}
