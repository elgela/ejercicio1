/*Escribir un programa que permita el ingreso de un número entero
por teclado e imprima el cociente de la división de dicho número
por 2, 3, y 4. En base a los resultados obtenidos analice cada
caso si es correcto o no. */

import java.io.*;

public class practica_1_Ejercicio9 {
    public static void main(String[] args) {
        int numero;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Ingrese un número entero");
            numero = Integer.valueOf(entrada.readLine());
            division_x_2(numero);
            division_x_3(numero);
            division_x_4(numero);

        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public static void division_x_2(float numero) {
        float resultado;
        resultado = (numero/2);
        System.out.println("La división por 2 es: " + resultado);
    }

    public static void division_x_3(float numero) {
        float resultado;
        resultado = (numero/3);
        System.out.println("La división por 3 es: " + resultado);
    }

    public static void division_x_4(float numero) {
        float resultado;
        resultado = (numero/4);
        System.out.println("La división por 4 es: " + resultado);
    }

    public static void resultados_obtenidos(float numero) {
        
    }
}
