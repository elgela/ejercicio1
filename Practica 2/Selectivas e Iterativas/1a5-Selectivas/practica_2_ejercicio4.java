/*Escribir un programa donde el usuario ingrese un número entre 0
y 999, y muestre un mensaje de cuántos dígitos tiene. Además, si
tiene 3 dígitos debe informar qué número es. */


import java.io.BufferedReader;
import java.io.InputStreamReader;
public class practica_2_ejercicio4 {
    public static void main(String[] args) {
        int numero;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.println("Ingrese número entre 0 y 999");
            numero = Integer.valueOf(entrada.readLine());
            System.out.println('\0');
            if ((numero >= 0) && (numero <= 9)) {
                System.out.println("El número tiene 1 dígito");
            } else if ((numero >= 10) && (numero <= 99)) {
                System.out.println("El número tiene 2 dígitos");
            } else if ((numero >= 100) && (numero <= 999)) {
                System.out.println("El número tiene 3 dígitos y es " + numero);
            } else {
                System.out.println("Debe ser número positivo y de 3 dígitos como máximo");
            }
        } catch(Exception e) {
            System.out.println("Error");
        }
    }
}
