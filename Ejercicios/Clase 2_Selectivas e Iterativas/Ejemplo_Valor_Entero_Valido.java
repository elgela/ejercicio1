//Ingresar un valor entero válido.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejemplo_Valor_Entero_Valido {
    public static void main(String[] args) {
        int valor = 0;
        boolean esValido = false;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        while (!esValido) { // mientras no haya ingresado un nro válido
            try { // try define un bloque de manejo de posibles excepciones
                System.out.println("Ingresar valor entero:");
                valor = Integer.valueOf(entrada.readLine());
                System.out.println("El entero ingresado es: " + valor);
                esValido = true;
            } catch (Exception exc) {
                System.out.println("El valor ingresado no es válido");
            }
        }
    }
}
