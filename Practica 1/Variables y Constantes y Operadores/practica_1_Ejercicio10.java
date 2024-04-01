/*Escribir un programa que permita el ingreso de dos números
enteros por teclado e imprima:
a. si el primero es mayor al segundo.
b. si ambos son múltiplos de 2. */

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class practica_1_Ejercicio10 {
    public static void main(String[] args) {
        int numero1, numero2;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Ingrese número 1:");
            numero1 = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese número 2:");
            numero2 = Integer.valueOf(entrada.readLine());
            System.out.println('\0');
                primero_mayor_segundo(numero1, numero2);
                multiplos_de_2(numero1, numero2);

        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public static void primero_mayor_segundo(int numero1, int numero2) {
        if (numero1>numero2) {
            System.out.println(numero1 + " es mayor a " + numero2);
        } else {
            System.out.println("Error! el segundo número fué mayor al primero");
        }
    }

    public static void multiplos_de_2(int numero1, int numero2) {
        if ((numero1 %2==0)&&(numero2 %2==0)) {
            System.out.println(numero1 + " y " + numero2 + " son múltiplos de 2");
        } if((numero1 %2!=0)) {
            System.out.println(numero1 + " no es múltiplo de 2");
        } if (numero2 %2!=0) {
            System.out.println(numero2 + " no es múltiplo de 2");
        } if ((numero1 %2!=0)&&(numero2 %2!=0)) {
            System.out.println("Entonces ni " + numero1 + " ni " + numero2 + " no son múltiplo de 2");
        }
    }
}
