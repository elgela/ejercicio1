/*Escribir un programa que declare una variable de tipo double y una
constante de tipo double con valor 1.0. Luego, deberá asignar el
doble del valor de la constante a la variable y mostrar ambos por
pantalla. */

public class practica_1_Ejercicio2 {
    public static void main(String[] args) {
        double decimal;
        final double parte = 1.0;

        decimal = parte * 2;

        System.out.println(parte);
        System.out.println(decimal);
    }
}
