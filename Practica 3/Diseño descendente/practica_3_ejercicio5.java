/*Hacer un método que dado un número entero con valor inicial 1,
haga una iteración incrementando el número de a uno hasta un
valor MAX = 4 (constante). Mientras itera deberá imprimir el
número. Luego invocarlo desde el programa principal y cuando
termina, imprimir por pantalla “terminó”. */

// import java.io.BufferedReader;
// import java.io.InputStreamReader;

public class practica_3_ejercicio5 {
    public static void main(String[] args) {
        incremento();
        System.out.println("Terminó");
    }

    public static int incremento() {
        final int MAX = 4;
        int numero;
        for (numero = 1; numero < MAX; numero++) {
            System.out.println("Número " + numero);
        }
        return numero;
    }

}
