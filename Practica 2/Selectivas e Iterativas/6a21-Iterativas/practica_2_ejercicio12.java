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

        while ((letra >='a') && (letra <= 'z')) {
            try {
                System.out.println("Ingrese letra minúscula");
                letra = entrada.readLine().charAt(0);

                if (letra < mayor) {
                    mayor = letra;
                } else if (letra > menor){
                    menor = letra;
                }              

                
            } catch (Exception exc) {
                System.out.println("Error");
            }
        }
        System.out.println("Letra mayor: " + mayor);
        System.out.println("Letra menor: " + menor);
    }
}
