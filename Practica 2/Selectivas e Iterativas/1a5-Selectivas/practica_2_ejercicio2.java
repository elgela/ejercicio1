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

        int mes, dias;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            
        try {
            System.out.println("Ingrese el número de mes");
            mes = Integer.valueOf(entrada.readLine());
            
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
