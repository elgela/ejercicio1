
/*Utilizando una sentencia repetitiva calcular el
capital acumulado a 10 años para un capital inicial
de $100 y una tasa de interés de 4% anual. */

public class Ejemplo_Capital_Acumulado {
    public static void main(String[] args) {
        final int MAX = 10;
        final int interes = 4;
        double capital = 100.0;
        int anios = 1;
        while (anios <= MAX) {
        capital += capital*interes/100;
        anios++;
        }
        System.out.println("Capital final es: " + capital);
    }
}
