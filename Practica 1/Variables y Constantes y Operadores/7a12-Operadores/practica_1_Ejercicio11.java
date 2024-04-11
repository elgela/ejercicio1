/*Escribir un programa que permita el ingreso de un número entero
por teclado e imprima el resultado de determinar:
a. si es múltiplo de 6 y de 7,
b. si es mayor a 30 y múltiplo de 2, o es menor igual a 30,
c. si el cociente de la división de dicho número por 5 es mayor
que 10. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class practica_1_Ejercicio11 {
    public static void main(String[] args) {
        int numero;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Ingrese número entero:");
            numero = Integer.valueOf(entrada.readLine());
            System.out.println('\0');
            if ((numero % 6 == 0) && (numero % 7 == 0)) {
                System.out.println(numero + " es múltiplo de 6 y de 7");
            }
            if ((numero > 30) && (numero % 2 == 0)) {
                System.out.println(numero + " es mayor a 30 y múltiplo de 2");
            } else if (numero <= 30) {
                System.out.println(numero + " es menor igual a 30");
            }
            if ((numero / 5) > 10) {
                System.out.println(
                        "El cociente de " + numero + " es mayor a 10 - (" + numero + " / 5 = " + (numero / 5) + ")");
            }

            // multiplo_6_7(numero);
            // multiplo_mayor_menor(numero);
            // cociente_division(numero);

        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
// public static void multiplo_6_7(int numero) {
// if ((numero % 6 == 0) && (numero % 7 == 0)) {
// System.out.println(numero + " es múltiplo de 6 y de 7");
// }
// }

// public static void multiplo_mayor_menor(int numero) {
// if ((numero>30)&&(numero %2==0)) {
// System.out.println(numero + " es mayor a 30 y múltiplo de 2");
// } else if(numero<=30) {
// System.out.println(numero + " es menor igual a 30");
// }
// }

// public static void cociente_division(float numero) {
// if ((numero/5)>10) {
// System.out.println("El cociente de " + numero + " es mayor a 10 - (" + numero
// + " / 5 = " + (numero/5) + ")");
// }
// }
// }
