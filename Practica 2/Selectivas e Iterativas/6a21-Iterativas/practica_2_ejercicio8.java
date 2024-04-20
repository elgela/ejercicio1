/*Escribir un programa que mientras que el usuario ingrese un
número entero distinto de 0, pida ingresar otro número entero y lo
imprima. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class practica_2_ejercicio8 {
    public static void main(String[] args) {
        int numero = 1;
        int numero2 = 1;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        while (numero != 0) {

            try {
                System.out.println('\0');
                System.out.println("Ingrese número entero / 0 para terminar");
                numero = Integer.valueOf(entrada.readLine());

                    if ((numero > 0) || (numero < 0)) {
                        System.out.println("Ingrese otro número entero");
                        numero2 = Integer.valueOf(entrada.readLine());
                        System.out.println('\0');
                        System.out.println("El número fue: " + numero2);
                    } else {
                        System.out.println("Fin");
                    }
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
    }
}
