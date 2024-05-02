/* Construir un programa que solicite desde teclado un número de
mes y posteriormente notifique por pantalla la cantidad de días de
ese mes. En el caso de que ingrese 2 como número de mes
(febrero) deberá además solicitar ingresar un número de año y,
dependiendo si es bisiesto o no con la siguiente sentencia:
((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
imprimir la cantidad de días correspondiente. */

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class practica_2_ejercicio2 {
    public static void main(String[] args) {

        int nroMes, dias, anio;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingrese el número de mes");
            nroMes = Integer.valueOf(entrada.readLine());

            switch (nroMes) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    dias = 31;
                    System.out.println("El mes tiene " + dias + " días");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    dias = 30;
                    System.out.println("El mes tiene " + dias + " días");
                    break;
                case 2:
                    System.out.println("Ingrese número de año");
                    anio = Integer.valueOf(entrada.readLine());
                    if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
                        System.out.println("El mes tiene 29 días");
                    } else {
                        System.out.println("El mes tiene 28 días");
                    }
                    break;
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
