/*Escribir un programa que mientras el usuario ingrese un
número entero entre 1 y 10 realice:
a. Si el numero ingresado es múltiplo de 3 pida ingresar un
caracter y para el caracter ingresado imprima a qué tipo de
carácter está asociado:
i. “letra minúscula” si el carácter es una letra del
abecedario en minúscula;
ii. “letra mayúscula” si el carácter es una letra del
abecedario en mayúscula;
iii. “dígito” si el carácter corresponde a un número;
iv. “otro” para los restantes casos de caracteres.
b. Si el número ingresado es múltiplo de 5 imprima la tabla de
multiplicar del número ingresado. */

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class practica_3_ejercicio10 {
    public static void main(String[] args) {
        int numero = 1;
        char caracter = 'a';

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        while (numero != 0) {
            try {
                System.out.println("Ingrese número entero");
                numero = Integer.valueOf(entrada.readLine());
                if ((numero >=1) && (numero <= 10)) {
                    System.out.println("Ingrese otro número entero");
                    numero = Integer.valueOf(entrada.readLine());
                    if (numero %3 == 0) {
                        System.out.println("Ingrese un carácter");
                        caracter = entrada.readLine().charAt(0);
                    }
                }
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
    }

}
