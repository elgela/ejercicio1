/*Escribir un programa completo (declaración de constantes y
variables, carga de datos, procesamiento e impresión de
resultados) para cada caso o ítem que:
a. solicite un número e indique si es positivo o negativo.
b. solicite un número e imprima “grande” si es mayor a 100 y
“chico “ si es menor.
c. solicite un número del 1 al 7 e imprima el día de la semana.
d. solicite una letra e imprima si es vocal o consonante.
e. solicite 3 números e imprima “creciente” si los tres números
están en orden creciente, “decreciente” si están en orden
decreciente o “error” si no cumplen ningún orden */

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class practica_2_ejercicio1 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int numero1, numero2, numero3;
        int numero;
        char letra;

        try {
            System.out.println("Ingrese un número");
            numero = Integer.valueOf(entrada.readLine());
            System.out.println('\0');
            positivo_negativo(numero);
            grande_chico(numero);
            dia_semana(numero);
            System.out.println('\0');
            System.out.println("Ingrese una letra");
            letra = entrada.readLine().charAt(0);
            vocal_consonante(letra);
            System.out.println('\0');
            System.out.println("Ingrese 3 números consecutivos:");
            numero1 = Integer.valueOf(entrada.readLine());
            numero2 = Integer.valueOf(entrada.readLine());
            numero3 = Integer.valueOf(entrada.readLine());
            System.out.println('\0');
            creciente_decreciente(numero1, numero2, numero3);
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public static void positivo_negativo(int numero) {
        if (numero > 0) {
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }

    }

    public static void grande_chico(int numero) {
        if (numero > 100) {
            System.out.println("Grande");
        } else {
            System.out.println("Chico");
        }
    }

    public static void dia_semana(int numero) {
        if ((numero >= 1) && (numero <= 7)) {
            switch (numero) {
                case 1:
                    System.out.println("Lunes");
                    break;
                case 2:
                    System.out.println("Martes");
                    break;
                case 3:
                    System.out.println("Miércoles");
                    break;
                case 4:
                    System.out.println("Jueves");
                    break;
                case 5:
                    System.out.println("Viernes");
                    break;
                case 6:
                    System.out.println("Sábado");
                    break;
                case 7:
                    System.out.println("Domingo");
                    break;
                default:
                    break;
            }
        }
    }

    public static void vocal_consonante(char letra) {
        switch (letra) {
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U':
                System.out.println("Vocal");
                break;
            default:
                System.out.println("Consonante");
                break;
        }
    }

    public static void creciente_decreciente(int num1, int num2, int num3) {
        if ((num1 < num2) && (num2 < num3)) {
            System.out.println("creciente");
        } else if ((num1 > num2) && (num2 > num3)) {
            System.out.println("decreciente");
        } else {
            System.out.println("error");
        }
    }
}
