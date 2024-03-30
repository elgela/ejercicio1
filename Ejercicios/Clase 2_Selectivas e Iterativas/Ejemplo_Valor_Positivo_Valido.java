/*Ingresar un valor positivo válido. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejemplo_Valor_Positivo_Valido {
    public static void main(String[] args) {
        int valor = 0;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        while (valor <= 0) {
            try { // try define un bloque de manejo de posibles excepciones
                System.out.println("Ingresar valor positivo: ");
                valor = Integer.valueOf(entrada.readLine());
                System.out.println("El valor ingresado es: " + valor);
            } catch (Exception exc) {
                System.out.println(exc);
            }
        }
    }
}
