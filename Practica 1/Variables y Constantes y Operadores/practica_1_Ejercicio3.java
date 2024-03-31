/*Escribir un programa que declare una constante de tipo int y pida el
ingreso de un valor por teclado. Luego muestre el valor ingresado.
¿Qué pasa en este caso? ¿Se puede o surge algún problema?*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class practica_1_Ejercicio3 {
    public static void main(String[] args) {
        final int valor;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese valor");
            valor = Integer.valueOf(entrada.readLine());
            System.out.println("El valor ingresado ha sido: " + valor);
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}

//Al tener la variable declarada como constante pero sin un valor asiganado igual pide el ingreso del valor al ser solicitado. Si se hace sin el try_catch no funciona