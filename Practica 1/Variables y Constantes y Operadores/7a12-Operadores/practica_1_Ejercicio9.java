/*Escribir un programa que permita el ingreso de un número entero
por teclado e imprima el cociente de la división de dicho número
por 2, 3, y 4. En base a los resultados obtenidos analice cada
caso si es correcto o no. */

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class practica_1_Ejercicio9 {
    public static void main(String[] args) {
        Double numero;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Ingresar número entero");
            numero = Double.valueOf(entrada.readLine());

            double resultado1, resultado2, resultado3;
            resultado1 = (numero/2);
            resultado2 = (numero/3);
            resultado3 = (numero/4);
            System.out.println("La division por 2 es: " + resultado1);
            System.out.println("La división por 3 es: " + resultado2);
            System.out.println("La división por 4 es: " + resultado3);
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
// import java.io.*;

// public class practica_1_Ejercicio9 {
//     public static void main(String[] args) {
//         int numero;

//         try {
//             BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

//             System.out.println("Ingrese un número entero");
//             numero = Integer.valueOf(entrada.readLine());

//             division_x_2(numero);
//             division_x_3(numero);
//             division_x_4(numero);

//         } catch (Exception exc) {
//             System.out.println(exc);
//         }
//     }

//     public static void division_x_2(float numero) {
//         float resultado;
//         resultado = (numero/2);
//         System.out.println("La división por 2 es: " + resultado);
//     }

//     public static void division_x_3(float numero) {
//         float resultado;
//         resultado = (numero/3);
//         System.out.println("La división por 3 es: " + resultado);
//     }

//     public static void division_x_4(float numero) {
//         float resultado;
//         resultado = (numero/4);
//         System.out.println("La división por 4 es: " + resultado);
//     }
// }
