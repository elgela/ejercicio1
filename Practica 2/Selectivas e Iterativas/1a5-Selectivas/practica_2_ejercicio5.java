/*Escribir un programa que solicite una hora del día (valor entero de
la hora solamente) y resuelva en cada caso:
a. Si la hora está entre las 0 y las 5, pida ingresar la
temperatura y si la misma es menor a 20 grados imprima
“Encender la calefacción”. Si es mayor a 25, imprima
“Apagar calefacción”. Si está en el rango de 20 a 25 imprima
“Calefacción encendida, no abra las ventanas!!!”.
b. Si la hora está entre las 6 y las 11, pida un carácter letra
minúscula y si es vocal imprima por la consola la cantidad de
vocales que tiene la palabra que corresponde con la hora.
Ejemplo 8 (ocho) tiene 2 vocales. Si no es vocal imprima la
cantidad de consonantes que tiene, para el ejemplo 8 (ocho)
tiene 2 consonantes.
c. Si la hora está entre las 12 y 17 y es par, imprima el
promedio entre la hora ingresada y el límite inferior del
rango. Si la hora es impar debe imprimir el promedio entre la
hora ingresada y el límite superior del rango.
d. Si la hora está entre las 18 y 23, pida ingresar una clave
numérica, si coincide con la clave almacenada previamente
en una constante, pida ingresar una segunda clave de
verificación (un valor entre 100 y 999). Para esta segunda
clave (que solo la conoce el usuario) se debe verificar que el
dígito de mayor peso (centena) sea múltiplo del dígito de
mayor peso de la clave almacenada. Si todo esto se cumple
debería mostrar por la consola el mensaje “Clave correcta”.
Ejemplo: clave almacenada 364, clave ingresada 364,
segunda clave ingresada 698. */

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class practica_2_ejercicio5 {
    public static void main(String[] args) {
        int hora;
        Double temperatura;
        char caracter;
        final int clave = 666;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.println("Ingrese la hora");
            hora = Integer.valueOf(entrada.readLine());

            if (hora >= 0 && hora <= 5) {
                System.out.println("Ingrese la temperatura");
                temperatura = Double.valueOf(entrada.readLine());
                if (temperatura < 20) {
                    System.out.println("Encender la calefacción");
                } else if (temperatura > 25) {
                    System.out.println("Apagar calefacción");
                } else if (temperatura >= 20 && temperatura <= 25) {
                    System.out.println("Calefacción encendida, no abra las ventanas!!!");
                }
            }
            if (hora >= 6 && hora <= 11) {
                System.out.println("Ingrese una letra minúscula");
                caracter = entrada.readLine().charAt(0);
                if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                    switch (hora) {
                        case 6:
                        case 8:
                        case 10:
                        case 11:
                            System.out.println(hora + " tiene 2 vocales");
                            break;
                        case 7:
                        case 9:
                            System.out.println(hora + " tiene 3 vocales");
                            break;
                        default:
                            break;
                    }
                } else {
                    System.out.println(hora + " tiene 2 consonantes");
                }
            }
            double hr = (double) hora;
            if (hora >= 12 && hora <= 17 && hora % 2 == 0) {
                System.out.println((hr * 12) / 100);
            } else if (hora >= 12 && hora <= 17 && hora % 2 != 0) {
                System.out.println((hr * 17) / 100);
            }
            if (hora >= 18 && hora <=23) {
                int numero;
                System.out.println("Ingrese una clave numérica");
                numero = Integer.valueOf(entrada.readLine());
                if (numero == clave) {
                    System.out.println("Ingrese una nueva clave entre 100 y 999");
                    numero = Integer.valueOf(entrada.readLine());
                    if (numero/100 == clave/100) {
                        System.out.println("Clave correcta");
                    }
                    
                }
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
