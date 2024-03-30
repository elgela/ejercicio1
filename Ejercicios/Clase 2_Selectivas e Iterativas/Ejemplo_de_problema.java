/*Hacer un programa que dado un valor ingresado por el
usuario entre 1 y 3 inclusive (si ingresa otro valor termina),
imprima como salida “Bajo” en el caso de que ingrese 1,
“Medio” si ingresa 2, y “Alto” si ingresa 3. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejemplo_de_problema {
    public static void main(String[] args) {
        int valor = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        while (valor >= 1 || valor <= 3) {
            try {
                System.out.println("Ingrese valor");
                valor = Integer.valueOf(entrada.readLine());
                if(valor == 1) {
                    System.out.println("Bajo");
                } else if (valor == 2) {
                    System.out.println("Medio");
                } else if (valor == 3) {
                    System.out.println("Alto");
                } else {
                    System.out.println("Valor incorrecto");
                }
            } catch (Exception exp) {
                System.out.println("Error");
            }
        }

    }
}
