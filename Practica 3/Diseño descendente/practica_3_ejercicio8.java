/*Realizar un programa que dado dos números enteros y un
carácter (todos ingresados por el usuario) muestre por pantalla el
resultado de una operación matemática básica según el valor del
carácter ingresado. Si se ingresó el carácter "a" debe realizar la
suma, para "b" la resta, para "c" la multiplicación y para "d" la
división entre ambos números. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class practica_3_ejercicio8 {
    public static void main(String[] args) {
        /*
         * usuario ingresa 2 enteros y un carácter
         * si carácter 'a' hace suma, si 'b' resta, si 'c' multiplica, si 'd' divide
         * imprime
         */
        char caracter = 'a';
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        while (caracter != '0') {
            try {
                System.out.println("Ingrese un carácter");
                System.out.println("A para suma, B para resta, C para multiplicar, D para dividir");
                // System.out.println("Ingrese carácter correspondiente a la operación");
                caracter = entrada.readLine().charAt(0);

                switch (caracter) {
                    case 'a':
                        suma();
                        break;
                    case 'b':
                        resta();
                    default:
                        break;
                    case 'c':
                        multiplicación();
                        break;
                    case 'd':
                        division();
                        break;
                }
            } catch (Exception exc) {
                System.out.println("Error");
            }
        }
    }

    public static int suma() {
        int numero1 = 0, numero2 = 0, suma = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println('\0');
            System.out.println("Suma");
            System.out.println("Numero 1");
            numero1 = Integer.valueOf(entrada.readLine());
            System.out.println("Número 2");
            numero2 = Integer.valueOf(entrada.readLine());
            suma = (numero1 + numero2);
        } catch (Exception exc) {
            System.out.println("Error");
        }
        System.out.println(numero1 + " + " + numero2 + " = " + suma);
        return suma;
    }

    public static int resta() {
        int numero1 = 0, numero2 = 0, resta = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println('\0');
            System.out.println("Resta");
            System.out.println("Numero 1");
            numero1 = Integer.valueOf(entrada.readLine());
            System.out.println("Número 2");
            numero2 = Integer.valueOf(entrada.readLine());
            resta = (numero1 - numero2);
        } catch (Exception exc) {
            System.out.println("Error");
        }
        System.out.println(numero1 + " - " + numero2 + " = " + resta);
        return resta;
    }

    public static int multiplicación() {
        int numero1 = 0, numero2 = 0, multiplicacion = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println('\0');
            System.out.println("Multiplicación");
            System.out.println("Numero 1");
            numero1 = Integer.valueOf(entrada.readLine());
            System.out.println("Número 2");
            numero2 = Integer.valueOf(entrada.readLine());
            multiplicacion = (numero1 * numero2);
        } catch (Exception exc) {
            System.out.println("Error");
        }
        System.out.println(numero1 + " - " + numero2 + " = " + multiplicacion);
        return multiplicacion;
    }

    public static Double division() {
        Double numero1 = 0.0, numero2 = 0.0;
        Double division = 0.0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println('\0');
            System.out.println("División");
            System.out.println("Numero 1");
            numero1 = Double.valueOf(entrada.readLine());
            System.out.println("Número 2");
            numero2 = Double.valueOf(entrada.readLine());
            division = (numero1 / numero2);
        } catch (Exception exc) {
            System.out.println("Error");
        }
        System.out.println(numero1 + " / " + numero2 + " = " + division);
        return division;
    }
}
