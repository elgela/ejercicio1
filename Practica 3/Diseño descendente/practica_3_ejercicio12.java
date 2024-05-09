/*Escribir un programa que simule 1000 lanzamientos de un dado
y muestre por pantalla cuántas veces salió el valor del dado
correspondiente al número entero N ingresado por el usuario.
Considerar que el valor N ingresado se corresponda a un valor
posible para un dado. Usar la sentencia Math.random() que
devuelve un valor aleatorio real entre 0 y 1.
Para asignar un posible valor a la variable dado entero:

dado = (int) (6*Math.random() + 1) */

/*usuario ingresa numero entero
* 
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class practica_3_ejercicio12 {
    public static void main(String[] args) {
        int N = 0;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            
        } catch (Exception exc) {
            System.out.println("Error");
        }
    }

    public static int lanzamientoDado() {
         final int MAX = 1000;
         int numero = 0;
         for (numero = 0; numero <= MAX; numero++) {
            
         }
         return numero;
    }
}
