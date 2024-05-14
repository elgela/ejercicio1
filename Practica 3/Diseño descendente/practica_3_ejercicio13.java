/*Realizar un programa que, dada una opción entera (1,2,3,4),
permita realizar operaciones entre tres números reales (r1,r2,r3)
ingresados desde teclado. Para la opción:
1. Calcular la raíz cuadrada de (r1-r3)
2. Calcular el promedio de r1, r2 y r3
3. Calcular cociente de la raíz cuadrada de (r3 - r2) dividida por
r1
4. Calcular el cociente del promedio de los tres valores dividido
por la raíz cuadrada de r2
Observación: La raíz cuadrada de un número se calcula con la
sentencia: Math.sqrt(numero). Hacer uso del diseño descendente
y de la modularización para la solución. Tener en cuenta posibles
errores o excepciones como la división por cero. */

import java.io.BufferedReader;
import java.io.InputStreamReader;
// import java.util.Scanner;
public class practica_3_ejercicio13 {
    public static float r1 = 0, r2 = 0, r3 = 0;
    public static void main(String[] args) {
        int opcion = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

            try {
                System.out.println("Ingrese primer número real");
                r1 = entrada.readLine().charAt(0);
                System.out.println("Ingrese segundo número real");
                r2 = entrada.readLine().charAt(0);
                System.out.println("Ingrese tercer número real");
                r3 = entrada.readLine().charAt(0);
                System.out.println("Elija que realizar");
                System.out.println("Opción 1: Calcular raiz cuadrada de (r1-r3)");
                System.out.println("Opción 2: Calcular el promedio de r1, r2 y r3");
                System.out.println("Opción 3: 3. Calcular cociente de la raíz cuadrada de (r3 - r2) dividida por r1" );
                System.out.println("Opción 4: Calcular el cociente del promedio de los tres valores dividido por la raíz cuadrada de r2");
                System.out.println("Ingrese opción");
                opcion = Integer.valueOf(entrada.readLine());
    
                switch (opcion) {
                    case 1:
                        // raizCuadrada();
                        break;
                    case 2:
                        promedio();
                        break;
                    case 3:
                        // cocienteRaiz();
                        break;
                    case 4:
                        // cocientePromedio();
                        break;
                    // default:
                    //     break;
                }
            } catch (Exception exc) {
                System.out.println("Error");
            }
        }

    // public static double raizCuadrada() {

    // }

    public static float promedio() {
        float promedio = 0;
        float suma = (r1 + r2 + r3);
        for (int numero = 0; numero < suma; numero++) {
            suma += numero;
        }
        promedio = suma / 3;
        System.out.println("El promedio es: " + promedio);
        return promedio;
    }

    // public static double cocienteRaiz() {

    // }

    // public static double cocientePromedio() {

    // }
}