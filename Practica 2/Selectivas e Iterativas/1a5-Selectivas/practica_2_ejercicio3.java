/*Escribir un programa que solicite el ingreso de un número mayor a
50, y lo muestre por pantalla en caso de ser múltiplo de 2 o 3. */

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class practica_2_ejercicio3 {
    public static void main(String[] args) {
        int numero;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingrese número mayor a 50");
            numero = Integer.valueOf(entrada.readLine());
            System.out.println('\0');
            
            if ((numero > 50) && (numero % 2 == 0) || (numero % 3 == 0)) {
                System.out.println("El número fué: " + numero);
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
