/*Escribir un programa que dado tres números reales ingresados
por el usuario, divida el primero por el segundo y al resultado
obtenido le reste el tercero. Muestre por pantalla el resultado
obtenido. Puede o no usar variables auxiliares para los cálculos.
Tenga en cuenta posibles errores en las operaciones. */

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class practica_1_Ejercicio7 {
    public static void main(String[] args) {
        double numero1, numero2, numero3;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.println("Ingrese primer número real");
            numero1 = Double.valueOf(entrada.readLine());
            System.out.println("Ingrese segundo número real");
            numero2 = Double.valueOf(entrada.readLine());
            System.out.println("Ingrese tercer número real");
            numero3= Double.valueOf(entrada.readLine());

            System.out.println((numero1/numero2)-numero3);
        } catch (Exception exc) {
            System.out.println(exc);
        }
    } 
}
