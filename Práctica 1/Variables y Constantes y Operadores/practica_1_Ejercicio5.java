/*Escribir un programa que solicite nombre, edad, altura y ocupación, y
los imprima por pantalla. */

import java.io.*;
public class practica_1_Ejercicio5 {
    public static void main(String[] args) {
        int edad;
        double altura;
        String nombre, ocupacion;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Nombre:");
            nombre = entrada.readLine();
            System.out.println("Edad:");
            edad = Integer.valueOf(entrada.readLine());
            System.out.println("Altura:");
            altura = Double.valueOf(entrada.readLine());
            System.out.println("Ocupación:");
            ocupacion = entrada.readLine();
            System.out.println('\0');
            System.out.println(nombre);
            System.out.println(edad);
            System.out.println(altura);
            System.out.println(ocupacion);
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
