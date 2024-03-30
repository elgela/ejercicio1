/*Escribir un programa que permita ingresar 5 números de a uno por
vez y que los muestre por pantalla en orden inverso:
Ejemplo: Ingreso: 23, 4, 2, 100, 3
Se debe mostrar: 3, 100, 2, 4, 23 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class practica_1_Ejercicio4 {
    public static void main(String[] args) {
        int[] numero = new int[5];

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

            for (int i = 0; i < 5; i++) {
                System.out.println("Ingrese número " + (i+1) + ": ");
                numero[i] = Integer.valueOf(entrada.readLine());
            }
            System.out.println('\b');
            System.out.println("Números en orden inverso:");
            for (int i = 4; i >= 0; i--) {
                System.out.println(numero[i]);
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
